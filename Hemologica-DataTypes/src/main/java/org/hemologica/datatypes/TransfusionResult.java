package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class TransfusionResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9023483717165649475L;
	
	private String transfusionId;
	private String personDocument;
	private String personCompleteName;
	private Date transfusionDate;
	private String transfusionState;
	
	public TransfusionResult(){}
	
	public TransfusionResult(String transfusionId, 
			String personDocument, 
			String personCompleteName, 
			Date transfusionDate, 
			String transfusionState){
		
		this.transfusionId = transfusionId;
		this.personDocument = personDocument;
		this.personCompleteName = personCompleteName;
		this.transfusionDate = transfusionDate;
		this.transfusionState = transfusionState;
	}
	
	public String getTransfusionId() {
		return transfusionId;
	}

	public void setTransfusionId(String transfusionId) {
		this.transfusionId = transfusionId;
	}

	public String getPersonDocument() {
		return personDocument;
	}

	public void setPersonDocument(String personDocument) {
		this.personDocument = personDocument;
	}

	public String getPersonCompleteName() {
		return personCompleteName;
	}

	public void setPersonCompleteName(String personCompleteName) {
		this.personCompleteName = personCompleteName;
	}

	public Date getTransfusionDate() {
		return transfusionDate;
	}

	public void setTransfusionDate(Date transfusionDate) {
		this.transfusionDate = transfusionDate;
	}

	public String getTransfusionState() {
		return transfusionState;
	}

	public void setTransfusionState(String transfusionState) {
		this.transfusionState = transfusionState;
	}
}
