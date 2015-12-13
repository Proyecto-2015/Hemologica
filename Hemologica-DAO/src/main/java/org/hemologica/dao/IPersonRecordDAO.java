package org.hemologica.dao;

import java.util.List;
import org.hemologica.dao.model.PersonsRecord;

public interface IPersonRecordDAO extends IGenericDAO<PersonsRecord>{

	List<PersonsRecord> getCDAsUserId(Long userId);
	List<PersonsRecord> getCDAsIdentificationId(Long userId);

}

