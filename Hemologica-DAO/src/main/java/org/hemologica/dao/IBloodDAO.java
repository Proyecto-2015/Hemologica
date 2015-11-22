package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.BloodAboTypesCode;
import org.hemologica.dao.model.BloodDTypesCode;

public interface IBloodDAO {
	
	public List<BloodAboTypesCode> getBloodAboTypesCode();
	
	public BloodAboTypesCode findBloodAboTypesCodeByCode(String code);
	
	public List<BloodDTypesCode> getBloodDTypesCode();
	
	public BloodDTypesCode findBloodDTypesCodeByCode(String code);

}
