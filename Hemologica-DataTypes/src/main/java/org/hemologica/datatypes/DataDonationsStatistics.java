package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataDonationsStatistics implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fromDate;
	private String toDate;
	private DataInstitution institution;
	private DataBank bloodBank;
	private List<DonationFilterData> filters;

	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public DataInstitution getInstitution() {
		return institution;
	}
	public void setInstitution(DataInstitution institution) {
		this.institution = institution;
	}

	public DataBank getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(DataBank bloodBank) {
		this.bloodBank = bloodBank;
	}
	public List<DonationFilterData> getFilters() {
		return filters;
	}
	public void setFilters(List<DonationFilterData> filters) {
		this.filters = filters;
	}

}
