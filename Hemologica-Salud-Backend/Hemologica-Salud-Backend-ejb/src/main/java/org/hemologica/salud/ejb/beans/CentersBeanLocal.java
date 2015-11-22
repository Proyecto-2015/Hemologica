package org.hemologica.salud.ejb.beans;

import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataBank;

@Local
public interface CentersBeanLocal {
	
	public List<DataBank> getBanks();
	
}
