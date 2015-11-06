package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataStockProductType extends DataProductType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1929443977536922657L;
	
	private List<DataStockProductTypeBloodType> bloodTypes;

	public List<DataStockProductTypeBloodType> getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(List<DataStockProductTypeBloodType> bloodTypes) {
		this.bloodTypes = bloodTypes;
	}

}
