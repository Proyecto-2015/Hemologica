package org.hemologica.salud.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataResponse;

@Local
public interface AdvertismentBeanLocal {

	List<DataCampaign> getCampaigns(String cant);

	DataResponse sendCampaign(DataCampaign dataCampaign);

	DataCampaign getCampaign(String campaignId);

}
