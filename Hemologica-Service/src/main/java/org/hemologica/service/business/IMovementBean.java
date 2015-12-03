package org.hemologica.service.business;

import java.text.ParseException;
import java.util.List;

import org.hemologica.service.datatype.MovementData;

public interface IMovementBean {

	
	public void save(List<MovementData> movements) throws ParseException;
	
}
