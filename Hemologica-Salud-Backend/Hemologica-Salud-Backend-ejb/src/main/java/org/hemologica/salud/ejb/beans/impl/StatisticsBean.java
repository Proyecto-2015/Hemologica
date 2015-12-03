package org.hemologica.salud.ejb.beans.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.DonationFilterCode;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.StatisticsBeanLocal;


public class StatisticsBean implements StatisticsBeanLocal {

	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public StatisticsBean() {

    }

	@Override
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData) {
		
		String query = "";
		
		for(DonationFilterData filter :donationsStatisticsData.getFilters()){
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				if(query != null && !query.equals("")){
					query += " + ";
				}
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					query += donationFilter.getDonationFilterCodesPath() + "=" + filter.getValue().getCode();
					
				}
			}
			
		}
		
		
		return null;
	}

}
