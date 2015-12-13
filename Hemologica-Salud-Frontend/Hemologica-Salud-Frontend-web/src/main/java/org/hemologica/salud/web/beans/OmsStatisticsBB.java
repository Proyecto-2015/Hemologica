package org.hemologica.salud.web.beans;

import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class OmsStatisticsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(OmsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataOmsStatistics statictic;
	private Date dateFrom;
	private Date dateTo;
	private StreamedContent file;

	@PostConstruct
	private void init(){
	 
		statictic = new DataOmsStatistics();
			
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
		
		InputStream stream = RestFactory.getServicesClient().getOmsStatistics(statictic);
		
		if(stream != null)
			file = new DefaultStreamedContent(stream, "application/pdf", "doc.pdf"); 

		return file;
	    
	}

}
