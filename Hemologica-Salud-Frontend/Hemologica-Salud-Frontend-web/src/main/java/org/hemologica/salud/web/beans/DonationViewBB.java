package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataDonation;

public class DonationViewBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(DonationViewBB.class.getName());
	
	private DataDonation donation;
	
	@PostConstruct
	private void init(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		donation = (DataDonation) context.getExternalContext().getSessionMap().get("donationView");
		
		
	}

	public DataDonation getDonation() {
		return donation;
	}

	public void setDonation(DataDonation donation) {
		this.donation = donation;
	}
	
}
