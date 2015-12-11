package org.hemologica.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

	@Override
	public User findByToken(String token) {

		Query query = em.createNamedQuery("User.findByAccountToken");
		query.setParameter("token", token);
		@SuppressWarnings("unchecked")
		List<User> res = query.getResultList();
		return res != null && res.size() > 0 ? res.get(0) : null;
	}

	@Override
	public User findById(Long id) {
		return em.find(User.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findByPersonId(Long personId){
		
		Query query = em.createNamedQuery("User.findByPersonId");
		query.setParameter("personId", personId);
		return query.getResultList();
	}
	
}
