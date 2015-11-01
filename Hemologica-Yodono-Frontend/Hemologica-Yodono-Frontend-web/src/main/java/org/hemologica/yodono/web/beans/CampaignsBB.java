package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.yodono.factories.RestFactory;


public class CampaignsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsBB.class.getName());
	
	private List<DataCampaign> campaigns;
	
	@PostConstruct
	public void init(){
		
		try {
			campaigns = RestFactory.getServicesClient().getCampaigns(6);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
	}

	public List<DataCampaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<DataCampaign> campaigns) {
		this.campaigns = campaigns;
	}
	
	public String setCampaignItem(DataCampaign campaignItem){
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("campaignsItem", campaignItem);
		
		return "campaignItem";
		
	}

}
