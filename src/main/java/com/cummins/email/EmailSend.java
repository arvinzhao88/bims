package com.cummins.email;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSend {

	 public static void main(String args[]) {
		 System.out.println("ddd");
		 /*EmailRequest email = new EmailRequest();
		 email.setFromAddress("CS_Admin@cummins.com");
		 email.setContent("这是一份这是一份这是一份这是一份这是一份这是一份 ");
		 email.setSubject("这是一份");
		 email.setReceiveAddresses("Jy957@cummins.com");
		 
		 EmailSendUtil.sendHtmlMail("192.168.66.161", 25, 0, "", "", email);*/
		 
		 //EmailSend.send();
	 }
	 
	 
	public static void send(EmailRequest email){
	     // SUBSTITUTE YOUR EMAIL ADDRESSES HERE!
	     String to = email.getReceiveAddresses();//"Jy957@cummins.com";
	     String from = email.getFromAddress();//"Jy957@cummins.com";
	     // SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!
	     String host = "192.168.66.161";

	     // Create properties, get Session
	     Properties props = new Properties();

	     //http://docs.oracle.com/javaee/6/api/javax/mail/Session.html
	     // If using static Transport.send(),
	     // need to specify which host to send it to
	     props.put("mail.smtp.host", host);
	     // To see what is going on behind the scene
	     props.put("mail.debug", "true");
	     props.put("mail.smtp.auth", "false");
	     Session session = Session.getInstance(props);

	     try {
	         // Instantiate a message
	         Message msg = new MimeMessage(session);

	         //Set message attributes
	         msg.setFrom(new InternetAddress(from));
	         InternetAddress[] address = {new InternetAddress(to)};
	         msg.setRecipients(Message.RecipientType.TO, address);
	         msg.setSubject(email.getSubject());
	         msg.setSentDate(new Date());
	         //msg.setHeader("dd", "dd");
	         // Set message content
	         msg.setText(email.getContent());

	         //Send the message
	         Transport.send(msg);
	     }
	     catch (MessagingException mex) {
	         // Prints all nested (chained) exceptions as well
	         mex.printStackTrace();
	     }
	 }
}
