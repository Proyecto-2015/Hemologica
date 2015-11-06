package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hemologica.constants.DataDonationStateEnum;

public class DataDonationStateConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value != null){
			if(value.equals(DataDonationStateEnum.MADE.value)){
//				ret.setCode(DataDonationStateEnum.MADE.value);
//				ret.setDisplayName(DataDonationStateEnum.MADE.label);
				return DataDonationStateEnum.MADE;
			}else if(value.equals(DataDonationStateEnum.REJECTED.value)){
//				ret.setCode(DataDonationStateEnum.REJECTED.value);
//				ret.setDisplayName(DataDonationStateEnum.REJECTED.label);
				return DataDonationStateEnum.REJECTED;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataDonationStateEnum){
			return ((DataDonationStateEnum) value).value;
		}
		return null;
	}

}
