package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.primefaces.event.FlowEvent;

public class DonationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5395079020796675499L;
	
	private static final Logger logger = Logger.getLogger(DonationBB.class.getName());
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	private PersonBB personBB;
	
	private DataDonation dataDonacion;
	private DataLaboratoryResult labResult;
	private DataDonationEvent event;
	
	private List<SelectItem> donationEvents;
	private String donationEventSelected;
	
	private List<SelectItem> severities;
	private String severitySelected;
	
	private FacesContext ctx;
	

	@PostConstruct
	public void init(){
		logger.info("init DonationBB");
		this.dataDonacion = new DataDonation();
		this.labResult = new DataLaboratoryResult();
		this.event = new DataDonationEvent();
		this.ctx = FacesContext.getCurrentInstance();
	}

	public void addLabResult(){
		
		if(this.dataDonacion.getLabResults() != null)
		
			this.dataDonacion.getLabResults().add(0,this.labResult);
		
		else{
			
			List<DataLaboratoryResult> list = new ArrayList<>();
			list.add(this.labResult);
			this.dataDonacion.setLabResults(list);
		}
		
		this.labResult = new DataLaboratoryResult();
	}
	
	public void addEvent(){
		
		if(this.dataDonacion.getEvents() != null){
			
			this.dataDonacion.getEvents().add(0,this.event);
				
		}else{
			
			List<DataDonationEvent> events = new ArrayList<>();
			events.add(this.event);
			this.dataDonacion.setEvents(events);
			
		}
		
		this.event = new DataDonationEvent();
		
	}
	
	
	
	public void setCtx(FacesContext ctx) {
		this.ctx = ctx;
	}
	
	public List<SelectItem> getSeverities() {
		return severities;
	}
	
	public void setSeverities(List<SelectItem> severities) {
		this.severities = severities;
	}

	public void dataDonationStateChange(ValueChangeEvent ev){
		dataDonacion.setState((DataDonationStateEnum) ev.getNewValue());
	}

	public DataDonation getDataDonacion() {
		return dataDonacion;
	}
	
	public void setDataDonacion(DataDonation dataDonacion) {
		this.dataDonacion = dataDonacion;
	}
	
	public SessionBB getSessionBB() {
		return sessionBB;
	}
	
	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
	public PersonBB getPersonBB() {
		return personBB;
	}
	
	public void setPersonBB(PersonBB personBB) {
		this.personBB = personBB;
	}

	
	public DataLaboratoryResult getLabResult() {
		return labResult;
	}


	public void setLabResult(DataLaboratoryResult labResult) {
		this.labResult = labResult;
	}


	public DataDonationEvent getEvent() {
		return event;
	}


	public void setEvent(DataDonationEvent event) {
		this.event = event;
	}

	public String getSeveritySelected() {
		return severitySelected;
	}

	public void setSeveritySelected(String severitySelected) {
		this.severitySelected = severitySelected;
	}

	public List<SelectItem> getDonationEvents() {
		return donationEvents;
	}

	public void setDonationEvents(List<SelectItem> donationEvents) {
		this.donationEvents = donationEvents;
	}

	public String getDonationEventSelected() {
		return donationEventSelected;
	}

	public void setDonationEventSelected(String donationEventSelected) {
		this.donationEventSelected = donationEventSelected;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
	public String onFlowProcess(FlowEvent event) {
	       
		return event.getNewStep();
        
    }

}
