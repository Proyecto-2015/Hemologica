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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	//bi-directional many-to-one association to NotificationsPerson
	@OneToMany(mappedBy="notification")
	private List<NotificationsPerson> notificationsPersons;

	public Notification() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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