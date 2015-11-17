package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.salud.factories.RestFactory;
import org.hemologica.salud.web.rest.client.IServicesClient;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.extensions.component.gchart.model.GChartModel;
import org.primefaces.extensions.component.gchart.model.GChartModelBuilder;
import org.primefaces.extensions.component.gchart.model.GChartType;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

//@Named("stockBB")
//@ViewScoped
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
	private DataBloodType bloodTypeCode;
	private Integer count;

	private List<SelectItem> banksItems;
	private String banksItemsSelected;

	private BarChartModel barModel;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";

	private Logger logger = Logger.getLogger(StockBB.class.getName());

	@PostConstruct
	public void init() {

		try {
			
			createBarModels();

			gmapModel = new DefaultMapModel();
			IServicesClient client = RestFactory.getServicesClient();
			banks = client.getBanks();
			banksItems = new ArrayList<SelectItem>();

			for (DataBank dataBank : banks) {
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				gmapModel.addOverlay(new Marker(coord1, dataBank.getCode()));
				banksItems.add(new SelectItem(dataBank.getCode(), dataBank.getName()));
			}

			nationalStockList = client.getNationalStock();
			nationalStockModel = this.initCharModel(nationalStockList);
			
			
			FacesContext context = FacesContext.getCurrentInstance();
			Application app = context.getApplication();
			bundle = app.getResourceBundle(context, languageVarName);
			
			nationalStockModel.setTitle(bundle.getString("label_national_stock"));
			nationalStockModel.setLegendPosition("ne");
			Axis xAxis = nationalStockModel.getAxis(AxisType.X);
			
			
			
			xAxis.setLabel(bundle.getString("label_product_blood_type"));
			Axis yAxis = nationalStockModel.getAxis(AxisType.Y);
			yAxis.setLabel("Cantidad");
			yAxis.setMin(0);
			yAxis.setMax(10000);

			nationalStockGModel = this.initGCharModel(nationalStockList);

		} catch (ClientProtocolException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web URISyntaxException", e);

		}

		logger.log(Level.FINE, "StockBB.init()");

	}

	public void search() {

		try {

			IServicesClient client = RestFactory.getServicesClient();

			this.banks = client.getBanks(banksItemsSelected, productTypeCode != null ? productTypeCode.getCode() : null,
					bloodTypeCode != null ? bloodTypeCode.getCode() : null, count);
			banksItems = new ArrayList<SelectItem>();

			gmapModel = new DefaultMapModel();

			for (DataBank dataBank : banks) {
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				gmapModel.addOverlay(new Marker(coord1, dataBank.getCode()));
				banksItems.add(new SelectItem(dataBank.getCode(), dataBank.getName()));
			}

			this.stock = null;

			if (this.banks.size() == 1) {
				this.bank = this.banks.get(0);
				this.stock = client.getBankStock(this.bank.getCode());
				this.stockModel = this.initCharModel(this.stock);
				stockModel.setTitle("Stock");
				stockModel.setLegendPosition("ne");
				Axis xAxis = stockModel.getAxis(AxisType.X);
				xAxis.setLabel("Tipo Producto & Tipo de Sangre");
				Axis yAxis = stockModel.getAxis(AxisType.Y);
				yAxis.setLabel("Cantidad");
				yAxis.setMin(0);
				yAxis.setMax(1000);
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
			this.stockModel = this.initCharModel(this.stock);

		} catch (ClientProtocolException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio web URISyntaxException", e);

		}

	}

	public BarChartModel initCharModel(DataStock stock) {
		return initCharModel(stock.getProducts());
	}

	public BarChartModel initCharModel(List<DataStockProductType> products) {

		BarChartModel model = new BarChartModel();
		for (DataStockProductType spt : products) {
			BarChartSeries serie = new BarChartSeries();
			serie.setLabel(spt.getDisplay());
			for (DataStockProductTypeBloodType sptbt : spt.getBloodTypes()) {
				serie.set(sptbt.getDisplayName(), sptbt.getCount());
			}
			model.addSeries(serie);
		}

		return model;

	}

	public GChartModel initGCharModel(List<DataStockProductType> products) {

		GChartModelBuilder gmodelBuilder = new GChartModelBuilder();
		gmodelBuilder.setChartType(GChartType.COLUMN);
		Map<String, List<Integer>> counts = new HashMap<String, List<Integer>>();
		List<Integer> aux;
		List<String> columnsStrings = new ArrayList<String>();
		for (DataStockProductType spt : products) {
			columnsStrings.add(spt.getDisplay());
			for (DataStockProductTypeBloodType sptbt : spt.getBloodTypes()) {
				aux = counts.get(sptbt.getDisplayName());
				aux = aux == null ? new ArrayList<Integer>() : aux;
				aux.add(sptbt.getCount());
				counts.put(sptbt.getDisplayName(), aux);
			}
		}

		gmodelBuilder.addColumns(columnsStrings);
		for (String bloodTypeString : counts.keySet()) {
			gmodelBuilder.addRow(bloodTypeString, counts.get(bloodTypeString));
		}

		return gmodelBuilder.build();

	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries boys = new ChartSeries();
		boys.setLabel("Boys");
		boys.set("2004", 120);
		boys.set("2005", 100);
		boys.set("2006", 44);
		boys.set("2007", 150);
		boys.set("2008", 25);

		ChartSeries girls = new ChartSeries();
		girls.setLabel("Girls");
		girls.set("2004", 52);
		girls.set("2005", 60);
		girls.set("2006", 110);
		girls.set("2007", 135);
		girls.set("2008", 120);

		model.addSeries(boys);
		model.addSeries(girls);

		return model;
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {
		barModel = initBarModel();

		barModel.setTitle("Bar Chart");
		barModel.setLegendPosition("ne");

		Axis xAxis = barModel.getAxis(AxisType.X);
		xAxis.setLabel("Gender");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("Births");
		yAxis.setMin(0);
		yAxis.setMax(200);
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

	public DataBloodType getBloodTypeCode() {
		return bloodTypeCode;
	}

	public void setBloodTypeCode(DataBloodType bloodTypeCode) {
		this.bloodTypeCode = bloodTypeCode;
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

	public String getBanksItemsSelected() {
		return banksItemsSelected;
	}

	public void setBanksItemsSelected(String banksItemsSelected) {
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

}
