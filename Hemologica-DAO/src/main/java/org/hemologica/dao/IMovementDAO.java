package org.hemologica.dao;

import org.hemologica.dao.model.Movement;
import org.hemologica.dao.model.MovementsType;

public interface IMovementDAO extends IGenericDAO<Movement>{

	public MovementsType findMovementTypeByCode(String code);
	
}
