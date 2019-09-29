package com.cummins.email;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.cummins.util.JsonResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class EmailSendUtil {
	 private static Log log = LogFactory.getLog(EmailSendUtil.class);
	 
	 public static void main(String args[]) {
		 System.out.println("ddd");
		 EmailRequest email = new EmailRequest();
		 email.setFromAddress("CS_Admin@cummins.com");
		 email.setContent("这是一份这是一份这是一份这是一份这是一份这是一份 ");
		 email.setSubject("这是一份");
		 email.setReceiveAddresses("1582166736@qq.com");
		 
		 EmailSendUtil.sendHtmlMail("192.168.66.161",  email);
	 }
	 
	 
	  public static String sendHtmlMail(String host, EmailRequest email) {
		  	String ssl="false";
	        JsonResult json = new JsonResult();
	        json.setSuccess(false);
	        MyAuthenticator authenticator = null;
			Properties pro = new Properties();
			pro.setProperty("mail.smtp.host", host);
			//pro.setProperty("mail.smtp.port",String.valueOf(port));
			//pro.setProperty("mail.transport.protocol", "smtp");      
			pro.setProperty("mail.smtp.auth", "false");
			//pro.setProperty("mail.smtp.connectiontimeout", "20000"); // 90秒超时
			//pro.setProperty("mail.smtp.user", userName);
			//pro.setProperty("mail.smtp.ssl.enable", ssl); 
			//mail.smtp.starttls.enable outlook邮箱需要ttls 加密协议 
			//pro.setProperty("mail.smtp.starttls.enable", "true");
			authenticator = new MyAuthenticator("", "");
			Session sendMailSession = Session.getInstance(pro, authenticator);
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建发送者地址
			Address from;
			try {
				from = new InternetAddress(email.getFromAddress());
			} catch (AddressException e) {
				log.error("发件人地址错误，请检查1",e);
				return "发件人地址错误";
			}catch (Exception e) {
				log.error("发件人地址错误，请检查2",e);
				return "发件人地址错误";
			}
			try {
				mailMessage.setFrom(from);
			} catch (MessagingException e) {
				log.error("发件人地址错误，请检查2",e);
				return "发件人地址错误";
			} 
			// 收件人
			int lengthTo=0;
			try {
				Address[] addressGGL=getAdresses(email.getReceiveAddresses());
				lengthTo=addressGGL.length;
				mailMessage.setRecipients(Message.RecipientType.TO,addressGGL);
			} catch (AddressException e) {
				log.error("收件人地址错误，请检查1",e);
				return "收件人地址错误";
			} catch (MessagingException e) {
				log.error("收件人地址错误，请检查2",e);
				return "收件人地址错误";
			}
			//抄送人
	        try {
				mailMessage.addRecipients(Message.RecipientType.CC,getAdresses(email.getCopyAddresses()));
			} catch (AddressException e) {
				log.error("抄送人地址错误，请检查1",e);
				return "抄送人地址错误";
			} catch (MessagingException e) {
				log.error("抄送人地址错误，请检查2",e);
				return "抄送人地址错误";
			} 
	        //密送人
	        try {
				mailMessage.addRecipients(Message.RecipientType.BCC,getAdresses(email.getBccAddresses()));
			} catch (AddressException e) {
				log.error("密送人地址错误，请检查1",e);
				return "密送人地址错误";
			} catch (MessagingException e) {
				log.error("密送人地址错误，请检查2",e);
				return "密送人地址错误";
			} 
			try {
				mailMessage.setSubject(email.getSubject());
			} catch (MessagingException e) {
				log.error("主题不能为空，不能包含特殊字符",e);
				return "主题不能为空，不能包含特殊字符";
			} // 设置邮件消息的主题
			/*try {
				mailMessage.setSentDate(email.getSendTime());
			} catch (MessagingException e) {
				e.printStackTrace();
				log.error("发送时间");
				return "主题不能为空，不能包含特殊字符";
			} // 设置邮件的发送时间
	*/		Multipart mainPart = new MimeMultipart(); // 设置邮件消息的MIME编码
			BodyPart html = new MimeBodyPart(); // 创建一个包含HTML内容的MimeBodyPart
			// 设置HTML内容
			try {
				html.setContent(email.getContent(), "text/html;charset=utf-8");
			} catch (MessagingException e) {
				log.error("邮件内容设置出错",e);
				return "邮件内容不能为空，不能包含特殊字符";
			}
			try {
				mainPart.addBodyPart(html);
			} catch (MessagingException e) {
				log.error("发送出错1",e);
				return "发送失败，请稍后重试";
			}
			try {
				mailMessage.setContent(mainPart);
			} catch (MessagingException e) {
				log.error("发送出错2",e);
				return "发送失败，请稍后重试";
			} // 将MIniMultipart对象设置为邮件内容
			sendMailSession.setDebug(true);
			try {
				Transport.send(mailMessage);
			} catch (MessagingException e) {
				log.error("发送出错3",e);
				if(e.getMessage()!=null&&e.getMessage().trim().equals("Invalid Addresses")){
					log.error("发送出错4",e);
					return "邮箱不正确！请核查";
					//System.out.println("邮箱地址不正确！");
				}else if(e.getMessage()!=null&&e.getMessage().trim().equals("535 Authentication failed")){
					log.error("发送出错5",e);
					return "邮箱或密码错误。";
				}else if(e.getMessage().trim().indexOf("535 Error: authentication failed".trim())!=-1){
					log.error("发件箱账号密码错误  535 Error: authentication failed  ",e);
					return "邮箱或密码错误。";
				}else if(e.getMessage().trim().indexOf("550 Mailbox not found or access denied ".trim())!=-1){
					log.error(e.getMessage().trim());
					if(lengthTo==1){
						return "5501";
					}
					return "550";
				}else{
					return "发件服务器配置错误";
				}
			}catch (Exception e) {
				if(e.getMessage()!=null&&e.getMessage().trim().equals("Invalid Addresses")){
					log.error("发送出错6",e);
					return "邮箱不正确！请核查";
				}else if(e.getMessage()!=null&&e.getMessage().trim().equals("535 Authentication failed")){
					log.error("发送出错7",e);
					return "邮箱或密码错误。";
				}else{
					log.error("发送出错8",e);
					return "邮箱或密码错误。";
				}
			} 
			return "success";
	    }
	  
		private static Address[] getAdresses(String addresses) throws AddressException {
			Address[] address=null;
	        if(addresses!=null&&!addresses.trim().equals("")){
	            if(addresses.trim().contains(";")){
	            	String[] temp=addresses.split(";");
	            	if(temp!=null&&temp.length>0){
	            		 address=new Address[temp.length];
	            		 for(int i=0;i<temp.length;i++){
	            			if(temp[i]!=null&&!temp[i].trim().equals("")){
	            				String sdf=temp[i];
	            				String add_="";
	            				sdf.replaceAll("&lt;","<").replaceAll("&gt;",">");
	            				if(sdf.contains("<")&&sdf.contains(">")){
	            					 Matcher m = Pattern.compile("<([\\s\\S]*?)>").matcher(sdf);
	            				     while(m.find())  	add_=m.group(1);
	        				    }else{
	        				    	add_=sdf;
	        				    }
	            				if(add_!=null&&!add_.trim().equals("")&&add_.contains("@")){
	            				   address[i]=new InternetAddress(add_);
	            				}
	            			}
	            		}
	            	}
	            }else{
	            	address=new Address[1];
	            	String sdf=addresses.trim();
	            	String add_="";
	            	if(sdf.contains("<")&&sdf.contains(">")){
						 Matcher m = Pattern.compile("<([\\s\\S]*?)>").matcher(sdf);
					     while(m.find())  	add_=m.group(1);
				    }else{
				    	add_=sdf;
				    }
					if(add_!=null&&!add_.trim().equals("")&&add_.contains("@")){
	            	    address[0]=new InternetAddress(add_);
					}
	            }
		     }
			return address;
		}
}
