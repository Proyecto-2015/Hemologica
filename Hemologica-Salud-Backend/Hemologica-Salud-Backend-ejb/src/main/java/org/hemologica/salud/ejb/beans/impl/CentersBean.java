package org.hemologica.salud.ejb.beans.impl;

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
import org.hemologica.salud.ejb.beans.CentersBeanLocal;

/**
 * Session Bean implementation class CentersBean
 */
@Stateless
@LocalBean
public class CentersBean implements CentersBeanLocal {
	
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public CentersBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataBank> getBanks() {
		
		List<DataBank> listReturn = new ArrayList<>();
		List<Center> list = FactoryDAO.getCenterDAO(em).getBanks();
		for(Center c : list){
			
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
			
			listReturn.add(dataBank);
		}
		
		return listReturn;
	}
	
	

}
