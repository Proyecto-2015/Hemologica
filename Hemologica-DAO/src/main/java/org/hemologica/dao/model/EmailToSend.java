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
@Table(name="email_to_send")
@NamedQueries({
@NamedQuery(name="EmailToSend.findAll", query="SELECT d FROM EmailToSend d"),
@NamedQuery(name="EmailToSend.findById", query="SELECT d FROM EmailToSend d WHERE d.emailToSendId = :id"),
@NamedQuery(name="EmailToSend.findByDate", query="SELECT d FROM EmailToSend d WHERE d.emailToSendDate <= :value"),
})
public class EmailToSend {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="email_to_send_id")
	private Long emailToSendId;

	@Column(name="email_to_send_subject")
	private String emailToSendSubject;

	@Column(name="email_to_send_text", columnDefinition = "LONGTEXT")
	private String emailToSendText;
	
	@Column(name="email_to_send_date")
	@Temporal(TemporalType.DATE)
	private Calendar emailToSendDate;
	
	@ManyToOne
	@JoinColumn(name="email_to_send_person_id")
	private Person emailToSendPerson;

	public Long getEmailToSendId() {
		return emailToSendId;
	}

	public void setEmailToSendId(Long emailToSendId) {
		this.emailToSendId = emailToSendId;
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

	public Person getEmailToSendPerson() {
		return emailToSendPerson;
	}

	public void setEmailToSendPerson(Person emailToSendPerson) {
		this.emailToSendPerson = emailToSendPerson;
	}
	
}
