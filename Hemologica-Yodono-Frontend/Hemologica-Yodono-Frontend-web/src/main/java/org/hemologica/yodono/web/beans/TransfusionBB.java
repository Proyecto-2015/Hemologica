package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;

import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.yodono.factories.RestFactory;

public class TransfusionBB  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(TransfusionBB.class.getName()); 
	private List<DataTransfusion> myTransfusions;
	
	@ManagedProperty(value="#{sessionBB}")
	private SessionBB sessionBB;
	
	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
	
	@PostConstruct
	public void init(){
		
		try {
				myTransfusions = RestFactory.getServicesClient().getMyTransfusions(""+ sessionBB.getDataUser().getId());
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
		
	}
	
	public List<DataTransfusion> getMyTransfusions() {
		return myTransfusions;
	}

	public void setMyTransfusions(List<DataTransfusion> myTransfusions) {
		
		this.myTransfusions = myTransfusions;
		
	}
	
	

}
