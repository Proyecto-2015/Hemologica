package org.hemologica.yodono.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataCampaign;

@Local
public interface AdvertismentBeanLocal {
	
	List<DataCampaign> getCampaigns(String cant);
	
	DataCampaign getCampaign(String campaignId);
	
}
