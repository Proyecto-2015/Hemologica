package org.hemologica.service.utils.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathEvaluator;
import org.w3c.dom.xpath.XPathExpression;
import org.w3c.dom.xpath.XPathResult;
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
		
		return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(input.getBytes()));
		
	}
	
	
	public static Document cloneDocument(Document doc) throws SAXException, IOException, ParserConfigurationException, TransformerException{
		
		return XMLUtils.stringToDocument(XMLUtils.documentToString(doc));
	}
	
	
	
	public static String executeXPathString(Document doc, String xpath) throws XPathExpressionException{
		return executeXPathString(doc.getDocumentElement(), xpath);
	}
	
	public static String executeXPathString(Element doc, String xpath) throws XPathExpressionException{
		
		XPathFactory factory = XPathFactory.newInstance();
		return (String) factory.newXPath().compile(xpath).evaluate(doc, XPathConstants.STRING);
		
	}
	
}
