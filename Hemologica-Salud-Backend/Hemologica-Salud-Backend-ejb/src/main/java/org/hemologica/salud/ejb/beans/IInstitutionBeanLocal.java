package org.hemologica.salud.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataInstitution;

@Local
public interface IInstitutionBeanLocal {
	
	public List<DataInstitution> getInstitutions();

	public List<DataInstitution> getInstitutionsUser(Long user);

	public DataInstitution getInstitutionById(String code);

}
