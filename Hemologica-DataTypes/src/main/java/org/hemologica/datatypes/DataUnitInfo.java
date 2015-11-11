package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataUnitInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5470280587666900962L;

	private String code;
	
	//Producto
	private DataProduct product;
	//Origen
	private DataDonation donation;
	//Destino
	private DataTransfusion transfusion;
	//Movimientos entre bancos que pudieran ocurrir
	private List<DataMovement> movements;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public DataProduct getProduct() {
		return product;
	}
	public void setProduct(DataProduct product) {
		this.product = product;
	}
	public DataDonation getDonation() {
		return donation;
	}
	public void setDonation(DataDonation donation) {
		this.donation = donation;
	}
	public DataTransfusion getTransfusion() {
		return transfusion;
	}
	public void setTransfusion(DataTransfusion transfusion) {
		this.transfusion = transfusion;
	}
	public List<DataMovement> getMovements() {
		return movements;
	}
	public void setMovements(List<DataMovement> movements) {
		this.movements = movements;
	}
	
	

}
