package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataCountry;

public class DataCountryConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
//		if(value == null){
//			return null;
//		}
//		
//		List<DataCountry> citiesList = null;
//		try {
//			citiesList = RestFactory.getServicesClient().getCities();
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		if(citiesList != null){
//			for(DataCity city : citiesList){
//				
//				if(city.getCode() != null && city.getCode().equals(value)){
//					return city;
//				}
//			}
//		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataCountry){
			
			return ((DataCountry)value).getCode();
		}
		return null;
	}

}
