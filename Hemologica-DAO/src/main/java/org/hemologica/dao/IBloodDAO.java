package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.BloodAboTypesCode;
import org.hemologica.dao.model.BloodDTypesCode;
import org.hemologica.dao.model.BloodTypes;

public interface IBloodDAO {
	
	public List<BloodAboTypesCode> getBloodAboTypesCode();
	
	public BloodAboTypesCode findBloodAboTypesCodeByCode(String code);
	
	public List<BloodDTypesCode> getBloodDTypesCode();
	
	public BloodDTypesCode findBloodDTypesCodeByCode(String code);
	
	public BloodTypes getBloodTypeCodeByCode(String code);
	
	public BloodTypes getBloodTypeCodeBySnomedCodeId(String code);

	public BloodTypes getBloodTypeCodeByABORHCodes(String abo, String rh);

}
