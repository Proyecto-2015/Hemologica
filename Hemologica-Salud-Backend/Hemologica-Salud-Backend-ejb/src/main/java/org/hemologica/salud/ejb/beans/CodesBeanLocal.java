package org.hemologica.salud.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;

@Local
public interface CodesBeanLocal {
	
	 public List<DataMessageOption> getMessageOptions();
	 
	 public List<DataProductType> getProducts();

}
