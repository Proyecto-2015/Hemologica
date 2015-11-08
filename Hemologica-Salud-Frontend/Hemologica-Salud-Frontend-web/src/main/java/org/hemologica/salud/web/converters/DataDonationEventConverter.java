package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataDonationEvent;

public class DataDonationEventConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataDonationEvent){
			
			return ((DataDonationEvent)value).getEvent().getCode();
		}
		return null;
	}

}
