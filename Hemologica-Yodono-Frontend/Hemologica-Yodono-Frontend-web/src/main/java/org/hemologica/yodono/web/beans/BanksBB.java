package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataBank;
import org.hemologica.yodono.factories.RestFactory;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

public class BanksBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(BanksBB.class.getName()); 
	private MapModel simpleModel;
	private DataBank bank;
	
	@ManagedProperty(value="#{applicationBB}")
	private ApplicationBB applicationBB;
	
    private Marker marker;
    
    @PostConstruct
    public void init() {
        
    	simpleModel = new DefaultMapModel();
    	List<DataBank> bancos = null;
		try {
			 bancos = RestFactory.getServicesClient().getBanks();
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
		for(DataBank dataBank : bancos){
			if(dataBank.getLatitude() != null && dataBank.getLongitude() != null){
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				simpleModel.addOverlay(new Marker(coord1, dataBank.getCode()));
			}
		}       
    }
      
    public MapModel getSimpleModel() {
        return simpleModel;
    }
      
    public void onMarkerSelect(OverlaySelectEvent event) {
    	
        marker = (Marker) event.getOverlay();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));
        
        for(DataBank bankItem : applicationBB.getBanks()){
        	if(bankItem.getCode().equals(marker.getTitle()))
        		bank = bankItem;
        }
    }
      
    public Marker getMarker() {
        return marker;
    }

	public DataBank getBank() {
		return bank;
	}

	public void setBank(DataBank bank) {
		this.bank = bank;
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
}
