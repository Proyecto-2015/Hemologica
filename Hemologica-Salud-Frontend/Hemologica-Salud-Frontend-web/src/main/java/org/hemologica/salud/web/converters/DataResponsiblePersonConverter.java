package org.hemologica.salud.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.salud.web.beans.SessionBB;

public class DataResponsiblePersonConverter implements Converter {

	private SessionBB sessionBB;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 == null){
			return null;
		}
		
		
		if(sessionBB.getResponsibleTransfusionPersons() != null){
			for(DataResponsiblePerson code : sessionBB.getResponsibleTransfusionPersons()){
				
				if(code.getId().equals(arg2)){
					return code;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		if(arg2 instanceof DataResponsiblePerson){
			
			return ((DataResponsiblePerson)arg2).getId();
		}
		return null;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

}
