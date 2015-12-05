package org.hemologica.service.activator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.dao.model.Person;
import org.hemologica.service.business.IPersonBean;
import org.hemologica.service.datatype.CDA;
import org.hemologica.service.datatype.UserData;
import org.hemologica.service.utils.xml.XMLUtils;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public class CDAProcessActivator {

	private static Logger logger = Logger.getLogger(CDAProcessActivator.class.getName());

	private IPersonBean personBean;

	public String process(String doc) throws Exception {

		
		CDA cda = null;

		try {
			cda = new CDA(XMLUtils.stringToDocument(doc));
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
		
		Person person = personBean.processCDAwithEMPIandDatabases(cda.getUserData(), doc);
		if(person.getPersonEmail() != null){
			UserData userData = new UserData(Long.parseLong(person.getId()), person.getPersonEmail());
			return new Gson().toJson(userData);
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
