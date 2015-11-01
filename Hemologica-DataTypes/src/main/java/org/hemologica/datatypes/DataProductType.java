package org.hemologica.datatypes;

import java.io.Serializable;

public class DataProductType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8452443889912017469L;
	
	private String code;
	private String display;
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
