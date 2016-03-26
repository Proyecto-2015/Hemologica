package org.hemologica.yodono.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataProductType;

@Local
public interface CodesBeanLocal {
	
	 public List<DataCode> getStates();
	 
	 public List<DataCode> getCities();

	 public List<DataCode> getCitiesByState(String stateCode);
	 
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
	 
	 public DataCode getResultBySnomedCode(String executeXPathString);

	public DataCode getBloodTypeCodeBySnomedCode(String bloodType);

	public DataCode getDonorTypeById(String donorType);
}

