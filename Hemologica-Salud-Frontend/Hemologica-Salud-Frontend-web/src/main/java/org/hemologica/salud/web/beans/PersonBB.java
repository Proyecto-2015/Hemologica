package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataState;

//@Named("personBB")
//@ViewScoped
public class PersonBB implements Serializable {

	
	private static final Logger logger = Logger.getLogger(PersonBB.class.getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8925888848602043532L;
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	private DataPerson dataPerson;
	
	private List<DataState> states;
	private DataState state;
	private DataCity city;
	private DataCountry country;
	private DataDocumentType documentType;
	
	@PostConstruct
	public void init(){
		dataPerson = new DataPerson();
	}
	
	
	public void submit(){
		logger.info("PersonBB: call submit()");
	}
	
	

	public List<DataState> getStates() {
		return states;
	}

	public void setStates(List<DataState> states) {
		this.states = states;
	}

	public DataState getState() {
		return state;
	}

	public void setState(DataState state) {
		this.state = state;
	}

	public DataCity getCity() {
		return city;
	}

	public void setCity(DataCity city) {
		this.city = city;
	}

	public DataPerson getDataPerson() {
		return dataPerson;
	}


	public void setDataPerson(DataPerson dataPerson) {
		this.dataPerson = dataPerson;
	}


	public SessionBB getSessionBB() {
		return sessionBB;
	}


	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public DataCountry getCountry() {
		return country;
	}


	public void setCountry(DataCountry country) {
		this.country = country;
	}


	public DataDocumentType getDocumentType() {
		return documentType;
	}


	public void setDocumentType(DataDocumentType documentType) {
		this.documentType = documentType;
	}


	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
	
}
