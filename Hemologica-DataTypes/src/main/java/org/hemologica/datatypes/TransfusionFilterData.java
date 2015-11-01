package org.hemologica.datatypes;

import java.util.List;

public class TransfusionFilterData {
	
	private String code;
	private String displayName;
	private List<TransfusionFilterData> options;
	
	
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
	public List<TransfusionFilterData> getOptions() {
		return options;
	}
	public void setOptions(List<TransfusionFilterData> options) {
		this.options = options;
	}
	
}
