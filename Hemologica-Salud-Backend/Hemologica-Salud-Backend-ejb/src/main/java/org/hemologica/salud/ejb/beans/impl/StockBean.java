package org.hemologica.salud.ejb.beans.impl;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Movement;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.StockBeanLocal;

@Stateless
@LocalBean
public class StockBean implements StockBeanLocal,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1878663879964146393L;
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
	@Override
	public List<DataMovement> getMovementsUnitId(String unitId) {
		
		List<DataMovement> dataMovements = new ArrayList<>();
		
		List<Movement> movements = FactoryDAO.getMovementDAO(em).getMovementsUnitId(unitId);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		if(movements != null){
			for(Movement m : movements){
				
				DataMovement dataMovement = new DataMovement();
				dataMovement.setDate(sdf.format(m.getDate()));
				dataMovement.setCenterName(m.getCenter().getCenterDisplayName());
	//			dataMovement.setMovementsType(m.getMovementsType().get);
				
				dataMovements.add(dataMovement);
				
			}
		}
		return dataMovements;
	}


}
