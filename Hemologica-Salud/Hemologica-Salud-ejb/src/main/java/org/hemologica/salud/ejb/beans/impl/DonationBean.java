package org.hemologica.salud.ejb.beans.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import org.hemologica.salud.ejb.beans.DonationBeanLocal;
import org.hemologica.salud.ejb.datatypes.DonationResult;
import org.hemologica.salud.ejb.datatypes.DonationSearch;
import org.hemologica.salud.ejb.exceptions.BusinessException;


public class DonationBean implements DonationBeanLocal, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7445567749832049675L;

    private EntityManager em;

	@Override
	public List<DonationResult> search(DonationSearch param) throws BusinessException {

		List<DonationResult> ret = new ArrayList<DonationResult>();
		
		for(int i = 1; i < 20; i++){
			ret.add(new DonationResult("" + i, "12345678", "Juan Perez", new Date(), "Realizada"));
		}
		
		return ret;
	}
	
}
