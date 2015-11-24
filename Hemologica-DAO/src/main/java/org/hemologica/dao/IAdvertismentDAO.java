package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Advertisment;


public interface IAdvertismentDAO extends IGenericDAO<Advertisment>{

	List<Advertisment> getCampaigns(String cant);

	Advertisment getCampaign(String campaignId);
	
}
