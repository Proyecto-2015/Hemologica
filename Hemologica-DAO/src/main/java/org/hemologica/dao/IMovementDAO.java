package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Movement;
import org.hemologica.dao.model.MovementsType;

public interface IMovementDAO extends IGenericDAO<Movement>{

	public MovementsType findMovementTypeByCode(String code);

	public List<Movement> getMovementsUnitId(String unitId);
	
	public List<Movement> getAllByUnitSortedByDate(Long id);
	
}
