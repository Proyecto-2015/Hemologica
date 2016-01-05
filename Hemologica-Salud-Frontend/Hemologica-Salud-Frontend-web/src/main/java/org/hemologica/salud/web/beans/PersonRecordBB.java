package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.salud.factories.RestFactory;


public class PersonRecordBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsBB.class.getName());
	
	private String filterName;
	private String filterDocumentNumber;
	private List<DataPerson> persons;
	
	@PostConstruct
	private void init(){
		
		try {
			
			persons = RestFactory.getServicesClient().getPersons(filterName,filterDocumentNumber);
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
			
		}
	}

	public String viewPerson(String personId){
		
		for(DataPerson p : persons){
			
			if(p.getId().equals(Long.parseLong(personId))){
				FacesContext context = FacesContext.getCurrentInstance();
				context.getExternalContext().getSessionMap().put("person", p);
				return "historyPerson";
			}
		}
		
		logger.info("ver persona " + personId);
		
		return null;
		
		
	}
	
	public List<DataPerson> getPersons() {
		
		return persons;
	}

	public void setPersons(List<DataPerson> persons) {
		
		this.persons = persons;
		
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public String getFilterDocumentNumber() {
		return filterDocumentNumber;
	}

	public void setFilterDocumentNumber(String filterDocumentNumber) {
		this.filterDocumentNumber = filterDocumentNumber;
	}
	
	public void search(){
		
		logger.info("BUSCAR--------------------");
		
		try {
			
			persons = RestFactory.getServicesClient().getPersons(filterName, filterDocumentNumber);
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
			
		}
	}
	
	
}
