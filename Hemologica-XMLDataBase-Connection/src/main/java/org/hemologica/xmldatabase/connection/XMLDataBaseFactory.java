package org.hemologica.xmldatabase.connection;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
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
			Properties prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			
			if (iXmlDataBase == null)
				iXmlDataBase = new BaseXConnection(prop);
			
		} catch (XMLDataBaseException e) {
			
			logger.error("Error al crear  la coneccion con la base de datos", e);
			throw new XMLDataBaseException();
		} catch (IOException e) {
			logger.error("Error al leer el archivo db.properties", e);
			throw new XMLDataBaseException();
		}
		
		return iXmlDataBase;	
	}

}
