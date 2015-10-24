package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataUser;
import org.hemologica.yodono.factories.RestFactory;
import org.hemologica.yodono.web.utils.JSFUtils;

public class UserBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(UserBB.class.getName()); 
	private DataUser dataUser;
	private List<DataState> states;
	private DataState state;
	private List<DataCity> cities;
	private DataCity city;
	private Date birthdayDate;
	
	@PostConstruct
	public void init(){
		
		try {
			
			dataUser = RestFactory.getServicesClient().getDataUser("");
			states = RestFactory.getServicesClient().getStates();
			state = dataUser.getState();
			city = dataUser.getCity();
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
	}
	
	public void changeState(){
		cities = getCities();
	}
	
	public void submit() {
		logger.info("holaaaaa");
		JSFUtils.addGlobalInfoMessage("HOLAAAAA");
	}
	
	
	public DataUser getDataUser() {
		
		return dataUser;
	}
	
	public void setDataUser(DataUser dataUser) {
		this.dataUser = dataUser;
	}
	
	public void setBirthdayDate(Date date){
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = format.format(date);
		this.dataUser.setBirthdayDate(dateString);
		
	}
	
	public Date getBirthdayDate(){
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			
			birthdayDate = format.parse(dataUser.getBirthdayDate());
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha", e);
			
		}
		return birthdayDate;
	}

	public List<DataState> getStates() {
		
		return states;
	
	}

	public List<DataCity> getCities() {
		
		return cities;
	}
	
	public List<DataCity> getCitiesState(String stateCode){
		
		try {
			
			return RestFactory.getServicesClient().getCities(stateCode);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error obtener las cidades del departamento: " + stateCode, e);
			
		}
		return null;
	}

	public DataState getState() {
		return state;
	}

	public void setState(DataState state) {
		this.state = state;
	}

	public DataCity getCity() {
		return city;
	}

	public void setCity(DataCity city) {
		this.city = city;
	}

	public void setStates(List<DataState> states) {
		this.states = states;
	}

	public void setCities(List<DataCity> cities) {
		this.cities = cities;
	}
	
	
	
	
}
