package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.Institution;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.IInstitutionBeanLocal;

/**
 * Session Bean implementation class InstitutionBean
 */

@Stateless
@LocalBean
public class InstitutionBean implements IInstitutionBeanLocal {

	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;

	@Override
	public List<DataInstitution> getInstitutions() {

		List<Institution> institutions = FactoryDAO.getInstitutionDAO(em).getInstitutions();
		List<DataInstitution> dataInstitutions = new ArrayList<>();

		if (institutions != null) {
			for (Institution i : institutions) {
				DataInstitution dataIins = new DataInstitution();
				dataIins.setCode(i.getInstitutionCode());
				dataIins.setName(i.getInstitutionDisplayName());
				dataInstitutions.add(dataIins);
			}
		}
		return dataInstitutions;
	}

}
