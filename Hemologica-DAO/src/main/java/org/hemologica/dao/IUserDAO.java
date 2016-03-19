package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.User;

public interface IUserDAO extends IGenericDAO<User>{

	public User findById(Long id);
	public User findByToken(String token);
	public User findByUsername(String username);
	public List<User> findByPersonId(Long personId);

}
