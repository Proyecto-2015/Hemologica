package org.hemologica.salud.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataMovement;

@Local
public interface StockBeanLocal {
	
	List<DataMovement> getMovementsUnitId(String unitId);

}
