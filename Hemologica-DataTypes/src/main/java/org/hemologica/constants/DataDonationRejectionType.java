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
		
}
