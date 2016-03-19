package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.hemologica.constants.Constants;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.salud.factories.RestFactory;

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

		try {
			boolean able = true;
			donations = RestFactory.getServicesClient().getMyDonations(person.getId());
			if(donations != null){
				Collections.sort(donations, new Comparator<DataDonation>() {
					  
					@Override public int compare( DataDonation d1, DataDonation d2) {
						
					    return d1.getDate().compareTo(d2.getDate());
					    
					  }
				});
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				
				for(DataDonation d : donations){	
					
					DataCode dataBlood = new DataCode();
					if(d.getBloodCode()!= null){
						dataBlood.setCode(d.getBloodType().getCode());
						dataBlood.setDisplayName(d.getBloodType().getDisplayName());
						person.setBloodType(dataBlood);
					}
					if(d.isApprovedDonation()){
						
						if(d.getDate() != null && !d.getDate().equals("")){
							
							Calendar dateDonation = Calendar.getInstance();
							
							try {
								
								dateDonation.setTime(sdf2.parse(d.getDate()));
								if(person.getGender().getDisplayName().equals("label_male")){
									
									dateDonation.add(Calendar.MONTH, Constants.MONTHS_MALE);
									
								}else if(person.getGender().getDisplayName().equals("label_female")){
									
									dateDonation.add(Calendar.MONTH, Constants.MONTHS_FEMALE);
									
								}
								if(dateDonation.compareTo(Calendar.getInstance()) >= 0){
									
									able = false;
								}
								
							} catch (ParseException e) {
								
								logger.log(Level.SEVERE, "Error al parsear la fecha: " + d.getDate(), e);
								
							}
						}
					}else if(d.getFail() != null && d.getFail().getDate() != null && !d.getFail().getDate().equals("")){
						
						if(d.getFail().getDate() != null && !d.getFail().getDate().equals("")){
							
							Calendar dateDonation = Calendar.getInstance();
							
							try {
								
								dateDonation.setTime(sdf2.parse(d.getFail().getDate()));
								
								if(dateDonation.compareTo(Calendar.getInstance()) >= 0){
									
									able = false;
								}
								
							} catch (ParseException e) {
								
								logger.log(Level.SEVERE, "Error al parsear la fecha: " + d.getDate(), e);
								
							}
						}
					}	
				}	
			}
			
			person.setAbleToDonate(able);
			
			transfusions = RestFactory.getServicesClient().getMyTransfusions(person.getId());
			if(transfusions != null){
				Collections.sort(transfusions, new Comparator<DataTransfusion>() {
					  
					@Override public int compare( DataTransfusion t1, DataTransfusion t2) {
						if(t2 != null && t1 != null){
							if(t2.getDate() != null && t1.getDate() != null){
								return t2.getDate().compareTo(t1.getDate());
							}else if(t1.getDate() == null && t2.getDate() != null){
								return -1;
							}else if (t1.getDate() != null && t2.getDate() == null){
								return 1;
							}
							return 0;
						}else if(t1 == null && t2 != null){
							return -1;
						}else if (t1 != null && t2 == null){
							return 1;
						}
						return 0;
					    
					  }
				});
			}
			
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
