package org.hemologica.dao.impl;


import javax.persistence.EntityManager;

import org.hemologica.dao.INotificationDAO;
import org.hemologica.dao.model.Notification;

public class NotificationDAOImpl extends GenericDAOImpl<Notification>   implements INotificationDAO {

	
	private static final long serialVersionUID = 1L;

	public NotificationDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
