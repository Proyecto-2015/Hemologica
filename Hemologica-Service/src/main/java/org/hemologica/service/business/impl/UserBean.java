package org.hemologica.service.business.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.impl.PersonDAOImpl;
import org.hemologica.dao.impl.UserDAOImpl;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.User;
import org.hemologica.service.business.IUserBean;
import org.hemologica.service.datatype.UserData;
import org.springframework.stereotype.Component;

@Component
public class UserBean implements IUserBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;
	
	@Override
	public void createUser(UserData data) {
		
		IUserDAO userDAO = new UserDAOImpl(em);
		IPersonDAO personDAO = new PersonDAOImpl(em);
		Person person = personDAO.getPersonsId(data.getPersonId().toString());
		User user = new User();
		user.setPerson(person);
		userDAO.create(entity)
	}
	
}
