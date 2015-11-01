package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.constants.DataEventSeverityEnum;

public class DataEventSeverityConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		if(DataEventSeverityEnum.MILD.getValue().equals(value)){
			return DataEventSeverityEnum.MILD;
		}
		if(DataEventSeverityEnum.MODERATE.getValue().equals(value)){
			return DataEventSeverityEnum.MODERATE;
		}
		if(DataEventSeverityEnum.SEVERE.getValue().equals(value)){
			return DataEventSeverityEnum.SEVERE;
		}
		return null;

	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof DataEventSeverityEnum) {

			return ((DataEventSeverityEnum) value).getValue();
		}
		return null;
	}

}
