package org.hemologica.service.business;

import java.io.Serializable;

import org.hemologica.service.datatype.UserData;

public interface IUserBean extends Serializable{

	public void createUser(UserData data);
	
}
