package org.hemologica.xmldatabase.factories;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hemologica.xmldatabase.connection.IXMLDataBase;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

/**
 * @author Paula Roche
 */
public class XMLDataBaseFactory {
	
	private static Logger logger = Logger.getLogger(XMLDataBaseFactory.class);
	private static IXMLDataBase iXmlDataBaseDonations = null;
	private static IXMLDataBase iXmlDataBaseTransfusions = null;
	private static IXMLDataBase iXmlDataBaseLaboratory = null;
	
	public XMLDataBaseFactory() {
		
	}
	
	public static IXMLDataBase getIXMLDataBaseDonations() throws XMLDataBaseException{
		
		
		try {
			Properties prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			
			if (iXmlDataBaseDonations == null)
				iXmlDataBaseDonations = new BaseXConnection(prop, prop.getProperty("dbnameDonation"));
			
		} catch (XMLDataBaseException e) {
			
			logger.error("Error al crear  la coneccion con la base de datos", e);
			throw new XMLDataBaseException();
		} catch (IOException e) {
			logger.error("Error al leer el archivo db.properties", e);
			throw new XMLDataBaseException();
		}
		
		return iXmlDataBaseDonations;	
	}
	
	public static IXMLDataBase getIXMLDataBaseTransfusions() throws XMLDataBaseException{
		
		
		try {
			Properties prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			
			if (iXmlDataBaseTransfusions == null)
				iXmlDataBaseTransfusions = new BaseXConnection(prop, prop.getProperty("dbnameTransfusion"));
			
		} catch (XMLDataBaseException e) {
			
			logger.error("Error al crear  la coneccion con la base de datos", e);
			throw new XMLDataBaseException();
		} catch (IOException e) {
			logger.error("Error al leer el archivo db.properties", e);
			throw new XMLDataBaseException();
		}
		
		return iXmlDataBaseTransfusions;	
	}
	
	public static IXMLDataBase getIXMLDataBaseLaboratory() throws XMLDataBaseException{
		
		
		try {
			Properties prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			
			if (iXmlDataBaseLaboratory == null)
				iXmlDataBaseLaboratory = new BaseXConnection(prop, prop.getProperty("dbnameLaboratory"));
			
		} catch (XMLDataBaseException e) {
			
			logger.error("Error al crear  la coneccion con la base de datos", e);
			throw new XMLDataBaseException();
		} catch (IOException e) {
			logger.error("Error al leer el archivo db.properties", e);
			throw new XMLDataBaseException();
		}
		
		return iXmlDataBaseLaboratory;	
	}

}
