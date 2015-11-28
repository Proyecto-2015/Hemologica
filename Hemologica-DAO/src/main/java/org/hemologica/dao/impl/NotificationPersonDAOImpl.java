package org.hemologica.dao.impl;


import javax.persistence.EntityManager;
import org.hemologica.dao.INotificationPersonDAO;
import org.hemologica.dao.model.NotificationsPerson;

public class NotificationPersonDAOImpl extends GenericDAOImpl<NotificationsPerson>   implements INotificationPersonDAO {

	
	private static final long serialVersionUID = 1L;

	public NotificationPersonDAOImpl(EntityManager em) {
		super(em);
	}

}
