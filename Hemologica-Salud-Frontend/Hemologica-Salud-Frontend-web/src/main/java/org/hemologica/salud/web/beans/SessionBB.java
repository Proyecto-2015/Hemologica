package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.salud.factories.RestFactory;

public class SessionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534391148649719007L;
	private static final Logger logger = Logger.getLogger(SessionBB.class.getName());
	
	private List<DataResponsiblePerson> responsibleTransfusionPersons;
	private ApplicationBB applicationBB;
	private DataBank bank;

	
	@PostConstruct
	public void init(){
		
		try {
			
			this.responsibleTransfusionPersons = RestFactory.getServicesClient().getResponsibleTransfusionPersons(new DataBank());
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: IOException", e);
			
		}
		
	}
	
	public String redirectTo(String go){
		
		System.out.println("REDIRECT TO: "+ go);
		return go;
		
	}
	
	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public List<DataResponsiblePerson> getResponsibleTransfusionPersons() {
		return responsibleTransfusionPersons;
	}

	public void setResponsibleTransfusionPersons(List<DataResponsiblePerson> responsibleTransfusionPersons) {
		this.responsibleTransfusionPersons = responsibleTransfusionPersons;
	}

	public DataBank getBank() {
		return bank;
	}

	public void setBank(DataBank bank) {
		this.bank = bank;
	}
	
}
