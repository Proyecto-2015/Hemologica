package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the notifications database table.
 * 
 */
@Entity
@Table(name="notifications")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="notifications_bloodTypeABO")
	private BloodAboTypesCode bloodTypeABO;
	
	@ManyToOne
	@JoinColumn(name="notifications_bloodTypeRH")
	private BloodDTypesCode bloodTypeRH;
	
	@Column(name="notifications_subject")
	private String subject;
	
	@Column(name="notifications_text")
	@Lob
	private String text;
	
	@ManyToOne
	@JoinColumn(name="notifications_messageSendOption")
	private MessageSendOption messageSendOption;

	//bi-directional many-to-one association to NotificationsPerson
	@OneToMany(mappedBy="notification")
	private List<NotificationsPerson> notificationsPersons;

	public Notification() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BloodAboTypesCode getBloodTypeABO() {
		return bloodTypeABO;
	}

	public void setBloodTypeABO(BloodAboTypesCode bloodTypeABO) {
		this.bloodTypeABO = bloodTypeABO;
	}

	public BloodDTypesCode getBloodTypeRH() {
		return bloodTypeRH;
	}

	public void setBloodTypeRH(BloodDTypesCode bloodTypeRH) {
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

	public MessageSendOption getMessageSendOption() {
		return messageSendOption;
	}

	public void setMessageSendOption(MessageSendOption messageSendOption) {
		this.messageSendOption = messageSendOption;
	}

	public List<NotificationsPerson> getNotificationsPersons() {
		return this.notificationsPersons;
	}

	public void setNotificationsPersons(List<NotificationsPerson> notificationsPersons) {
		this.notificationsPersons = notificationsPersons;
	}

	public NotificationsPerson addNotificationsPerson(NotificationsPerson notificationsPerson) {
		getNotificationsPersons().add(notificationsPerson);
		notificationsPerson.setNotification(this);

		return notificationsPerson;
	}

	public NotificationsPerson removeNotificationsPerson(NotificationsPerson notificationsPerson) {
		getNotificationsPersons().remove(notificationsPerson);
		notificationsPerson.setNotification(null);

		return notificationsPerson;
	}

}