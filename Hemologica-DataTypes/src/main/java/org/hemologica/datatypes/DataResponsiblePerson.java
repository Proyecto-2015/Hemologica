package org.hemologica.datatypes;

public class DataResponsiblePerson {
	
	private Long id;
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private DataDocument documents;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	public DataDocument getDocuments() {
		return documents;
	}
	public void setDocuments(DataDocument documents) {
		this.documents = documents;
	}
	public String getFullName(){
		
		return firstName + " " + secondName + " " + firstLastName+ " " + secondLastName;
	}
	
}
