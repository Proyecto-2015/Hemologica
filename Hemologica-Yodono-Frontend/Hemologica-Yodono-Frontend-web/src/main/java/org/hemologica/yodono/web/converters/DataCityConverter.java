package org.hemologica.yodono.web.converters;

import java.util.List;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataCode;
import org.hemologica.yodono.web.beans.ApplicationBB;

public class DataCityConverter implements Converter {
	
	private static final Logger logger = Logger.getLogger(DataCityConverter.class.getName()); 
	
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
