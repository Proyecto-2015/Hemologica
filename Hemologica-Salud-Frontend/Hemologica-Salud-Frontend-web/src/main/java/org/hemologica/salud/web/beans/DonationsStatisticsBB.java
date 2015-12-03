package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;

public class DonationsStatisticsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(DonationsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataDonationsStatistics statictic;
	private List<DonationFilterData> allFilters;
	private DataDonationsStatisticsResults statisticsResults;
	private Date dateFrom;
	private Date dateTo;
	

	@PostConstruct
	private void init(){
		
		allFilters = new ArrayList<DonationFilterData>(applicationBB.getDonationsFilters().size());
	    for(DonationFilterData item: applicationBB.getDonationsFilters()){
			try {
				
				allFilters.add((DonationFilterData) item.clone());
				
			} catch (CloneNotSupportedException e) {
				
				logger.log(Level.SEVERE, "Error al clonar el objeto", e);
				
			}
		}
		
		statictic = new DataDonationsStatistics();
		
	}
    
    public void find(){
    	
    	statictic.setFilters(allFilters);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFrom != null)
			statictic.setFromDate(sdf.format(dateFrom));
		if(dateTo != null)
			statictic.setToDate(sdf.format(dateTo));
    	
		statisticsResults = RestFactory.getServicesClient().getDonationsStatistics(statictic);
    	
 
    }

	public DataDonationsStatistics getStatictic() {
		return statictic;
	}
	public void setStatictic(DataDonationsStatistics statictic) {
		this.statictic = statictic;
	}
	public List<DonationFilterData> getAllFilters() {
		return allFilters;
	}
	public void setAllFilters(List<DonationFilterData> allFilters) {
		this.allFilters = allFilters;
	}
	
	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public DataDonationsStatisticsResults getStatisticsResults() {
		return statisticsResults;
	}

	public void setStatisticsResults(DataDonationsStatisticsResults statisticsResults) {
		this.statisticsResults = statisticsResults;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
