package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persons database table.
 * 
 */
@Entity
@Table(name="persons")
@NamedQueries({
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p"),
@NamedQuery(name="Person.findById", query="SELECT p FROM Person p where p.id = :id"),
})
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="person_address")
	private String personAddress;

	@Temporal(TemporalType.DATE)
	@Column(name="person_birthday")
	private Date personBirthday;

	@Column(name="person_first_lastname")
	private String personFirstLastname;

	@Column(name="person_first_name")
	private String personFirstName;

	@Column(name="person_second_lastname")
	private String personSecondLastname;

	@Column(name="person_second_name")
	private String personSecondName;

	@Column(name="person_telephone")
	private String personTelephone;
	
	@Column(name="person_email")
	private String personEmail;
	
	@Column(name="person_allow_notification_able")
	private boolean allowNotificationAbleToDonate;
	
	@Column(name="person_allow_notification_need_donor")
	private boolean allowNotificationNeedDonor;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="person")
	private List<Document> documents;

	//bi-directional many-to-one association to Identification
	@OneToMany(mappedBy="person")
	private List<Identification> identifications;

	//bi-directional many-to-one association to NotificationsPerson
	@OneToMany(mappedBy="person")
	private List<NotificationsPerson> notificationsPersons;

	//bi-directional many-to-one association to CitiesCode
	@ManyToOne
	@JoinColumn(name="person_city")
	private CitiesCode citiesCode;
	
	@ManyToOne
	@JoinColumn(name="person_state")
	private StatesCode stateCode;
	
	@Column(name="person_zip_code")
	private String zipCode;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="person")
	private List<User> users;

	public Person() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonAddress() {
		return this.personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public Date getPersonBirthday() {
		return this.personBirthday;
	}

	public void setPersonBirthday(Date personBirthday) {
		this.personBirthday = personBirthday;
	}

	public String getPersonFirstLastname() {
		return this.personFirstLastname;
	}

	public void setPersonFirstLastname(String personFirstLastname) {
		this.personFirstLastname = personFirstLastname;
	}

	public String getPersonFirstName() {
		return this.personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonSecondLastname() {
		return this.personSecondLastname;
	}

	public void setPersonSecondLastname(String personSecondLastname) {
		this.personSecondLastname = personSecondLastname;
	}

	public String getPersonSecondName() {
		return this.personSecondName;
	}

	public void setPersonSecondName(String personSecondName) {
		this.personSecondName = personSecondName;
	}

	public String getPersonTelephone() {
		return this.personTelephone;
	}

	public void setPersonTelephone(String personTelephone) {
		this.personTelephone = personTelephone;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	public boolean getAllowNotificationAbleToDonate() {
		return allowNotificationAbleToDonate;
	}

	public void setAllowNotificationAbleToDonate(boolean allowNotificationAbleToDonate) {
		this.allowNotificationAbleToDonate = allowNotificationAbleToDonate;
	}

	public boolean getAllowNotificationNeedDonor() {
		return allowNotificationNeedDonor;
	}

	public void setAllowNotificationNeedDonor(boolean allowNotificationNeedDonor) {
		this.allowNotificationNeedDonor = allowNotificationNeedDonor;
	}
	
	public StatesCode getStateCode() {
		return stateCode;
	}

	public void setStateCode(StatesCode stateCode) {
		this.stateCode = stateCode;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setPerson(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setPerson(null);

		return document;
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

	public CitiesCode getCitiesCode() {
		return this.citiesCode;
	}

	public void setCitiesCode(CitiesCode citiesCode) {
		this.citiesCode = citiesCode;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}