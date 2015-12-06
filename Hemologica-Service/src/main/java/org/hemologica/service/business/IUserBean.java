package org.hemologica.service.business;

import java.io.Serializable;

import org.hemologica.service.datatype.MailData;
import org.hemologica.service.datatype.UserData;

public interface IUserBean extends Serializable{

	public MailData createUser(UserData data) throws Exception;
	
}
