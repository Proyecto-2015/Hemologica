package org.hemologica.datatypes;

import java.io.Serializable;

public class DataMovement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String movementsType;
	private String centerName;
	private String date;
	
	public String getMovementsType() {
		return movementsType;
	}
	public void setMovementsType(String movementsType) {
		this.movementsType = movementsType;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
