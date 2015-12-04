package org.hemologica.datatypes;

import java.util.List;

public class DonationFilterData implements Cloneable{
	
	private String code;
	private String displayName;
	private DonationFilterData value;
	private String valueString;
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
	public DonationFilterData getValue() {
		return value;
	}
	public void setValue(DonationFilterData value) {
		this.value = value;
	}
	
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
