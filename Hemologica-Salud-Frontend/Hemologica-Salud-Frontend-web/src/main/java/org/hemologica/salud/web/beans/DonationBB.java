package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.FlowEvent;

public class DonationBB implements Serializable {

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
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	

	@PostConstruct
	public void init(){
		
		this.dataDonacion = new DataDonation();
		this.labResult = new DataLaboratoryResult();
		this.event = new DataDonationEvent();
		this.ctx = FacesContext.getCurrentInstance();
		
		this.dataDonacion.setState(applicationBB.getStates().get(0));
	}

	public void addLabResult(){
		
		if(this.dataDonacion.getLabResults() != null)
		
			this.dataDonacion.getLabResults().add(0,this.labResult);
		
		else{
			
			List<DataLaboratoryResult> list = new ArrayList<DataLaboratoryResult>();
			list.add(this.labResult);
			this.dataDonacion.setLabResults(list);
		}
		
		this.labResult = new DataLaboratoryResult();
	}
	
	public void addEvent(){
		
		if(this.dataDonacion.getEvents() != null){
			
			this.dataDonacion.getEvents().add(0,this.event);
				
		}else{
			
			List<DataDonationEvent> events = new ArrayList<DataDonationEvent>();
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
		
		dataDonacion.setState((DataCode) ev.getNewValue());
		
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
	
	public void submit(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		bundle = app.getResourceBundle(context, languageVarName);
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("add_donation_error"));
		
		DataResponse response = RestFactory.getServicesClient().addDonation(dataDonacion);

		if(response != null && response.getCode() == 0){
			
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, bundle.getString("add_donation_success"));

		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

}
