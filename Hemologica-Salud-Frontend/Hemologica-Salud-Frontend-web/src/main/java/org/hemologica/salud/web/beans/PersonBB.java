package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataState;

public class PersonBB implements Serializable {

	
	private static final Logger logger = Logger.getLogger(PersonBB.class.getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8925888848602043532L;
	
	
	private SessionBB sessionBB;
	
	private DataPerson dataPerson;
	
	private List<DataState> states;
	private DataState state;
	private List<DataCity> cities;
	private DataCity city;
	private List<DataCountry> countries;
	private DataCountry country;
	private List<DataDocumentType> documentTypes;
	private DataDocumentType documentType;
	
	@PostConstruct
	public void init(){
		dataPerson = new DataPerson();
		/**
		 *	TO-DO
		 *	inicializar las codigueras 
		 */
	}
	
	
	public void submit(){
		logger.info("PersonBB: call submit()");
	}
	
	
	public List<DataDocumentType> getDocumentTypes() {
		return documentTypes;
	}

	public void setDocumentTypes(List<DataDocumentType> documentTypes) {
		this.documentTypes = documentTypes;
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

	public List<DataCity> getCities() {
		return cities;
	}

	public void setCities(List<DataCity> cities) {
		this.cities = cities;
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

	public List<DataCountry> getCountries() {
		return countries;
	}

	public void setCountries(List<DataCountry> countries) {
		this.countries = countries;
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
	
	
	
}
