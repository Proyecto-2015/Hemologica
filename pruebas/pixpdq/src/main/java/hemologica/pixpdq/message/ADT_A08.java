package hemologica.pixpdq.message;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

import org.openmrs.Patient;
import org.openmrs.PersonAddress;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.v231.datatype.CX;
import ca.uhn.hl7v2.model.v231.segment.EVN;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.segment.PV1;

public class ADT_A08 extends AbstractMessage{

	private ca.uhn.hl7v2.model.v231.message.ADT_A08 adt;
	private Patient patient;
	
	private static final String MESSAGE_TYPE = "ADT";
	private static final String MESSAGE_STRUCTURE = "ADT_A08";
	private static final String MESSAGE_TRIGGER_EVENT = "A08";
	private static final String MESSAGE_VERSION = "2.3.1";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ADT_A08(Patient patient) throws HL7Exception {
		
		adt = new ca.uhn.hl7v2.model.v231.message.ADT_A08();
		this.patient = patient;
		
		this.createMSH();
		this.createENV();
		this.createPV1();
		PID pid = (PID) this.createPID();
		CX cx = this.createCX(pid);
		

		if (patient.getAttribute(1) != null)
			pid.getRace(0).getText().setValue(patient.getAttribute(1).toString());

		if (patient.getAttribute(2) != null)
			pid.getBirthPlace().setValue(patient.getAttribute(2).toString());

		if (patient.getAttribute(3) != null)
			pid.getCitizenship(0).getText().setValue(patient.getAttribute(3).toString());

		if (patient.getAttribute(4) != null) {
			pid.getMotherSMaidenName(0).getGivenName().setValue(patient.getAttribute(3).toString());
			pid.getMotherSMaidenName(0).getNameTypeCode().setValue("L");
		}

		if (patient.getAttribute(5) != null)
			pid.getMaritalStatus().getText().setValue(patient.getAttribute(5).toString());

		Set<PersonAddress> addressSet = patient.getAddresses();
		if (!addressSet.isEmpty()) {
			PersonAddress[] addressArray = addressSet.toArray(new PersonAddress[0]);
			pid.getPatientAddress(0).getStreetAddress().setValue(addressArray[0].getAddress1());
			pid.getPatientAddress(0).getCity().setValue(addressArray[0].getCityVillage());
			pid.getPatientAddress(0).getCountry().setValue(addressArray[0].getCountry());
			pid.getPatientAddress(0).getStateOrProvince().setValue(addressArray[0].getStateProvince());
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(addressArray[0].getPostalCode());
		}

		this.message = adt;

	}

	@Override
	public AbstractSegment createMSH() throws HL7Exception {

		// Populate the MSH Segment
		MSH mshSegment = adt.getMSH();

		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");
		mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
		mshSegment.getReceivingApplication().getNamespaceID().setValue("PatientManager");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getSequenceNumber().setValue("456");
		mshSegment.getMessageType().getTriggerEvent().setValue(ADT_A08.MESSAGE_TRIGGER_EVENT);
		mshSegment.getMessageType().getMessageStructure().setValue(ADT_A08.MESSAGE_STRUCTURE);
		mshSegment.getMessageType().getMessageType().setValue(ADT_A08.MESSAGE_TYPE);
		mshSegment.getVersionID().getVersionID().setValue(ADT_A08.MESSAGE_VERSION);
		mshSegment.getMessageControlID().setValue(sdf.format(Calendar.getInstance().getTime()));
		mshSegment.getSendingFacility().getNamespaceID().setValue("OpenMRS");
		mshSegment.getReceivingFacility().getNamespaceID().setValue("IHE");
		mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(sdf.format(Calendar.getInstance().getTime()));

		return mshSegment;
	}

	@Override
	public AbstractSegment createENV() throws HL7Exception {

		EVN evnSegment = adt.getEVN();
		evnSegment.getRecordedDateTime().getTimeOfAnEvent().setValue(sdf.format(Calendar.getInstance().getTime()));
		evnSegment.getEventTypeCode().setValue("OpenMRS");
		return evnSegment;
	}

	@Override
	public AbstractSegment createPV1() throws HL7Exception {

		PV1 pv1 = adt.getPV1();
		pv1.getPatientClass().setValue("N");
		return pv1;
	}

	@Override
	public AbstractSegment createPID() throws HL7Exception {

		// Populate the PID Segment
		PID pid = adt.getPID();
		pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(patient.getFamilyName());
		pid.getPatientName(0).getGivenName().setValue(patient.getGivenName());
		pid.getPatientName(0).getNameTypeCode().setValue("L");
		return pid;
	}
	
	public CX createCX(PID pid)  throws HL7Exception{
		
		CX cx;
		cx = pid.getPatientIdentifierList(0);
		cx.getAssigningAuthority().getNamespaceID().setValue("OPENMRS");
		cx.getIdentifierTypeCode().setValue("QWER");
		cx.getID().setValue(patient.getId().toString());
		return cx;
	}

}
