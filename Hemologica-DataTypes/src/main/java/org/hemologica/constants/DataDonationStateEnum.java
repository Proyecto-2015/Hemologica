package org.hemologica.constants;

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
//		DataDonationStateEnum state = new DataDonationStateEnum();
//		state.setCode(MADE.value);
//		state.setDisplayName(MADE.label);
//		ret.add(state);
//		state = new DataDonationState();
//		state.setCode(REJECTED.value);
//		state.setDisplayName(REJECTED.label);
//		ret.add(state);
		return ret;
	}
}
