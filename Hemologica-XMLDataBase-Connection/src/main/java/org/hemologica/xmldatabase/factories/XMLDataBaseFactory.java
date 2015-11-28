package org.hemologica.xmldatabase.factories;

import org.apache.log4j.Logger;
import org.hemologica.xmldatabase.connection.IXMLDataBase;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

/**
 * @author Paula Roche
 */
public class XMLDataBaseFactory {
	
	private static Logger logger = Logger.getLogger(XMLDataBaseFactory.class);
	private static IXMLDataBase iXmlDataBase = null;
	
	public XMLDataBaseFactory() {
		
	}
	
	public static IXMLDataBase getIXMLDataBase() throws XMLDataBaseException{
		
		
		try {
			
			if (iXmlDataBase == null)
				iXmlDataBase = new BaseXConnection();
			
		} catch (XMLDataBaseException e) {
			
			logger.error("Error al crear  la coneccion con la base de datos", e);
			// TODO excepciones
			throw new XMLDataBaseException();
		}
		
		return iXmlDataBase;	
	}

}
