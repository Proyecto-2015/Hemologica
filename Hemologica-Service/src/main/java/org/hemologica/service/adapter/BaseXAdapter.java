package org.hemologica.service.adapter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.service.utils.xml.XMLUtils;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class BaseXAdapter {

	private static final Logger logger = Logger.getLogger(BaseXAdapter.class.getName());
	
	private BaseXConnection connection;

	public void persist(String cda) {

		try {
			
			Document doc = XMLUtils.stringToDocument(cda);
			String id = 
					XMLUtils.executeXPathString(doc, "/ClinicalDocument/id/@root") +"."+
					XMLUtils.executeXPathString(doc, "/ClinicalDocument/id/@extension");
			
			if(connection.getElement(id) != null){
				connection.updateElementContent(id, cda);
			}else{
				connection.addElement(id, cda);
			}
			
			
			
			
		} catch (XMLDataBaseException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (SAXException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (ParserConfigurationException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (XPathExpressionException e) {
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
