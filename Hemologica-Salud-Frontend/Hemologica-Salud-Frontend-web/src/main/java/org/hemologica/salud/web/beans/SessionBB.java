package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.salud.factories.RestFactory;
import org.hemologica.salud.web.utils.JSFUtils;

public class SessionBB implements Serializable {

	private static final long serialVersionUID = -2534391148649719007L;
	private static final Logger logger = Logger.getLogger(SessionBB.class.getName());
	
	private List<DataResponsiblePerson> responsibleTransfusionPersons;
	private List<DataInstitution> userInstitutions;
	private List<DataBank> userBanks;
	
	private List<DataBank> arrangementBanks;
	private List<DataInstitution> arrangementInstitutions;
	
	private DataPerson person;
	private ApplicationBB applicationBB;
	
	private DataBank bank;

	
	@PostConstruct
	public void init(){
		
		try {
			
			/**
			 * Obtener nombre de usuario
			 */
			String username = (String)JSFUtils.getSessionMap().get("edu.yale.its.tp.cas.client.filter.user");
			
//			String username = "pula14@gmail.com";
//			System.out.println("USUARIO: "+ username);
			
			DataBank bank = new DataBank();
			bank.setCode("2.16.858.0.0.1.10.2.3.6");
			this.responsibleTransfusionPersons = RestFactory.getServicesClient().getResponsibleTransfusionPersons(bank);
			
			if (username != null) {
				person = RestFactory.getServicesClient().getDataUser(username);
				this.userInstitutions = RestFactory.getServicesClient().getInstitution(person.getId().toString());
				this.userBanks = RestFactory.getServicesClient().getBanks(person.getId().toString());
				if(userBanks!= null && userBanks.size()!=0){
					this.bank = userBanks.get(0);
				}
				
				this.arrangementBanks = RestFactory.getServicesClient().getArrangementBanks(person.getId().toString());
				this.arrangementInstitutions = RestFactory.getServicesClient().getArrangementInstitutions(person.getId().toString());
			
			}
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: IOException", e);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: URISyntaxException", e);
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

	public List<DataBank> getArrangementBanks() {
		return arrangementBanks;
	}

	public void setArrangementBanks(List<DataBank> arrangementBanks) {
		this.arrangementBanks = arrangementBanks;
	}

	public List<DataInstitution> getArrangementInstitutions() {
		return arrangementInstitutions;
	}

	public void setArrangementInstitutions(List<DataInstitution> arrangementInstitutions) {
		this.arrangementInstitutions = arrangementInstitutions;
	}
	
	
}
