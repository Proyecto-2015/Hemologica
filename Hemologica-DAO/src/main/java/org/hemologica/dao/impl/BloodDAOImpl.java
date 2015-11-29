package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.IBloodDAO;
import org.hemologica.dao.model.BloodAboTypesCode;
import org.hemologica.dao.model.BloodDTypesCode;
import org.hemologica.dao.model.BloodTypes;

public class BloodDAOImpl implements IBloodDAO{
	
	protected EntityManager em;
	
	public BloodDAOImpl(EntityManager em ) {
		
		this.em = em;

	}
	
	@SuppressWarnings("unchecked")
	public List<BloodAboTypesCode> getBloodAboTypesCode() {
		
		Query query = em.createNamedQuery("BloodAboTypesCode.findAll");
		return query.getResultList();
		
	}
	
	public BloodAboTypesCode findBloodAboTypesCodeByCode(String code){
		
		Query query = em.createNamedQuery("BloodAboTypesCode.getBloodAboTypesCodeByCode");
		query.setParameter("code", Integer.parseInt(code));
		return (BloodAboTypesCode) query.getSingleResult();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<BloodDTypesCode> getBloodDTypesCode() {
		
		Query query = em.createNamedQuery("BloodDTypesCode.findAll");
		return query.getResultList();
		
	}
	
	public BloodDTypesCode findBloodDTypesCodeByCode(String code){
		
		Query query = em.createNamedQuery("BloodDTypesCode.getBloodDTypesCodeByCode");
		query.setParameter("code", code);
		return (BloodDTypesCode) query.getSingleResult();
		
	}

	public BloodTypes getBloodTypeCodeByCode(String code) {
		
		Query query = em.createNamedQuery("BloodTypes.findById");
		query.setParameter("code", code);
		return (BloodTypes) query.getSingleResult();
		
	}
	
	public BloodTypes getBloodTypeCodeBySnomedCodeId(String code) {
		
		Query query = em.createNamedQuery("BloodTypes.findBySnomedCodeId");
		query.setParameter("code", code);
		return (BloodTypes) query.getSingleResult();
		
	}
	
}
