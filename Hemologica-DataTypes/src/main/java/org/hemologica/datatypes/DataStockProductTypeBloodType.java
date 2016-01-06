package org.hemologica.datatypes;

import java.io.Serializable;

public class DataStockProductTypeBloodType extends DataCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8604429466268055966L;
	
	private Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
