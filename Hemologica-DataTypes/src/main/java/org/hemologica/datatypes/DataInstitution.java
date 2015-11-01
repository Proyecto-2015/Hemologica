package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataInstitution implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4982457911970636051L;
	
	private String id;
	private String oid;
	private String code;
	private String name;
	private List<DataInstitutionCenter> centers;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DataInstitutionCenter> getCenters() {
		return centers;
	}
	public void setCenters(List<DataInstitutionCenter> centers) {
		this.centers = centers;
	}	
}
