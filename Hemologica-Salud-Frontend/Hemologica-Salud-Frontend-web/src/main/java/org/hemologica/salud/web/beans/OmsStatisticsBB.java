package org.hemologica.salud.web.beans;

import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class OmsStatisticsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(OmsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataOmsStatistics statictic;
	
	private List<TransfusionFilterData> transfusionFilter = new ArrayList<>();
	private List<DonationFilterData> donationFilter = new ArrayList<>();
	private List<DonationFilterData> commonsFilters = new ArrayList<>();
	
	private Date dateFrom;
	private Date dateTo;
	private StreamedContent file;

	@PostConstruct
	private void init(){
	 
		statictic = new DataOmsStatistics();
		
		for(DonationFilterData dfilter : applicationBB.getDonationsFilters()){
			if(dfilter.getCode().equals("1") || dfilter.getCode().equals("2") || dfilter.getCode().equals("3")){
				commonsFilters.add(dfilter);
			}else{
				donationFilter.add(dfilter);
			}
		}
		for(TransfusionFilterData tfilter : applicationBB.getTransfusionsFilters()){
			if(!tfilter.getCode().equals("2") && !tfilter.getCode().equals("3") && !tfilter.getCode().equals("4")){
				transfusionFilter.add(tfilter);
			}
		}
	}

	public DataOmsStatistics getStatictic() {
		return statictic;
	}

	public void setStatictic(DataOmsStatistics statictic) {
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
	
	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public StreamedContent download(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFrom != null)
			statictic.setFromDate(sdf.format(dateFrom));
		if(dateTo != null)
			statictic.setToDate(sdf.format(dateTo));
		
		statictic.setCommonsFilters(commonsFilters);
		statictic.setDonationFilter(donationFilter);
		statictic.setTransfusionFilter(transfusionFilter);
		
		InputStream stream = RestFactory.getServicesClient().getOmsStatistics(statictic);
		
		if(stream != null)
			file = new DefaultStreamedContent(stream, "application/pdf", "indicadores.pdf"); 

		return file;
	    
	}

	public List<TransfusionFilterData> getTransfusionFilter() {
		return transfusionFilter;
	}

	public void setTransfusionFilter(List<TransfusionFilterData> transfusionFilter) {
		this.transfusionFilter = transfusionFilter;
	}

	public List<DonationFilterData> getDonationFilter() {
		return donationFilter;
	}

	public void setDonationFilter(List<DonationFilterData> donationFilter) {
		this.donationFilter = donationFilter;
	}

	public List<DonationFilterData> getCommonsFilters() {
		return commonsFilters;
	}

	public void setCommonsFilters(List<DonationFilterData> commonsFilters) {
		this.commonsFilters = commonsFilters;
	}

}
