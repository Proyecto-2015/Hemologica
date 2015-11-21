package org.hemologica.salud.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCode;

@Local
public interface IBloodLocal {
	
	public List<DataBloodType> getBloodTypes();
	
	public List<DataCode> getDonationABOTypes();
	
	public List<DataCode> getDonationDTTypes();
	
}
