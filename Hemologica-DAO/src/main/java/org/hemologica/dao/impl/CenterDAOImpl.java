package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.ICenterDAO;
import org.hemologica.dao.model.Center;
import org.hemologica.dao.model.DonationTypesCode;

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
		List<Center> list = query.getResultList();
		return (!list.isEmpty()) ? (Center) list.get(0) : null;
		
	}

	@SuppressWarnings("unchecked")
	public List<Center> getBanksByInstitutionId(String code) {
		
		Query query = em.createNamedQuery("Center.findBankByInstitutionId");
		query.setParameter("code", code);
		return query.getResultList();
	}
}
