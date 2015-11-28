package org.hemologica.yodono.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataCode;

@Local
public interface CodesBeanLocal {
	
	 public List<DataCode> getStates();
	 
	 public List<DataCode> getCities();

	 public List<DataCode> getCitiesByState(String stateCode);
}
