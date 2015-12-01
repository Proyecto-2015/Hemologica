package org.hemologica.datatypes;

import java.io.Serializable;

public class DataPerson implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1221320030601695117L;
	
	private String id;
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private String documentCountry;
	private String documentType;
	private String documentNumber;
	private String birthdayDate;
	private DataCode state;
	private DataCode city;
	private String address;
	private String telephone;
	private String email;
	private DataBloodType bloodType;
	private boolean ableToDonate;
	private byte[] image;
	private boolean allowNotificationNeedDonor;
	private boolean allowNotificationAbleToDonate;
	private String zipCode;
	
	public String getDocumentCountry() {
		return documentCountry;
	}
	public void setDocumentCountry(String documentCountry) {
		this.documentCountry = documentCountry;
	}
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
	public DataCode getState() {
		return state;
	}
	public void setState(DataCode state) {
		this.state = state;
	}
	public DataCode getCity() {
		return city;
	}
	public void setCity(DataCode city) {
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
	public String getFullName() {
		
		return firstName + " " + secondName + " " + firstLastName+ " " + secondLastName;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DataBloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(DataBloodType bloodType) {
		this.bloodType = bloodType;
	}
	public boolean isAbleToDonate() {
		return ableToDonate;
	}
	public void setAbleToDonate(boolean ableToDonate) {
		this.ableToDonate = ableToDonate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public boolean isAllowNotificationNeedDonor() {
		return allowNotificationNeedDonor;
	}
	public void setAllowNotificationNeedDonor(boolean allowNotificationNeedDonor) {
		this.allowNotificationNeedDonor = allowNotificationNeedDonor;
	}
	public boolean isAllowNotificationAbleToDonate() {
		return allowNotificationAbleToDonate;
	}
	public void setAllowNotificationAbleToDonate(boolean allowNotificationAbleToDonate) {
		this.allowNotificationAbleToDonate = allowNotificationAbleToDonate;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
