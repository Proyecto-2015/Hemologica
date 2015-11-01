package org.hemologica.datatypes;

import java.util.List;

public class DonationFilterData {
	
	private String code;
	private String displayName;
	private List<DonationFilterData> options;
	
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<DonationFilterData> getOptions() {
		return options;
	}
	public void setOptions(List<DonationFilterData> options) {
		this.options = options;
	}
	
}
