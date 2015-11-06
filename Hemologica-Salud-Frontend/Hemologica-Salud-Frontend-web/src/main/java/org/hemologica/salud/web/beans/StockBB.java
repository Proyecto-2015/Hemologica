package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataStock;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.map.OverlaySelectEvent;
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

	private Logger logger = Logger.getLogger(StockBB.class.getName());

	@PostConstruct
	public void init() {

		try {

			gmapModel = new DefaultMapModel();

			banks = RestFactory.getServicesClient().getBanks();

			for (DataBank dataBank : banks) {
				LatLng coord1 = new LatLng(dataBank.getLatitude(), dataBank.getLongitude());
				gmapModel.addOverlay(new Marker(coord1, dataBank.getCode()));
			}

		} catch (ClientProtocolException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio web URISyntaxException", e);

		}

		logger.log(Level.FINE, "StockBB.init()");

	}

	public void onMarkerSelect(OverlaySelectEvent event) {

		marker = (Marker) event.getOverlay();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));

		for (DataBank bankItem : banks) {
			if (bankItem.getCode().equals(marker.getTitle())){
				bank = bankItem;
				break;
			}
		}
		
		try {
			
			stock = RestFactory.getServicesClient().getBankStock(bank.getCode());
			
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


}
