package org.hemologica.salud.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;

@Local
public interface CodesBeanLocal {
	
	 public List<DataMessageOption> getMessageOptions();
	 
	 public List<DataProductType> getProducts();
	 
	 public List<DataCode> getDocumentsTypes();
	 
	 public List<DataCode> getCountries();
	 
	 public List<DataCode> getStates();
	 
	 public List<DataCode> getCities();

	 public List<DataCode> getCitiesByState(String stateCode);

	 public List<DataCode> getDonationsStates();

	 public List<DataCode> getRejectionTypes();

	 public List<DataCode> getRejectionReasons();

	 public List<DataCode> getDonationsAnalysis();

	 public List<DataCode> getDonationsEvents();

	 public List<DataCode> getSeverities();

	public List<DataCode> getTransfusionsAnalysis();

	public List<DataCode> getTransfusionsEvents();

}
