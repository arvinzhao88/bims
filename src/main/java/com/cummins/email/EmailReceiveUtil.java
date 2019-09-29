package com.cummins.email;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.cummins.util.JsonResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.pop3.POP3Folder;

/**
 * 
 * @ClassName: EmailUtil
 * @Description:邮件通用接口类
 * @author 作者 E-mail <a href="mailto:szg@51box.cn">石志刚</a>
 * @version 创建时间：2015年11月26日下午3:36:11
 */
public class EmailReceiveUtil {
	private static Log log = LogFactory.getLog(EmailReceiveUtil.class);

	/**
	 * 
	 * @Title: connnect
	 * @Description:连接收件服务器
	 * @param protocol
	 *            协议类型 imap/pop3
	 * @param host
	 *            收件服务器
	 * @param port
	 *            端口
	 * @param useSSL
	 *            是否使用ssl连接，true/false
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return JsonResult success是否连接成功 msg 信息 object 连接成功时会将store存在obj中
	 */
	public static JsonResult connnect(String protocol, String host, int port, int useSSL, String userName, String password) {
		String ssl = (useSSL == 1 ? "true" : "false");
		JsonResult json = new JsonResult();
		json.setSuccess(false);
		Properties props = new Properties();
		Store store = null;
		props.setProperty("mail.store.protocol", protocol); // 协议
		props.setProperty("mail." + protocol + ".host", host); // 主机host
		props.setProperty("mail." + protocol + ".port", String.valueOf(port)); // 端口
		props.setProperty("mail." + protocol + ".timeout", "4000"); // 超时
		props.setProperty("mail." + protocol + ".connectiontimeout", "4000"); // 超时
		props.setProperty("mail." + protocol + ".ssl.enable", ssl);
		// =========创建Session实例对象
		Session session = Session.getInstance(props);
		try {
			store = session.getStore(protocol);
			// =========连接邮件服务器
			store.connect(userName, password);
			json.setSuccess(true);
			json.setMsg("连接成功");
			json.setObj(store);
			return json;
		} catch (NoSuchProviderException e) {
			log.error(userName + "协议错误", e);
			json.setMsg("协议错误，请检查您的配置信息");
			return json;
		} catch (AuthenticationFailedException e) {
			if (e.getMessage().trim().equals("Read timed out")) {
				log.error(userName + "连接超时", e);
				json.setMsg("连接邮件服务器超时， 请检查配置或稍后重试(请确认是否开启POP3/SMTP/IMAP服务)");
				return json;
			} else {
				log.error(userName + "邮件地址或密码错误", e);
				json.setMsg("邮件地址或密码错误(请确认是否开启POP3/SMTP/IMAP服务)");
				return json;
			}
		} catch (Exception e) {
			log.error(userName + "邮件地址或密码错误", e);
			json.setMsg("系统异常 请稍后重试");
			return json;
		} finally {
			props.clear();
			session = null;
		}
	}

	/**
	 * 
	 * @Title: getSubject
	 * @Description:获取邮件主题
	 * @param msg
	 *            MimeMessage对象
	 * @return
	 */
	public static String getSubject(MimeMessage msg) {
		try {
			String subject = msg.getHeader("Subject", null);
			if (subject.startsWith("?=")) {
				return MimeUtility.decodeText(msg.getSubject());
			} else {
				return MimeUtility.decodeText(toChinese(subject));
			}
		} catch (Exception e) {
			log.error("获取邮件主题异常", e);
		}
		return null;
	}

	/**
	 * 
	 * @Title: getFrom
	 * @Description:获取邮件收件人
	 * @param msg
	 *            MimeMessage对象
	 * @return
	 */
	public static String getFrom(MimeMessage msg) {
		try {
			String from = "";
			Address[] froms = msg.getFrom();
			if (froms.length < 1)
				throw new MessagingException("没有发件人!");

			InternetAddress address = (InternetAddress) froms[0];
			String person = address.getPersonal();
			if (person != null) {
				person = MimeUtility.decodeText(person) + " ";
			} else {
				person = "";
			}
			from = person + "<" + address.getAddress() + ">";
			return from;
		} catch (Exception e) {
			log.error("获取邮件收件人异常", e);
		}
		return null;
	}

	/**
	 * 
	 * @Title: getReceiveAddress
	 * @Description:根据收件人类型，获取邮件收件人、抄送和密送地址。如果收件人类型为空，则获得所有的收件人
	 * @param msg
	 *            MimeMessage对象
	 * @param type
	 *            收件人类型 Message.RecipientType.TO 收件人 Message.RecipientType.CC 抄送
	 *            Message.RecipientType.BCC 密送
	 * @return
	 */
	public static String getReceiveAddress(MimeMessage msg, Message.RecipientType type) {
		String addx = "";
		try {
			StringBuffer receiveAddress = new StringBuffer();
			Address[] addresss = null;
			if (type == null) {
				addresss = msg.getAllRecipients();
			} else {
				addresss = msg.getRecipients(type);
			}
			if (addresss == null || addresss.length < 1) {
				return "";
			}
			for (Address address : addresss) {
				InternetAddress internetAddress = (InternetAddress) address;
				receiveAddress.append(internetAddress.toUnicodeString()).append(";");
			}
			receiveAddress.deleteCharAt(receiveAddress.length() - 1);
			addx = receiveAddress.toString();
		} catch (Exception e) {
			addx = "";
			log.error("邮件地址解析异常，进行自定义解析", e);
			String typexd = "";
			if (type == Message.RecipientType.TO)
				typexd = "To";
			else if (type == Message.RecipientType.CC)
				typexd = "Cc";
			else if (type == Message.RecipientType.BCC)
				typexd = "Bcc";
			else if (type == MimeMessage.RecipientType.NEWSGROUPS)
				typexd = "Newsgroups";
			else
				return "";
			try {
				String[] s = msg.getHeader(typexd);
				String temp = "";
				for (int i = 0; i < s.length; i++) {
					temp = s[i];
					if (temp != null && !temp.trim().equals("") && temp.contains("=") && temp.length() >= temp.lastIndexOf('=') + 1)
						temp = temp.substring(temp.lastIndexOf('=') + 1);
					if (addx.equals(""))
						addx += temp;
					else
						addx += ";" + temp;
				}
			} catch (MessagingException e1) {
				log.error("自定义解析循环地址出现异常", e1);
			}
		}
		return addx;
	}

	public static String getUID(MimeMessage mimeMessage, Folder folder) {
		String uid = "";
		try {
			if (folder instanceof POP3Folder) {
				POP3Folder inbox = (POP3Folder) folder;
				uid = inbox.getUID(mimeMessage);
			} else {
				IMAPFolder inbox = (IMAPFolder) folder;
				uid = String.valueOf(inbox.getUID(mimeMessage));
			}
		} catch (MessagingException e) {
			log.error("读取UID信息出错");
		}
		return uid;
	}

	/**
	 * 
	 * @Title: toChinese
	 * @Description:将未知编码格式内容转换成gbk
	 * @param strvalue
	 * @return
	 */
	public static String toChinese(String strvalue) {
		try {
			if (strvalue == null)
				return null;
			else {
				strvalue = new String(strvalue.getBytes("ISO8859_1"), "GBK");
				return strvalue;
			}
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 获得邮件发送时间
	 * 
	 * @param msg
	 *            邮件内容
	 * @return yyyy年mm月dd日 星期X HH:mm
	 * @throws MessagingException
	 */
	public static Date getSentDate(MimeMessage msg) {
		Date date = null;
		try {
			date = msg.getSentDate();
		} catch (Exception e) {
			log.error("获取发送日期失败：", e);
		}
		return date;
	}

	/**
	 * 判断邮件是否需要阅读回执
	 * 
	 * @param msg
	 *            邮件内容
	 * @return 需要回执返回true,否则返回false
	 * @throws MessagingException
	 */
	public static int isReplySign(MimeMessage msg) {
		int replySign = 0;
		try {
			if (msg.getHeader("Disposition-Notification-To") != null)
				replySign = 1;
		} catch (Exception e) {
			log.error("判断邮件是否需要阅读回执出错", e);
		}
		return replySign;
	}

	/**
	 * 获得邮件的优先级
	 * 
	 * @param msg
	 *            邮件内容
	 * @return 1(High):紧急 3:普通(Normal) 5:低(Low)
	 * @throws MessagingException
	 */
	public static String getPriority(MimeMessage msg){
		String priority = "普通";
		try{
			String[] headers = msg.getHeader("X-Priority");
			if (headers != null) {
				String headerPriority = headers[0];
				if (headerPriority.indexOf("1") != -1 || headerPriority.indexOf("High") != -1)
					priority = "紧急";
				else if (headerPriority.indexOf("5") != -1 || headerPriority.indexOf("Low") != -1)
					priority = "低";
				else
					priority = "普通";
			}
		}catch(Exception e){
			log.error("获取邮件优先级出错",e);
		}
		
		return priority;
	}

	/**
	 * 判断邮件中是否包含附件
	 * 
	 * @param msg
	 *            邮件内容
	 * @return 邮件中存在附件返回true，不存在返回false
	 * @throws MessagingException
	 * @throws IOException
	 */
	public static boolean isContainAttachment(Part part) {
		boolean flag = false;
		try {
			if (part.isMimeType("multipart/*")) {
				MimeMultipart multipart = (MimeMultipart) part.getContent();
				int partCount = multipart.getCount();
				for (int i = 0; i < partCount; i++) {
					BodyPart bodyPart = multipart.getBodyPart(i);
					String disp = bodyPart.getDisposition();
					if (disp != null && (disp.equalsIgnoreCase(Part.ATTACHMENT) || disp.equalsIgnoreCase(Part.INLINE))) {
						flag = true;
					} else if (bodyPart.isMimeType("multipart/*")) {
						flag = isContainAttachment(bodyPart);
					} else {
						String contentType = bodyPart.getContentType();
						if (contentType.indexOf("application") != -1) {
							flag = true;
						}
						if (contentType.indexOf("name") != -1) {
							flag = true;
						}
					}
					if (flag)
						break;
				}
			} else if (part.isMimeType("message/rfc822")) {
				flag = isContainAttachment((Part) part.getContent());
			}
		} catch (Exception e) {
			log.error("判断是否有附件异常",e);
		}
		return flag;
	}

	/**
	 * 判断邮件是否已读
	 * 
	 * @param msg
	 *            邮件内容
	 * @return 如果邮件已读返回true,否则返回false
	 * @throws MessagingException
	 */
	public static int isSeen(MimeMessage msg) throws MessagingException {
		if (msg.getFlags().contains(Flags.Flag.SEEN))
			return 1;
		else
			return 0;
	}

	/**
	 * 获取邮件文本内容
	 * 
	 * @param part
	 *            邮件体
	 * @param content
	 *            存储邮件文本内容的字符串
	 * @throws MessagingException
	 * @throws IOException
	 */
	public static void getMailTextContent(Part part, StringBuffer content, int type) {
		// 如果是文本类型的附件，通过getContent方法可以取到文本内容，但这不是我们需要的结果，所以在这里要做判断
		boolean isContainTextAttach = false;
		try {
			isContainTextAttach = part.getContentType().indexOf("name") > 0;
			if (part.isMimeType("text/html") && !isContainTextAttach) {
				content.append(part.getContent().toString());
			} else if (part.isMimeType("text/*") && !isContainTextAttach && type != 2) {
				content.append(part.getContent().toString());
			} else if (part.isMimeType("message/rfc822")) {
				getMailTextContent((Part) part.getContent(), content, 0);
			} else if (part.isMimeType("multipart/*")) {
				Multipart multipart = (Multipart) part.getContent();
				for (int i = 0; i < multipart.getCount(); i++) {
					BodyPart bodyPart = multipart.getBodyPart(i);
					if (part.isMimeType("multipart/alternative"))
						getMailTextContent(bodyPart, content, 2);
					else
						getMailTextContent(bodyPart, content, 0);
				}
			}
		} catch (Exception e) {
			log.error("获取邮件正文异常:",e);
		} 
	}
}
