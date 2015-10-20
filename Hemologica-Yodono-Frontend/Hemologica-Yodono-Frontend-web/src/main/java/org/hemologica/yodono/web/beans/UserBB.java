package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	
	@PostConstruct
	public void init(){
		
		try {
			
			dataUser = RestFactory.getServicesClient().getDataUser("");
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
		Date date = null;
		try {
			
			date = format.parse(dataUser.getBirthdayDate());
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha", e);
			
		}
		return date;
	}

	public List<DataState> getStates() {
		
		List<DataState> cities = new ArrayList<DataState>();
		
		DataState dataCity = new DataState();
		dataCity.setId(1);
		dataCity.setName("Montevideo 111");
		cities.add(dataCity);
		
		DataState dataCity2 = new DataState();
		dataCity2.setId(2);
		dataCity2.setName("Montevideo 122");
		cities.add(dataCity2);
		
		DataState dataCity3 = new DataState();
		dataCity3.setId(3);
		dataCity3.setName("Montevideo 133");
		cities.add(dataCity3);
		
		return cities;
	}

	public List<DataCity> getCities() {
		
		List<DataCity> cities = new ArrayList<DataCity>();
		getDataUser();
		if(state.getId() == 0){
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setName("Montevideo 1");
			cities.add(dataCity);
			
			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity2.setName("Montevideo 2");
			cities.add(dataCity2);
			
			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity3.setName("Montevideo 3");
			cities.add(dataCity3);
		}
		if(state.getId() == 1){
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setName("Montevideo 12");
			cities.add(dataCity);
			
			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity2.setName("Montevideo 22");
			cities.add(dataCity2);
			
			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity3.setName("Montevideo 32");
			cities.add(dataCity3);
		}
		if(state.getId() == 2){
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setName("Montevideo 13");
			cities.add(dataCity);
			
			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity2.setName("Montevideo 23");
			cities.add(dataCity2);
			
			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity3.setName("Montevideo 33");
			cities.add(dataCity3);
		}
		
		return cities;
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
