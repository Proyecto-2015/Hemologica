package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.datatypes.DataDonationState;

public class DataDonationStateConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		DataDonationState ret = new DataDonationState();
		if(value != null){
			if(value.equals(DataDonationStateEnum.MADE.value)){
				ret.setCode(DataDonationStateEnum.MADE.value);
				ret.setDisplayName(DataDonationStateEnum.MADE.label);
				return ret;
			}else if(value.equals(DataDonationStateEnum.REJECTED.value)){
				ret.setCode(DataDonationStateEnum.REJECTED.value);
				ret.setDisplayName(DataDonationStateEnum.REJECTED.label);
				return ret;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataDonationState){
			return ((DataDonationState) value).getCode();
		}
		return null;
	}

}
