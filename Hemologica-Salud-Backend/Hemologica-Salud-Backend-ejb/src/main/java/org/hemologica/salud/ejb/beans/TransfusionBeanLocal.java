package org.hemologica.salud.ejb.beans;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

public interface TransfusionBeanLocal {
	
	List<DataTransfusion> getTransfusionsUserId(Long userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException;

	DataResponse addTransfusion(DataTransfusion dataTransfusion);

	DataTransfusion getDataTransfusionSpecimenId(String code,String institutionCode) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, DOMException;

	List<DataTransfusion> getTransfusionsFilters(List<DataSearchFilter> filters) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, DOMException;

}
