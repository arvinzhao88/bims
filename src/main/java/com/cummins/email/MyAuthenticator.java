package com.cummins.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 
 * @ClassName: MyAuthenticator
 * @Description: 认证器继承父类，重写构造方法以及密码认证方法，
 * 
 */
public class MyAuthenticator extends Authenticator {
	private String userName = null;
	private String password = null;

	public MyAuthenticator() {
	}

	public MyAuthenticator(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	/*
	 * (non-Javadoc) <p>Title: getPasswordAuthentication</p> <p>Description:
	 * 重写父类的密码认证方法</p>
	 * 
	 * @return: PasswordAuthentication
	 * 
	 * @see javax.mail.Authenticator#getPasswordAuthentication()
	 */
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}
