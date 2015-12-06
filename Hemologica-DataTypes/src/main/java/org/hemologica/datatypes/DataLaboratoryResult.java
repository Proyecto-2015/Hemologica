package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DataLaboratoryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7214257230098571156L;

	private DataCode analysis;
	private DataBank bank; /* Pueden ser en otro lugar que el de la donación???? */
	private String date;
	private DataResponsiblePerson responsiblePerson;
	private DataCode result;
	
	
	public DataCode getAnalysis() {
		return analysis;
	}
	public void setAnalysis(DataCode analysis) {
		this.analysis = analysis;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public DataCode getResult() {
		return result;
	}
	public void setResult(DataCode result) {
		this.result = result;
	}
	public DataBank getBank() {
		return bank;
	}
	public void setBank(DataBank bank) {
		this.bank = bank;
	}
	public DataResponsiblePerson getResponsiblePerson() {
		return responsiblePerson;
	}
	public void setResponsiblePerson(DataResponsiblePerson responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	
	
}

