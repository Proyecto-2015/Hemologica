package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataCity;
import org.hemologica.yodono.factories.RestFactory;

//@FacesConverter(value="dataCityConverter")
public class DataCityConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value == null){
			return null;
		}
		
		List<DataCity> citiesList = null;
		try {
			citiesList = RestFactory.getServicesClient().getCities();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(citiesList != null){
			for(DataCity city : citiesList){
				
				if(city.getCode() != null && city.getCode().equals(value)){
					return city;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataCity){
			return ((DataCity)value).getCode();
		}
		return null;
	}

}
