package com.cummins.email;

import java.io.File;
import java.net.URI;
import java.util.List;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.BodyType;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.Attachment;
import microsoft.exchange.webservices.data.property.complex.FileAttachment;
import microsoft.exchange.webservices.data.property.complex.MessageBody;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.ItemView;

public class ExchangeEmailUtil {
	/**
	serverName 接收邮件地址
	user 用户信息
	pwd 密码
	path 邮件临时储存路径
	max 每次接收邮件的最大数量
	**/

	public static int receive(String serverName, String user, String pwd, String path, int max) throws Exception {
	        //新建ExchangeVersion.Exchange2007_SP1版本的Exchange服务
	    ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
	    String[] userInfo = user.split("/");
	    //用户认证信息
	    	ExchangeCredentials credentials = new WebCredentials(userInfo[1], pwd,userInfo[0]);
	    	service.setCredentials(credentials);
	    	//设置Exchange连接的服务器地址
	    	service.setUrl(new URI(serverName));
	    	//绑定邮箱
	    	Folder inbox = Folder.bind(service, WellKnownFolderName.Inbox);
	    	//获取邮箱文件数量
	    	int count = inbox.getTotalCount();
	    	if(max > 0) count = count > max ? max : count;
	        //循环获取邮箱邮件
	    	ItemView view = new ItemView(count);
	        FindItemsResults<Item> findResults = service.findItems(inbox.getId(), view);
	        for (Item item : findResults.getItems()) {
	            EmailMessage message = EmailMessage.bind(service, item.getId());
	            System.out.println("标题："+message.getSubject());
	            System.out.println("正文："+message.getBody());
	            List<Attachment> attachs = message.getAttachments().getItems();
	            try{
	                if(message.getHasAttachments()){
	                    for(Attachment f : attachs){
	                    	if(f instanceof FileAttachment){
	                    	        //接收邮件到临时目录
	                    		File tempZip = new File(path,f.getName());
	                    		((FileAttachment)f).load(tempZip.getPath());
	                    	}
	                    }
	                    //删除邮件
//	                    message.delete(DeleteMode.HardDelete);
	                }
	            }catch(Exception err){
	            	err.printStackTrace();
	            }
	        }
	        return count;
	    }


    /**
     * 使用Exchange协议发送
     *
     * @throws Exception
     */
    public static void send(String subject, List<String> to, List<String> cc,
            String bodyText, String realPath,String serverName, String user, String pwd) throws Exception {
        //新建ExchangeVersion.Exchange2007_SP1版本的Exchange服务
        ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
        String[] userInfo = user.split("/");
        //用户认证信息
            ExchangeCredentials credentials = new WebCredentials(userInfo[1], pwd,userInfo[0]);
            service.setCredentials(credentials);
            //设置Exchange连接的服务器地址
            service.setUrl(new URI(serverName));

        //创建邮件
        EmailMessage msg = new EmailMessage(service);
        // 设置主题
        msg.setSubject(subject);
        // 邮件内容
        MessageBody body = MessageBody.getMessageBodyFromText(bodyText);
        body.setBodyType(BodyType.HTML);
        msg.setBody(body);
        // to
        for (String s : to) {
            msg.getToRecipients().add(s);
        }
        // cc
        if(cc!=null){
            for (String s : cc) {
                msg.getCcRecipients().add(s);
            }
        }

        // 附件
        if(realPath!=null&&!"".equals(realPath)){
            msg.getAttachments().addFileAttachment(realPath);
        }
        msg.send();
    }
	public static void main(String[] args) {
		try {
		    String serverName="https://mail.crc.com.hk/EWS/Exchange.asmx";
		    String user="crcgas/gas_wx";
		    String pwd="Crcgas99";
			receive(serverName,user,pwd,"/Users/szg/work/emailTemp",10);
//		    List<String> toList=new ArrayList<>();
//		    toList.add("szg@51box.cn");
// 		    send("测试邮件", toList, null, "测试邮件", null, serverName, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
