package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.salud.factories.RestFactory;
import org.hemologica.salud.web.rest.client.IServicesClient;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.extensions.component.gchart.model.GChartModel;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

public class StockBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7416896283879589746L;

	private ApplicationBB applicationBB;
	private SessionBB sessionBB;

	private List<DataBank> banks;

	private MapModel gmapModel;

	private Marker marker;
	private DataBank bank;
	private DataStock stock;
	private BarChartModel stockModel;
	private GChartModel stockGModel;

	// Stock Nacional
	private List<DataStockProductType> nationalStockList;
	private BarChartModel nationalStockModel;
	private GChartModel nationalStockGModel;

	private String bankCode;
	private DataProductType productTypeCode;
//	
	private DataCode bloodTypeABO;
	private DataCode bloodTypeRH;
	
	private Integer count;

	private List<SelectItem> banksItems;
	private DataBank banksItemsSelected;
	private DataInstitution institutionSelected;

	private BarChartModel barModel;

	private Logger logger = Logger.getLogger(StockBB.class.getName());

	@PostConstruct
	public void init() {

		gmapModel = new DefaultMapModel();
	//	IServicesClient client = RestFactory.getServicesClient();
		banks = sessionBB.getArrangementBanks();
		banksItems = new ArrayList<SelectItem>();
		
		if(banks != null){
			for (DataBank dataBank : banks) {
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				gmapModel.addOverlay(new Marker(coord1, dataBank.getCode()));
				banksItems.add(new SelectItem(dataBank.getCode(), dataBank.getName()));
			}
		}

		logger.log(Level.FINE, "StockBB.init()");

	}

	public void search() {

		try {
			
			IServicesClient client = RestFactory.getServicesClient();
			stock = client.getBanks(banksItemsSelected, institutionSelected, productTypeCode != null ? productTypeCode.getCode() : null,
					bloodTypeABO != null ? bloodTypeABO.getCode() : null, bloodTypeRH != null ? bloodTypeRH.getCode() : null, count);
			
			bank = null;
			if(stock != null && stock.getBanks() != null){
				this.banks = stock.getBanks();
				if(stock.getBanks().size() == 1){
					
					bank = stock.getBanks().get(0);
					
				}
			}
			
			banksItems = new ArrayList<SelectItem>();

			gmapModel = new DefaultMapModel();

			for (DataBank dataBank : banks) {
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				gmapModel.addOverlay(new Marker(coord1, dataBank.getCode()));
				banksItems.add(new SelectItem(dataBank.getCode(), dataBank.getName()));
			}

		} catch (ClientProtocolException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web URISyntaxException", e);

		}

	}

	public void onMarkerSelect(OverlaySelectEvent event) {

		marker = (Marker) event.getOverlay();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));

		for (DataBank bankItem : banks) {
			if (bankItem.getCode().equals(marker.getTitle())) {
				bank = bankItem;
				
				break;
			}
		}

		try {

			this.stock = RestFactory.getServicesClient().getBankStock(bank.getCode());

		} catch (ClientProtocolException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web URISyntaxException", e);

		}

	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public List<DataBank> getBanks() {
		return banks;
	}

	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}

	public Marker getMarker() {
		return marker;
	}

	public DataBank getBank() {
		return bank;
	}

	public void setBank(DataBank bank) {
		this.bank = bank;
	}

	public MapModel getGmapModel() {
		return gmapModel;
	}

	public void setGmapModel(MapModel gmapModel) {
		this.gmapModel = gmapModel;
	}

	public DataStock getStock() {
		return stock;
	}

	public void setStock(DataStock stock) {
		this.stock = stock;
	}

	public List<DataStockProductType> getNationalStockList() {
		return nationalStockList;
	}

	public void setNationalStockList(List<DataStockProductType> nationalStockList) {
		this.nationalStockList = nationalStockList;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public DataProductType getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(DataProductType productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<SelectItem> getBanksItems() {
		return banksItems;
	}

	public void setBanksItems(List<SelectItem> banksItems) {
		this.banksItems = banksItems;
	}

	public DataBank getBanksItemsSelected() {
		return banksItemsSelected;
	}

	public void setBanksItemsSelected(DataBank banksItemsSelected) {
		this.banksItemsSelected = banksItemsSelected;
	}

	public BarChartModel getStockModel() {
		return stockModel;
	}

	public void setStockModel(BarChartModel stockModel) {
		this.stockModel = stockModel;
	}

	public BarChartModel getNationalStockModel() {
		return nationalStockModel;
	}

	public void setNationalStockModel(BarChartModel nationalStockModel) {
		this.nationalStockModel = nationalStockModel;
	}

	public GChartModel getNationalStockGModel() {
		return nationalStockGModel;
	}

	public void setNationalStockGModel(GChartModel nationalStockGModel) {
		this.nationalStockGModel = nationalStockGModel;
	}

	public GChartModel getStockGModel() {
		return stockGModel;
	}

	public void setStockGModel(GChartModel stockGModel) {
		this.stockGModel = stockGModel;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}

	public DataCode getBloodTypeABO() {
		return bloodTypeABO;
	}

	public void setBloodTypeABO(DataCode bloodTypeABO) {
		this.bloodTypeABO = bloodTypeABO;
	}

	public DataCode getBloodTypeRH() {
		return bloodTypeRH;
	}

	public void setBloodTypeRH(DataCode bloodTypeRH) {
		this.bloodTypeRH = bloodTypeRH;
	}

	public DataInstitution getInstitutionSelected() {
		return institutionSelected;
	}

	public void setInstitutionSelected(DataInstitution institutionSelected) {
		this.institutionSelected = institutionSelected;
	}
	
	
}
