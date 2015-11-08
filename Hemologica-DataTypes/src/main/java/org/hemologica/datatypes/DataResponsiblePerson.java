package org.hemologica.datatypes;

public class DataResponsiblePerson {
	
	private String id;
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private String documentCountry;
	private String documentType;
	private String documentNumber;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDocumentCountry() {
		return documentCountry;
	}
	public void setDocumentCountry(String documentCountry) {
		this.documentCountry = documentCountry;
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
	
	public String getFullName(){
		
		return firstName + " " + secondName + " " + firstLastName+ " " + secondLastName;
	}
	
}
