package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Center;
import org.hemologica.dao.model.Document;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.ResponsibleTransfusionPerson;
import org.hemologica.dao.model.User;
import org.hemologica.dao.model.UsersRoleService;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataDocument;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataResponsiblePerson;
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
	
	@Override
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(String centerCode) {
		
		List<DataResponsiblePerson> listReturn = new ArrayList<>();
		List<ResponsibleTransfusionPerson> list = FactoryDAO.getCodesDAO(em).getResponsibleTransfusionPerson(centerCode);
		
		for(ResponsibleTransfusionPerson unit :list){
			
			if(unit.getPerson() != null){
			
				DataResponsiblePerson data = new DataResponsiblePerson();
				data.setFirstName(unit.getPerson().getPersonFirstName());
				data.setSecondName(unit.getPerson().getPersonSecondName());
				data.setFirstLastName(unit.getPerson().getPersonFirstLastname());
				data.setSecondLastName(unit.getPerson().getPersonSecondLastname());
				
				if(unit.getPerson().getDocuments() != null && unit.getPerson().getDocuments().size() != 0){
					
					Document d = unit.getPerson().getDocuments().get(0);
					DataDocument dataDoc = new DataDocument();
					dataDoc.setDocumentCountry(d.getCountriesCode().getCountryCodeValue());
					dataDoc.setDocumentNumber(d.getDocumentNumber());
					dataDoc.setDocumentType(d.getDocumentsTypesCode().getDocumentsTypeCodeValue());
					data.setDocuments(dataDoc);
				}
				data.setId(unit.getId());
					
				listReturn.add(data);
			}
		}
		return listReturn;
	}

	@Override
	public List<DataBank> getBanksUser(Long user) {
		
		List<DataBank> listReturn = new ArrayList<>();
		
		Person person = FactoryDAO.getPeronDAO(em).getPersonsId(user);
		
		HashMap<String, Center> centers = new HashMap<>();
		
		for(User u :person.getUsers()){
			
			for(UsersRoleService userRole : u.getUsersRoleServices()){
				
				if(!centers.containsKey(userRole.getCenter().getCenterCode())){
					
					centers.put(userRole.getCenter().getCenterCode(), userRole.getCenter());
					
				}	
			}
		}
			
		for(Center c : centers.values()){
			
			DataBank dataBank = new DataBank();
			dataBank.setCode(String.valueOf(c.getCenterCode()));
			dataBank.setName(c.getCenterDisplayName());
			dataBank.setAddress(c.getCenterAddress());
			dataBank.setEmail(c.getCenterEmail());
			dataBank.setHour(c.getCenterHour());
			dataBank.setInformation(c.getCenterInformation());
			dataBank.setTelephone(c.getCenterTelephone());
			
			if(c.getInstitution() != null){
			
				DataInstitution dataInstitution = new DataInstitution();
				dataInstitution.setName(c.getInstitution().getInstitutionDisplayName());
				dataInstitution.setCode(c.getInstitution().getInstitutionCode());	
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
