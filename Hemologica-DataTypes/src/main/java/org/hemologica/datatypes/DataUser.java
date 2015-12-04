package org.hemologica.datatypes;

import java.util.List;

public class DataUser {

	private String userId;
	private String personId;
	private String username;
	private String password;
	
//	List<DataRole> roles;
//	List<DataPermision> roles;
	
	List<DataBank> banks;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
		
}
