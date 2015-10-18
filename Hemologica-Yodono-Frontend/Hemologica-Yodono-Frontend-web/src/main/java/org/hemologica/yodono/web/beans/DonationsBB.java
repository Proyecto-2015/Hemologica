package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.yodono.factories.RestFactory;

public class DonationsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(DonationsBB.class.getName()); 
	private List<DataDonacion> myDonations;

	public List<DataDonacion> getMyDonations() {
		
		try {
			
			myDonations = RestFactory.getServicesClient().getMyDonations("");
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
		
		return myDonations;
	}

	public void setMyDonations(List<DataDonacion> myDonations) {
		this.myDonations = myDonations;
	}
	
	public String getStringDifferencedDate(String donationDate){
		
		logger.info(donationDate);
		return "hace 2 meses";
	}
	
}
