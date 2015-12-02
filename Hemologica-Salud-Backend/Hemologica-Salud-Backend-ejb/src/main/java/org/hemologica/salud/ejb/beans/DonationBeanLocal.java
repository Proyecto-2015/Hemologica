package org.hemologica.salud.ejb.beans;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.xml.sax.SAXException;

public interface DonationBeanLocal {
	
	List<DataDonation> getDonationsUserId(String userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException;

}
