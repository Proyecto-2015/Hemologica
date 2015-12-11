package org.hemologica.salud.ejb.beans;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.xml.sax.SAXException;

public interface DonationBeanLocal {
	
	List<DataDonation> getDonationsUserId(Long userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException;

	DataResponse addDonation(DataDonation dataDonacion);

	DataDonation getDataDonationSpecimenId(String code, String institutionCode) throws XPathExpressionException, SAXException, IOException, ParserConfigurationException;

}
