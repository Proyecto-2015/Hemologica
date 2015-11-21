package org.hemologica.service.activator;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.tools.ant.filters.StringInputStream;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DefaultServiceActivator {
	
	
	public Document process(String msg) throws SAXException, IOException, ParserConfigurationException{
		
		StringInputStream input = new StringInputStream(msg);
		return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(input);
		
	}

}
