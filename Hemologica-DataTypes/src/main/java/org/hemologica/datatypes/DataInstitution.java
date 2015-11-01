package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataInstitution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9176360583037903695L;
	
	private String code;
	private String name;
	private List<DataBank> banks;
	private String address;
	private String hour;
	private String telephone;
	private String email;
	private String information;
	private Double latitude;
	private Double longitude;
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
	public List<DataBank> getBanks() {
		return banks;
	}
	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	} 
}
