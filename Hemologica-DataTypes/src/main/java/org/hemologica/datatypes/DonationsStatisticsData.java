package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DonationsStatisticsData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String type;
	private String fromDate;
	private String toDate;
	private String institutionId;
	private String bloodBankId;
	private List<DonationFilterData> filters;
	private List<DonationFilterData> distinguish;
	
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
	public String getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	public String getBloodBankId() {
		return bloodBankId;
	}
	public void setBloodBankId(String bloodBankId) {
		this.bloodBankId = bloodBankId;
	}
	public List<DonationFilterData> getFilters() {
		return filters;
	}
	public void setFilters(List<DonationFilterData> filters) {
		this.filters = filters;
	}
	public List<DonationFilterData> getDistinguish() {
		return distinguish;
	}
	public void setDistinguish(List<DonationFilterData> distinguish) {
		this.distinguish = distinguish;
	}

}
