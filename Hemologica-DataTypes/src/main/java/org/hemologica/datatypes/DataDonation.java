package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hemologica.constants.Constants;

public class DataDonation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4260250837335930498L;

	private String name;
	private String date;
	private String time;
	private DataBank bank;
	
	private String bloodCode;
	private DataInstitution institution;
	private DataPerson person;
	private DataCode dataDonorType;
	private DataCode donationType;
	private DataCode state;
	private DataCode bloodABOType;
	private DataCode bloodDType;
	private DataDonationFail fail;
	private DataResponsiblePerson responsiblePerson;
	private List<DataLaboratoryResult> labResults;
	private List<DataDonationEvent> events;
	private boolean approved; 

	private String extractionTimeBegin;
	private String extractionTimeEnd;

	public DataDonation() {
		this.fail = new DataDonationFail();
//		this.bloodABOType = new DataCode();
//		this.bloodDType = new DataCode();
//		this.dataDonorType = new DataCode();
//		this.person = new DataPerson();
		this.labResults = new ArrayList<DataLaboratoryResult>();
		this.events = new ArrayList<DataDonationEvent>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public DataBank getBank() {
		return bank;
	}

	public void setBank(DataBank bank) {
		this.bank = bank;
	}

	public DataInstitution getInstitution() {
		return institution;
	}

	public void setInstitution(DataInstitution institution) {
		this.institution = institution;
	}

	public boolean isApproved() {
		
		if(state != null && state.getCode().equals(Constants.COMPLETED))
			return true;
		else 
			return false;

	}
	
	public Boolean isStateDefined(){
		return this.state != null;
	}

	public List<DataLaboratoryResult> getLabResults() {
		return labResults;
	}

	public void setLabResults(List<DataLaboratoryResult> labResults) {
		this.labResults = labResults;
	}

	public DataPerson getPerson() {
		return person;
	}

	public void setPerson(DataPerson person) {
		this.person = person;
	}

	public DataDonationFail getFail() {
		return fail;
	}

	public void setFail(DataDonationFail fail) {
		this.fail = fail;
	}

	public DataCode getBloodABOType() {
		return bloodABOType;
	}

	public void setBloodABOType(DataCode bloodABOType) {
		this.bloodABOType = bloodABOType;
	}

	public DataCode getDataDonorType() {
		return dataDonorType;
	}

	public void setDataDonorType(DataCode dataDonorType) {
		this.dataDonorType = dataDonorType;
	}

	public String getExtractionTimeBegin() {
		return extractionTimeBegin;
	}

	public void setExtractionTimeBegin(String extractionTimeBegin) {
		this.extractionTimeBegin = extractionTimeBegin;
	}

	public String getExtractionTimeEnd() {
		return extractionTimeEnd;
	}

	public void setExtractionTimeEnd(String extractionTimeEnd) {
		this.extractionTimeEnd = extractionTimeEnd;
	}

	public DataCode getBloodDType() {
		return bloodDType;
	}

	public void setBloodDType(DataCode bloodDType) {
		this.bloodDType = bloodDType;
	}

	public List<DataDonationEvent> getEvents() {
		return events;
	}

	public void setEvents(List<DataDonationEvent> events) {
		this.events = events;
	}

	public DataCode getState() {
		return state;
	}

	public void setState(DataCode state) {
		this.state = state;
	}

	public DataCode getDonationType() {
		return donationType;
	}

	public void setDonationType(DataCode donationType) {
		this.donationType = donationType;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public String getBloodCode() {
		return bloodCode;
	}

	public void setBloodCode(String bloodCode) {
		this.bloodCode = bloodCode;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public DataResponsiblePerson getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setResponsiblePerson(DataResponsiblePerson responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	

}

