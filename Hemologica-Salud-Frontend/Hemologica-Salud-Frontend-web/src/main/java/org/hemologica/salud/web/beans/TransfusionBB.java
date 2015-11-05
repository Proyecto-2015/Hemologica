package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationState;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;

public class TransfusionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5395079020796675499L;
	
	private static final Logger logger = Logger.getLogger(TransfusionBB.class.getName());
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	private PersonBB personBB;
	
	private DataTransfusion dataTransfusion;
	private DataLaboratoryResult labResult;
	private DataTransfusionEvent event;
	
	private List<SelectItem> transfusionEvents;
	private String transfusionEventSelected;
	
	private List<SelectItem> severities;
	private String severitySelected;
	
	private FacesContext ctx;
	

	@PostConstruct
	public void init(){
		logger.info("init DonationBB");
		this.dataTransfusion = new DataTransfusion();
		this.labResult = new DataLaboratoryResult();
		this.event = new DataTransfusionEvent();
		this.ctx = FacesContext.getCurrentInstance();
	}

	public void addLabResult(){
		this.dataTransfusion.getLaboratoryResults().add(this.labResult);
		this.labResult = new DataLaboratoryResult();
	}
	
	public void addEvent(){
		this.dataTransfusion.getEvents().add(this.event);
		this.event = new DataTransfusionEvent();
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


	public DataTransfusionEvent getEvent() {
		return event;
	}


	public void setEvent(DataTransfusionEvent event) {
		this.event = event;
	}

	public String getSeveritySelected() {
		return severitySelected;
	}

	public void setSeveritySelected(String severitySelected) {
		this.severitySelected = severitySelected;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public List<SelectItem> getTransfusionEvents() {
		return transfusionEvents;
	}

	public void setTransfusionEvents(List<SelectItem> transfusionEvents) {
		this.transfusionEvents = transfusionEvents;
	}

	public String getTransfusionEventSelected() {
		return transfusionEventSelected;
	}

	public void setTransfusionEventSelected(String transfusionEventSelected) {
		this.transfusionEventSelected = transfusionEventSelected;
	}

}
