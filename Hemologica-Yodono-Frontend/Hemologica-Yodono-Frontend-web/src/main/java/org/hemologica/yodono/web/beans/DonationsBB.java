package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.yodono.factories.RestFactory;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

public class DonationsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(DonationsBB.class.getName()); 
	private List<DataDonation> myDonations;
	
	@ManagedProperty(value="#{language}")
	private LanguageBB languageBB;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	
	@PostConstruct
	public void init(){
		
		try {
			
			myDonations = RestFactory.getServicesClient().getMyDonations("1");
			
			Collections.sort(myDonations, new Comparator<DataDonation>() {
				  
				@Override public int compare( DataDonation d1, DataDonation d2) {
					
				    return d2.getDate().compareTo(d1.getDate());
				    
				  }
			});
			

			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
	}
	
	public LanguageBB getLanguageBB() {
		return languageBB;
	}

	public void setLanguageBB(LanguageBB languageBB) {
		this.languageBB = languageBB;
	}

	public List<DataDonation> getMyDonations() {
		return myDonations;
	}

	public void setMyDonations(List<DataDonation> myDonations,String language) {
		this.myDonations = myDonations;
	}
	
	public String getStringDifferencedDate(String donationDate){
		
		Calendar today = Calendar.getInstance();
		
		Calendar dateDonation = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			
			dateDonation.setTime(sdf.parse(donationDate));
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha: " + donationDate);
			
		}
		
		LocalDate todayLocalDate = new LocalDate(today.getTime());
		LocalDate donationDateLocalDate = new LocalDate(dateDonation.getTime());	
		
		int diffMonths =  Months.monthsBetween(donationDateLocalDate,todayLocalDate).getMonths();
		int diffYears =  Years.yearsBetween(donationDateLocalDate,todayLocalDate).getYears();
		int diffDays =   Days.daysBetween(donationDateLocalDate, todayLocalDate).getDays();
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		ResourceBundle bundle = app.getResourceBundle(context, languageVarName);	
		
		String result = "";
		if(diffYears > 0){
			
			result += diffYears + " ";
			if(diffYears > 1)
				result += bundle.getString("label_years");
			else
				result += bundle.getString("label_year");
			
		}else if(diffMonths > 0){
			result += diffMonths + " ";
			if(diffMonths > 1)
				result += bundle.getString("label_months");
			else
				result += bundle.getString("label_month");
				
			
		}else{
			result += diffDays + " ";
			if(diffDays > 1)
				result += bundle.getString("label_days");
			else
				result += bundle.getString("label_day");
				
		}
		
		result += " " + bundle.getString("label_ago");
		/**
		 * cambio porque franco pidio 
		 */
		
//		if(languageBB != null && languageBB.getLanguage() != null && languageBB.getLanguage().equals("en"))
//			
//			result += " " + bundle.getString("label_ago");
//			
//		else
//			result= bundle.getString("label_ago") +" " + result;
		
		return result;
	}
	
	public void shareFacebook(){
		
		logger.info("facebook");
	}
	
	public void shareTwitter(){
		
		logger.info("twitter");
	}
}
