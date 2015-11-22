package org.hemologica.dao;

import java.util.List;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.UnitsType;

public interface ICodesDAO {
	
	public List<MessageSendOption> getMessageOptions();
	
	public List<UnitsType> getProducts();

}
