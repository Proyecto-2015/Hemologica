package org.hemologica.yodono.ejb.beans.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Advertisment;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.yodono.ejb.beans.AdvertismentBeanLocal;

/**
 * Session Bean implementation class AdvertismentBean
 */
@Stateless
@LocalBean
public class AdvertismentBean implements AdvertismentBeanLocal {

private static final Logger logger = Logger.getLogger(AdvertismentBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	
    public AdvertismentBean() {
        
    }

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		
		List<DataCampaign> listReturn = new ArrayList<>();
		List<Advertisment> list = FactoryDAO.getAdvertismentDAO(em).getCampaigns(cant);

		if (list != null) {
			for (Advertisment i : list) {
				DataCampaign dataIins = new DataCampaign();
				
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				if(i.getDate() != null)
					dataIins.setDate(format.format(i.getDate().getTime()));
				dataIins.setSubtitle(i.getSubtitle());
				dataIins.setId(String.valueOf(i.getId()));
				dataIins.setSummary(i.getSummary());
				dataIins.setText(i.getText());
				dataIins.setTitle(i.getTitle());
				
				listReturn.add(dataIins);
			}
		}
		
		return listReturn;
		
	}
	
	@Override
	public DataCampaign getCampaign(String campaignId) {
		
		Advertisment i = FactoryDAO.getAdvertismentDAO(em).getCampaign(campaignId);
		
		DataCampaign dataIins = null;
		if (i != null) {
			
			dataIins = new DataCampaign();
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			if(i.getDate() != null)
				dataIins.setDate(format.format(i.getDate().getTime()));
			dataIins.setSubtitle(i.getSubtitle());
			dataIins.setId(String.valueOf(i.getId()));
			dataIins.setSummary(i.getSummary());
			dataIins.setText(i.getText());
			dataIins.setTitle(i.getTitle());
				
		}
		
		return dataIins;
	}


}
