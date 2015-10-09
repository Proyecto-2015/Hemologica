/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "person")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
	@NamedQuery(name = "Person.findByPersonId", query = "SELECT p FROM Person p WHERE p.personId = :personId"),
	@NamedQuery(name = "Person.findByPersonDocument", query = "SELECT p FROM Person p WHERE p.personDocument = :personDocument"),
	@NamedQuery(name = "Person.findByPersonFirstName", query = "SELECT p FROM Person p WHERE p.personFirstName = :personFirstName"),
	@NamedQuery(name = "Person.findByPersonSecondName", query = "SELECT p FROM Person p WHERE p.personSecondName = :personSecondName"),
	@NamedQuery(name = "Person.findByPersonFirstSurname", query = "SELECT p FROM Person p WHERE p.personFirstSurname = :personFirstSurname"),
	@NamedQuery(name = "Person.findByPersonSecondSurname", query = "SELECT p FROM Person p WHERE p.personSecondSurname = :personSecondSurname"),
	@NamedQuery(name = "Person.findByPersonBirthday", query = "SELECT p FROM Person p WHERE p.personBirthday = :personBirthday"),
	@NamedQuery(name = "Person.findByPersonAddress", query = "SELECT p FROM Person p WHERE p.personAddress = :personAddress"),
	@NamedQuery(name = "Person.findByPersonAddressPostalCode", query = "SELECT p FROM Person p WHERE p.personAddressPostalCode = :personAddressPostalCode"),
	@NamedQuery(name = "Person.findByPersonAddressPostalCodeGmap", query = "SELECT p FROM Person p WHERE p.personAddressPostalCodeGmap = :personAddressPostalCodeGmap")})
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "person_id")
	private Long personId;
	@Size(max = 45)
    @Column(name = "person_document")
	private String personDocument;
	@Size(max = 45)
    @Column(name = "person_first_name")
	private String personFirstName;
	@Size(max = 45)
    @Column(name = "person_second_name")
	private String personSecondName;
	@Size(max = 45)
    @Column(name = "person_first_surname")
	private String personFirstSurname;
	@Size(max = 45)
    @Column(name = "person_second_surname")
	private String personSecondSurname;
	@Column(name = "person_birthday")
    @Temporal(TemporalType.DATE)
	private Date personBirthday;
	@Size(max = 45)
    @Column(name = "person_address")
	private String personAddress;
	@Size(max = 45)
    @Column(name = "person_address_postal_code")
	private String personAddressPostalCode;
	@Size(max = 45)
    @Column(name = "person_address_postal_code_gmap")
	private String personAddressPostalCodeGmap;

	public Person() {
	}

	public Person(Long personId) {
		this.personId = personId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonDocument() {
		return personDocument;
	}

	public void setPersonDocument(String personDocument) {
		this.personDocument = personDocument;
	}

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonSecondName() {
		return personSecondName;
	}

	public void setPersonSecondName(String personSecondName) {
		this.personSecondName = personSecondName;
	}

	public String getPersonFirstSurname() {
		return personFirstSurname;
	}

	public void setPersonFirstSurname(String personFirstSurname) {
		this.personFirstSurname = personFirstSurname;
	}

	public String getPersonSecondSurname() {
		return personSecondSurname;
	}

	public void setPersonSecondSurname(String personSecondSurname) {
		this.personSecondSurname = personSecondSurname;
	}

	public Date getPersonBirthday() {
		return personBirthday;
	}

	public void setPersonBirthday(Date personBirthday) {
		this.personBirthday = personBirthday;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getPersonAddressPostalCode() {
		return personAddressPostalCode;
	}

	public void setPersonAddressPostalCode(String personAddressPostalCode) {
		this.personAddressPostalCode = personAddressPostalCode;
	}

	public String getPersonAddressPostalCodeGmap() {
		return personAddressPostalCodeGmap;
	}

	public void setPersonAddressPostalCodeGmap(String personAddressPostalCodeGmap) {
		this.personAddressPostalCodeGmap = personAddressPostalCodeGmap;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (personId != null ? personId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Person)) {
			return false;
		}
		Person other = (Person) object;
		if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Person[ personId=" + personId + " ]";
	}
	
}
