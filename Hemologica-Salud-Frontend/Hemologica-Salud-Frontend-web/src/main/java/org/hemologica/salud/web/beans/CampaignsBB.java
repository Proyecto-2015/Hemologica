package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.logging.Logger;

import org.hemologica.datatypes.DataCampaign;

public class CampaignsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsBB.class.getName());
	
	private DataCampaign campaign;

	public DataCampaign getCampaign() {
		return campaign;
	}

	public void setCampaign(DataCampaign campaign) {
		this.campaign = campaign;
	}
	
	public void submit(){
		
		logger.info("submit");
	}
	
}
