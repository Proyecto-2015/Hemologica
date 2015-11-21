package org.hemologica.dao.enums;

import java.io.Serializable;

public enum CenterType  implements Serializable {
	
	BANK ("bank"),
	TRANSFUSON_CENTER ("transfusionCenter");
	
	public String value;
	
	private CenterType(String value){
		
		this.value = value;
		
	}

}
