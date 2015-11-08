package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hemologica.datatypes.DataBank;
import org.hemologica.salud.web.beans.ApplicationBB;
import org.hemologica.salud.web.beans.SessionBB;;

public class DataBankConverter implements Converter{

	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof DataBank){
			return ((DataBank)value).getCode();
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
