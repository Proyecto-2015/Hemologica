package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataBloodDTypeConverter implements Converter {
	
	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if(value == null){
			return null;
		}
				
		if(applicationBB.getDonationDTypes() != null){
			for(DataCode code : applicationBB.getDonationDTypes()){
				
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
