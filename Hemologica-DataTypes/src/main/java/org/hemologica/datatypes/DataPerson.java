package org.hemologica.datatypes;

import java.io.Serializable;

public class DataPerson implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1221320030601695117L;
	
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private String documentType;
	private String documentNumber;
	private String birthdayDate;
	private DataState state;
	private DataCity city;
	private String address;
	private String telephone;
	private String email;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstLastName() {
		return firstLastName;
	}
	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}
	public String getSecondLastName() {
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public DataState getState() {
		return state;
	}
	public void setState(DataState state) {
		this.state = state;
	}
	public DataCity getCity() {
		return city;
	}
	public void setCity(DataCity city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
