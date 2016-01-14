package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hemologica.dao.enums.SentOptions;


/**
 * The persistent class for the notifications_persons database table.
 * 
 */
@Entity
@Table(name="notifications_persons")
@NamedQuery(name="NotificationsPerson.findAll", query="SELECT n FROM NotificationsPerson n")
public class NotificationsPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//bi-directional many-to-one association to Notification
	@ManyToOne
	@JoinColumn(name="notifications_id")
	private Notification notification;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="persons_id")
	private Person person;
	
	@Column(name="notification_person_sended")
	private SentOptions sentOption;

	public NotificationsPerson() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public SentOptions getSentOption() {
		return sentOption;
	}

	public void setSentOption(SentOptions sentOption) {
		this.sentOption = sentOption;
	}
	
}