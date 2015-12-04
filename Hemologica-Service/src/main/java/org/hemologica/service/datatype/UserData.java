package org.hemologica.service.datatype;

public class UserData {
	
	
	private Long personId;
	private String mail;
	
	
	public UserData(Long personId, String mail){
		
		this.personId = personId;
		this.mail = mail;
	}
	
	public UserData(Integer personId){}
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
