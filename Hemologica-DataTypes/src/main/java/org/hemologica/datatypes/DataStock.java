package org.hemologica.datatypes;

import java.io.Serializable;

public class DataStock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -979972334865660149L;
	private DataBank bank;
	private Integer count;
	private DataProductType product;
	
	public DataBank getBank() {
		return bank;
	}
	public void setBank(DataBank bank) {
		this.bank = bank;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public DataProductType getProduct() {
		return product;
	}
	public void setProduct(DataProductType product) {
		this.product = product;
	}

	
	
	
}
