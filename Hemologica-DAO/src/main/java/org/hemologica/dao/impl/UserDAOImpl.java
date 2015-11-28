package org.hemologica.dao.impl;


import javax.persistence.EntityManager;

import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.model.User;

public class UserDAOImpl extends GenericDAOImpl<User> implements IUserDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDAOImpl(EntityManager em) {
		super(em);
	}

}
