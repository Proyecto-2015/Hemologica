package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persons database table.
 * 
 */
@Entity
@Table(name="persons")
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private String id;

	//bi-directional many-to-one association to Identification
	@OneToMany(mappedBy="person")
	private List<Identification> identifications;

	//bi-directional many-to-one association to NotificationsPerson
	@OneToMany(mappedBy="person")
	private List<NotificationsPerson> notificationsPersons;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_id", nullable=false)
	private User user;

	public Person() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Identification> getIdentifications() {
		return this.identifications;
	}

	public void setIdentifications(List<Identification> identifications) {
		this.identifications = identifications;
	}

	public Identification addIdentification(Identification identification) {
		getIdentifications().add(identification);
		identification.setPerson(this);

		return identification;
	}

	public Identification removeIdentification(Identification identification) {
		getIdentifications().remove(identification);
		identification.setPerson(null);

		return identification;
	}

	public List<NotificationsPerson> getNotificationsPersons() {
		return this.notificationsPersons;
	}

	public void setNotificationsPersons(List<NotificationsPerson> notificationsPersons) {
		this.notificationsPersons = notificationsPersons;
	}

	public NotificationsPerson addNotificationsPerson(NotificationsPerson notificationsPerson) {
		getNotificationsPersons().add(notificationsPerson);
		notificationsPerson.setPerson(this);

		return notificationsPerson;
	}

	public NotificationsPerson removeNotificationsPerson(NotificationsPerson notificationsPerson) {
		getNotificationsPersons().remove(notificationsPerson);
		notificationsPerson.setPerson(null);

		return notificationsPerson;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}