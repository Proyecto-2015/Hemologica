package org.hemologica.salud.ejb.beans.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Person;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.PersonBeanLocal;
import org.joda.time.LocalDate;
import org.joda.time.Years;

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
			
			DataPerson data = getDataPeron(p);
			listReturn.add(data);
			
		}
		
		return listReturn;
	}

	public DataPerson getDataPeron(Person p) {
		
		DataPerson data = new DataPerson();
		
		data.setId((p.getId() == null) ? -1 :p.getId());
		data.setId(p.getId());
		data.setFirstName((p.getPersonFirstName() == null) ? "" :p.getPersonFirstName());
		data.setSecondName((p.getPersonSecondName() == null) ? "" :p.getPersonSecondName());
		data.setFirstLastName((p.getPersonFirstLastname() == null) ? "" :p.getPersonFirstLastname());
		data.setSecondLastName((p.getPersonSecondLastname() == null) ? "" :p.getPersonSecondLastname());
		data.setAddress((p.getPersonAddress() == null) ? "" :p.getPersonAddress());
		data.setEmail((p.getPersonEmail() == null) ? "" :p.getPersonEmail());
		data.setAllowNotificationAbleToDonate(p.getAllowNotificationAbleToDonate());
		data.setAllowNotificationNeedDonor(p.getAllowNotificationNeedDonor());
		
		if(p.getGenderCode()!= null){
			
			DataCode gender = new DataCode();
			gender.setCode(p.getGenderCode().getGenderCodeValue());
			gender.setDisplayName(p.getGenderCode().getGenderCodeLabel());
			data.setGender(gender);
			
		}
		
		if(p.getPersonBirthday() != null){
			Calendar date = Calendar.getInstance();
			date.setTime(p.getPersonBirthday());
			
			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR),date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			data.setAge(String.valueOf(age.getYears()));
		}
		
		if(p.getDocuments() != null && p.getDocuments().size() != 0){
			
			if(p.getDocuments().get(0).getCountriesCode() == null){
				DataCode documentCountry = new DataCode();
				documentCountry.setCode(p.getDocuments().get(0).getCountriesCode().getCountryCodeValue());
				documentCountry.setDisplayName(p.getDocuments().get(0).getCountriesCode().getCountryCodeLabel());
				data.setDocumentCountry(documentCountry);
			}
			
			if(p.getDocuments().get(0).getDocumentsTypesCode() == null){
				DataCode documentType = new DataCode();
				documentType.setCode(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeValue());
				documentType.setDisplayName(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeLabel());
				data.setDocumentType(documentType);
			}
			
			data.setDocumentNumber((p.getDocuments().get(0).getDocumentNumber() == null) ? "" :p.getDocuments().get(0).getDocumentNumber());
			
		}
		
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
		
		return data;
	}

	
	@Override
	public DataPerson getPersonId(Long id) {
		
		Person p = FactoryDAO.getPeronDAO(em).getPersonsId(id);
		
		DataPerson data =null;
		
		if(p != null){
			
			data = new DataPerson();
//			data.setId((p.getId() == null) ? "" :p.getId());
			data.setId(p.getId());
			data.setFirstName((p.getPersonFirstName() == null) ? "" :p.getPersonFirstName());
			data.setSecondName((p.getPersonSecondName() == null) ? "" :p.getPersonSecondName());
			data.setFirstLastName((p.getPersonFirstLastname() == null) ? "" :p.getPersonFirstLastname());
			data.setSecondLastName((p.getPersonSecondLastname() == null) ? "" :p.getPersonSecondLastname());
			data.setAddress((p.getPersonAddress() == null) ? "" :p.getPersonAddress());
			data.setEmail((p.getPersonEmail() == null) ? "" :p.getPersonEmail());
			
			if(p.getGenderCode()!= null){
				
				DataCode gender = new DataCode();
				gender.setCode(p.getGenderCode().getGenderCodeValue());
				gender.setDisplayName(p.getGenderCode().getGenderCodeLabel());
				data.setGender(gender);
				
			}
			
			
			
			Calendar date = Calendar.getInstance();
			date.setTime(p.getPersonBirthday());
			
			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR),date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
			
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			data.setAge(String.valueOf(age.getYears()));
			
			
			if(p.getDocuments() != null && p.getDocuments().size() != 0){
				
				if(p.getDocuments().get(0).getCountriesCode() == null){
					DataCode documentCountry = new DataCode();
					documentCountry.setCode(p.getDocuments().get(0).getCountriesCode().getCountryCodeValue());
					documentCountry.setDisplayName(p.getDocuments().get(0).getCountriesCode().getCountryCodeLabel());
					data.setDocumentCountry(documentCountry);
				}
				
				if(p.getDocuments().get(0).getDocumentsTypesCode() == null){
					DataCode documentType = new DataCode();
					documentType.setCode(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeValue());
					documentType.setDisplayName(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeLabel());
					data.setDocumentType(documentType);
				}
				
				data.setDocumentNumber((p.getDocuments().get(0).getDocumentNumber() == null) ? "" :p.getDocuments().get(0).getDocumentNumber());
				
			}
			
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
			data.setAllowNotificationAbleToDonate(p.getAllowNotificationAbleToDonate());
			
		}
		
		return data;
	}

	@Override
	public List<DataPerson> getPersonsFilters(String filterName, String filterDocumentNumber) {
		
		List<DataPerson> listReturn = new ArrayList<>();
		List<Person> list = FactoryDAO.getPeronDAO(em).getPersonsFilters(filterName,filterDocumentNumber);
		
		for(Person p : list){
			
			DataPerson data = getDataPeron(p);
			listReturn.add(data);
			
		}
		
		return listReturn;
	}

}
