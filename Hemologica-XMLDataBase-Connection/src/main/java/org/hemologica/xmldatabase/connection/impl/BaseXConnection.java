package org.hemologica.xmldatabase.connection.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hemologica.xmldatabase.connection.IXMLDataBase;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

/**
 * @author Paula Roche
 */
public class BaseXConnection implements IXMLDataBase{
	
	private Logger logger = Logger.getLogger(BaseXConnection.class.getName());
	private String dataBase;
	private String host;
	private Integer port;
	private String user;
	private String password;
	
	public BaseXConnection(){}
	
	public BaseXConnection(Properties prop, String dbname) throws XMLDataBaseException {
		
		try {
			
			host = prop.getProperty("host");
			port = Integer.valueOf(prop.getProperty("port"));
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			dataBase = dbname;
//			dataBase = dbprop.getProperty("bdname");
			BaseXClient session = new BaseXClient(host, port, user, password);
			session.close();
			
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al conectarse a la base de datos.", e);
			throw new XMLDataBaseException();
			
		}
	}
	
	private BaseXClient getClient() throws IOException{
		return new BaseXClient(host, port, user, password);
	}
	
	public void addElement(File element) {
		// TODO Auto-generated method stub
		
	}
	
	public void addElement(String path) throws XMLDataBaseException {
		
		String input = "db:add('" + dataBase + "','" + path +"')";
		BaseXClient session = null;
		try {

			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar agregar el elemento a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
	}

	public void removeElement(File element) {
		// TODO Auto-generated method stub
		
	}

	public void removeElement(String name) throws XMLDataBaseException {
		
		String input = "db:delete('" + dataBase + "','" + name +"')";
		BaseXClient session = null;
		try {
			
			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
	}

	public void updateElement(String nameOldElement, File newElement) {
		// TODO Auto-generated method stub
		
	}

	public void updateElement(String nameOldElement, String pathNewElement) throws XMLDataBaseException {
		
		String input = "db:replace(\"" + dataBase + "\",'" + nameOldElement +"',' "+pathNewElement+"')";
		BaseXClient session = null;
		try {
			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
	}

	public void getElement(File element) {
		// TODO Auto-generated method stub
		
	}

	public String getElement(String name) throws XMLDataBaseException {
		
		String input = "db:open('" + dataBase + "','" + name +"')";
		BaseXClient session = null;
		try {
			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();
			
			if(query.more()){
				return query.next();
			}
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al intentar recuperar el elemnto en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
		return null;
	}

	public List<String> getElementPatientId(String patientId)
			throws XMLDataBaseException {
	
		ArrayList<String> cdasList = new ArrayList<String>();
		
		String input = "for $doc in collection('" + dataBase + "') "
					+ "where  $doc//ClinicalDocument//recordTarget//patientRole//patient//id[descendant-or-self::node()/@root ='2.16.858.1.858.68909."+ patientId +"'] "
					+ "return $doc";
			
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();
			
			while (query.more()){
				cdasList.add(query.next());
			}
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
		
		return cdasList;
	}

	public String getElementCDAId(String root, String extention) throws XMLDataBaseException {
		
		ArrayList<String> cdasList = new ArrayList<String>();
		
		String input = "for $doc in collection('" + dataBase + "') "
					+ "where  $doc//ClinicalDocument//id/@root='"+ root + "' and " + "$doc//ClinicalDocument//id/@extension='" + extention
					+ "' return $doc";
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();
			
			while (query.more()){
				cdasList.add(query.next());
			}
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
		if(cdasList != null && cdasList.size() != 0)
			return cdasList.get(0);
		else
			return null;
	}

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getLaboratoryElementsBySpecimenId(String root, String extension) throws XMLDataBaseException {
		
		ArrayList<String> cdasList = new ArrayList<String>();
		
		String input = "for $doc in collection('" + dataBase + "') "
					+ "where  $doc//ClinicalDocument//component//structuredBody//component//section//entry//organizer//specimen//specimenRole//@root='"+ root 
					+ "' and " + "$doc//ClinicalDocument//component//structuredBody//component//section//entry//organizer//specimen//specimenRole//@extension='" + extension
					+ "' return $doc";
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();
			
			while (query.more()){
				cdasList.add(query.next());
			}
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if(session != null){
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		
		
		return cdasList;
		
	}
}
