package org.hemologica.service.activator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.service.business.IPersonBean;
import org.hemologica.service.datatype.CDA;
import org.hemologica.service.utils.xml.XMLUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CDAEMPIProcessActivator {

	private static Logger logger = Logger.getLogger(CDAEMPIProcessActivator.class.getName());

	private IPersonBean personBean;

	public String process(Document doc) {

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
		} catch (XPathExpressionException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		
		try {

			cda.setIdentifier(personBean.getID(cda.getUserData(), XMLUtils.documentToString(doc)));
			return XMLUtils.documentToString(doc);
			
		} catch (TransformerException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;

	}

	public IPersonBean getPersonBean() {
		return personBean;
	}

	public void setPersonBean(IPersonBean personBean) {
		this.personBean = personBean;
	}

}
