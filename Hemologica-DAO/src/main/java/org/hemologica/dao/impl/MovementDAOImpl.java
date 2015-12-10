package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IMovementDAO;
import org.hemologica.dao.model.Movement;
import org.hemologica.dao.model.MovementsType;
import org.hemologica.dao.model.Unit;

public class MovementDAOImpl extends GenericDAOImpl<Movement> implements IMovementDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovementDAOImpl(EntityManager em) {
		super(em);
	}

	public MovementsType findMovementTypeByCode(String code) {

		Query query = em.createNamedQuery("MovementsType.findByCode");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<MovementsType> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

	public List<Movement> getMovementsUnitId(String unitId) {
		
		Query query = em.createNamedQuery("Unit.findByUUID");
		query.setParameter("uuid", unitId);
		
		Unit unit = (Unit) query.getSingleResult();
		
		return unit != null ? unit.getMovements() : null;
	}
	
	
}
