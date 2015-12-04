package org.hemologica.datatypes;

import java.util.List;

public class TransfusionFilterData implements Cloneable {
	
	private String code;
	private String displayName;
	private TransfusionFilterData value;
	private String valueString;
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
	
	public TransfusionFilterData getValue() {
		return value;
	}
	public void setValue(TransfusionFilterData value) {
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
	
		return super.clone();
		
	}
}
