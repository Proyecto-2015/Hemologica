package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataBloodDType;

public class DataBloodDTypeConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataBloodDType){
			
			return ((DataBloodDType)value).getCode();
		}
		return null;
	}

}
