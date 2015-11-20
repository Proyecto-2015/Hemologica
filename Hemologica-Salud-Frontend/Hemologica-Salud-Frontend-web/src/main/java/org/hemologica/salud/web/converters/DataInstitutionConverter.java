package org.hemologica.salud.web.converters;

import java.io.Serializable;
import java.util.List;
//import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.salud.web.beans.ApplicationBB;
import org.hemologica.salud.web.beans.SessionBB;

public class DataInstitutionConverter implements Converter, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 421603990867590424L;

	private ApplicationBB applicationBB;
	private SessionBB sessionBB;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		if (value == null) {
			return null;
		}

		List<DataInstitution> typesList = applicationBB.getInstitutions();
		
		if (typesList != null) {
			for (DataInstitution type : typesList) {

				if (type.getCode() != null && type.getCode().equals(value)) {
					return type.getCode();
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {

		if (value instanceof DataInstitution) {
			return ((DataInstitution) value).getCode();
		}
		return null;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

}
