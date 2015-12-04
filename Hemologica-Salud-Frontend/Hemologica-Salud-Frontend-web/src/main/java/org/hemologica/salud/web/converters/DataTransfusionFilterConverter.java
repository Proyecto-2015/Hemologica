package org.hemologica.salud.web.converters;

import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.web.beans.ApplicationBB;
import org.hemologica.salud.web.beans.SessionBB;;

public class DataTransfusionFilterConverter implements Converter{

	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if (value == null) {
			return null;
		}
		
		TransfusionFilterData donationFIlterData = (TransfusionFilterData) component.getAttributes().get("filterItem");

		List<TransfusionFilterData> typesList = donationFIlterData.getOptions();
		
		if (typesList != null) {
			for (TransfusionFilterData type : typesList) {

				if (type.getCode() != null && type.getCode().equals(value)) {
					return type;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value instanceof TransfusionFilterData){
			
			return ((TransfusionFilterData)value).getCode();
		}
		return null;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
}
