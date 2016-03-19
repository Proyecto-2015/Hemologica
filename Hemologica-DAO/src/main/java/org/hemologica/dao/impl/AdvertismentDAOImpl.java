package org.hemologica.dao.impl;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.hemologica.dao.IAdvertismentDAO;
import org.hemologica.dao.model.Advertisment;
import org.hemologica.dao.model.EmailSent;
import org.hemologica.dao.model.EmailToSend;

public class AdvertismentDAOImpl extends GenericDAOImpl<Advertisment> implements IAdvertismentDAO {


	private static final long serialVersionUID = 1L;

	public AdvertismentDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public List<Advertisment> getCampaigns(String cant) {
		
		Query query = em.createNamedQuery("Advertisment.findLimit");
		return (List<Advertisment>) query.setMaxResults(Integer.parseInt(cant)).getResultList();
	}

	public Advertisment getCampaign(String campaignId) {
		
		Query query = em.createNamedQuery("Advertisment.findById");
		query.setParameter("id", Long.parseLong(campaignId));
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (Advertisment) list.get(0) : null;
		
	}

	public boolean createEmailToSend(EmailToSend emailToSend) {
		
		em.persist(emailToSend);
		return true;
	}

	public boolean removeEmailToSend(EmailToSend emailToSend) {
		
		em.remove(emailToSend);
		return true;
	}

	public boolean createEmailSent(EmailSent emailSent) {
		
		em.persist(emailSent);
		return true;
	}

	public EmailToSend getEmailById(Long id) {
		
		Query query = em.createNamedQuery("EmailToSend.findById");
		query.setParameter("id", id);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (EmailToSend) list.get(0) : null;
		
	}

	@SuppressWarnings("unchecked")
	public List<EmailToSend> getEmailsToSend(Calendar instance) {
		
		Query query = em.createNamedQuery("EmailToSend.findByDate");

		query.setParameter("value",instance,TemporalType.DATE);
		
		return query.getResultList();
		
	}
}
