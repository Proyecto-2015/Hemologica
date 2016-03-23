package org.hemologica.salud.ejb.beans;

import javax.ejb.Local;

import org.hemologica.salud.ejb.exceptions.BusinessException;

@Local
public interface UnitBeanLocal {

	
	public String[] getDonationFromProduct(String code, String institution) throws BusinessException;
	
}
