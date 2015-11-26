package org.hemologica.yodono.ejb.beans;

import javax.ejb.Local;

import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;

@Local
public interface PersonBeanLocal {

	DataPerson getPerson(String userId);

	DataResponse updatePerson(DataPerson dataUser);

}
