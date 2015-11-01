package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the identifications database table.
 * 
 */
@Entity
@Table(name="identifications")
@NamedQuery(name="Identification.findAll", query="SELECT i FROM Identification i")
public class Identification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="identificacion_code")
	private String identificacionCode;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="persons_id")
	private Person person;

	//bi-directional many-to-one association to IdentificationsHistory
	@OneToMany(mappedBy="identification")
	private List<IdentificationsHistory> identificationsHistories;

	//bi-directional many-to-one association to PersonsRecord
	@OneToMany(mappedBy="identification")
	private List<PersonsRecord> personsRecords;

	public Identification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacionCode() {
		return this.identificacionCode;
	}

	public void setIdentificacionCode(String identificacionCode) {
		this.identificacionCode = identificacionCode;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<IdentificationsHistory> getIdentificationsHistories() {
		return this.identificationsHistories;
	}

	public void setIdentificationsHistories(List<IdentificationsHistory> identificationsHistories) {
		this.identificationsHistories = identificationsHistories;
	}

	public IdentificationsHistory addIdentificationsHistory(IdentificationsHistory identificationsHistory) {
		getIdentificationsHistories().add(identificationsHistory);
		identificationsHistory.setIdentification(this);

		return identificationsHistory;
	}

	public IdentificationsHistory removeIdentificationsHistory(IdentificationsHistory identificationsHistory) {
		getIdentificationsHistories().remove(identificationsHistory);
		identificationsHistory.setIdentification(null);

		return identificationsHistory;
	}

	public List<PersonsRecord> getPersonsRecords() {
		return this.personsRecords;
	}

	public void setPersonsRecords(List<PersonsRecord> personsRecords) {
		this.personsRecords = personsRecords;
	}

	public PersonsRecord addPersonsRecord(PersonsRecord personsRecord) {
		getPersonsRecords().add(personsRecord);
		personsRecord.setIdentification(this);

		return personsRecord;
	}

	public PersonsRecord removePersonsRecord(PersonsRecord personsRecord) {
		getPersonsRecords().remove(personsRecord);
		personsRecord.setIdentification(null);

		return personsRecord;
	}

}