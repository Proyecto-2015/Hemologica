package org.hemologica.service.business.impl;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;
import javax.mail.internet.AddressException;
import javax.persistence.EntityManager;
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
import org.springframework.transaction.annotation.Transactional;


@Component
public class UserBean implements IUserBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(UserBean.class.getName());

	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;

	@Transactional
	@Override
	public MailData createUser(UserData data) throws Exception {

		// EntityTransaction tx = em.getTransaction();

		// tx.begin();

		IUserDAO userDAO = new UserDAOImpl(em);
		IPersonDAO personDAO = new PersonDAOImpl(em);
		Person person = personDAO.getPersonsId(data.getPersonId());
		User user = new User();
		user.setPerson(person);
		user.setActiveAccount(true);
		String token = this.generateToken();
		user.setActiveAccountToken(token);
		user.setActiveAccountTokenTime(new Date());
		user.setPasswordReset(false);
		userDAO.create(user);

		// tx.commit();

		if (person.getPersonEmail() != null) {
			return buildMail(person, token);
		}

		return null;
	}

	private String generateToken() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[64];
		random.nextBytes(bytes);
		String token = Base64.getEncoder().encodeToString(bytes);
		return token;
	}

	private MailData buildMail(Person person, String token) throws AddressException, IOException {

		Properties prop = new Properties();
		prop.load(UserBean.class.getClassLoader().getResourceAsStream("hemologica.properties"));
		MailData data = new MailData();
		data.setToken(token);
		data.setFrom(prop.getProperty("mail.username"));
		data.addAddressTO(person.getPersonEmail());
		data.setSubject(prop.getProperty("user.account.active.subject"));
		data.setContent(this.buildMailContent(token));
		return data;
	}

	private String buildMailContent(String token) throws IOException {
		Properties prop = new Properties();
		prop.load(UserBean.class.getClassLoader().getResourceAsStream("hemologica.properties"));
		String content = prop.getProperty("user.account.active.content");
		String url = prop.getProperty("user.account.active.url");
		url = url.replaceAll(":token", token);
		content = content.replaceAll(":url", url);
		return content;
	}

}
