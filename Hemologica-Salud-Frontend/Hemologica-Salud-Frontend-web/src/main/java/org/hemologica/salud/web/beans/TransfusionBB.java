package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.primefaces.event.FlowEvent;

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
	
	private List<SelectItem> severities;
	private String severitySelected;
	
	private FacesContext ctx;
	

	@PostConstruct
	public void init(){
		logger.info("init TransfusionBB");
		this.labResult = new DataLaboratoryResult();
		this.dataTransfusion = new DataTransfusion();
		this.event = new DataTransfusionEvent();
	}

	
	public void addLabResult(){
		if(this.dataTransfusion.getLaboratoryResults() != null)
			this.dataTransfusion.getLaboratoryResults().add(0,this.labResult);
		else{
			
			List<DataLaboratoryResult> list = new ArrayList<DataLaboratoryResult>();
			list.add(this.labResult);
			this.dataTransfusion.setLaboratoryResults(list);
		}
		
		this.labResult = new DataLaboratoryResult();
	}
	
	public void addEvent(){
		
		if(this.dataTransfusion.getEvents() != null){
			
			this.dataTransfusion.getEvents().add(0,this.event);
			
			
		}else{
			
			List<DataTransfusionEvent> events = new ArrayList<DataTransfusionEvent>();
			events.add(this.event);
			this.dataTransfusion.setEvents(events);
			
		}
		
		this.event = new DataTransfusionEvent();
		
	}
	
	
	public DataLaboratoryResult getLabResult() {
		return labResult;
	}


	public void setLabResult(DataLaboratoryResult labResult) {
		this.labResult = labResult;
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

	public String getSeveritySelected() {
		return severitySelected;
	}

	public void setSeveritySelected(String severitySelected) {
		this.severitySelected = severitySelected;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public DataTransfusion getDataTransfusion() {
		return dataTransfusion;
	}

	public void setDataTransfusion(DataTransfusion dataTransfusion) {
		this.dataTransfusion = dataTransfusion;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
	public String onFlowProcess(FlowEvent event) {
       
		return event.getNewStep();
        
    }
	
	public DataTransfusionEvent getEvent() {
		return event;
	}

	public void setEvent(DataTransfusionEvent event) {
		this.event = event;
	}

	public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
