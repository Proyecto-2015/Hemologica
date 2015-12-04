package org.hemologica.xmldatabase.connection.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

	public BaseXConnection() {
	}

	public BaseXConnection(Properties prop, String dbname) throws XMLDataBaseException {

		try {

			host = prop.getProperty("host");
			port = Integer.valueOf(prop.getProperty("port"));
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			dataBase = dbname;
			BaseXClient session = new BaseXClient(host, port, user, password);
			session.close();

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al conectarse a la base de datos.", e);
			throw new XMLDataBaseException();

		}
	}

	private BaseXClient getClient() throws IOException {
		return new BaseXClient(host, port, user, password);
	}

	public void addElement(File element) {
		// TODO Auto-generated method stub

	}

	public void addElement(String name, String input) throws XMLDataBaseException {

		BaseXClient session = null;
		File temp = null;
		FileOutputStream writer = null;
		try {

			session = this.getClient();
			// temp = File.createTempFile(name, ".tmp");
			// temp = new File("/tmp/"+ name);
			// writer = new FileOutputStream(temp);
			// writer.write(input.getBytes());
			// this.addElement(temp.getPath());
			InputStream inputStream = new ByteArrayInputStream(input.getBytes());
			session.add(dataBase + "/" + name, inputStream);

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar agregar el elemento a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
			if (temp != null) {
				temp.delete();
			}
		}

	}

	public void addElement(String path) throws XMLDataBaseException {

		String input = "db:add('" + dataBase + "','" + path + "')";
		BaseXClient session = null;
		try {

			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar agregar el elemento a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
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

		String input = "db:delete('" + dataBase + "','" + name + "')";
		BaseXClient session = null;
		try {

			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
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

	public void updateElementContent(String name, String input) throws XMLDataBaseException {

		BaseXClient session = null;
		File temp = null;
		FileOutputStream writer = null;
		try {

			session = this.getClient();
			temp = File.createTempFile(name, ".tmp");
			temp = new File("/tmp/" + name);
			writer = new FileOutputStream(temp);
			writer.write(input.getBytes());
			this.updateElement(name, temp.getPath());

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar agregar el elemento a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
			if (temp != null) {
				temp.delete();
			}
		}

	}

	public void updateElement(String nameOldElement, String pathNewElement) throws XMLDataBaseException {

		String input = "db:replace(\"" + dataBase + "\",'" + nameOldElement + "',' " + pathNewElement + "')";
		BaseXClient session = null;
		try {
			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al intentar eliminar el elemnto a la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
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

		String input = "db:open('" + dataBase + "','" + name + "')";
		BaseXClient session = null;
		try {
			session = this.getClient();
			BaseXClient.Query query = session.query(input);
			query.execute();

			if (query.more()) {
				return query.next();
			}

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al intentar recuperar el elemnto en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}

		return null;
	}

	public List<String> getElementPatientId(String patientId) throws XMLDataBaseException {

		ArrayList<String> cdasList = new ArrayList<String>();

		String input = "for $doc in collection('" + dataBase + "') "
				+ "where  $doc//ClinicalDocument//recordTarget//patientRole//patient//id[descendant-or-self::node()/@root ='2.16.858.1.858.68909."
				+ patientId + "'] " + "return $doc";

		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();

			while (query.more()) {
				cdasList.add(query.next());
			}

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
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

		String input = "for $doc in collection('" + dataBase + "') " + "where  $doc//ClinicalDocument//id/@root='"
				+ root + "' and " + "$doc//ClinicalDocument//id/@extension='" + extention + "' return $doc";
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();

			while (query.more()) {
				cdasList.add(query.next());
			}

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}

		if (cdasList != null && cdasList.size() != 0)
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
				+ "where  $doc//ClinicalDocument//component//structuredBody//component//section//entry//organizer//specimen//specimenRole//@root='"
				+ root + "' and "
				+ "$doc//ClinicalDocument//component//structuredBody//component//section//entry//organizer//specimen//specimenRole//@extension='"
				+ extension + "' return $doc";
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			query = session.query(input);
			query.execute();

			while (query.more()) {
				cdasList.add(query.next());
			}

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al intentar recuperarlos elementos en la base de datos.", e);
			throw new XMLDataBaseException();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}

		return cdasList;

	}

	public int countQuery(List<String> andClauses, List<List<String>> orClauses, List<String> orClausesCDAsIds) throws XMLDataBaseException {
		
		String input = "";
		
		if((andClauses != null && andClauses.size() != 0) || (orClauses != null && orClauses.size()!= 0) && 
				(orClauses.size()==1 && orClauses.get(0).size() != 0)){
			
			input += "count(for $doc in collection('" + dataBase + "') "
			+ "where ";
			
			boolean first = true;
			for(String s : andClauses){
				if(first){
					input += "$doc" +s;
					first = false;
				}
				else
					input += " and $doc" +s;
				
			}
			
			for(List<String> orClausesList : orClauses){
				String or = "";
				for(String s : orClausesList){
					
					if(orClausesList.indexOf(s) == 0)
						or += "$doc" +s;
					else
						or += " or $doc" +s;
				}
				if(or != ""){
					if(first){
						
						input += "(" + or + ")";
						first = false;
						
					}else{
						
						input += " and (" + or + ")";
						
					}
				}
			}
			
			if(orClausesCDAsIds != null){
				String or = "";
				for(String s : orClausesCDAsIds){
					
					if(orClausesCDAsIds.indexOf(s) == 0)
						or +=  " (" +s + " )";
					else
						or += " or (" +s + " )";
				}
				if(or != ""){
					if(first){
						
						input +=  or;
						
					}else{
						
						input += " and (" + or + ")";
						
					}
				}
			}
			
			input += " return $doc)";	
			
		}else{
			
			input = "count(collection('" +dataBase + "'))";
			
		}
		
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			
			query = session.query(input);
			query.execute();
			
			if(query.more()){
				
				return Integer.parseInt(query.next());
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
		
		return 0;		
	}

	public int countEvents(List<String> andClauses, List<List<String>> orClauses, List<String> orClausesCDAsIds)
			throws XMLDataBaseException {
		
		String input = "";
		
//		if((andClauses != null && andClauses.size() != 0) || (orClauses != null && orClauses.size()!= 0) && 
//				(orClauses.size()==1 && orClauses.get(0).size() != 0)){
			
			input += "sum(for $doc in collection('" + dataBase + "') ";
			
			
			boolean first = true;
			if(andClauses != null){
				for(String s : andClauses){
					if(first){
						input += "where "+ "$doc" +s;
						first = false;
					}
					else
						input += " and $doc" +s;
					
				}
			}
			
			if(orClauses != null){
				for(List<String> orClausesList : orClauses){
					String or = "";
					for(String s : orClausesList){
						
						if(orClausesList.indexOf(s) == 0)
							or += "$doc" +s;
						else
							or += " or $doc" +s;
					}
					if(or != ""){
						if(first){
							
							input += "where "+ "(" + or + ")";
							first = false;
							
						}else{
							
							input += " and (" + or + ")";
							
						}
					}
				}
			}
			
			String returnString = "";
			if(orClausesCDAsIds != null && orClausesCDAsIds.size()==1){
				returnString = orClausesCDAsIds.get(0);
				
//				String returnString = "for $doc in collection('" + dataBase + "') "
//										+ "where ";
//				boolean firstReturn = true;
//				for(String s : orClausesCDAsIds){
//					
//					if(first){
//						returnString += "$doc" +s;
//						firstReturn = false;
//					}
//					else
//						returnString += " and $doc" +s;
//					
//				}
//				returnString += " return $doc";
				
				
			}else if(orClausesCDAsIds != null && orClausesCDAsIds.size()==2){
				
				returnString = orClausesCDAsIds.get(1);
				
			}else{
				returnString = "$doc//ClinicalDocument//component//structuredBody//component//section[descendant-or-self::node()/@code = \"54790000\"]//entry//observation//entryRelationship";
			}
			
			input += " return count("+ returnString + "))";	
			
//		}else{
//			
//			input = "count(//ClinicalDocument//component//structuredBody//component//section[descendant-or-self::node()/@code = \"54790000\"]//entry//observation//entryRelationship)";
//			
//		}
		
		BaseXClient.Query query;
		BaseXClient session = null;
		try {
			session = this.getClient();
			
			query = session.query(input);
			query.execute();
			
			if(query.more()){
				
				return Integer.parseInt(query.next());
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
		
		return 0;		
	}
}
