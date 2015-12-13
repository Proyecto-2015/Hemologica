package org.hemologica.datatypes;


public class DataOmsStatistics {
	
	private String type;
	private String fromDate;
	private String toDate;
	private DataInstitution institution;
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
	
}
