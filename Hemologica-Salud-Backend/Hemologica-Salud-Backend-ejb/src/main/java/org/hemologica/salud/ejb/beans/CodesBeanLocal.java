package org.hemologica.salud.ejb.beans;

import java.util.List;
import javax.ejb.Local;

import org.hemologica.dao.model.SearchFilterCode;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;

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
	
	public DataCode getBloodTypeCodeByCode(String code);
	 
	 public DataCode getABOBloodTypeCodeByBloodSnomedCode(String code);
	 
	 public DataCode getRHBloodTypeCodeByBloodSnomedCode(String code);

	 public DataCode getDonationTypeByCode(String donationType);

	 public DataCode getDonationTypeBySnomedCode(String donationType);

	 public DataCode getDonationEventBySnomedCode(String event);

	 public DataCode getSeverityBySnomedCode(String severity);

	 public DataCode getDonationsAnalysisBySnomedCode(String analisisCode);

	 public boolean getBooleanResultBySnomedCode(String executeXPathString);

	 public DataCode getRejectionCauseBySnomedCode(String executeXPathString);

	 public DataCode getRejectionTypesBySnomedCode(String executeXPathString);

	 public DataProductType getProductBySnomedCode(String componentCode);

	 public DataCode getTransfusionEventBySnomedCode(String event);

	 public DataCode getTransfusionAnalysisBySnomedCode(String executeXPathString);

	public List<DataCode> getBloodTypes();

	public List<DonationFilterData> getDonationsFilters();

	public List<TransfusionFilterData> getTransfusionsFilters();

	public List<DataCode> getDonationTypes();

	public List<DataCode> getDonorTypes();

	public List<DataCode> getGenderCodes();

	public List<DataCode> getResultsCodes();

	public DataCode getResultBySnomedCode(String executeXPathString);

	public String getNewCDAid();

	public String getNewHcCDAid();

	public DataCode getBloodTypeCodeBySnomedCode(String bloodType);

	public List<DataSearchFilter> getSearchFilters();

	public DataCode getGenderCodeById(String genderCode);

	public DataCode getDonorTypeById(String donorType);


}
