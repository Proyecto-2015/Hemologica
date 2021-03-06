package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.enums.CenterType;
import org.hemologica.dao.model.Center;
import org.hemologica.dao.model.Institution;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.IInstitutionBeanLocal;
import org.hemologica.salud.ejb.utils.FactoryBeans;

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

	@Override
	public List<DataInstitution> getInstitutionsUser(Long user) {
		
		List<DataBank> banks = FactoryBeans.getCenterBean().getBanksUser(user);
		
		HashMap<String, DataInstitution> institutions = new HashMap<>();
		List<DataInstitution> institutionList = new ArrayList<>();
		
		for(DataBank dataBank : banks){
			
			if(dataBank.getInstitution() != null && !institutions.containsKey(dataBank.getInstitution().getCode())){
			
				institutions.put(dataBank.getInstitution().getCode(), dataBank.getInstitution());
				institutionList.add(dataBank.getInstitution());
			}
		}
		
		return institutionList;
	}

	@Override
	public DataInstitution getInstitutionById(String code) {
		
		Institution institution = FactoryDAO.getInstitutionDAO(em).findInstitutionByCode(code);
		
		if(institution != null){
			DataInstitution dataInstitution = new DataInstitution();
			dataInstitution.setCode(institution.getInstitutionCode());
			
			List<DataBank> banks = new LinkedList<DataBank>();
			for(Center c : institution.getCenters()){
				
				if(c.getCenterType().equals(CenterType.BANK)){
					
					DataBank dataBank = new DataBank();
					dataBank.setAddress(c.getCenterAddress());
					dataBank.setCode(c.getCenterCode());
					dataBank.setEmail(c.getCenterEmail());
					dataBank.setHour(c.getCenterHour());
					dataBank.setInformation(c.getCenterInformation());
					dataBank.setLatitude(c.getGeoLocation().getGeoLocationsX());
					dataBank.setLongitude(c.getGeoLocation().getGeoLocationsY());
					dataBank.setName(c.getCenterDisplayName());
					dataBank.setTelephone(c.getCenterTelephone());
					banks.add(dataBank);
				}
				
			}
			dataInstitution.setBanks(banks);
			return dataInstitution;
		}
		
		return null;
		
	}
}
