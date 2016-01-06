package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.salud.factories.RestFactory;

public class SearchDonationBB implements Serializable {

	private static final long serialVersionUID = 4834951080949861155L;

	private static final Logger logger = Logger.getLogger(SearchDonationBB.class.getName());
	
	private SessionBB sessionBB;
	private ApplicationBB applicationBB;

	List<DataSearchFilter> filters;

	private List<DataDonation> resultDonations;
	private Date date;


	@PostConstruct
	public void init() {
		
		filters = applicationBB.getSearchFilters();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			for(DataSearchFilter data : filters){
				if(data.getCode().equals("3")){
					
					if(date != null){
						String dateString = sdf.format(date);
						data.setValueString(dateString);
					}else
						data.setValueString(null);
				}
			}	
			resultDonations = RestFactory.getServicesClient().getDonations(filters);
			
		} catch (ClientProtocolException e) {
			
			logger.info("Error al ir a buscar las donaciones ClientProtocolException");
			
		} catch (IOException e) {
			
			logger.info("Error al ir a buscar las donaciones IOException");
			
		}
	}

	public void search() {
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			for(DataSearchFilter data : filters){
				if(data.getCode().equals("3")){
					
					if(date != null){
						String dateString = sdf.format(date);
						data.setValueString(dateString);
					}else
						data.setValueString(null);
				}
			}		
			resultDonations = RestFactory.getServicesClient().getDonations(filters);
			
		} catch (IOException e) {
			
			logger.info("Error al ir a buscar las donaciones IOException");
		}
		
	}
	
	public String viewPerson(DataDonation donation){
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().put("donationView", donation);
		
		return "viewDonation";
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public List<DataDonation> getResultDonations() {
		return resultDonations;
	}

	public void setResultDonations(List<DataDonation> resultDonations) {
		this.resultDonations = resultDonations;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public List<DataSearchFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<DataSearchFilter> filters) {
		this.filters = filters;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}