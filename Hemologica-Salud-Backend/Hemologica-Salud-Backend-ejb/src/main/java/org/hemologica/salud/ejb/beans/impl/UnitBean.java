package org.hemologica.salud.ejb.beans.impl;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.Unit;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.UnitBeanLocal;
import org.hemologica.salud.ejb.exceptions.BusinessException;

/**
 * Session Bean implementation class UnitBean
 */
@Stateless
@LocalBean
public class UnitBean implements UnitBeanLocal {
private static final Logger logger = Logger.getLogger(TransfusionBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;

	@Override
	public String[] getDonationFromProduct(String code, String institution) throws BusinessException {

		Unit u = FactoryDAO.getUnitDAO(em).findUnitByCodes(code, institution);
		while(u.getUnitParent() != null){ //recorro para atrás buscando la donación de origen
			u = u.getUnitParent();
		}
		String[] ret = new String[2];
		ret[0] = u.getUnitInstitutionCode();
		ret[1] = u.getCenter().getInstitution().getInstitutionCode();
		return ret;
	}
	
	
	

}
