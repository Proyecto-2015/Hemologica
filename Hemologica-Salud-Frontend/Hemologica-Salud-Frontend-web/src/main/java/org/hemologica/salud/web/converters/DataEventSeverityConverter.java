package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.constants.DataEventSeverityEnum;
import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataEventSeverityConverter implements Converter {

	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 == null){
			return null;
		}
		
		
		if(applicationBB.getSeverities() != null){
			for(DataCode code : applicationBB.getSeverities()){
				
				if(code.getCode().equals(arg2)){
					return code;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		if(arg2 instanceof DataCode){
			
			return ((DataCode)arg2).getCode();
		}
		return null;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
	
//	@Override
//	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//
//		if(DataEventSeverityEnum.MILD.getValue().equals(value)){
//			return DataEventSeverityEnum.MILD;
//		}
//		if(DataEventSeverityEnum.MODERATE.getValue().equals(value)){
//			return DataEventSeverityEnum.MODERATE;
//		}
//		if(DataEventSeverityEnum.SEVERE.getValue().equals(value)){
//			return DataEventSeverityEnum.SEVERE;
//		}
//		return null;
//
//	}
//
//	@Override
//	public String getAsString(FacesContext context, UIComponent component, Object value) {
//	
//		if (value instanceof DataEventSeverityEnum) {
//
//			return ((DataEventSeverityEnum) value).getValue();
//		}
//		return null;
//	}

}
