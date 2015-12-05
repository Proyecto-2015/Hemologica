package org.hemologica.yodono.ejb.beans;

import javax.ejb.Local;

import org.hemologica.datatypes.DataUser;

@Local
public interface UserBeanLocal {

	public DataUser getDataUserFirstAccess(String token);
	public void updateUserFirstAccess(DataUser data) throws Exception;
}
