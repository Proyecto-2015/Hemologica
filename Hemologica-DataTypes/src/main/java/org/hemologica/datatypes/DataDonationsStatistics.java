package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataDonationsStatistics implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fromDate;
	private String toDate;
	private DataInstitution institution;
	private DataBank bloodBank;
	private List<DonationFilterData> filtersDenominator;
	private List<DonationFilterData> filtersNumerator;
	
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
	public List<DonationFilterData> getFiltersDenominator() {
		return filtersDenominator;
	}
	public void setFiltersDenominator(List<DonationFilterData> filtersDenominator) {
		this.filtersDenominator = filtersDenominator;
	}
	public List<DonationFilterData> getFiltersNumerator() {
		return filtersNumerator;
	}
	public void setFiltersNumerator(List<DonationFilterData> filtersNumerator) {
		this.filtersNumerator = filtersNumerator;
	}

}
