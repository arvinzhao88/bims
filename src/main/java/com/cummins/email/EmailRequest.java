package com.cummins.email;

public class EmailRequest {
	private String fromAddress;
	private String receiveAddresses;
	private String copyAddresses;
	private String bccAddresses;
	private String subject;
	private String content;
	
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	
	public String getReceiveAddresses() {
		return receiveAddresses;
	}
	public void setReceiveAddresses(String receiveAddresses) {
		this.receiveAddresses = receiveAddresses;
	}
	public String getCopyAddresses() {
		return copyAddresses;
	}
	public void setCopyAddresses(String copyAddresses) {
		this.copyAddresses = copyAddresses;
	}
	public String getBccAddresses() {
		return bccAddresses;
	}
	public void setBccAddresses(String bccAddresses) {
		this.bccAddresses = bccAddresses;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
