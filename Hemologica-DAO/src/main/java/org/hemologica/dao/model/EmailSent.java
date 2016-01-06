package org.hemologica.dao.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="email_sent")
@NamedQueries({
@NamedQuery(name="EmailSent.findAll", query="SELECT d FROM EmailSent d"),
//@NamedQuery(name="EmailSent.findByDate", query="SELECT d FROM EmailSent d WHERE d.emailToSendDate = :date"),
})
public class EmailSent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="email_sent_id")
	private Long emailSentId;

	@Column(name="email_sent_subject")
	private String emailSentSubject;

	@Column(name="email_sent_text", columnDefinition = "LONGTEXT")
	private String emailSentText;
	
	@Column(name="email_sent_date")
	@Temporal(TemporalType.DATE)
	private Calendar emailSentDate;
	
	@ManyToOne
	@JoinColumn(name="email_sent_person_id")
	private Person emailSentPerson;
	
	@Column(name="email_sent_to")
	private String emailSentTo;
	
	@Column(name="email_sent_from")
	private String emailSentFrom;
	
	@Column(name="email_effective_sent_date")
	@Temporal(TemporalType.DATE)
	private Calendar emailEffectiveSentDate;

	public Long getEmailSentId() {
		return emailSentId;
	}

	public void setEmailSentId(Long emailSentId) {
		this.emailSentId = emailSentId;
	}

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

	public Person getEmailSentPerson() {
		return emailSentPerson;
	}

	public void setEmailSentPerson(Person emailSentPerson) {
		this.emailSentPerson = emailSentPerson;
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
