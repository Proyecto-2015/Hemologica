package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.BloodAboTypesCode;
import org.hemologica.dao.model.BloodDTypesCode;
import org.hemologica.dao.model.Institution;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.IBloodLocal;

/**
 * Session Bean implementation class IBlood
 */
@Stateless
@LocalBean
public class BloodBean implements IBloodLocal {

	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public BloodBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataBloodType> getBloodTypes() {
		
		List<DataBloodType> bloodTypes = new ArrayList<>();
		
		return bloodTypes;
//		List<Institution> institutions = FactoryDAO.getInstitutionDAO(em).getInstitutions();
//		List<DataInstitution> dataInstitutions = new ArrayList<>();
//
//		if (institutions != null) {
//			for (Institution i : institutions) {
//				DataInstitution dataIins = new DataInstitution();
//				dataIins.setCode(i.getInstitutionCode());
//				dataIins.setName(i.getInstitutionDisplayName());
//				dataInstitutions.add(dataIins);
//			}
//		}
	}

	@Override
	public List<DataCode> getDonationABOTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<BloodAboTypesCode> list = FactoryDAO.getbloodDAO(em).getBloodAboTypesCode();

		if (list != null) {
			for (BloodAboTypesCode i : list) {
				DataCode dataIins = new DataCode();
				dataIins.setCode(i.getBloodAboTypeCodeValue());
				dataIins.setDisplayName(i.getBloodAboTypeCodeLabel());
				listReturn.add(dataIins);
			}
		}
		
		return listReturn;
	}

	@Override
	public List<DataCode> getDonationDTTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<BloodDTypesCode> list = FactoryDAO.getbloodDAO(em).getBloodDTypesCode();

		if (list != null) {
			for (BloodDTypesCode i : list) {
				DataCode dataIins = new DataCode();
				dataIins.setCode(i.getBloodDTypeCodeValue());
				dataIins.setDisplayName(i.getBloodDTypeCodeLabel());
				listReturn.add(dataIins);
			}
		}
		
		return listReturn;
	}
    
    
    

}
