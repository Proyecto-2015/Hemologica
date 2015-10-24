package org.hemologica.yodono.web.converters;

import java.io.IOException;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataState;
import org.hemologica.yodono.factories.RestFactory;

public class DataStateConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if(value == null){
			return null;
		}
		
		List<DataState> statesList = null;
		try {
			statesList = RestFactory.getServicesClient().getStates();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(statesList != null){
			for(DataState state : statesList){
				
				if(state.getCode() != null && state.getCode().equals(value)){
					return state;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		if(value instanceof DataState){
			
			return ((DataState)value).getName();
		}
		return null;
	}

}
