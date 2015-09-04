package org.hemologica.xmldatabase.connection.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.basex.core.Context;
import org.hemologica.xmldatabase.connection.IXMLDataBase;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

/**
 * @author Paula Roche
 */
public class XbaseConnection implements IXMLDataBase{
	
	private BaseXClient session;
	private Logger logger = Logger.getLogger(XbaseConnection.class);
	private String dataBase;
	
	
	public XbaseConnection() throws XMLDataBaseException {
		
		
		Properties prop = new Properties();

	    try {
	    	
			prop.load(XbaseConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			
		} catch (IOException e) {
			
			logger.error("Error al leer el archivo db.properties", e);
			// TODO excepciones
			throw new XMLDataBaseException();
		}
		
		try {
			dataBase = prop.getProperty("bdname");
			session = new BaseXClient(prop.getProperty("host"), Integer.valueOf(prop.getProperty("port")), 
					prop.getProperty("user"), prop.getProperty("password"));
			
		} catch (IOException e) {
			
			logger.error("Error al conectarse a la base de datos.", e);
			throw new XMLDataBaseException();
			
		}
	}

	@Override
	public void addElement(File element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addElement(String path) throws XMLDataBaseException {
		
		String input = "db:add(\"" + dataBase + "\",\" " + path +"\")";
		try {

			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.error("Error al intentar agregar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		}
	}

	@Override
	public void removeElement(File element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(String name) throws XMLDataBaseException {
		
		String input = "db:delete(\"" + dataBase + "\",\"" + name +"\")";
		try {

			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.error("Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		}
		
	}

	@Override
	public void updateElement(String nameOldElement, File newElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateElement(String nameOldElement, String pathNewElement) throws XMLDataBaseException {
		
		String input = "db:replace(\"" + dataBase + "\",\"" + nameOldElement +"\",\" "+pathNewElement+"\")";
		try {

			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.error("Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		}
		
	}

	@Override
	public void getElement(File element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getElement(String name) throws XMLDataBaseException {
		
		String input = "db:open(\"" + dataBase + "\",\"" + name +"\")";
		try {

			BaseXClient.Query query = session.query(input);
			query.execute();
			
			if(query.more()){
				return query.next();
			}
			
		} catch (IOException e) {
			
			logger.error("Error al intentar recuperar el elemnto en la base de datos.", e);
			throw new XMLDataBaseException();
		}
		return null;
	}

	@Override
	public List<String> getElementPatientId(String patientId)
			throws XMLDataBaseException {
	
		//ClinicalDocument//recordTarget//id[descendant-or-self::node()/@root = "2.16.840.1.113883.1.3"]
		
		
		
		ArrayList<String> cdasList = new ArrayList<String>();
		//String input = "db:open(\"" + dataBase + "\")\\ClinicalDocument/recordTarget/patientRole";
		//String input = "(db:open(\"xmlHemologica\",\"cda1-Paula.xml\"))/descendant::ClinicalDocument/descendant::recordTarget/descendant::family";
		
		String input = "for $doc in collection('xmlHemologica') "
				+ "where matches($doc/ClinicalDocument/recordTarget/patientRole/patient/id/@root,'2.16.858.1.858.68909.46714299')"
			//	+ " where $doc//ClinicalDocument//recordTarget//patientRole//patient//id[descendant-or-self::node()/@root = '2.16.858.1.858.68909.46714299']"
				+ "return $doc";
			//+ "return $doc/ClinicalDocument/recordTarget/patientRole/patient/id/@root "; 
			
		BaseXClient.Query query;
		try {
			query = session.query(input);
			query.execute();
			
			while (query.more()){
				cdasList.add(query.next());
			}
			
		} catch (IOException e) {
			
			logger.error("Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		}
		
		
		return cdasList;
	}

}