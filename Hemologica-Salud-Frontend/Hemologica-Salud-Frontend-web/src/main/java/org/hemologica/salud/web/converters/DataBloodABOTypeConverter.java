package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataBloodABOTypeConverter implements Converter {
	
	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value == null){
			return null;
		}
		
		
		if(applicationBB.getDonationABOTypes() != null){
			for(DataCode code : applicationBB.getDonationABOTypes()){
				
				if(code.getCode().equals(value)){
					return code;
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
