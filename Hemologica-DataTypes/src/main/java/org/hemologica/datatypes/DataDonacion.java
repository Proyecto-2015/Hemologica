package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataDonacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4260250837335930498L;

	private String name;
	private String date;
	private String bank;
	private String institution;
	private String donorType;
	private Boolean approved;
	private DataPerson person;
	private DataDonationDonorType dataDonorType;
	private DataDonationState state;
	private DataBloodABOType bloodABOType;
	private DataBloodDType bloodDType;
	private DataDonationFail fail;
	private List<DataLaboratoryResult> labResults;

	private Date extractionTimeBegin;
	private Date extractionTiemEnd;

	public DataDonacion() {
		this.fail = new DataDonationFail();
		this.bloodABOType = new DataBloodABOType();
		this.bloodDType = new DataBloodDType();
		this.dataDonorType = new DataDonationDonorType();
		this.state = new DataDonationState();
		this.person = new DataPerson();
		this.labResults = new ArrayList<DataLaboratoryResult>();
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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public List<DataLaboratoryResult> getLabResults() {
		return labResults;
	}

	public void setLabResults(List<DataLaboratoryResult> labResults) {
		this.labResults = labResults;
	}

	public DataDonationState getState() {
		return state;
	}

	public void setState(DataDonationState state) {
		this.state = state;
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

	public Date getExtractionTiemEnd() {
		return extractionTiemEnd;
	}

	public void setExtractionTiemEnd(Date extractionTiemEnd) {
		this.extractionTiemEnd = extractionTiemEnd;
	}

	public DataBloodDType getBloodDType() {
		return bloodDType;
	}

	public void setBloodDType(DataBloodDType bloodDType) {
		this.bloodDType = bloodDType;
	}

}

