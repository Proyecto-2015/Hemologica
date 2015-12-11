package org.hemologica.dao;

import org.hemologica.dao.model.Unit;
import org.hemologica.dao.model.UnitsType;

public interface IUnitDAO extends IGenericDAO<Unit>{

	
	public Unit findByInstitutionCode(String code);
	
	public UnitsType findUnitTypeByCode(String code);
	
	public int getCountUnit(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH, String code);
}
