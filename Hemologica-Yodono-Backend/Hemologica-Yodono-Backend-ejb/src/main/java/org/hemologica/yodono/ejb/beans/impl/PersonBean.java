package org.hemologica.yodono.ejb.beans.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Person;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.yodono.ejb.beans.PersonBeanLocal;

/**
 * Session Bean implementation class PersonBean
 */
@Stateless
@LocalBean
public class PersonBean implements PersonBeanLocal {

	private static final Logger logger = Logger.getLogger(PersonBean.class.getName()); 
	
	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	
    public PersonBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public DataPerson getPerson(String userId) {
		
		Person p = FactoryDAO.getPeronDAO(em).getPersonsId(userId);
		
		DataPerson data =null;
		
		if(p != null){
			
			data = new DataPerson();
			data.setId((p.getId() == null) ? "" :p.getId());
			data.setFirstName((p.getPersonFirstName() == null) ? "" :p.getPersonFirstName());
			data.setSecondName((p.getPersonSecondName() == null) ? "" :p.getPersonSecondName());
			data.setFirstLastName((p.getPersonFirstLastname() == null) ? "" :p.getPersonFirstLastname());
			data.setSecondLastName((p.getPersonSecondLastname() == null) ? "" :p.getPersonSecondLastname());
			data.setAddress((p.getPersonAddress() == null) ? "" :p.getPersonAddress());
			data.setEmail((p.getPersonEmail() == null) ? "" :p.getPersonEmail());
			data.setZipCode(p.getZipCode());
			
			if(p.getDocuments() != null && p.getDocuments().size() != 0){
				
				data.setDocumentCountry((p.getDocuments().get(0).getCountriesCode().getCountryCodeLabel() == null) ? "" : p.getDocuments().get(0).getCountriesCode().getCountryCodeLabel());
				data.setDocumentType((p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeLabel() == null) ? "" : p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeLabel());
				data.setDocumentNumber((p.getDocuments().get(0).getDocumentNumber() == null) ? "" :p.getDocuments().get(0).getDocumentNumber());
				
			}
			
			//TODO cambiar esto
			data.setAbleToDonate(true);
			DataBloodType dbt = new DataBloodType();
			dbt.setCode("AB+");
			dbt.setDisplayName("AB+");
			data.setBloodType(dbt);
			// ***************************
			
			if(p.getPersonBirthday() != null){
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				data.setBirthdayDate(df.format(p.getPersonBirthday()));
				data.setTelephone(p.getPersonTelephone());
			}else{
				data.setBirthdayDate("");
			}
			
			if(p.getCitiesCode() != null){
				DataCode city = new DataCode();
				city.setCode((p.getCitiesCode().getCityCode() == null) ? "" :p.getCitiesCode().getCityCode());
				city.setDisplayName((p.getCitiesCode().getCityDisplayName() == null) ? "" :p.getCitiesCode().getCityDisplayName());
				data.setCity(city);
			}
			
			if(p.getStateCode() != null){
				DataCode state = new DataCode();
				state.setCode((p.getStateCode().getStateCode() == null) ? "" :p.getStateCode().getStateCode());
				state.setDisplayName((p.getStateCode().getStateDisplayName() == null) ? "" :p.getStateCode().getStateDisplayName());
				data.setState(state);
			}
			
			data.setAllowNotificationAbleToDonate(p.getAllowNotificationAbleToDonate());
			data.setAllowNotificationNeedDonor(p.getAllowNotificationAbleToDonate());
			
		}
		
		return data;
	}

	@Override
	public DataResponse updatePerson(DataPerson dataUser) {
		
		DataResponse response = new DataResponse();
		
		Person p = FactoryDAO.getPeronDAO(em).getPersonsId(dataUser.getId());
		
		if(p != null){
			
			p.setId(dataUser.getId());
			p.setPersonFirstName(dataUser.getFirstName());
			p.setPersonSecondName(dataUser.getFirstName());
			p.setPersonFirstLastname(dataUser.getFirstLastName());
			p.setPersonSecondName(dataUser.getSecondLastName());
			p.setPersonAddress(dataUser.getAddress());
			p.setPersonEmail(dataUser.getEmail());
			
			//Los documentos no deberian actualizarce.
			
	
			if(p.getPersonBirthday() != null){
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				try {
					
					p.setPersonBirthday(df.parse(dataUser.getBirthdayDate()));
					
				} catch (ParseException e) {
					
					logger.log(Logger.getGlobal().getLevel().SEVERE, "Error al parcear la fecha", e);
					
				}
				p.setPersonTelephone(dataUser.getTelephone());
			}
			
			if(dataUser.getCity() != null){
				
				p.setCitiesCode(FactoryDAO.getCodesDAO(em).getCitiesByCode(dataUser.getCity().getCode()));
			}
			
			if(dataUser.getState() != null){
				
				p.setStateCode(FactoryDAO.getCodesDAO(em).getStatesCodeByCode(dataUser.getState().getCode()));
			}
			
			p.setAllowNotificationAbleToDonate(dataUser.isAllowNotificationAbleToDonate());
			p.setAllowNotificationNeedDonor(dataUser.isAllowNotificationNeedDonor());
			
			FactoryDAO.getPeronDAO(em).update(p);
			response.setCode(0);
			
		}else{
			response.setCode(1);
			response.setErrorMessage("No esxiste la persona con id: " + dataUser.getId());
			
		}
		
		return response;
	}

}
