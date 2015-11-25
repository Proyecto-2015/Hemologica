package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DonationsStatisticsData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String type;
	private String fromDate;
	private String toDate;
	private DataCode institution;
	private DataCode bloodBank;
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
	public DataCode getInstitution() {
		return institution;
	}
	public void setInstitution(DataCode institution) {
		this.institution = institution;
	}
	public DataCode getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(DataCode bloodBank) {
		this.bloodBank = bloodBank;
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
