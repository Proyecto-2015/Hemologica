package org.hemologica.empi.adapter.message;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v231.message.*;
import ca.uhn.hl7v2.model.v25.message.QBP_Q21;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.PipeParser;

public class MessageFactoryTest {

	private static final HashMap<String, String> context = new HashMap<String, String>();
	static {
		context.put("sendingApplication", "HEMOLOGICA_SEND");
		context.put("sendingFacility", "HEMOLOGICA");
		context.put("receivingApplication", "EMPI_RECEIVE");
		context.put("receivingFacility", "EMPI");
		context.put("aa_namespace", "HEMOLOGICA");
		context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
		context.put("aa_universal_id_type", "OID");
	}
	
	@Test
	public void testMessageFactory() {
//		fail("Not yet implemented");
	}

	@Test
	public void testCreate_ADT_A01() {
		
//		HashMap<String, String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-111");
//		values.put("name", "Bruno");
//		values.put("surname", "Strasser");
//		MessageFactory factory = new MessageFactory(context);
//		try {
//			
//			ADT_A01 adt_A01 = factory.create_ADT_A01(values);
//			PipeParser pipeParser = new PipeParser();
//			DefaultXMLParser xmlParser = new DefaultXMLParser();
//			String pipeMsg = pipeParser.encode(adt_A01);
//			String xmlMsg = xmlParser.encode(adt_A01);
//			
//			System.out.println("########################### ADT_A01 PIPE ###########################");
//			System.out.println("PIPE_MSG:");
//			System.out.println(pipeMsg);
//			System.out.println("########################### ADT_A01 XML ############################");
//			System.out.println("XML_MSG:");
//			System.out.println(xmlMsg);
//			System.out.println("####################################################################");
//			
//			
//		} catch (MessageFactoryException e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		} catch (HL7Exception e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		}
		
		
	}

	@Test
	public void testCreate_ADT_A04() {

//		HashMap<String, String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-111");
//		values.put("name", "Bruno");
//		values.put("surname", "Strasser");
//		MessageFactory factory = new MessageFactory(context);
//		try {
//			
//			ADT_A04 adt_A04 = factory.create_ADT_A04(values);
//			PipeParser pipeParser = new PipeParser();
//			DefaultXMLParser xmlParser = new DefaultXMLParser();
//			String pipeMsg = pipeParser.encode(adt_A04);
//			String xmlMsg = xmlParser.encode(adt_A04);
//			
//			System.out.println("########################### ADT_A04 PIPE ###########################");
//			System.out.println("PIPE_MSG:");
//			System.out.println(pipeMsg);
//			System.out.println("########################### ADT_A04 XML ############################");
//			System.out.println("XML_MSG:");
//			System.out.println(xmlMsg);
//			System.out.println("####################################################################");
//			
//			
//		} catch (MessageFactoryException e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		} catch (HL7Exception e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		}
		
	}

	@Test
	public void testCreate_ADT_A05() {

//		HashMap<String, String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-111");
//		values.put("name", "Bruno");
//		values.put("surname", "Strasser");
//		MessageFactory factory = new MessageFactory(context);
//		try {
//			
//			ADT_A05 adt_A05 = factory.create_ADT_A05(values);
//			PipeParser pipeParser = new PipeParser();
//			DefaultXMLParser xmlParser = new DefaultXMLParser();
//			String pipeMsg = pipeParser.encode(adt_A05);
//			String xmlMsg = xmlParser.encode(adt_A05);
//			
//			System.out.println("########################### ADT_A05 PIPE ###########################");
//			System.out.println("PIPE_MSG:");
//			System.out.println(pipeMsg);
//			System.out.println("########################### ADT_A05 XML ############################");
//			System.out.println("XML_MSG:");
//			System.out.println(xmlMsg);
//			System.out.println("####################################################################");
//			
//			
//		} catch (MessageFactoryException e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		} catch (HL7Exception e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		}
		
	}

	@Test
	public void testCreate_ADT_A08() {

//		HashMap<String, String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-111");
//		values.put("name", "Bruno");
//		values.put("surname", "Strasser");
//		MessageFactory factory = new MessageFactory(context);
//		try {
//			
//			ADT_A08 adt_A08 = factory.create_ADT_A08(values);
//			PipeParser pipeParser = new PipeParser();
//			DefaultXMLParser xmlParser = new DefaultXMLParser();
//			String pipeMsg = pipeParser.encode(adt_A08);
//			String xmlMsg = xmlParser.encode(adt_A08);
//			
//			System.out.println("########################### ADT_A08 PIPE ###########################");
//			System.out.println("PIPE_MSG:");
//			System.out.println(pipeMsg);
//			System.out.println("########################### ADT_A08 XML ############################");
//			System.out.println("XML_MSG:");
//			System.out.println(xmlMsg);
//			System.out.println("####################################################################");
//			
//			
//		} catch (MessageFactoryException e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		} catch (HL7Exception e) {
//			e.printStackTrace();
//			fail("Exception: "+ e.getMessage());
//		}
		
	}

	@Test
	public void testCreate_QBP_Q21() {

		
		HashMap<String, String> values = new HashMap<String, String>();
		values.put("name", "PAULA");
		values.put("secondName", "MARIA");
		values.put("surname", "ROCHE");
		values.put("secondSurname", "PEREZ");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
//		values.put("surname", "ROCHE");
		
		
		MessageFactory factory = new MessageFactory(context);
		try {
			
			QBP_Q21 qbp_Q21 = factory.create_QBP_Q22(values);
			PipeParser pipeParser = new PipeParser();
			DefaultXMLParser xmlParser = new DefaultXMLParser();
			String pipeMsg = pipeParser.encode(qbp_Q21);
			String xmlMsg = xmlParser.encode(qbp_Q21);
			
			System.out.println("########################### QBP_Q22 PIPE ###########################");
			System.out.println("PIPE_MSG:");
			System.out.println(pipeMsg);
			System.out.println("########################### QBP_Q22 XML ############################");
			System.out.println("XML_MSG:");
			System.out.println(xmlMsg);
			System.out.println("####################################################################");
			
			
		} catch (MessageFactoryException e) {
			e.printStackTrace();
			fail("Exception: "+ e.getMessage());
		} catch (HL7Exception e) {
			e.printStackTrace();
			fail("Exception: "+ e.getMessage());
		}
		
	}

}
