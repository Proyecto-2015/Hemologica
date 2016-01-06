package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Calendar;


public class DataEmailSent implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String emailSentSubject;
	private String emailSentText;
	private Calendar emailSentDate;
	private DataPerson emailToSentPerson;
	private String emailSentTo;
	private String emailSentFrom;
	private Calendar emailEffectiveSentDate;
	
	public String getEmailSentSubject() {
		return emailSentSubject;
	}
	public void setEmailSentSubject(String emailSentSubject) {
		this.emailSentSubject = emailSentSubject;
	}
	public String getEmailSentText() {
		return emailSentText;
	}
	public void setEmailSentText(String emailSentText) {
		this.emailSentText = emailSentText;
	}
	public Calendar getEmailSentDate() {
		return emailSentDate;
	}
	public void setEmailSentDate(Calendar emailSentDate) {
		this.emailSentDate = emailSentDate;
	}
	public DataPerson getEmailToSentPerson() {
		return emailToSentPerson;
	}
	public void setEmailToSentPerson(DataPerson emailToSentPerson) {
		this.emailToSentPerson = emailToSentPerson;
	}
	public String getEmailSentTo() {
		return emailSentTo;
	}
	public void setEmailSentTo(String emailSentTo) {
		this.emailSentTo = emailSentTo;
	}
	public String getEmailSentFrom() {
		return emailSentFrom;
	}
	public void setEmailSentFrom(String emailSentFrom) {
		this.emailSentFrom = emailSentFrom;
	}
	public Calendar getEmailEffectiveSentDate() {
		return emailEffectiveSentDate;
	}
	public void setEmailEffectiveSentDate(Calendar emailEffectiveSentDate) {
		this.emailEffectiveSentDate = emailEffectiveSentDate;
	}

}
