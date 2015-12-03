package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IUnitDAO;
import org.hemologica.dao.model.Unit;
import org.hemologica.dao.model.UnitsType;

public class UnitDAOImpl extends GenericDAOImpl<Unit> implements IUnitDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnitDAOImpl(EntityManager em) {
		super(em);
	}

	public Unit findByInstitutionCode(String code) {
		
		Query query = em.createNamedQuery("Unit.findByInstitutionCode");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<Unit> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

	public UnitsType findUnitTypeByCode(String code) {

		Query query = em.createNamedQuery("UnitsType.findBySnomedCode");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<UnitsType> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

}
