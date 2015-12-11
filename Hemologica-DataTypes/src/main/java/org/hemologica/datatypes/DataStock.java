package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataStock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -979972334865660149L;
	private DataBank bank;
	private List<DataStockProductType> products;
	private List<DataBank> banks;
	
	public DataBank getBank() {
		return bank;
	}
	public void setBank(DataBank bank) {
		this.bank = bank;
	}
	public List<DataStockProductType> getProducts() {
		return products;
	}
	public void setProducts(List<DataStockProductType> products) {
		this.products = products;
	}
	public List<DataBank> getBanks() {
		return banks;
	}
	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}
	
	
	
	
}
