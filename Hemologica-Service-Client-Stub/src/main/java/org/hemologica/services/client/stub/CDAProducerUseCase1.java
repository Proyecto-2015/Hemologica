package org.hemologica.services.client.stub;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.commons.io.FileUtils;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.hemologica.service.ws.MovementData;
import org.hemologica.service.ws.impl.ParseException;
import org.hemologica.service.ws.impl.Service;
import org.hemologica.service.ws.impl.ServiceImplService;

public class CDAProducerUseCase1 {

	private static String url = "http://localhost:8082/Hemologica-Service/Service?wsdl";
	
	private static String CDA_DONATION_TYPE = "2.16.840.1.113883.1.3";
	private static String CDA_LABORATORY_TYPE = "2.16.840.1.113883.1.3";
	private static String CDA_TRANSFUSION_TYPE = "2.16.840.1.113883.1.3";

	private static final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
	private static final String lexiconDocumento = "12345674890";

	private static final java.util.Random rand = new java.util.Random();

	private static final Map<String, Boolean> identifiers = new HashMap<String, Boolean>();

	public static String randomIdentifier() {
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = rand.nextInt(5) + 5;
			for (int i = 0; i < length; i++)
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			if (identifiers.containsKey(builder.toString()))
				builder = new StringBuilder();
		}
		return builder.toString();
	}

	public static String randomDocument() {
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = 7;
			for (int i = 0; i < length; i++)
				builder.append(lexiconDocumento.charAt(rand.nextInt(lexiconDocumento.length())));
			if (identifiers.containsKey(builder.toString()))
				builder = new StringBuilder();
		}
		return builder.toString();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String outputPath = "/home/bruno/Escritorio/cda_generados/input";
		Integer offsetDonation = 0;
		Integer offsetLaboratory = 0;
		Integer offsetTransfusion = 0;
		
		for(int i = 0; i < 20; ++i){
			
		
		
			// ################################ DONATION  ##########################################
	
			// /ClinicalDocument/id/@root
			String root = "2.16.858.0.0.1.10.2.3.1.1.1";
			// /ClinicalDocument/id/@extension use toString();
			Integer extension = offsetDonation + i;
	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			// /ClinicalDocument/effectiveTime
			String efectiveTime = sdf.format(new Date());
	
			// /ClinicalDocument/recordTarget/patientRole/patient/id/@root
			String patientIdRoot = "2.16.858.1.858.68909."+ randomDocument();;
			// /ClinicalDocument/recordTarget/patientRole/patient/id/@extension
	
			// /ClinicalDocument/recordTarget/patientRole/patient/name/given
			String patientGivenName = randomIdentifier();
			// /ClinicalDocument/recordTarget/patientRole/patient/name/family
			String patientFamily = randomIdentifier();
	
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/id/@root
			String doctorIdRoot = "2.16.858.1.858.68909."+ randomDocument();
	
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/giveName
			String doctorGivenName = randomIdentifier();
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/family
			String doctorFamily = randomIdentifier();
	
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@root
			String donationIdRoot = "";
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@extension
			String donationIdExtension = ""; 
			
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@root
			String specimenDonationRoot = "2.16.858.0.0.1.10.2.3.1.1.4";
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@extension
			String specimenDonationExtension = UUID.randomUUID().toString();
	
			
			
			try {
				writeFile(outputPath +"/donacion_"+ i +".xml", 
						getCDADonation(
								root,
								extension.toString(),
								efectiveTime,
								patientIdRoot,
								patientGivenName,
								patientFamily,
								doctorIdRoot,
								doctorGivenName,
								doctorFamily,
								donationIdRoot,
								donationIdExtension,
								specimenDonationRoot,
								specimenDonationExtension));
				
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			
			
			
			
			// ################################ LABORATORY ##########################################
			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//				return;
//			}
			
			// /ClinicalDocument/id/@root
			root = "2.16.858.0.0.1.10.2.3.1.1.2";
			// /ClinicalDocument/id/@extension use toString();
			extension = offsetLaboratory + i;
			
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/id/@root
			doctorIdRoot = randomDocument();
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/giveName
			doctorGivenName = randomIdentifier();
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/family
			doctorFamily = randomIdentifier();
	
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@root
			String specimenLaboratoryUnitRoot = specimenDonationRoot;
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@extension
			String specimenLaboratoryUnitExtension = specimenDonationExtension;
	
			
			efectiveTime = sdf.format(new Date());
			
			try {
				writeFile(outputPath +"/laboratory_"+ extension +".xml", 
						getCDALaboratory(
								root,
								extension.toString(),
								efectiveTime,
								patientIdRoot,
								patientGivenName,
								patientFamily,
								doctorIdRoot,
								doctorGivenName,
								doctorFamily,
								specimenLaboratoryUnitRoot,
								specimenLaboratoryUnitExtension ));
				
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			
			
			String unit = UUID.randomUUID().toString();
			ServiceImplService service;
			SimpleDateFormat sdfM = new SimpleDateFormat("yyyyMMdd");
			try {
			
//				'1', 'label_plaquetas', '1', '7', '7', '256395009'
//				'2', 'label_crioprecipitado', '2', '8', '8', '256401009'
//				'3', 'label_plasma', '3', '9', '9', '256400005'
//				'4', 'label_eritrocitos', '4', '10', '10', '126242007'
//				'5', 'label_hematies', '5', '54', '54', '119351004'

				
				service = new ServiceImplService(new URL(url));
				Service port = service.getServiceImplPort();
				MovementData m = null;
				List<MovementData> lms = new ArrayList<MovementData>();
				
				m = new MovementData();
				m.setCenter("347");
				m.setDate(sdfM.format(new Date()));
				m.setType("1");
//				m.setUnit(UUID.randomUUID().toString());
				m.setUnit(specimenDonationExtension + ".256395009");
				m.setUnitBloodType("278151004"); 	//ab+
				m.setUnitType("256395009"); 		//plaquetas
				lms.add(m);
			
				m = new MovementData();
				m.setCenter("347");
				m.setDate(sdfM.format(new Date()));
				m.setType("1");
//				m.setUnit(UUID.randomUUID().toString());
				m.setUnit(specimenDonationExtension + ".256401009");
				m.setUnitBloodType("278151004"); 	//ab+
				m.setUnitType("256401009"); 		//crioprecipitado
				lms.add(m);
				
				m = new MovementData();
				m.setCenter("347");
				m.setDate(sdfM.format(new Date()));
				m.setType("1");
//				m.setUnit(UUID.randomUUID().toString());
				m.setUnit(specimenDonationExtension + ".256400005");
				m.setUnitBloodType("278151004"); 	//ab+
				m.setUnitType("256400005"); 		//plasma
				lms.add(m);
				
				m = new MovementData();
				m.setCenter("347");
				m.setDate(sdfM.format(new Date()));
				m.setType("1");
//				m.setUnit(UUID.randomUUID().toString());
				m.setUnit(specimenDonationExtension + ".119351004");
				m.setUnitBloodType("278151004"); 	//ab+
				m.setUnitType("119351004"); 		//hematies
				lms.add(m);
				
				service.getServiceImplPort().importMOVEMENTS(lms);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
				return;
			} catch (ParseException e) {
				e.printStackTrace();
				return;
			}
			
			
			
			// ################################ TRANSFUSION ##########################################
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/id/@root
			doctorIdRoot = randomDocument();
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/giveName
			doctorGivenName = randomIdentifier();
			// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/family
			doctorFamily = randomIdentifier();
	
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@root
			String specimenTransfusionUnitRoot = specimenLaboratoryUnitRoot;
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@extension
			String specimenTransfusionUnitExtension = specimenLaboratoryUnitExtension;
	
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]
			String specimenTransfusionDonationRoot = donationIdRoot;
			// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@extension
			String specimenTransfusionDonationExtension = donationIdExtension;
		
			
			// /ClinicalDocument/id/@root
						root = "2.16.858.0.0.1.10.2.3.1.1.2";
						// /ClinicalDocument/id/@extension use toString();
						extension = offsetTransfusion + i;
			
			efectiveTime = sdf.format(new Date());
						
//			try {
//				writeFile(outputPath +"/transfusion_"+ extension +".xml", 
//						getCDATransfusion(
//								root,
//								extension.toString(),
//								efectiveTime,
//								patientIdRoot,
//								patientGivenName,
//								patientFamily,
//								doctorIdRoot,
//								doctorGivenName,
//								doctorFamily,
//								specimenTransfusionUnitRoot,
//								specimenTransfusionUnitExtension,
//								specimenTransfusionDonationRoot,
//								specimenTransfusionDonationExtension  ));
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//				return;
//			}
			

//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//				return;
//			}
			
		
		}
		
	}
	
	
	public static String getCDADonation(
			String root,
			String extension,
			String effectiveTime,
			String patientIdRoot,
			String patientGivenName,
			String patientFamily,
			String doctorIdRoot,
			String doctorGivenName,
			String doctorFamily,
			String donationIdRoot,
			String donationIdExtension,
			String specimenDonationRoot,
			String specimenDonationExtension ){
		
		
		Document cda = getCDAResource("donation.xml");  		
		try {
			
			cda = setCDAHeader( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily );
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@root", donationIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@extension", donationIdExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@root", specimenDonationRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@extension", specimenDonationExtension);
			
			return XMLUtils.documentToString(cda);
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getCDALaboratory(
			String root,
			String extension,
			String effectiveTime,
			String patientIdRoot,
			String patientGivenName,
			String patientFamily,
			String doctorIdRoot,
			String doctorGivenName,
			String doctorFamily,
			String specimenLaboratoryUnitRoot,
			String specimenLaboratoryUnitExtension ){
		
		
		Document cda = getCDAResource("laboratory.xml");  		
		try {
			
			cda = setCDAHeader( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily );
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@root", specimenLaboratoryUnitRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@root", specimenLaboratoryUnitExtension);

			return XMLUtils.documentToString(cda);
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getCDATransfusion(
			String root,
			String extension,
			String effectiveTime,
			String patientIdRoot,
			String patientGivenName,
			String patientFamily,
			String doctorIdRoot,
			String doctorGivenName,
			String doctorFamily,
			String specimenTransfusionUnitRoot,
			String specimenTransfusionUnitExtension,
			String specimenTransfusionDonationRoot,
			String specimenTransfusionDonationExtension ){
		
		
		Document cda = getCDAResource("transfusion.xml");  		
		try {
			
			cda = setCDAHeader( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily );
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@root", specimenTransfusionUnitRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@extension", specimenTransfusionUnitExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]/@root", specimenTransfusionDonationRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]/@extension", specimenTransfusionDonationExtension);
			
			return XMLUtils.documentToString(cda);
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	private static Document getCDAResource(String resource){
		
		CDAProducerUseCase1.class.getClassLoader();
		InputStream input = ClassLoader.getSystemResourceAsStream(resource);
		InputSource is = new InputSource(input);
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	private static Document setCDAHeader(
			Document cda,
			String root,
			String extension,
			String effectiveTime,
			String patientIdRoot,
			String patientGivenName,
			String patientFamily,
			String doctorIdRoot,
			String doctorGivenName,
			String doctorFamily
			){
		
		
		try {
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@root" , root);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@extension" , extension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/effectiveTime" , effectiveTime);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/id/@root", patientIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/given", patientGivenName);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/family", patientFamily);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/id[1]/@root", doctorIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor/assignedPerson/name/given", doctorGivenName);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/assignedPerson[1]/name[1]/family[1]", doctorFamily);
			
			return cda;
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static void writeFile(String name, String content) throws IOException{
		
		FileUtils.writeStringToFile(new File(name), content);
		
	}
	
}
