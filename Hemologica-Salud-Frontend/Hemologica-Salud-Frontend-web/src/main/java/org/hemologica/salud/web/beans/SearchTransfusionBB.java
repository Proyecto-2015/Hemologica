package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.TransfusionResult;
import org.hemologica.salud.factories.RestFactory;


public class SearchTransfusionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834951080949861155L;

	private static final Logger logger = Logger.getLogger(SearchDonationBB.class.getName());
	
	private SessionBB sessionBB;
	private ApplicationBB applicationBB;

	List<DataSearchFilter> filters;
	private List<DataTransfusion> resultTransfusions;
	
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
			
			resultTransfusions = RestFactory.getServicesClient().getTransfusions(filters);
			
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
			resultTransfusions = RestFactory.getServicesClient().getTransfusions(filters);
			
		} catch (IOException e) {
			
			logger.info("Error al ir a buscar las donaciones IOException");
		}
	}

	public String viewPerson(DataTransfusion transfusion){
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().put("transfusionView", transfusion);
		
		return "viewTransfusion";
	}
	
	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
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

	public List<DataTransfusion> getResultTransfusions() {
		return resultTransfusions;
	}

	public void setResultTransfusions(List<DataTransfusion> resultTransfusions) {
		this.resultTransfusions = resultTransfusions;
	}
	
}
