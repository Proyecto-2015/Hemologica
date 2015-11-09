package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataInstitutionCenter;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.salud.factories.RestFactory;

import java.util.Date;

public class UnitBB implements Serializable {

	
	private static final Logger logger = Logger.getLogger(UnitBB.class.getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8925888848602043532L;
	
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	
	private DataInstitution institution;
	private String institutionCode;
	private String code;
	private Boolean active;
	private DataProductType productType;
	private DataBloodType bloodType;
	private Date dueDate;
	
	
	private List<DataUnit> units;
	private Boolean renderResult;
	


	@PostConstruct
	public void init(){
	
		this.renderResult = false;
		
	}
	
	
	public void search(){
		
		try {
			
			System.out.println("hOLA");
			units =  RestFactory.getServicesClient().getUnits();
			renderResult = true;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void searchClear(){
		
		units = null;
		renderResult = false;
		institution = null;
		institutionCode = null;
		code = null;
		active = null;
		productType = null;
		bloodType = null;
		dueDate = null;
		
	}

	public String getInstitutionCode() {
		return institutionCode;
	}



	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}



	public DataInstitution getInstitution() {
		return institution;
	}



	public void setInstitution(DataInstitution institution) {
		this.institution = institution;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Boolean getActive() {
		return active;
	}



	public void setActive(Boolean active) {
		this.active = active;
	}



	public DataProductType getProductType() {
		return productType;
	}



	public void setProductType(DataProductType productType) {
		this.productType = productType;
	}



	public DataBloodType getBloodType() {
		return bloodType;
	}



	public void setBloodType(DataBloodType bloodType) {
		this.bloodType = bloodType;
	}



	public Date getDueDate() {
		return dueDate;
	}



	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}



	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}



	public SessionBB getSessionBB() {
		return sessionBB;
	}



	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
	public List<DataUnit> getUnits() {
		return units;
	}


	public void setUnits(List<DataUnit> units) {
		this.units = units;
	}


	public Boolean getRenderResult() {
		return renderResult;
	}


	public void setRenderResult(Boolean renderResult) {
		this.renderResult = renderResult;
	}
	
}
