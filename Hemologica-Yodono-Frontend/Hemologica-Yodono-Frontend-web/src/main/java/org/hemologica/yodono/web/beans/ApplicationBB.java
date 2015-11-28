package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.yodono.factories.RestFactory;

public class ApplicationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967430387332405694L;
	private static final Logger logger = Logger.getLogger(ApplicationBB.class.getName());
	
	private List<DataBank> banks;
	private List<DataCode> cities;
	private List<DataCode> states;
	
	@PostConstruct
	public void init(){
		
		try {
			
			this.cities = RestFactory.getServicesClient().getCitiesCodes();
			this.states = RestFactory.getServicesClient().getStatesCodes();
			this.banks = RestFactory.getServicesClient().getBanks();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: IOException", e);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: URISyntaxException", e);
			
		}
	}

	public List<DataBank> getBanks() {
		return banks;
	}

	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}

	public List<DataCode> getCities() {
		return cities;
	}

	public void setCities(List<DataCode> cities) {
		this.cities = cities;
	}

	public List<DataCode> getStates() {
		return states;
	}

	public void setStates(List<DataCode> states) {
		this.states = states;
	}

}
