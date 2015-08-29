package org.hemologica.empi.adapter.message;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.Location;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v231.message.ADT_A01;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.message.ADT_A05;
import ca.uhn.hl7v2.model.v26.message.QBP_Q21;
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
	public static String QBP_Q23 = "QBP_Q23";

	/**
	 * Fixed values
	 * 
	 */
	private Map<String, String> context = new HashMap<String, String>();

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
			this.processMSH(msg.getMSH());

			// PID
			PID pid = msg.getPID();
			pid.getPatientName(0).getGivenName().setValue(values.get("name"));
			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
			pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));
			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
			pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
			// pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
			pid.getSex().setValue(values.get("sex"));
			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
			pid.getBirthPlace().setValue(values.get("birthdayPlace"));

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
			this.processMSH(msg.getMSH());

			// PID
			PID pid = msg.getPID();
			pid.getPatientName(0).getGivenName().setValue(values.get("name"));
			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
			pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));
			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
			pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
			// pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
			pid.getSex().setValue(values.get("sex"));
			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
			pid.getBirthPlace().setValue(values.get("birthdayPlace"));

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
			this.processMSH(msg.getMSH());

			
			// PID
			PID pid = msg.getPID();
			
			pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
			
			pid.getPatientName(0).getGivenName().setValue(values.get("name"));
			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
			pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));
			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
			// pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
			pid.getSex().setValue(values.get("sex"));
			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
			pid.getBirthPlace().setValue(values.get("birthdayPlace"));

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
			this.processMSH(msg.getMSH());

			// PID
			PID pid = msg.getPID();
			pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
			pid.getPatientName(0).getGivenName().setValue(values.get("name"));
			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
			pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));
			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
			// pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
			pid.getSex().setValue(values.get("sex"));
			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
			pid.getBirthPlace().setValue(values.get("birthdayPlace"));

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}

//	public ADT_A40 create_ADT_A40(Map<String, String> values) throws MessageFactoryException {
//		ADT_A40 msg = new ADT_A40();
//		try {
//			// MSH
//			msg.initQuickstart("ADT", "A04", context.get("processingId"));
//			this.processMSH(msg.getMSH());
//
//			// PID
//			PID pid = msg.getPID();
//			pid.getPatientName(0).getGivenName().setValue(values.get("name"));
//			pid.getPatientName(0).getMiddleInitialOrName().setValue(values.get("secondName"));
//			pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(values.get("surname"));
//			pid.getPatientName(0).getFamilyLastName().getFn1_FamilyName().setValue(values.get("secondSurname"));
//			pid.getPatientIdentifierList(0).getID().setValue(values.get("patientIdentifier"));
//			pid.getPatientAddress(0).getCountry().setValue(values.get("addressCountry"));
//			pid.getPatientAddress(0).getStateOrProvince().setValue(values.get("addressStateOrProvince"));
//			pid.getPatientAddress(0).getCity().setValue(values.get("addressCity"));
//			pid.getPatientAddress(0).getZipOrPostalCode().setValue(values.get("addressZipPostalCode"));
//			pid.getPatientAddress(0).getStreetAddress().setValue(values.get("addressStreet"));
//			// pid.getPatientAddress(0).getOtherGeographicDesignation().setValue(values.get("addressGeographic"));
//			pid.getSex().setValue(values.get("sex"));
//			pid.getPhoneNumberHome(0).getAnyText().setValue(values.get("phone"));
//			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(values.get("birthday"));
//			pid.getBirthPlace().setValue(values.get("birthdayPlace"));
//
//		} catch (DataTypeException e) {
//			throw new MessageFactoryException(e);
//		} catch (HL7Exception e) {
//			throw new MessageFactoryException(e);
//		} catch (IOException e) {
//			throw new MessageFactoryException(e);
//		}
//		return msg;
//	}
	
	
	public QBP_Q21 create_QBP_Q21(Map<String, String> values) throws MessageFactoryException {
		QBP_Q21 msg = new QBP_Q21();
		try {
			// MSH
			msg.initQuickstart("QBP", "Q23", context.get("processingId"));
			msg.getMSH().getMsh3_SendingApplication().getNamespaceID().setValue(context.get("sendingApplication"));
			msg.getMSH().getMsh4_SendingFacility().getNamespaceID().setValue(context.get("sendingFacility"));
			msg.getMSH().getMsh5_ReceivingApplication().getNamespaceID().setValue(context.get("receivingApplication"));
			msg.getMSH().getMsh6_ReceivingFacility().getNamespaceID().setValue(context.get("receivingFacility"));
			msg.getMSH().getMsh13_SequenceNumber().setValue("123");

			// QPD
			Terser terser = new Terser(msg);
			for(String key : values.keySet()){
				terser.set(key, values.get(key));
			}

		} catch (DataTypeException e) {
			throw new MessageFactoryException(e);
		} catch (HL7Exception e) {
			throw new MessageFactoryException(e);
		} catch (IOException e) {
			throw new MessageFactoryException(e);
		}
		return msg;
	}

	private MSH processMSH(MSH msh) throws DataTypeException {
		msh.getMsh3_SendingApplication().getNamespaceID().setValue(context.get("sendingApplication"));
		msh.getMsh4_SendingFacility().getNamespaceID().setValue(context.get("sendingFacility"));
		msh.getMsh5_ReceivingApplication().getNamespaceID().setValue(context.get("receivingApplication"));
		msh.getMsh6_ReceivingFacility().getNamespaceID().setValue(context.get("receivingFacility"));
		msh.getMsh13_SequenceNumber().setValue("123");
		return msh;
	}

}
