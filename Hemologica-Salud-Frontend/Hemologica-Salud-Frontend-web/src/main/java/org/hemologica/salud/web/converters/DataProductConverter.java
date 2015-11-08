package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataProduct;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.salud.web.beans.ApplicationBB;

public class DataProductConverter implements Converter {

	private ApplicationBB applicationBB;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 == null){
			return null;
		}
		
		
		if(applicationBB.getProducts() != null){
			for(DataProductType code : applicationBB.getProducts()){
				
				if(code.getCode().equals(arg2)){
					return code;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		if(arg2 instanceof DataProductType){
			
			return ((DataProductType)arg2).getCode();
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
