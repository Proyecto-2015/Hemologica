package org.hemologica.yodono.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonationEvent;

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
}
