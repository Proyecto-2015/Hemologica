package org.hemologica.services.client.stub;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
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
import org.apache.commons.lang3.RandomUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.hemologica.service.ws.MovementData;
import org.hemologica.service.ws.impl.ParseException;
import org.hemologica.service.ws.impl.Service;
import org.hemologica.service.ws.impl.ServiceImplService;

public class CDAProducerUseCase1 {

	private static String url = "http://localhost:8180/Hemologica-Service2/ServiceImpl?wsdl";
	
	private static String CDA_DONATION_TYPE = "2.16.840.1.113883.1.3";
	private static String CDA_LABORATORY_TYPE = "2.16.840.1.113883.1.3";
	private static String CDA_TRANSFUSION_TYPE = "2.16.840.1.113883.1.3";

	private static final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
	private static final String lexiconDocumento = "12345674890";

	private static final java.util.Random rand = new java.util.Random();

	private static final Map<String, Boolean> identifiers = new HashMap<String, Boolean>();
	
	private static final String[] bloodTypes = { "278148006", "278147001", "278152006", "278149003", "278154007", "278151004", "278153001",	"278150003" };
	
	private static final String[][] banks = {
			{"2.16.858.0.0.1.10.2.3.6", "2.16.858.0.0.1.10.2.3.6"},
			{"2.16.858.0.2.16.86.1.0.0.212567060019", "2.16.858.0.0.1.10.2.3.7"},
			{"2.16.858.0.2.16.86.1.0.0.212567060019", "2.16.858.0.0.1.10.2.3.8"}
	};	
	
//	{"2.16.858.0.0.1.10.2.3.6", "2.16.858.0.0.1.10.2.3.9"},
//	{"2.16.858.0.2.16.86.1.0.0.212567060019", "2.16.858.0.0.1.10.2.3.10"}
	
	


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

		String outputPath = "/home/bruno/Escritorio/proyecto/Mirth/Integracion/import";
		Integer offsetDonation = 100000;
		Integer offsetLaboratory = 100000;
		Integer offsetTransfusion = 100000;
		
		for(int i = 0; i < 5; ++i){
			
		
		
			// ################################ DONATION  ##########################################
	
			String[] center = getRandomCenter();
			
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
			String donationIdRoot = center[0];
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@extension
			String donationIdExtension = UUID.randomUUID().toString(); 
			
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@root
			String specimenDonationRoot = donationIdRoot;
			// /ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@extension
			String specimenDonationExtension = donationIdExtension;
	
			String gender = getRandomGender();
			String birthday = getRandomBirth();
			String bloodType = getRandomBloodType();
			
			
			try {
				writeFile(outputPath +"/donacion_"+ (offsetDonation + i) +".xml", 
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
								specimenDonationExtension,
								gender,
								birthday,
								bloodType));
				
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
	
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				return;
			}
			
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
								specimenLaboratoryUnitExtension,
								gender,
								birthday));
				
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			
			
			ServiceImplService service;
			SimpleDateFormat sdfM = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			List<MovementData> lms;
			String[] times = getTimes(6);
			Service port;
			try {
			
//				'1', 'label_plaquetas', '1', '7', '7', '256395009'
//				'2', 'label_crioprecipitado', '2', '8', '8', '256401009'
//				'3', 'label_plasma', '3', '9', '9', '256400005'
//				'4', 'label_eritrocitos', '4', '10', '10', '126242007'
//				'5', 'label_hematies', '5', '54', '54', '119351004'

				
				service = new ServiceImplService(new URL(url));
				port = service.getServiceImplPort();
				MovementData m = null;
				lms = new ArrayList<MovementData>();
				
				m = new MovementData();
				m.setCenter("2.16.858.0.0.1.10.2.3.6");
				m.setDate(times[0]);
				m.setType("1");
				m.setUnit(specimenDonationExtension);
				m.setUnitBloodType("278151004"); 	
				m.setUnitType("258580003"); 		//sangre entera -- 258580003
				lms.add(m);
				
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[1]);
				m.setType("2");
				m.setUnit(specimenDonationExtension);
				m.setUnitBloodType(bloodType); 	
				m.setUnitType("258580003"); 		//sangre entera
				lms.add(m);
				
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[2]);
				m.setType("1");
				m.setUnit(specimenDonationExtension + ".256395009");
				m.setUnitBloodType(bloodType); 	
				m.setUnitType("256395009"); 		//plaquetas
				m.setUnitParent(specimenDonationExtension);
				lms.add(m);
			
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[3]);
				m.setType("1");
				m.setUnit(specimenDonationExtension + ".256401009");
				m.setUnitBloodType(bloodType); 	
				m.setUnitType("256401009"); 		//crioprecipitado
				m.setUnitParent(specimenDonationExtension);
				lms.add(m);
				
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[4]);
				m.setType("1");
				m.setUnit(specimenDonationExtension + ".256400005");
				m.setUnitBloodType(bloodType); 	
				m.setUnitType("256400005"); 		//plasma
				m.setUnitParent(specimenDonationExtension);
				lms.add(m);
				
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[5]);
				m.setType("1");
				m.setUnit(specimenDonationExtension + ".119351004");
				m.setUnitBloodType(bloodType); 	
				m.setUnitType("119351004"); 		//hematies
				m.setUnitParent(specimenDonationExtension);
				lms.add(m);
				
				m = new MovementData();
				m.setCenter(center[1]);
				m.setDate(times[5]);
				m.setType("1");
				m.setUnit(specimenDonationExtension + ".126242007");
				m.setUnitBloodType(bloodType); 	//ab+
				m.setUnitType("126242007"); 		//eritrocitos
				m.setUnitParent(specimenDonationExtension);
				lms.add(m);
				
				service.getServiceImplPort().importMOVEMENTS(lms);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
				return;
			} 
			catch (ParseException e) {
				e.printStackTrace();
				return;
			}
			
			
			
			// ################################ TRANSFUSION ##########################################
			
			for(MovementData m : lms){
					
				if(m.getUnitType().equals("258580003")) continue;
				if(RandomUtils.nextInt(0, 6) > 2 ) continue;
				
				// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/id/@root
				doctorIdRoot = randomDocument();
				// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/giveName
				doctorGivenName = randomIdentifier();
				// /ClinicalDocument/recordTarget/patientRole/author/assignedAuthor/assignedPerson/name/family
				doctorFamily = randomIdentifier();
		
				// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@root
				String specimenTransfusionUnitRoot = donationIdRoot;
				// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@extension
				String specimenTransfusionUnitExtension = m.getUnit();
		
				// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]
				String specimenTransfusionDonationRoot = donationIdRoot;
				// /ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]/@extension
				String specimenTransfusionDonationExtension = donationIdExtension;
			
				String gender2 = getRandomGender();
				String birthday2 = getRandomBirth();
				
				// /ClinicalDocument/id/@root
							root = "2.16.858.0.0.1.10.2.3.1.1.2";
							// /ClinicalDocument/id/@extension use toString();
							extension = offsetTransfusion + i;
				
				efectiveTime = sdf.format(new Date());
							
				try {
					writeFile(outputPath +"/transfusion_"+ extension +".xml", 
							getCDATransfusion(
									root,
									extension.toString(),
									efectiveTime,
									patientIdRoot,
									patientGivenName,
									patientFamily,
									doctorIdRoot,
									doctorGivenName,
									doctorFamily,
									specimenTransfusionUnitRoot,
									specimenTransfusionUnitExtension,
									specimenTransfusionDonationRoot,
									specimenTransfusionDonationExtension,
									gender,
									birthday,
									m.getUnitType()
									));
					
					m.setDate(getTimes(1)[0]);
					m.setType("2");
					List<MovementData> l = new ArrayList<>();
					l.add(m);
					port.importMOVEMENTS(l);
					
				} catch (IOException e) {
					e.printStackTrace();
					return;
				} catch (ParseException e) {
					e.printStackTrace();
				}
			

			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					return;
				}
				
				
				
			} //for
			
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				return;
			}
			
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
			String specimenDonationExtension,
			String gender,
			String birthday,
			String bloodType){
		
		
		Document cda = getCDAResource("donation.xml");  		
		try {
			
			cda = setCDAHeader( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily, gender, birthday);
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@root", donationIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@extension", donationIdExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@root", specimenDonationRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/specimen/specimenRole/id/@extension", specimenDonationExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/code/@code", bloodType);
			
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
			String specimenLaboratoryUnitExtension,
			String gender,
			String birthday){
		
		
		Document cda = getCDAResource("laboratory.xml");  		
		try {
			
			cda = setCDAHeader( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily, gender, birthday);
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@root", specimenLaboratoryUnitRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/organizer[1]/specimen[1]/specimenRole[1]/id[1]/@extension", specimenLaboratoryUnitExtension);

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
			String specimenTransfusionDonationExtension,
			String gender,
			String birthday,
			String product){
		
		
		Document cda = getCDAResource("transfusion.xml");  		
		try {
			
			cda = setCDAHeaderTransfusion( cda, root, effectiveTime, extension, patientIdRoot, patientGivenName, patientFamily, doctorIdRoot, doctorGivenName, doctorFamily, gender, birthday);
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/id[1]/@root", specimenTransfusionUnitRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/	id[1]/@extension", specimenTransfusionUnitExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@root", specimenTransfusionUnitRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[1]/specimenRole[1]/id[1]/@extension", specimenTransfusionUnitExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]/@root", specimenTransfusionDonationRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/component[1]/structuredBody[1]/component[1]/section[1]/entry[1]/procedure[1]/specimen[2]/specimenRole[1]/id[1]/@extension", specimenTransfusionDonationExtension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code", product);
			
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
			String doctorFamily,
			String gender,
			String birthday
			){
		
		
		try {
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@root" , root);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@extension" , extension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/effectiveTime" , effectiveTime);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/id/@root", patientIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/given", patientGivenName);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/family", patientFamily);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code", gender);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value", birthday);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/id[1]/@root", doctorIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor/assignedPerson/name/given", doctorGivenName);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/assignedPerson[1]/name[1]/family[1]", doctorFamily);
			
			return cda;
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	private static Document setCDAHeaderTransfusion(
			Document cda,
			String root,
			String extension,
			String effectiveTime,
			String patientIdRoot,
			String patientGivenName,
			String patientFamily,
			String doctorIdRoot,
			String doctorGivenName,
			String doctorFamily,
			String gender,
			String birthday
			){
		
		
		try {
			
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@root" , root);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/id/@extension" , extension);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/effectiveTime" , effectiveTime);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/id/@root", patientIdRoot);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/given", patientGivenName);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/name/family", patientFamily);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code", gender);
			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value", birthday);
//			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/id[1]/@root", doctorIdRoot);
//			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor/assignedPerson/name/given", doctorGivenName);
//			XMLUtils.replaceXPathString(cda.getDocumentElement(), "/ClinicalDocument/author[1]/assignedAuthor[1]/assignedPerson[1]/name[1]/family[1]", doctorFamily);
			
			return cda;
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static void writeFile(String name, String content) throws IOException{
		
		FileUtils.writeStringToFile(new File(name), content);
		
	}
	
	
	public static String[] getTimes(int i){
		String[] ret = new String[i];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = sdf.format(new Date());
		time.substring(0, time.length()-1);
		for(int j = 0; j < i; ++j){
			ret[j] = time + j + "000"; 
		}
		return ret;
	}
	
	public static String getRandomGender(){
		return ""+ RandomUtils.nextInt(0,3);
	}
	
	public static String getRandomBirth(){
		Date ret = new Date();
		Long time = ret.getTime();
		time = Math.abs(time - RandomUtils.nextLong(0, time));
		ret = new Date(time);
		return new SimpleDateFormat("yyyyMMdd").format(ret);
	}
	
	public static String[] getRandomCenter(){
		return banks[RandomUtils.nextInt(0, banks.length)];
	}
	
	public static String getRandomBloodType(){
		return bloodTypes[RandomUtils.nextInt(0, bloodTypes.length)];
	}
	
}
