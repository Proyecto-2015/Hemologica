package org.hemologica.constants;

import java.io.Serializable;

public enum DataDonationRejectionType implements Serializable {
		
		TEMPORARY ("temporary", "temporary"),
		PERMANENT ("permanent", "permanent");
		
		public String value;
		public String label;
		
		private DataDonationRejectionType(String value, String label){
			this.value = value;
			this.label = label;
		}
		
//		public static List<DataDonationRejectionType> RejectionType(){
//			List<DataDonationRejectionType> ret = new ArrayList<DataDonationRejectionType>();
//			DataDonationRejectionType state = new DataDonationRejectionType();
//			state.setCode(TEMPORARY.value);
//			state.setDisplayName(TEMPORARY.label);
//			ret.add(state);
//			state = new DataDonationState();
//			state.setCode(PERMANENT.value);
//			state.setDisplayName(PERMANENT.label);
//			ret.add(state);
//			return ret;
//		}
}
