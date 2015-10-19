package org.hemologica.yodono.web.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataBank;
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
	private HashMap<String, DataBank> banks = new HashMap<>();
	  
    private Marker marker;
    
    @PostConstruct
    public void init() {
        simpleModel = new DefaultMapModel();
          
        //Shared coordinates
        LatLng coord1 = new LatLng(-34.898930, -56.165753);
        LatLng coord2 = new LatLng(-34.871729, -56.188868);
          
        //Basic marker
        simpleModel.addOverlay(new Marker(coord1, "id1"));
        simpleModel.addOverlay(new Marker(coord2, "id2"));
        
        DataBank db1 = new DataBank();
        db1.setName("Banco 1");
        db1.setInstitution("Institucion 1");
        db1.setAddress("Direccion 1");
        db1.setEmail("email 1");
        db1.setHour("hora 1");
        db1.setInformation("informacion 1");
        db1.setTelephone("telefono 1");
        banks.put("id1", db1);
        
        
        DataBank db2 = new DataBank();
        db2.setName("Banco 2");
        db2.setInstitution("Institucion 2");
        db2.setAddress("Direccion 2");
        db2.setEmail("email 2");
        db2.setHour("hora 2");
        db2.setInformation("informacion 2");
        db2.setTelephone("telefono 2");
        
        banks.put("id2", db2);
        
        
        
        
    }
      
    public MapModel getSimpleModel() {
        return simpleModel;
    }
      
    public void onMarkerSelect(OverlaySelectEvent event) {
    	
        marker = (Marker) event.getOverlay();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));
        
        bank = banks.get(marker.getTitle());
        
        logger.info("seleccioneeee");
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

}
