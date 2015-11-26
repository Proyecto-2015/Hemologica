package org.hemologica.empi.adapter.message;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hemologica.empi.datatypes.Identifier;

import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.GenericComposite;
import ca.uhn.hl7v2.model.GenericPrimitive;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v231.message.ADT_A01;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A18;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.message.ADT_A05;
import ca.uhn.hl7v2.model.v25.message.QBP_Q21;
import ca.uhn.hl7v2.model.v25.segment.QPD;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.util.Terser;

/**
 * 
 * @author bruno
 *
 */
public class MessageFactory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4359277168618376863L;

	/**
	 * Versions
	 */
	public static String V26 = "v26";
	public static String V25 = "v25";
	public static String V251 = "v251";
	public static String V24 = "v24";
	public static String V23 = "v23";
	public static String V231 = "v231";
	public static String V22 = "v22";
	public static String V21 = "v21";

	/**
	 * Messages
	 */
	public static String ADT_A01 = "ADT_AO1";
	public static String ADT_A04 = "ADT_AO4";
	public static String ADT_A05 = "ADT_AO5";
	public static String ADT_A08 = "ADT_AO8";
	public static String ADT_A40 = "ADT_A40";
	public static String QBP_Q22 = "QBP_Q22";
	public static String QBP_Q23 = "QBP_Q23";
	
	private static String QBP_Q23_MSG_STRING = "MSH|^~\\&|NIST_SENDER^^|NIST^^|NIST_RECEIVER^^|NIST^^|20101101161157||QBP^Q23^QBP_Q21|NIST-101101161157166|P|2.5\r\nQPD|IHE PIX Query||HEMO-111^^^HEMOLOGICA\r\nRCP|I";
	private static String QBP_Q22_MSG_STRING = "MSH|^~\\&|NIST_SENDER^^|NIST^^|NIST_RECEIVER^^|NIST^^|20101101161157||QBP^Q22|NIST-101101161157166|P|2.5\r\nQPD|IHE PDQ Query||HEMO-111^^^HEMOLOGICA\r\nRCP|I";

	
	/**
	 * Fixed values
	 * 
	 */
	private Map<String, String> context = new HashMap<String, String>();
	// context.put("sendingApplication", "HEMOLOGICA_SEND");
	// context.put("sendingFacility", "HEMOLOGICA");
	// context.put("receivingApplication", "EMPI_RECEIVE");
	// context.put("receivingFacility", "EMPI");
	// context.put("aa_namespace", "HEMOLOGICA");
	// context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
	// context.put("aa_universal_id_type", "OID");

	/**
	 * 
	 * @param context
	 */
	public MessageFactory(Map<String, String> context) {
		// the context contains fixed values like MSH parameters
		this.context.putAll(context);

	}

	public ADT_A01 create_ADT_A01(Map<String, String> values) throws MessageFactoryException {
		ADT_A01 msg = new ADT_A01();

		try {

			// MSH
			msg.initQuickstart("ADT", "A01", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);
			

			// PID
			PID pid = msg.getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}

		return msg;
	}

	public ADT_A04 create_ADT_A04(Map<String, String> values) throws MessageFactoryException {

		ADT_A04 msg = new ADT_A04();
		try {
			// MSH
			msg.initQuickstart("ADT", "A04", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);

			// PID
			PID pid = msg.getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}

	public ADT_A05 create_ADT_A05(Map<String, String> values) throws MessageFactoryException {
		ADT_A05 msg = new ADT_A05();
		try {
			// MSH
			msg.initQuickstart("ADT", "A08", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);

			// PID
			PID pid = msg.getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}

	public ADT_A08 create_ADT_A08(Map<String, String> values) throws MessageFactoryException {
		ADT_A08 msg = new ADT_A08();
		try {
			// MSH
			msg.initQuickstart("ADT", "A08", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);

			// PID
			PID pid = msg.getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}
	
	public ADT_A18 create_ADT_A18(Map<String, String> values) throws MessageFactoryException {
		ADT_A18 msg = new ADT_A18();
		try {
			// MSH
			msg.initQuickstart("ADT", "A18", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);

			// PID
			PID pid = msg.getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}
	
	
	public ADT_A40 create_ADT_A40(Map<String, String> values) throws MessageFactoryException {
		ADT_A40 msg = new ADT_A40();
		try {
			// MSH
			msg.initQuickstart("ADT", "A18", context.get("processingId"));
			MSH msh = msg.getMSH();
			msh = this.processMSH(msh);

			// PID
			PID pid = msg.getPIDPD1MRGPV1().getPID();
			pid = this.processPID(values, pid);

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}

	public QBP_Q21 create_QBP_Q21(Map<String, String> values) throws MessageFactoryException {
		
		
		try {
			
			PipeParser parser = new PipeParser();
			QBP_Q21 msg = (QBP_Q21) parser.parse(QBP_Q23_MSG_STRING);
			
			// MSH
			msg.initQuickstart("QBP", "Q23", context.get("processingId"));
			ca.uhn.hl7v2.model.v25.segment.MSH msh = msg.getMSH();
			msh = processMSH(msh);
			
			// QPD
			QPD qpd = msg.getQPD();
			Varies varies = qpd.getQpd3_UserParametersInsuccessivefields();
			GenericComposite elem = (GenericComposite) varies.getData();
			Type[] items = elem.getComponents();
			Varies identifierVaries = (Varies) items[0];
			Varies domainVaries = (Varies) items[3];
			GenericPrimitive identifierData = (GenericPrimitive) identifierVaries.getData();
			identifierData.setValue(values.get("identifier"));
			GenericPrimitive domainData = (GenericPrimitive) domainVaries.getData();
			domainData.setValue(values.get("domain"));
			
			return msg;
			

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		
	}
	
	public QBP_Q21 create_QBP_Q22(Map<String, String> values) throws MessageFactoryException {
		
		
		try {
			
			PipeParser parser = new PipeParser();
			QBP_Q21 msg = (QBP_Q21) parser.parse(QBP_Q22_MSG_STRING);
			
			// MSH
			msg.initQuickstart("QBP", "Q22", context.get("processingId"));
			ca.uhn.hl7v2.model.v25.segment.MSH msh = msg.getMSH();
			msh = processMSH(msh);
			
			Terser terser = new Terser(msg);
			terser.set("/QPD-3(0)-1", "@PID.5.1.1");
			terser.set("/QPD-3(0)-2", values.get("surname").toUpperCase());
			terser.set("/QPD-3(1)-1", "@PID.5.2.1");
			terser.set("/QPD-3(1)-2", values.get("name").toUpperCase());
			
			
			if(values.containsKey("secondSurname")){ 
				terser.set("/QPD-3(2)-1", "@PID.5.1.2");
				terser.set("/QPD-3(2)-2", values.get("secondSurname").toUpperCase());
			}
			
			if(values.containsKey("secondName")){ 
				terser.set("/QPD-3(3)-1", "@PID.5.2.2");
				terser.set("/QPD-3(3)-2", values.get("secondName").toUpperCase());
			}
//			if(values.containsKey("birthday")){ 
//				terser.set("/QPD-3(4)-1", "@PID.7");
//				terser.set("/QPD-3(4)-2", values.get("birthday"));
//			}
			if(values.containsKey("birthdayPlace")){ 
				terser.set("/QPD-3(5)-1", "@PID.23");
				terser.set("/QPD-3(5)-2", values.get("birthdayPlace"));
			}
//			if(values.containsKey("sex")){ 
//				terser.set("/QPD-3(6)-1", "@PID.8");
//				terser.set("/QPD-3(6)-2", values.get("sex"));
//			}
			if(values.containsKey("addressStreet")){ 
				terser.set("/QPD-3(7)-1", "@PID.11");
				terser.set("/QPD-3(7)-2", values.get("addressStreet"));
			}
//			if(values.containsKey("phone")){ 
//				terser.set("/QPD-3(8)-1", "@PID.13");
//				terser.set("/QPD-3(8)-2", values.get("phone"));
//			}
			terser.set("/QPD-8-4", this.getMyDomain());

			return msg;
			

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		
	}

	

	private ca.uhn.hl7v2.model.v25.segment.MSH processMSH(ca.uhn.hl7v2.model.v25.segment.MSH msh) throws DataTypeException {
		msh.getMsh3_SendingApplication().getNamespaceID().setValue(context.get("sendingApplication"));
		msh.getMsh4_SendingFacility().getNamespaceID().setValue(context.get("sendingFacility"));
		msh.getMsh5_ReceivingApplication().getNamespaceID().setValue(context.get("receivingApplication"));
		msh.getMsh6_ReceivingFacility().getNamespaceID().setValue(context.get("receivingFacility"));
		msh.getMsh13_SequenceNumber().setValue("123");
		return msh;
	}
	
	private MSH processMSH(MSH msh) throws DataTypeException {
		msh.getMsh3_SendingApplication().getNamespaceID().setValue(context.get("sendingApplication"));
		msh.getMsh4_SendingFacility().getNamespaceID().setValue(context.get("sendingFacility"));
		msh.getMsh5_ReceivingApplication().getNamespaceID().setValue(context.get("receivingApplication"));
		msh.getMsh6_ReceivingFacility().getNamespaceID().setValue(context.get("receivingFacility"));
		msh.getMsh13_SequenceNumber().setValue("123");
		return msh;
	}

	private PID processPID(Map<String, String> values, PID pid) throws DataTypeException {

		// obligatory information
		pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
		// pid.getPatientIdentifierList(0).getIdentifierTypeCode().setValue(context.get("identifierTypeCode"));
		pid.getPatientIdentifierList(0).getAssigningAuthority().getHd1_NamespaceID()
				.setValue(context.get("aa_namespace"));
		pid.getPatientIdentifierList(0).getAssigningAuthority().getHd2_UniversalID()
				.setValue(context.get("aa_universal_id"));
		;
		pid.getPatientIdentifierList(0).getAssigningAuthority().getHd3_UniversalIDType()
				.setValue(context.get("aa_universal_id_type"));
		
		pid.getPatientName(0).getGivenName().setValue(values.get("name"));
		pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));

		// optional information
		if (values.containsKey("secondName")) {
			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
		}
		if (values.containsKey("secondSurname")) {
			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
		}
		if (values.containsKey("addressCountry")) {
			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
		}
		if (values.containsKey("addressStateOrProvince")) {
			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
		}
		if (values.containsKey("addressCity")) {
			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
		}
		if (values.containsKey("addressZipPostalCode")) {
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
		}
		if (values.containsKey("addressStreet")) {
			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
		}
		if (values.containsKey("addressGeographic")) {
			pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
		}
		if (values.containsKey("sex")) {
			pid.getSex().setValue(values.get("sex"));
		}
		if (values.containsKey("phone")) {
			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
		}
		if (values.containsKey("birthday")) {
			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
		}
		if (values.containsKey("birthdayPlace")) {
			pid.getBirthPlace().setValue(values.get("birthdayPlace"));
		}

		return pid;
	}

	public QPD getQPDFromTemplate(Map<String, String> values) throws HL7Exception{
		
		PipeParser parser = new PipeParser();
		QBP_Q21 msg = (QBP_Q21) parser.parse(QBP_Q23_MSG_STRING);
		QPD qpd = msg.getQPD();
		qpd = this.processQPD(qpd, values);
		return qpd;
		
	}
	
	public QPD processQPD(QPD qpd, Map<String,String> values) throws DataTypeException{
		
		Varies varies = qpd.getQpd3_UserParametersInsuccessivefields();
		GenericComposite elem = (GenericComposite) varies.getData();
		Type[] items = elem.getComponents();
		Varies identifierVaries = (Varies) items[0];
		Varies domainVaries = (Varies) items[3];
		GenericPrimitive identifierData = (GenericPrimitive) identifierVaries.getData();
		identifierData.setValue(values.get("identifier"));
		GenericPrimitive domainData = (GenericPrimitive) domainVaries.getData();
		domainData.setValue(values.get("domain"));
		return qpd;
	}

	public Identifier createIdentifier() {
		Identifier id = new Identifier();
		id.setDomain(context.get("aa_namespace"));
		id.setId(UUID.randomUUID().toString());
		return id;
	}

	public String getMyDomain() {
		return context.get("aa_namespace");
	}
	
}
