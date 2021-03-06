package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IInstitutionDAO;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.Institution;

public class InstitutionDAOImpl extends GenericDAOImpl<Institution> implements IInstitutionDAO {


	public InstitutionDAOImpl(EntityManager em) {

		super(em);

	}

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Institution> getInstitutions() {
		
		Query query = em.createNamedQuery("Institution.findAll");
		return query.getResultList();
		
	}
	
	public Institution findInstitutionByCode(String code){
		
		Query query = em.createNamedQuery("Institution.getInstitutionCode");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (Institution) list.get(0) : null;
		
	}

	public List<Institution> getInstitutionsUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
