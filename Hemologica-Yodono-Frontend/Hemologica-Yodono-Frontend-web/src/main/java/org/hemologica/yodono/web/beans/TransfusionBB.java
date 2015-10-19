package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.yodono.factories.RestFactory;

public class TransfusionBB  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(TransfusionBB.class.getName()); 
	private List<DataTransfusion> myTransfusions;
	
	public List<DataTransfusion> getMyTransfusions() {
		
		try {
			if(myTransfusions == null)
				myTransfusions = RestFactory.getServicesClient().getMyTransfusions("");
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
		
		return myTransfusions;
	}

	public void setMyTransfusions(List<DataTransfusion> myTransfusions) {
		
		this.myTransfusions = myTransfusions;
		
	}
	
	

}
