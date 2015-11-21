package org.hemologica.service.activator;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.hemologica.service.datatype.CDA;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CDAEMPIProcessActivator {

	public CDA process(Document cda) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		
		return new CDA(cda);
		
	}
}
