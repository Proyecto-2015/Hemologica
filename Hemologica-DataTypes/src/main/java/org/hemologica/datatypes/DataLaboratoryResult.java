package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DataLaboratoryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7214257230098571156L;

	private DataCode analysis;
	private String bank; /* Pueden ser en otro lugar que el de la donación???? */
	private Date date;
	private DataResponsiblePerson responsiblePerson;
	private Boolean result;
	
	
	public DataCode getAnalysis() {
		return analysis;
	}
	public void setAnalysis(DataCode analysis) {
		this.analysis = analysis;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public DataResponsiblePerson getResponsiblePerson() {
		return responsiblePerson;
	}
	public void setResponsiblePerson(DataResponsiblePerson responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	
	
}

