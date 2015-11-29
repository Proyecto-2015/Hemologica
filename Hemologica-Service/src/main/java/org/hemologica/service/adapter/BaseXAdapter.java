package org.hemologica.service.adapter;

import java.io.ByteArrayInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

public class BaseXAdapter {

	private static final Logger logger = Logger.getLogger(BaseXAdapter.class.getName());
	
	private BaseXConnection connection;

	public void persist(String cda) {

		try {
			
			ByteArrayInputStream input = new ByteArrayInputStream(cda.getBytes());
			connection.addElement(input);
			
		} catch (XMLDataBaseException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public BaseXConnection getConnection() {
		return connection;
	}

	public void setConnection(BaseXConnection connection) {
		this.connection = connection;
	}

}
