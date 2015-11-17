package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.salud.factories.RestFactory;

//@Named("personaRecordBloodBB")
//@ViewScoped
public class PersonRecordBloodBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(PersonRecordBloodBB.class.getName());
	
	private DataPerson person;
	private List<DataDonation> donations;
	private List<DataTransfusion> transfusions;
	
	private DataDonation donationItem;
	private DataTransfusion transfusionItem;
	
	
	@PostConstruct
	private void init(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		person = (DataPerson) context.getExternalContext().getSessionMap().get("person");
		
		//TODO hay que cambiarlo para que llame al servicio que busque donaciones por id de persona o que tengo el usuario. 

		try {
			donations = RestFactory.getServicesClient().getMyDonations(person.getId());
			transfusions = RestFactory.getServicesClient().getMyTransfusions(person.getId());
			
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio web IOException", e);
			
		}
		
	} 
	
	public DataPerson getPerson() {
		return person;
	}
	public void setPerson(DataPerson person) {
		this.person = person;
	}
	public List<DataDonation> getDonations() {
		return donations;
	}
	public void setDonations(List<DataDonation> donations) {
		this.donations = donations;
	}
	public List<DataTransfusion> getTransfusions() {
		return transfusions;
	}
	public void setTransfusions(List<DataTransfusion> transfusions) {
		this.transfusions = transfusions;
	}

	public DataDonation getDonationItem() {
		return donationItem;
	}

	public void setDonationItem(DataDonation donationItem) {
		this.donationItem = donationItem;
	}

	public DataTransfusion getTransfusionItem() {
		return transfusionItem;
	}

	public void setTransfusionItem(DataTransfusion transfusionItem) {
		this.transfusionItem = transfusionItem;
		
	}	
	
	
}
