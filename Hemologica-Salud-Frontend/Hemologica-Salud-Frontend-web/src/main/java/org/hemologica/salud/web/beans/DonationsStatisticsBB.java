package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DonationsStatisticsData;
import org.hemologica.datatypes.InstitutionData;
import org.hemologica.salud.factories.RestFactory;

public class DonationsStatisticsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(DonationsStatisticsBB.class.getName());
	
	private DonationsStatisticsData statictic;
	private List<DataBank> banks;
	private List<InstitutionData> institutions;
	private List<DonationFilterData> filters;
	private List<DonationFilterData> distinguish;
	private List<DonationFilterData> allFilters;

	@PostConstruct
	private void init(){
		
		try {
			
			institutions = RestFactory.getServicesClient().getInstitution("userId");
			banks = RestFactory.getServicesClient().getBanks("userId");
			allFilters = RestFactory.getServicesClient().getDonationsFilters();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}	
	}
	
	
	public DonationsStatisticsData getStatictic() {
		return statictic;
	}
	public void setStatictic(DonationsStatisticsData statictic) {
		this.statictic = statictic;
	}
	public List<DataBank> getBanks() {
		return banks;
	}
	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}
	public List<InstitutionData> getInstitutions() {
		return institutions;
	}
	public void setInstitutions(List<InstitutionData> institutions) {
		this.institutions = institutions;
	}
	public List<DonationFilterData> getFilters() {
		return filters;
	}
	public void setFilters(List<DonationFilterData> filters) {
		this.filters = filters;
	}
	public List<DonationFilterData> getDistinguish() {
		return distinguish;
	}
	public void setDistinguish(List<DonationFilterData> distinguish) {
		this.distinguish = distinguish;
	}
	public List<DonationFilterData> getAllFilters() {
		return allFilters;
	}
	public void setAllFilters(List<DonationFilterData> allFilters) {
		this.allFilters = allFilters;
	}

}
