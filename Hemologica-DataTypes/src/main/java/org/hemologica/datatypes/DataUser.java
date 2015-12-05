package org.hemologica.datatypes;

import java.util.List;

public class DataUser {

	private Long userId;
	private Long personId;
	private String username;
	private String password;
	
//	List<DataRole> roles;
//	List<DataPermision> roles;
	
	List<DataBank> banks;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
		
}
