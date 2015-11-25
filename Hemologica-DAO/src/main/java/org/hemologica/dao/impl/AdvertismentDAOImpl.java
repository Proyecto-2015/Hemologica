package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IAdvertismentDAO;
import org.hemologica.dao.model.Advertisment;

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
		query.setParameter("id", Integer.parseInt(campaignId));
		
		return (Advertisment) query.getSingleResult();
		
	}

	

}
