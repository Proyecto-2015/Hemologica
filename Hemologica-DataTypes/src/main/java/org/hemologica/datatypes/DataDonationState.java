package org.hemologica.datatypes;

import java.io.Serializable;

import org.hemologica.constants.DataDonationStateEnum;

public class DataDonationState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3224603718726115909L;
	
	private String code;
	private String displayName;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public Boolean isApproved(){
		return code != null && code.equals(DataDonationStateEnum.MADE.value);
	}
	
	@Override
	public boolean equals(Object obj){
		if( (obj instanceof DataDonationState) &&
			(obj != null)){
			return this.code.equals(((DataDonationState)obj).getCode());
		}
		return super.equals(obj);
		
	}
	
}
