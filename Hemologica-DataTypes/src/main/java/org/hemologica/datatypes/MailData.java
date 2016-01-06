package org.hemologica.datatypes;

import java.io.Serializable;

public class MailData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private DataMessageOption messageOption;
	private DataCode bloodTypeABO;
	private DataCode bloodTypeRH;
	private DataCode bloodType;
	private String subject;
	private String text;
	
	
	public DataMessageOption getMessageOption() {
		return messageOption;
	}
	public void setMessageOption(DataMessageOption messageOption) {
		this.messageOption = messageOption;
	}

	public DataCode getBloodTypeABO() {
		return bloodTypeABO;
	}
	public void setBloodTypeABO(DataCode bloodTypeABO) {
		this.bloodTypeABO = bloodTypeABO;
	}
	public DataCode getBloodTypeRH() {
		return bloodTypeRH;
	}
	public void setBloodTypeRH(DataCode bloodTypeRH) {
		this.bloodTypeRH = bloodTypeRH;
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
	public DataCode getBloodType() {
		return bloodType;
	}
	public void setBloodType(DataCode bloodType) {
		this.bloodType = bloodType;
	}
	

}
