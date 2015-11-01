package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataStock;

public class StockBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7984410942023139487L;
	
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	
	private List<DataBank> banks;
	private List<DataStock> stocks;
	
	
	@PostConstruct
	public void init(){

		
		
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

	public List<DataStock> getStocks() {
		return stocks;
	}

	public void setStocks(List<DataStock> stocks) {
		this.stocks = stocks;
	}





	public List<DataBank> getBanks() {
		return banks;
	}





	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}

}
