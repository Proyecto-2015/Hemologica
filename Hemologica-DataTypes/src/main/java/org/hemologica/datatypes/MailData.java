package org.hemologica.datatypes;

public class MailData {
	
	private MessageOptionData messageOption;
	private BloodTypeData bloodType;
	private String subject;
	private String text;
	
	
	public MessageOptionData getMessageOption() {
		return messageOption;
	}
	public void setMessageOption(MessageOptionData messageOption) {
		this.messageOption = messageOption;
	}
	public BloodTypeData getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodTypeData bloodType) {
		this.bloodType = bloodType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
