package org.hemologica.service.utils.xml;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class XMLUtils {

	public static String documentToString(Document doc) throws TransformerException{
		
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		return writer.toString();
	}
	
	public static Document stringToDocument(String input) throws SAXException, IOException, ParserConfigurationException{
		
		return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(input);
		
	}
	
	
	public static Document cloneDocument(Document doc) throws SAXException, IOException, ParserConfigurationException, TransformerException{
		
		return XMLUtils.stringToDocument(XMLUtils.documentToString(doc));
	}
	
}
