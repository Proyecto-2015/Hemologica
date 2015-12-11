package org.hemologica.service.business.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.IBloodDAO;
import org.hemologica.dao.ICenterDAO;
import org.hemologica.dao.IMovementDAO;
import org.hemologica.dao.IUnitDAO;
import org.hemologica.dao.impl.BloodDAOImpl;
import org.hemologica.dao.impl.CenterDAOImpl;
import org.hemologica.dao.impl.MovementDAOImpl;
import org.hemologica.dao.impl.UnitDAOImpl;
import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.Center;
import org.hemologica.dao.model.Movement;
import org.hemologica.dao.model.MovementsType;
import org.hemologica.dao.model.Unit;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.service.business.IMovementBean;
import org.hemologica.service.datatype.MovementData;
import org.springframework.stereotype.Component;

@Component
public class MovementBean implements IMovementBean{

	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;
	
	@Override
	public void save(List<MovementData> movements) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		IMovementDAO movementDAO = new MovementDAOImpl(em);
		IUnitDAO unitDAO = new UnitDAOImpl(em);
		ICenterDAO centerDAO = new CenterDAOImpl(em);
		IBloodDAO bloodDAO = new BloodDAOImpl(em);
		
		Movement movement;
		MovementsType movementType;
		Unit unit;
		Unit unitParent;
		UnitsType unitType;
		BloodTypes bloodType;
		Center center;
		for(MovementData m : movements){
			
			unit = unitDAO.findByInstitutionCode(m.getUnit());
			unitParent = m.getUnitParent() != null ? unitDAO.findByInstitutionCode(m.getUnitParent()) : null;
			
			unitType = unitDAO.findUnitTypeByCode(m.getUnitType());
			center = centerDAO.getBankById(m.getCenter());
			bloodType = bloodDAO.getBloodTypeCodeBySnomedCodeId(m.getUnitBloodType());
			
			//si no existe la unidad, la creo
			if(unit == null){
				unit = new Unit();
				unit.setUnitParent(unitParent);
				unit.setUnitInstitutionCode(m.getUnit());
				unit.setUnitUuid(UUID.randomUUID().toString());
				unit.setUnitsType(unitType);
				unit.setBloodType(bloodType);
				unit.setCenter(center);
				unit = unitDAO.create(unit);
			}
			
			movementType = movementDAO.findMovementTypeByCode(m.getType());
			movement = new Movement();
			movement.setCenter(center);
			movement.setMovementsType(movementType);
			movement.setUnit(unit);
			movement.setDate(sdf.parse(m.getDate()));
			movement = movementDAO.create(movement);
			
			
			//FIX unit state
			List<Movement> unitMovementsOrdered = movementDAO.getAllByUnitSortedByDate(unit.getId());
			if(unitMovementsOrdered != null && unitMovementsOrdered.size() > 0){
				
				//si movements_types.type es true entonces es entrada, si es false es salida
				unit.setActive(unitMovementsOrdered.get(0).getMovementsType().getType());
				unit = unitDAO.update(unit);
				
			}
			
		}
		
	}
	
	
	

	
	
}
