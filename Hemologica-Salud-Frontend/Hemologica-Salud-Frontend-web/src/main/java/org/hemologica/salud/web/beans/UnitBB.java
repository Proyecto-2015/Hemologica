package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.salud.factories.RestFactory;

public class UnitBB implements Serializable {

	
	private static final Logger logger = Logger.getLogger(UnitBB.class.getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8925888848602043532L;
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	private DataInstitution institution;
	private String code;	
	private DataUnitInfo unit;

	@PostConstruct
	public void init(){
	
		
	}	
	
	public void search(){
		
		try {
			
			unit =  RestFactory.getServicesClient().getUnitInfo(code, institution.getCode());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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


	public DataUnitInfo getUnit() {
		return unit;
	}


	public void setUnit(DataUnitInfo unit) {
		this.unit = unit;
	}
	
}
