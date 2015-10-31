package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataDonationState;

import javax.annotation.PostConstruct;

public class ApplicationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967430387332405694L;
	
	private List<DataCity> cities;
	private List<DataCountry> countries;
	private List<DataDocumentType> documentTypes;
	
	
	@PostConstruct
	public void init(){
		
	}

	public List<SelectItem> getItems(String code){
		
		if(code == null){
			return null;
		}
		
		return null;
	}
	
	public List<DataDonationState> getDonationStates(){
		return DataDonationStateEnum.getStates();
	}

	public List<DataCity> getCities() {
		return cities;
	}

	public List<DataCountry> getCountries() {
		return countries;
	}

	public List<DataDocumentType> getDocumentTypes() {
		return documentTypes;
	}
	
	
}
