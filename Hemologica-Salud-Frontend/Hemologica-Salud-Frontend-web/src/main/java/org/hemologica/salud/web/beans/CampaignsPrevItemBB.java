package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.salud.factories.RestFactory;


public class CampaignsPrevItemBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsPrevItemBB.class.getName());
	
	private DataCampaign dataCampaign;
	
	@PostConstruct
	public void init(){
		FacesContext context = FacesContext.getCurrentInstance();
	    String campaignId = context.getExternalContext()
	                .getRequestParameterMap().get("campaignId");
	
		
		try {
			if(campaignId.equals("-1")){
				
				dataCampaign = (DataCampaign) context.getExternalContext().getSessionMap().get("campaignNew");
				
			}else
				dataCampaign = RestFactory.getServicesClient().getCampaign(campaignId);
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		} 
	}

	public DataCampaign getDataCampaign() {
		return dataCampaign;
	}

	public void setDataCampaign(DataCampaign dataCampaign) {
		this.dataCampaign = dataCampaign;
	}
	

}
