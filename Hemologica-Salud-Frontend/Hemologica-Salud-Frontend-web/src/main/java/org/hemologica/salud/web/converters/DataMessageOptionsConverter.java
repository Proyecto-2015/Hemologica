package org.hemologica.salud.web.converters;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.salud.factories.RestFactory;

public class DataMessageOptionsConverter implements Converter {

	private static final Logger logger = Logger.getLogger(DataMessageOptionsConverter.class.getName()); 
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		if(value == null){
			return null;
		}
		
		List<MessageOptionData> optionList = null;
		try {
			
			optionList = RestFactory.getServicesClient().getMessageOptions();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
			
		}
		
		if(optionList != null){
			for(MessageOptionData type : optionList){
				
				if(type.getCode() != null && type.getCode().equals(value)){
					return type;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		if(value instanceof MessageOptionData){
			
			return ((MessageOptionData)value).getCode();
		}
		return null;
	}

}
