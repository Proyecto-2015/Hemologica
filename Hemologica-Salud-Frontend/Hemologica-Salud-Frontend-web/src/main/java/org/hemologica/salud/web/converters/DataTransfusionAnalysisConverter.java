package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataTransfusionAnalysisConverter implements Converter {

	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 == null){
			return null;
		}
		
		
		if(applicationBB.getTransfusionAnalysis() != null){
			for(DataCode code : applicationBB.getTransfusionAnalysis()){
				
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

}
