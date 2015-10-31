package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataBloodDType;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataDonationFailCause;
import org.hemologica.datatypes.DataDonationState;
import org.hemologica.datatypes.DataLaboratoryResult;

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
	private List<DataDonationState> donationStates;
	private List<DataDonationFail> donationFails;
	private List<DataDonationFailCause> donationFailCauses;
	private List<DataBloodABOType> donationABOTypes;
	private List<DataBloodDType> donationDTypes;
	
	
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
		this.donationStates = DataDonationStateEnum.getStates();
		this.ctx = FacesContext.getCurrentInstance();
	}

	public void addLabResult(){
		this.dataDonacion.getLabResults().add(this.labResult);
		this.labResult = new DataLaboratoryResult();
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
		dataDonacion.setState((DataDonationState) ev.getNewValue());
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

	public List<DataDonationFailCause> getDonationFailCauses() {
		return donationFailCauses;
	}


	public void setDonationFailCauses(List<DataDonationFailCause> donationFailCauses) {
		this.donationFailCauses = donationFailCauses;
	}


	public List<DataDonationFail> getDonationFails() {
		return donationFails;
	}


	public void setDonationFails(List<DataDonationFail> donationFails) {
		this.donationFails = donationFails;
	}


	public DataLaboratoryResult getLabResult() {
		return labResult;
	}


	public void setLabResult(DataLaboratoryResult labResult) {
		this.labResult = labResult;
	}


	public List<DataBloodABOType> getDonationABOTypes() {
		return donationABOTypes;
	}


	public void setDonationABOTypes(List<DataBloodABOType> donationABOTypes) {
		this.donationABOTypes = donationABOTypes;
	}


	public List<DataBloodDType> getDonationDTypes() {
		return donationDTypes;
	}


	public void setDonationDTypes(List<DataBloodDType> donationDTypes) {
		this.donationDTypes = donationDTypes;
	}


	public List<DataDonationState> getDonationStates() {
		return donationStates;
	}


	public void setDonationStates(List<DataDonationState> donationStates) {
		this.donationStates = donationStates;
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

}
