package org.hemologica.salud.web.converters;

import java.util.List;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataMessageOptionsConverter implements Converter {

	private static final Logger logger = Logger.getLogger(DataMessageOptionsConverter.class.getName());
	
	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		if(value == null){
			return null;
		}
		
		List<DataMessageOption> optionList = applicationBB.getMessageOptions();
		
		if(optionList != null){
			for(DataMessageOption type : optionList){
				
				if(type.getCode() != null && type.getCode().equals(value)){
					return type;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		if(value instanceof DataMessageOption){
			
			return ((DataMessageOption)value).getCode().toString();
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
