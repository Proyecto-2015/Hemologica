package org.hemologica.salud.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataResponsiblePerson;

@Local
public interface CentersBeanLocal {
	
	public List<DataBank> getBanks();
	
	public DataBank getBankById(String bankId);
	
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(String centerCode);

	public List<DataBank> getBanksUser(String user);
	
}
