package org.hemologica.datatypes;

import java.util.List;

public class DataTransfusionsStatistics {
	
	private String type;
	private String fromDate;
	private String toDate;
	private DataInstitution institution;
	private DataBank bloodBank;
	private List<TransfusionFilterData> filters;
	private List<TransfusionFilterData> allFiltersDenominator;

	
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
	public List<TransfusionFilterData> getFilters() {
		return filters;
	}
	public void setFilters(List<TransfusionFilterData> filters) {
		this.filters = filters;
	}
	public List<TransfusionFilterData> getAllFiltersDenominator() {
		return allFiltersDenominator;
	}
	public void setAllFiltersDenominator(List<TransfusionFilterData> allFiltersDenominator) {
		this.allFiltersDenominator = allFiltersDenominator;
	}
	
	
}
