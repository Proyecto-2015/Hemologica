package org.hemologica.salud.web.converters;

import java.io.Serializable;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataCode;
import org.hemologica.salud.web.beans.ApplicationBB;
import org.hemologica.salud.web.beans.SessionBB;

public class DataBloodTypeConverter implements Converter, Serializable {

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

		List<DataCode> typesList = applicationBB.getBloodTypes();
		
		if (typesList != null) {
			for (DataCode type : typesList) {

				if (type.getCode() != null && type.getCode().equals(value)) {
					return type;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {

		if (value instanceof DataCode) {
			return ((DataCode) value).getCode();
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
