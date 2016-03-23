package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Unit;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataBank;

public interface IUnitDAO extends IGenericDAO<Unit>{

	
	public Unit findByInstitutionCode(String code);
	
	public UnitsType findUnitTypeByCode(String code);
	
	public Unit findUnitByCodes(String code, String institution);
	
	public int getCountUnit(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH, String code);
	
	public int getCountUnitBanks(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH, List<DataBank> banks);
	
}
