package org.hemologica.salud.ejb.beans;

import java.util.List;

import org.hemologica.salud.ejb.datatypes.DonationResult;
import org.hemologica.salud.ejb.datatypes.DonationSearch;
import org.hemologica.salud.ejb.exceptions.BusinessException;

public interface DonationBeanLocal {
	
	public List<DonationResult> search(DonationSearch param) throws BusinessException;

}
