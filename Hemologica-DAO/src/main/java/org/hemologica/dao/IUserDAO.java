package org.hemologica.dao;

import org.hemologica.dao.model.User;

public interface IUserDAO extends IGenericDAO<User>{

	public User findById(String id);
	public User findByToken(String token);

}
