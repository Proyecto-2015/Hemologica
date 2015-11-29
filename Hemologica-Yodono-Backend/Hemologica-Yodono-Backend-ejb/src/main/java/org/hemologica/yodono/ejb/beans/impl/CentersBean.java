package org.hemologica.yodono.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.Center;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.yodono.ejb.beans.CentersBeanLocal;

/**
 * Session Bean implementation class CentersBean
 */
@Stateless
@LocalBean
public class CentersBean implements CentersBeanLocal {
	
	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	

    public CentersBean() {

    }
    
    @Override
	public List<DataBank> getBanks() {
		
		List<DataBank> listReturn = new ArrayList<DataBank>();
		List<Center> list = FactoryDAO.getCenterDAO(em).getBanks();
		for(Center c : list){
			
			listReturn.add(getDataBank(c));
			
		}
		
		return listReturn;
	}

	
    @Override
	public DataBank getBankById(String bankId) {
    	
    	Center bank = FactoryDAO.getCenterDAO(em).getBankById(bankId);
    	return getDataBank(bank);
    	
	}

	private DataBank getDataBank(Center c) {
		
		DataBank dataBank = new DataBank();
		dataBank.setCode(c.getCenterCode());
		dataBank.setName(c.getCenterDisplayName());
		dataBank.setAddress(c.getCenterAddress());
		dataBank.setEmail(c.getCenterEmail());
		dataBank.setHour(c.getCenterHour());
		dataBank.setInformation(c.getCenterInformation());
		dataBank.setTelephone(c.getCenterTelephone());
		
		if(c.getInstitution() != null){
		
			DataInstitution dataInstitution = new DataInstitution();
			dataInstitution.setName(c.getInstitution().getInstitutionDisplayName());
			dataInstitution.setCode(c.getInstitution().getInstitutionDisplayName());	
			dataBank.setInstitution(dataInstitution);
			
		}
		
		if(c.getGeoLocation() != null){
			
			dataBank.setLatitude(c.getGeoLocation().getGeoLocationsX());
			dataBank.setLongitude(c.getGeoLocation().getGeoLocationsY());
			
		}
		
		return dataBank;
	}

}
