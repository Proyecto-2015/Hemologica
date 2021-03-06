package org.hemologica.salud.ejb.beans.impl;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.impl.UserDAOImpl;
import org.hemologica.dao.model.User;
import org.hemologica.datatypes.DataUser;
import org.hemologica.salud.ejb.beans.UserBeanLocal;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
@LocalBean
public class UserBean implements UserBeanLocal {

private static final Logger logger = Logger.getLogger(TransfusionBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;

	@Override
	public DataUser getDataUserFirstAccess(String token) {
		
		IUserDAO userDAO = new UserDAOImpl(em);
		User user = userDAO.findByToken(token);
		DataUser data = new DataUser();
		data.setPersonId(user.getPerson().getId());
		data.setUserId(user.getId());
		return data;
	}

	@Override
	public void updateUserFirstAccess(DataUser data) throws Exception {

		IUserDAO userDAO = new UserDAOImpl(em);
		User user = userDAO.findById(data.getUserId());
		user.setCode(data.getUsername());
		user.setPassword(data.getPassword());
		user.setActiveAccount(true);
		user.setActiveAccountToken(null);
		user.setActiveAccountTokenTime(null);
		user.setPasswordReset(false);
		user.setPasswordResetToken(null);
		user.setActiveAccountTokenTime(null);
		userDAO.update(user);
	}

	@Override
	public Long getPersonIdFromUsername(String username) {

		IUserDAO userDAO = new UserDAOImpl(em);
		User u = userDAO.findByUsername(username);
		return u != null && u.getPerson() != null ? u.getPerson().getId() : null;
	}

}
