package org.hemologica.yodono.ejb.beans;

import java.io.IOException;
import java.util.List;

import javax.ejb.Local;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.datatypes.DataDonation;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.xml.sax.SAXException;

@Local
public interface DonationBeanLocal {

	List<DataDonation> getDonationsUserId(Long userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException;

}
