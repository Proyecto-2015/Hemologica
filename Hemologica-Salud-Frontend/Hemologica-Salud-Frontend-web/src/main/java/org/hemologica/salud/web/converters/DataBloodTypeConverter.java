package org.hemologica.salud.web.converters;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.salud.factories.RestFactory;

public class DataBloodTypeConverter implements Converter {
	
	private static final Logger logger = Logger.getLogger(DataBloodTypeConverter.class.getName()); 
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		if(value == null){
			return null;
		}
		
		List<BloodTypeData> typesList = null;
		try {
			
			typesList = RestFactory.getServicesClient().getBloodTypes();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
			
		}
		
		if(typesList != null){
			for(BloodTypeData type : typesList){
				
				if(type.getCode() != null && type.getCode().equals(value)){
					return type;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		if(value instanceof BloodTypeData){
			
			return ((BloodTypeData)value).getCode();
		}
		return null;
	}

}
