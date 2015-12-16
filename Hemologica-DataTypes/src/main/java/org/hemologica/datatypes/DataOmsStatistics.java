package org.hemologica.datatypes;

import java.util.List;

public class DataOmsStatistics {
	
	private String type;
	private String fromDate;
	private String toDate;
	private DataInstitution institution;
	private List<TransfusionFilterData> transfusionFilter;
	private List<DonationFilterData> donationFilter;
	private List<DonationFilterData> commonsFilters;
	private DataBank bloodBank;

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public List<TransfusionFilterData> getTransfusionFilter() {
		return transfusionFilter;
	}
	public void setTransfusionFilter(List<TransfusionFilterData> transfusionFilter) {
		this.transfusionFilter = transfusionFilter;
	}
	public List<DonationFilterData> getDonationFilter() {
		return donationFilter;
	}
	public void setDonationFilter(List<DonationFilterData> donationFilter) {
		this.donationFilter = donationFilter;
	}
	public List<DonationFilterData> getCommonsFilters() {
		return commonsFilters;
	}
	public void setCommonsFilters(List<DonationFilterData> commonsFilters) {
		this.commonsFilters = commonsFilters;
	}
	
}
