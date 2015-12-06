package org.hemologica.yodono.ejb.beans;

import javax.ejb.Local;

import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;

@Local
public interface PersonBeanLocal {

	DataPerson getPerson(Long userId);

	DataResponse updatePerson(DataPerson dataUser);

}
