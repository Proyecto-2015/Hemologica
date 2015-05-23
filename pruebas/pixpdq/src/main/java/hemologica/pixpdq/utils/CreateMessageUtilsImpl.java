package hemologica.pixpdq.utils;

import org.openmrs.Patient;

import hemologica.pixpdq.message.QBP_Q22;
import hemologica.pixpdq.message.QBP_Q23;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

import org.openmrs.Patient;
import org.openmrs.PersonAddress;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A31;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v231.message.ADT_A01;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v26.message.QCN_J01;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;



public class CreateMessageUtilsImpl implements ICreateMessageUtils {

	public ADT_A01 create_ADT_A01(Patient patient) throws HL7Exception {
		// TODO Auto-generated method stub
		
		ADT_A01 adt = new ADT_A01();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
		// Populate the MSH Segment
		MSH mshSegment = adt.getMSH();
		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");
		mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
		mshSegment.getReceivingApplication().getNamespaceID().setValue("PAMSimulator");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getSequenceNumber().setValue("123");
		mshSegment.getMessageType().getTriggerEvent().setValue("A28");
		mshSegment.getMessageType().getMessageStructure().setValue("ADT_A05");
		mshSegment.getMessageType().getMessageCode().setValue("ADT");
		mshSegment.getVersionID().getVersionID().setValue("2.5");
		mshSegment.getMessageControlID().setValue(sdf.format(Calendar.getInstance().getTime()));
		mshSegment.getSendingFacility().getNamespaceID().setValue("OpenMRS");
		mshSegment.getReceivingFacility().getNamespaceID().setValue("IHE");
		mshSegment.getDateTimeOfMessage().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));


		EVN evnSegment = adt.getEVN();
		evnSegment.getRecordedDateTime().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));
		evnSegment.getEventFacility().getNamespaceID().setValue("OpenMRS");

		PV1 pv1 = adt.getPV1();
		pv1.getPatientClass().setValue("N");

		// Populate the PID Segment
		PID pid = adt.getPID(); 
		pid.getPatientName(0).getFamilyName().getSurname().setValue(patient.getFamilyName());
		pid.getPatientName(0).getGivenName().setValue(patient.getGivenName());
		pid.getPatientName(0).getNameTypeCode().setValue("L");
		pid.getPatientID().getIDNumber().setValue(patient.getPatientId().toString());
		pid.getDateTimeOfBirth().getTime().setValue(patient.getBirthdate().toString());

		CX cx;
		cx = pid.getPatientIdentifierList(0);
		cx.getAssigningAuthority().getNamespaceID().setValue("OPENMRS");
		cx.getIdentifierTypeCode().setValue("QWER");
		cx.getIDNumber().setValue(patient.getId().toString());


		if(patient.getAttribute(1) != null)
			pid.getRace(0).getText().setValue(patient.getAttribute(1).toString());

		if(patient.getAttribute(2) != null)      
			pid.getBirthPlace().setValue(patient.getAttribute(2).toString());

		if(patient.getAttribute(3) != null)
			pid.getCitizenship(0).getText().setValue(patient.getAttribute(3).toString());

		if(patient.getAttribute(4) != null){
			pid.getMotherSMaidenName(0).getGivenName().setValue(patient.getAttribute(3).toString());
			pid.getMotherSMaidenName(0).getNameTypeCode().setValue("L");
		}

		if(patient.getAttribute(5) != null)
			pid.getMaritalStatus().getText().setValue(patient.getAttribute(5).toString());

		Set<PersonAddress> addressSet = patient.getAddresses();
		if(!addressSet.isEmpty()){
			PersonAddress[] addressArray = addressSet.toArray(new PersonAddress[0]);
			pid.getPatientAddress(0).getStreetAddress().getStreetName().setValue(addressArray[0].getAddress1());
			pid.getPatientAddress(0).getCity().setValue(addressArray[0].getCityVillage());
			pid.getPatientAddress(0).getCountry().setValue(addressArray[0].getCountry());
			pid.getPatientAddress(0).getStateOrProvince().setValue(addressArray[0].getStateProvince());
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(addressArray[0].getPostalCode());
		}
		
		return adt;
	}

	public ADT_A04 create_ADT_A04(Patient patient) throws HL7Exception {
		// TODO Auto-generated method stub
		ADT_A04 adt = new ADT_A04();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
		// Populate the MSH Segment
		MSH mshSegment = adt.getMSH();
		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");
		mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
		mshSegment.getReceivingApplication().getNamespaceID().setValue("PAMSimulator");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getSequenceNumber().setValue("123");
		mshSegment.getMessageType().getTriggerEvent().setValue("A28");
		mshSegment.getMessageType().getMessageStructure().setValue("ADT_A05");
//		mshSegment.getMessageType().getMessageCode().setValue("ADT");
		mshSegment.getVersionID().getVersionID().setValue("2.5");
		mshSegment.getMessageControlID().setValue(sdf.format(Calendar.getInstance().getTime()));
		mshSegment.getSendingFacility().getNamespaceID().setValue("OpenMRS");
		mshSegment.getReceivingFacility().getNamespaceID().setValue("IHE");
//		mshSegment.getDateTimeOfMessage().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));


		EVN evnSegment = adt.getEVN();
		evnSegment.getRecordedDateTime().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));
		evnSegment.getEventFacility().getNamespaceID().setValue("OpenMRS");

		PV1 pv1 = adt.getPV1();
		pv1.getPatientClass().setValue("N");

		// Populate the PID Segment
		PID pid = adt.getPID(); 
		pid.getPatientName(0).getFamilyName().getSurname().setValue(patient.getFamilyName());
		pid.getPatientName(0).getGivenName().setValue(patient.getGivenName());
		pid.getPatientName(0).getNameTypeCode().setValue("L");
		pid.getPatientID().getIDNumber().setValue(patient.getPatientId().toString());
		pid.getDateTimeOfBirth().getTime().setValue(patient.getBirthdate().toString());

		CX cx;
		cx = pid.getPatientIdentifierList(0);
		cx.getAssigningAuthority().getNamespaceID().setValue("OPENMRS");
		cx.getIdentifierTypeCode().setValue("QWER");
		cx.getIDNumber().setValue(patient.getId().toString());


		if(patient.getAttribute(1) != null)
			pid.getRace(0).getText().setValue(patient.getAttribute(1).toString());

		if(patient.getAttribute(2) != null)      
			pid.getBirthPlace().setValue(patient.getAttribute(2).toString());

		if(patient.getAttribute(3) != null)
			pid.getCitizenship(0).getText().setValue(patient.getAttribute(3).toString());

		if(patient.getAttribute(4) != null){
			pid.getMotherSMaidenName(0).getGivenName().setValue(patient.getAttribute(3).toString());
			pid.getMotherSMaidenName(0).getNameTypeCode().setValue("L");
		}

		if(patient.getAttribute(5) != null)
			pid.getMaritalStatus().getText().setValue(patient.getAttribute(5).toString());

		Set<PersonAddress> addressSet = patient.getAddresses();
		if(!addressSet.isEmpty()){
			PersonAddress[] addressArray = addressSet.toArray(new PersonAddress[0]);
			pid.getPatientAddress(0).getStreetAddress().getStreetName().setValue(addressArray[0].getAddress1());
			pid.getPatientAddress(0).getCity().setValue(addressArray[0].getCityVillage());
			pid.getPatientAddress(0).getCountry().setValue(addressArray[0].getCountry());
			pid.getPatientAddress(0).getStateOrProvince().setValue(addressArray[0].getStateProvince());
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(addressArray[0].getPostalCode());
		}
		
		return adt;
	}

	public ADT_A08 create_ADT_A08(Patient patient) throws HL7Exception {
		// TODO Auto-generated method stub
		ADT_A08 msg = new ADT_A08();
		return msg;
	}

	public ADT_A31 create_ADT_A31(Patient patient) throws HL7Exception {
		// TODO Auto-generated method stub
		ADT_A31 msg = new ADT_A31();
		return msg;
	}
	
	public ADT_A40 create_ADT_A40(Patient patient) throws HL7Exception {
		// TODO Auto-generated method stub
		ADT_A40 msg = new ADT_A40();
		return msg;
	}

	public QBP_Q22 create_QBP_Q22() throws HL7Exception {
		// TODO Auto-generated method stub
		QBP_Q22 msg = new QBP_Q22();
		return msg;
	}

	public QBP_Q23 create_QBP_Q23() throws HL7Exception {
		// TODO Auto-generated method stub
		QBP_Q23 msg = new QBP_Q23();
		return msg;
	}

	public QCN_J01 create_QCN_J01() throws HL7Exception {
		// TODO Auto-generated method stub
		QCN_J01 msg = new QCN_J01();
		return msg;
	}
	
	public String encodeMessage(AbstractMessage message) throws HL7Exception{
		
		Parser parser = new PipeParser();
		String encodedMessage = parser.encode(message);
		System.out.println(encodedMessage);
		return encodedMessage;
	}

}
