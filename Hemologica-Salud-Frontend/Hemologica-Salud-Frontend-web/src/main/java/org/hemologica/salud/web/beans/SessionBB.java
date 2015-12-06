package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.salud.factories.RestFactory;

public class SessionBB implements Serializable {

	private static final long serialVersionUID = -2534391148649719007L;
	private static final Logger logger = Logger.getLogger(SessionBB.class.getName());
	
	private List<DataResponsiblePerson> responsibleTransfusionPersons;
	private List<DataInstitution> userInstitutions;
	private List<DataBank> userBanks;
	
	private DataPerson person;
	private ApplicationBB applicationBB;
	
	private DataBank bank;

	
	@PostConstruct
	public void init(){
		
		try {
			DataBank bank = new DataBank();
			bank.setCode("348");
			this.responsibleTransfusionPersons = RestFactory.getServicesClient().getResponsibleTransfusionPersons(bank);
			
			person = new DataPerson();
//			person.setId("1"); Bruno 05-12-2015
			person.setId(new Long(1));
			this.userInstitutions = RestFactory.getServicesClient().getInstitution(person.getId().toString());
			this.userBanks = RestFactory.getServicesClient().getBanks(person.getId().toString());
			if(userBanks!= null && userBanks.size()!=0){
				this.bank = userBanks.get(0);
			}
			
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

	public List<DataInstitution> getUserInstitutions() {
		return userInstitutions;
	}

	public void setUserInstitutions(List<DataInstitution> userInstitutions) {
		this.userInstitutions = userInstitutions;
	}

	public DataPerson getPerson() {
		return person;
	}

	public void setPerson(DataPerson person) {
		this.person = person;
	}

	public List<DataBank> getUserBanks() {
		return userBanks;
	}

	public void setUserBanks(List<DataBank> userBanks) {
		this.userBanks = userBanks;
	}
	
}
