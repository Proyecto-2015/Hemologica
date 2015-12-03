package org.hemologica.service.business.impl;

import java.net.InetAddress;
import javax.mail.Address;
import java.security.SecureRandom;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.impl.PersonDAOImpl;
import org.hemologica.dao.impl.UserDAOImpl;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.User;
import org.hemologica.service.business.IUserBean;
import org.hemologica.service.datatype.MailData;
import org.hemologica.service.datatype.UserData;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;


@Component
public class UserBean implements IUserBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;

	@Override
	public MailData createUser(UserData data) {

		EntityTransaction tx = em.getTransaction();

		try {
			
			tx.begin();
			
			IUserDAO userDAO = new UserDAOImpl(em);
			IPersonDAO personDAO = new PersonDAOImpl(em);
			Person person = personDAO.getPersonsId(data.getPersonId().toString());
			User user = new User();
			user.setPerson(person);
			user.setActiveAccount(true);
			user.setActiveAccountToken(this.generateToken());
			user.setActiveAccountTokenTime(new Date());
			user.setPasswordReset(false);
			userDAO.create(user);
		
			if(person.getPersonEmail() != null){
				MailData mail = new MailData();
				mail.setAddressTO(mail.getAddressTO());
			}
			
			tx.commit();
			
		} catch (Exception ex) {
			if (tx.isActive()) {
				tx.rollback();
			}
		}
		
		return null;
	}

	private String generateToken() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[1025];
		random.nextBytes(bytes);
		String token = bytes.toString();
		return token;
	}

}
