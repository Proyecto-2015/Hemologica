package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.ICenterDAO;
import org.hemologica.dao.model.Center;

public class CenterDAOImpl extends GenericDAOImpl<Center> implements ICenterDAO {

	private static final long serialVersionUID = 1L;

	public CenterDAOImpl(EntityManager em) {
		
		super(em);
		
	}

	@SuppressWarnings("unchecked")
	public List<Center> getBanks() {
		
		Query query = em.createNamedQuery("Center.findAllBanks");
		return query.getResultList();
		
	}

	public Center getBankById(String bankId) {
		
		Query query = em.createNamedQuery("Center.findBankById");
		query.setParameter("code", bankId);
		return (Center) query.getSingleResult();
		
	}
}
