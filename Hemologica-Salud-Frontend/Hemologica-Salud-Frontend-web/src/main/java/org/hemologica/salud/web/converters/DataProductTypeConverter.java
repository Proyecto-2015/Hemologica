package org.hemologica.salud.web.converters;

import java.io.Serializable;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.salud.web.beans.ApplicationBB;
import org.hemologica.salud.web.beans.SessionBB;

public class DataProductTypeConverter implements Converter, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 447082888928991445L;

	private ApplicationBB applicationBB;
	private SessionBB sessionBB;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		if (value == null) {
			return null;
		}

		List<DataProductType> typesList;
		typesList = applicationBB.getProducts();

		if (typesList != null) {
			for (DataProductType type : typesList) {

				if (type.getCode() != null && type.getCode().equals(value)) {
					return type;
				}
			}
		}

		return null;

	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		if (value instanceof DataProductType) {
			return ((DataProductType) value).getCode();
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
