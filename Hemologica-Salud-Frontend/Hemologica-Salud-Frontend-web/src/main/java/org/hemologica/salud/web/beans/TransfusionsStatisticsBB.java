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
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;

public class TransfusionsStatisticsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(TransfusionsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataTransfusionsStatistics statictic;
	private List<TransfusionFilterData> allFilters;
	private Date dateFrom;
	private Date dateTo;
	private DataTransfusionsStatisticsResults statisticsResults;

	@PostConstruct
	private void init(){
		
		allFilters = new ArrayList<TransfusionFilterData>(applicationBB.getTransfusionsFilters().size());
	    for(TransfusionFilterData item: applicationBB.getTransfusionsFilters()){
			try {
				
				allFilters.add((TransfusionFilterData) item.clone());
				
			} catch (CloneNotSupportedException e) {
				
				logger.log(Level.SEVERE, "Error al clonar el objeto", e);
				
			}
		}
			
		statictic = new DataTransfusionsStatistics();
			
	}
    
    public void find(){
    	
    	
    	logger.info("IR a buscar la infoooo");
    	
    	statictic.setFilters(allFilters);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFrom != null)
			statictic.setFromDate(sdf.format(dateFrom));
		if(dateTo != null)
			statictic.setToDate(sdf.format(dateTo));
    	
		statisticsResults = RestFactory.getServicesClient().getTransfusionsStatistics(statictic);
    }

	public DataTransfusionsStatistics getStatictic() {
		return statictic;
	}

	public void setStatictic(DataTransfusionsStatistics statictic) {
		this.statictic = statictic;
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

	public List<TransfusionFilterData> getAllFilters() {
		return allFilters;
	}

	public void setAllFilters(List<TransfusionFilterData> allFilters) {
		this.allFilters = allFilters;
	}
	
	public DataTransfusionsStatisticsResults getStatisticsResults() {
		return statisticsResults;
	}

	public void setStatisticsResults(DataTransfusionsStatisticsResults statisticsResults) {
		this.statisticsResults = statisticsResults;
	}

	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	

}
