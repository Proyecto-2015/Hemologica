package org.hemologica.cda.validator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.hemologica.xmldatabase.connection.IXMLDataBase;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import org.xml.sax.SAXException;


public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());


	public static void main(String[] args) {

		
//		if(args.length != 2){
//			System.out.println("Ingrese el archivo xsd y el archivo xml como argumentos");
//			return;
//		}
//
//		String xsd = args[0];
//		String xml = args[0];
		String xsd = "/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service/src/main/resources/xsd/cda.xsd";
		String xml[] = {
//				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA.xml",
//				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_2.xml",
//				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_3.xml",
//				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_4.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.31.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.32.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.33.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.34.xml"
		};

		String xml_id[][] = {
				{"2.16.858.0.0.1.10.2.3.1.1.1", "31"},
				{"2.16.858.0.0.1.10.2.3.1.1.1", "32"},
				{"2.16.858.0.0.1.10.2.3.1.1.1", "33"},
				{"2.16.858.0.0.1.10.2.3.1.1.1", "34"}
		};
		
		String xml_name[] = {
				"2.16.858.0.0.1.10.2.3.1.1.1.31",
				"2.16.858.0.0.1.10.2.3.1.1.1.32",
				"2.16.858.0.0.1.10.2.3.1.1.1.33",
				"2.16.858.0.0.1.10.2.3.1.1.1.34"
		};
		
		//validar xsd
		System.out.println("#############################################################");
		System.out.println("VALIDAR XSD:");
		
		try {
			
			int i = 0;
			for(String x : xml){
				if(	XMLUtils.validateWithExtXSDUsingSAX(new FileInputStream(x), new FileInputStream(xsd)) ){
					System.out.println(i + ": VALIDO");
				}else{
					System.out.println(i + ": INVALIDO");
				}
				i++;
			}
			
		} catch (Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
		System.out.println("#############################################################");
		System.out.println("VALIDAR BASEX:");
		
		String xmlContent;
		int i = 0;
		for(String x : xml){
		
			try {
				
				IXMLDataBase db = XMLDataBaseFactory.getIXMLDataBaseDonations();
				//agrego al cda a la base
				db.addElement(xml_name[i], fixXML(x) );
//				XMLUtils.fixCDANamespaces(doc) para agregar los namespaces de hl7
//				XMLUtils.removeCDANamespaces(doc) para sacar los namepsaces
				
				xmlContent = db.getElementCDAId(xml_id[i][0], xml_id[i][1]); //NO ANDA
//				xmlContent = db.getElement(xml_name[i]); ANDA BIEN!
				if(xmlContent != null){
					System.out.println(i + " VALIDO");
				}else{
					System.out.println(i + " INVALIDO");
				}
				
				
			} catch (Exception ex) {
				logger.log(Level.SEVERE, ex.getMessage(), ex);
			}
			
			i++;
			
		}
		
		
		
		
		System.out.println("#############################################################");
	}
	
	
	private static String fixXML(String xml) throws TransformerException, SAXException, IOException, ParserConfigurationException{
		
//		xml.replaceAll("xmlns=\"urn:hl7-org:v3\"", "");
		return XMLUtils.documentToString(
				XMLUtils.removeCDANamespaces(
						XMLUtils.fileToDocument(xml)
						)
					);
//				.replaceAll("xmlns=\"urn:hl7-org:v3\"", "");
	}

}
