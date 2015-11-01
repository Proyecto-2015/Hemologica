package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DonationsStatisticsData;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.PieChartModel;

public class DonationsStatisticsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(DonationsStatisticsBB.class.getName());
	
	private DonationsStatisticsData statictic;
	private List<DataBank> banks;
	private List<DataInstitution> institutions;
	private List<DonationFilterData> filters;
	private List<DonationFilterData> distinguish;
	private List<DonationFilterData> allFilters;
	
	private PieChartModel pieModel1;

	@PostConstruct
	private void init(){
		
		try {
			
			institutions = RestFactory.getServicesClient().getInstitution("userId");
			banks = RestFactory.getServicesClient().getBanks("userId");
			allFilters = RestFactory.getServicesClient().getDonationsFilters();
			statictic = new DonationsStatisticsData();
			createPieModels();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}	
	}
	
	private void createPieModels() {
        createPieModel1();
    }
     
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
         
        pieModel1.set("Brand 1", 540);
        pieModel1.set("Brand 2", 325);
        pieModel1.set("Brand 3", 702);
        pieModel1.set("Brand 4", 421);
        pieModel1.setExtender("pieExtender");
        pieModel1.setShowDataLabels(true);
        pieModel1.setLegendPosition("w");
    }
    
    public void find(){
    	
    	
    	logger.info("IR a buscar la infoooo");
    }
	
	public PieChartModel getPieModel1() {
		return pieModel1;
	}

	public void setPieModel1(PieChartModel pieModel1) {
		this.pieModel1 = pieModel1;
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
	public List<DataInstitution> getInstitutions() {
		return institutions;
	}
	public void setInstitutions(List<DataInstitution> institutions) {
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
	
	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
