package org.hemologica.service.activator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.hemologica.empi.adapter.IEMPIAdapter;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.service.business.IPersonBean;
import org.hemologica.service.datatype.CDA;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CDAEMPIProcessActivator {
	
	private static Logger logger = Logger.getLogger(CDAEMPIProcessActivator.class.getName());
	
	

	private IPersonBean personBean;
	
	public CDA process(Document doc) {
		
		CDA cda = null;
		
		try {
			cda = new CDA(doc);
		} catch (ParserConfigurationException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (SAXException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (TransformerException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		
		
		cda.setIdentifier(personBean.getID(cda.getUserData()));
		
		return cda;
		
	}
	
	
	
	
	
	
	public IPersonBean getPersonBean() {
		return personBean;
	}

	public void setPersonBean(IPersonBean personBean) {
		this.personBean = personBean;
	}

	
}
