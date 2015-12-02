package org.hemologica.dao.enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public enum DataDonationStateEnum implements Serializable {
	
	MADE ("made", "donation_state_made"),
	REJECTED ("rejected", "donation_state_rejected");
	
	public String value;
	public String label;
	
	private DataDonationStateEnum(String value, String label){
		this.value = value;
		this.label = label;
	}
	
	public static List<DataDonationStateEnum> getStates(){
		List<DataDonationStateEnum> ret = new ArrayList<DataDonationStateEnum>();
		
		ret.add(DataDonationStateEnum.MADE);
		ret.add(DataDonationStateEnum.REJECTED);
		return ret;
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
