package org.hemologica.datatypes;

import java.util.List;

public class DataUser {

	private String personId;
	
//	List<DataRole> roles;
//	List<DataPermision> roles;
	
	List<DataBank> banks;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	
		
}
