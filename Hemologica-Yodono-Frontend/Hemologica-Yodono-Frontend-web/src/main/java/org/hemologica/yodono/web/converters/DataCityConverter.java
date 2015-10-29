package org.hemologica.yodono.web.converters;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataCity;
import org.hemologica.yodono.factories.RestFactory;

public class DataCityConverter implements Converter {
	
	private static final Logger logger = Logger.getLogger(DataCityConverter.class.getName()); 
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value == null){
			return null;
		}
		
		List<DataCity> citiesList = null;
		try {
			
			citiesList = RestFactory.getServicesClient().getCities();
			
		}catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
			
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
			
			return ((DataCity)value).getName();
		}
		return null;
	}

}
