package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataDonation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4260250837335930498L;

	private String name;
	private String date;
	private DataBank bank;
	private DataInstitution institution;
	private String donorType;
	private DataPerson person;
	private DataDonationDonorType dataDonorType;
	private DataDonationState state;
	private DataBloodABOType bloodABOType;
	private DataBloodType bloodDType;
	private DataDonationFail fail;
	private List<DataLaboratoryResult> labResults;
	private List<DataDonationEvent> events;

	private Date extractionTimeBegin;
	private Date extractionTimeEnd;

	public DataDonation() {
		this.fail = new DataDonationFail();
		this.bloodABOType = new DataBloodABOType();
		this.bloodDType = new DataBloodType();
		this.dataDonorType = new DataDonationDonorType();
		this.person = new DataPerson();
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

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public Boolean isApproved() {
		return this.state.isApproved();
	}
	
	public Boolean isStateDefined(){
		return this.state != null;
	}
	
	public Boolean isNotApproved() {
		return !this.state.isApproved();
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

	public DataBloodABOType getBloodABOType() {
		return bloodABOType;
	}

	public void setBloodABOType(DataBloodABOType bloodABOType) {
		this.bloodABOType = bloodABOType;
	}

	public DataDonationDonorType getDataDonorType() {
		return dataDonorType;
	}

	public void setDataDonorType(DataDonationDonorType dataDonorType) {
		this.dataDonorType = dataDonorType;
	}

	public Date getExtractionTimeBegin() {
		return extractionTimeBegin;
	}

	public void setExtractionTimeBegin(Date extractionTimeBegin) {
		this.extractionTimeBegin = extractionTimeBegin;
	}

	public Date getExtractionTimeEnd() {
		return extractionTimeEnd;
	}

	public void setExtractionTimeEnd(Date extractionTimeEnd) {
		this.extractionTimeEnd = extractionTimeEnd;
	}

	public DataBloodType getBloodDType() {
		return bloodDType;
	}

	public void setBloodDType(DataBloodType bloodDType) {
		this.bloodDType = bloodDType;
	}

	public DataDonationState getState() {
		return state;
	}

	public void setState(DataDonationState state) {
		this.state = state;
	}

	public List<DataDonationEvent> getEvents() {
		return events;
	}

	public void setEvents(List<DataDonationEvent> events) {
		this.events = events;
	}

}

