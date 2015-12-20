package org.hemologica.service.utils.xml;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.tools.ant.filters.StringInputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

public class XMLUtils {

	private static final String XMLNAMESPACE = "xmlns";

	
	
	public static Document fixCDANamespaces(Document document){
		Element docElement = document.getDocumentElement();
		docElement.setAttribute("xmlns", "urn:hl7-org:v3");
		docElement.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		return document;
	}
	
	public static String removeCDANamespaces(String document){
		document = document.replaceAll("xmlns=\"urn:hl7-org:v3\"", "");
//		document = document.replaceAll("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "");
		return document;
	}
	
	public static Document removeCDANamespaces(Document document){
		Element docElement = document.getDocumentElement();
		docElement.removeAttributeNS("urn:hl7-org:v3","xmlns");
		docElement.removeAttributeNS("http://www.w3.org/2001/XMLSchema-instance","xmlns:xsi");
		return document;
	}
	
	
	// validate SAX and external XSD
	  public static boolean validateWithExtXSDUsingSAX(String xml, String xsd) throws ParserConfigurationException, IOException{
		  
		  ByteArrayInputStream xmlInput = new ByteArrayInputStream(xml.getBytes());
		  ByteArrayInputStream xsdInput = new ByteArrayInputStream(xsd.getBytes());
		  return XMLUtils.validateWithExtXSDUsingSAX(xmlInput, xsdInput);
	  }
	  
	  public static boolean validateWithExtXSDUsingSAX(String xml, InputStream xsd) throws ParserConfigurationException, IOException{
		  ByteArrayInputStream xmlInput = new ByteArrayInputStream(xml.getBytes());
		  return XMLUtils.validateWithExtXSDUsingSAX(xmlInput, xsd);
	  }
	  
	  public static boolean validateWithExtXSDUsingSAX(InputStream xml, InputStream xsd) 
	  throws ParserConfigurationException, IOException 
	  {
	    try {
	      SAXParserFactory factory = SAXParserFactory.newInstance();
	      factory.setValidating(false); 
	      factory.setNamespaceAware(true);

	      SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
	      SAXParser parser = null;
	      try {
	         factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource( xsd )}));
	         parser = factory.newSAXParser();
	      }
	      catch (SAXException se) {
	        System.out.println("SCHEMA : " + se.getMessage());  // problem in the XSD itself
	        return false;
	      }
	      
	      XMLReader reader = parser.getXMLReader();
	      reader.setErrorHandler(
	          new ErrorHandler() {
	            public void warning(SAXParseException e) throws SAXException {
	              System.out.println("WARNING: " + e.getMessage()); // do nothing
	            }

	            public void error(SAXParseException e) throws SAXException {
	              System.out.println("ERROR : " + e.getMessage());
	              throw e;
	            }

	            public void fatalError(SAXParseException e) throws SAXException {
	              System.out.println("FATAL : " + e.getMessage());
	              throw e;
	            }
	          }
	          );
	      reader.parse(new InputSource(xml));
	      return true;
	    }    
	    catch (ParserConfigurationException pce) {
	      throw pce;
	    } 
	    catch (IOException io) {
	      throw io;
	    }
	    catch (SAXException se){
	      return false;
	  }
	}
	
	
	public static void validar(String doc, String xsd) throws ParserConfigurationException, SAXException, IOException {
		StringInputStream input = new StringInputStream(xsd);
		XMLUtils.validar(doc, input);
	}
	
	public static void validar(String doc, InputStream xsd) throws ParserConfigurationException, SAXException, IOException {

		// parse an XML document into a DOM tree
		Document document = XMLUtils.stringToDocument(doc);
		Element docElement = document.getDocumentElement();
		docElement.setAttribute("xmlns", "urn:hl7-org:v3");
		docElement.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		
		// create a SchemaFactory capable of understanding WXS schemas
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		// load a WXS schema, represented by a Schema instance
		
		Source schemaFile = new StreamSource(xsd);
		Schema schema = factory.newSchema(schemaFile);
		
		// create a Validator instance, which can be used to validate an
		// instance document
		Validator validator = schema.newValidator();
		

		// validate the DOM tree

		validator.validate(new DOMSource(document));
	}

	public static String createNamespace(Element el, String ns) {
		String p = "ns1";
		int i = 1;
		while (getPrefix(el, ns) != null) {
			p = "ns" + i;
			i++;
		}
		el.setAttribute(XMLNAMESPACE + ":" + p, ns);
		return p;
	}

	public static String getPrefix(Element el, String ns) {
		NamedNodeMap atts = el.getAttributes();
		for (int i = 0; i < atts.getLength(); i++) {
			Node node = atts.item(i);
			String name = node.getNodeName();
			if (ns.equals(node.getNodeValue())
					&& (name != null && (XMLNAMESPACE.equals(name) || name.startsWith(XMLNAMESPACE + ":")))) {
				return node.getPrefix();
			}
		}
		return null;
	}

	public static Document addNamespace(Document document, String namespace, String prefix) {

		// String namespace = "http://com";
		// String prefix = "ns2";
		// Upgrade the DOM level 1 to level 2 with the correct namespace
		Element originalDocumentElement = document.getDocumentElement();
		Element newDocumentElement = document.createElementNS(namespace, originalDocumentElement.getNodeName());
		// Set the desired namespace and prefix
		newDocumentElement.setPrefix(prefix);
		// Copy all children
		NodeList list = originalDocumentElement.getChildNodes();
		while (list.getLength() != 0) {
			newDocumentElement.appendChild(list.item(0));
		}
		// Replace the original element
		document.replaceChild(newDocumentElement, originalDocumentElement);
		return document;

	}

	public static String documentToString(Document doc) throws TransformerException {

		Element docElement = doc.getDocumentElement();
		docElement.setAttribute("xmlns", "urn:hl7-org:v3");
		docElement.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		return writer.toString();
	}

	public static Document stringToDocument(String input)
			throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(false);
		dbFactory.setIgnoringComments(true);
		return dbFactory.newDocumentBuilder().parse(new ByteArrayInputStream(input.getBytes()));

	}

	public static Document fileToDocument(String path)
			throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(false);
		dbFactory.setIgnoringComments(true);
		return dbFactory.newDocumentBuilder().parse(new FileInputStream(path));

	}
	
	public static Document cloneDocument(Document doc)
			throws SAXException, IOException, ParserConfigurationException, TransformerException {

		return XMLUtils.stringToDocument(XMLUtils.documentToString(doc));
	}

	public static String executeXPathString(Document doc, String xpath) throws XPathExpressionException {
		return executeXPathString(doc.getDocumentElement(), xpath);
	}

	public static String executeXPathString(String doc, String xpath)
			throws XPathExpressionException, SAXException, IOException, ParserConfigurationException {
		return executeXPathString(XMLUtils.stringToDocument(doc), xpath);
	}

	public static String executeXPathString(Element doc, String xpath) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		return (String) factory.newXPath().compile(xpath).evaluate(doc, XPathConstants.STRING);
	}

}