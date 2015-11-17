package org.hemologica.salud.web.converters;

import java.io.IOException;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.factories.RestFactory;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataCityConverter implements Converter {
	
private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value == null){
			return null;
		}
		
		List<DataCode> citiesList = applicationBB.getCities();
		
		
		if(citiesList != null){
			for(DataCode city : citiesList){
				
				if(city.getCode() != null && city.getCode().equals(value)){
					return city;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataCode){
			
			return ((DataCode)value).getCode();
		}
		return null;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

}
