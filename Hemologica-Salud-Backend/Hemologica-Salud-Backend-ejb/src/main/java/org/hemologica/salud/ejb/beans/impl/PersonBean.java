package org.hemologica.salud.ejb.beans.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Person;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.PersonBeanLocal;

/**
 * Session Bean implementation class PersonBean
 */
@Stateless
@LocalBean
public class PersonBean implements PersonBeanLocal {

	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public PersonBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataPerson> getPersonsFilters(HashMap<String, Object> whereFilters) {
		
		List<DataPerson> listReturn = new ArrayList<>();
		List<Person> list = FactoryDAO.getPeronDAO(em).getPersonsFilters(whereFilters);
		
		for(Person p : list){
			
			DataPerson data = new DataPerson();
			
			data.setId((p.getId() == null) ? "" :p.getId());
			data.setFirstName((p.getPersonFirstName() == null) ? "" :p.getPersonFirstName());
			data.setSecondName((p.getPersonSecondName() == null) ? "" :p.getPersonSecondName());
			data.setFirstLastName((p.getPersonFirstLastname() == null) ? "" :p.getPersonFirstLastname());
			data.setSecondLastName((p.getPersonSecondLastname() == null) ? "" :p.getPersonSecondLastname());
			data.setAddress((p.getPersonAddress() == null) ? "" :p.getPersonAddress());
			
			if(p.getDocuments() != null && p.getDocuments().size() != 0){
				
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
				DataCity city = new DataCity();
				city.setCode((p.getCitiesCode().getCityCode() == null) ? "" :p.getCitiesCode().getCityCode());
				city.setName((p.getCitiesCode().getCityDisplayName() == null) ? "" :p.getCitiesCode().getCityDisplayName());
				data.setCity(city);
			}
			listReturn.add(data);
			
		}
		
		return listReturn;
	}

	@Override
	public DataPerson getPersonId(String id) {
		
		Person p = FactoryDAO.getPeronDAO(em).getPersonsId(id);
		
		DataPerson data =null;
		
		if(p != null){
			
			data = new DataPerson();
			data.setId((p.getId() == null) ? "" :p.getId());
			data.setFirstName((p.getPersonFirstName() == null) ? "" :p.getPersonFirstName());
			data.setSecondName((p.getPersonSecondName() == null) ? "" :p.getPersonSecondName());
			data.setFirstLastName((p.getPersonFirstLastname() == null) ? "" :p.getPersonFirstLastname());
			data.setSecondLastName((p.getPersonSecondLastname() == null) ? "" :p.getPersonSecondLastname());
			data.setAddress((p.getPersonAddress() == null) ? "" :p.getPersonAddress());
			
			if(p.getDocuments() != null && p.getDocuments().size() != 0){
				
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
				DataCity city = new DataCity();
				city.setCode((p.getCitiesCode().getCityCode() == null) ? "" :p.getCitiesCode().getCityCode());
				city.setName((p.getCitiesCode().getCityDisplayName() == null) ? "" :p.getCitiesCode().getCityDisplayName());
				data.setCity(city);
			}
			
			data.setAllowNotificationAbleToDonate(p.getAllowNotificationAbleToDonate());
			data.setAllowNotificationAbleToDonate(p.getAllowNotificationAbleToDonate());
			
		}
		
		return data;
	}

}
