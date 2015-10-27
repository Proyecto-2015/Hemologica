package org.hemologica.yodono.web.beans;

import java.io.Serializable;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataCampaign;


public class CampaignsItemBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsItemBB.class.getName());
	
	private DataCampaign dataCampaign;
	
	@PostConstruct
	public void init(){
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		
		dataCampaign = (DataCampaign) sessionMap.get("campaignsItem"); 
		
		logger.info(dataCampaign.getTitle());
	}

	public DataCampaign getDataCampaign() {
		return dataCampaign;
	}

	public void setDataCampaign(DataCampaign dataCampaign) {
		this.dataCampaign = dataCampaign;
	}
	

}
