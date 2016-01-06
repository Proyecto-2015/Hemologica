package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Calendar;


public class DataEmailToSend implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String emailToSendSubject;
	private String emailToSendText;
	private Calendar emailToSendDate;
	private DataPerson emailToSendPerson;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailToSendSubject() {
		return emailToSendSubject;
	}
	public void setEmailToSendSubject(String emailToSendSubject) {
		this.emailToSendSubject = emailToSendSubject;
	}
	public String getEmailToSendText() {
		return emailToSendText;
	}
	public void setEmailToSendText(String emailToSendText) {
		this.emailToSendText = emailToSendText;
	}
	public Calendar getEmailToSendDate() {
		return emailToSendDate;
	}
	public void setEmailToSendDate(Calendar emailToSendDate) {
		this.emailToSendDate = emailToSendDate;
	}
	public DataPerson getEmailToSendPerson() {
		return emailToSendPerson;
	}
	public void setEmailToSendPerson(DataPerson emailToSendPerson) {
		this.emailToSendPerson = emailToSendPerson;
	}	

}
