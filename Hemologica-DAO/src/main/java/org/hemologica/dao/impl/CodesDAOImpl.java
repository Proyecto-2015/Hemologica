package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.ICodesDAO;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.UnitsType;

public class CodesDAOImpl implements ICodesDAO{

	protected EntityManager em;
	
	public CodesDAOImpl(EntityManager em ) {
		
		this.em = em;

	}
	
	@SuppressWarnings("unchecked")
	public List<MessageSendOption> getMessageOptions() {
		
		Query query = em.createNamedQuery("MessageSendOption.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<UnitsType> getProducts() {
		
		Query query = em.createNamedQuery("UnitsType.findAll");
		return query.getResultList();
	}

}
