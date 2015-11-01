package org.hemologica.datatypes;

import java.io.Serializable;

public class DataProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2826091238509417952L;
	
	private String code;
	private String display;
	
	private DataDonation donation;

	public DataDonation getDonation() {
		return donation;
	}

	public void setDonation(DataDonation donation) {
		this.donation = donation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
