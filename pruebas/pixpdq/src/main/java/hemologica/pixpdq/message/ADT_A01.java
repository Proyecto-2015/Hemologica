package hemologica.pixpdq.message;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

import org.openmrs.Patient;
import org.openmrs.PersonAddress;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v25.segment.EVN;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;

public class ADT_A01 extends AbstractMessage{

	private ca.uhn.hl7v2.model.v25.message.ADT_A01 adt;
	private Patient patient;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
	
	public ADT_A01(Patient patient) throws HL7Exception {

		this.patient = patient;

		this.createMSH();
		this.createENV();
		this.createPV1();
		PID pid = (PID) this.createPID(); 
		

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
			pid.getPatientAddress(0).getStreetAddress().getStreetName().setValue(addressArray[0].getAddress1());
			pid.getPatientAddress(0).getCity().setValue(addressArray[0].getCityVillage());
			pid.getPatientAddress(0).getCountry().setValue(addressArray[0].getCountry());
			pid.getPatientAddress(0).getStateOrProvince().setValue(addressArray[0].getStateProvince());
			pid.getPatientAddress(0).getZipOrPostalCode().setValue(addressArray[0].getPostalCode());
		}
		
		this.message = adt;

	}



	@Override
	public AbstractSegment createMSH() throws HL7Exception{

		MSH mshSegment = adt.getMSH();
		mshSegment.getFieldSeparator().setValue("|");
		mshSegment.getEncodingCharacters().setValue("^~\\&");
		mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
		mshSegment.getReceivingApplication().getNamespaceID().setValue("PatientManager");
		mshSegment.getProcessingID().getProcessingID().setValue("P");
		mshSegment.getSequenceNumber().setValue("456");
		mshSegment.getMessageType().getTriggerEvent().setValue("A01");
		mshSegment.getMessageType().getMessageStructure().setValue("ADT_A01");
		mshSegment.getMessageType().getMessageCode().setValue("ADT");
		mshSegment.getVersionID().getVersionID().setValue("2.5");
		mshSegment.getMessageControlID().setValue(sdf.format(Calendar.getInstance().getTime()));
		mshSegment.getSendingFacility().getNamespaceID().setValue("OpenMRS");
		mshSegment.getReceivingFacility().getNamespaceID().setValue("IHE");
		mshSegment.getDateTimeOfMessage().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));
		return mshSegment;
	}



	@Override
	public AbstractSegment createENV() throws HL7Exception{
		
		EVN evnSegment = adt.getEVN();
		evnSegment.getRecordedDateTime().getTime().setValue(sdf.format(Calendar.getInstance().getTime()));
		evnSegment.getEventFacility().getNamespaceID().setValue("OpenMRS");
		return evnSegment;
	}



	@Override
	public AbstractSegment createPV1() throws HL7Exception{

		PV1 pv1 = adt.getPV1();
		pv1.getPatientClass().setValue("N");
		return pv1;
	}



	@Override
	public AbstractSegment createPID() throws HL7Exception{
		
		PID pid = adt.getPID();
		pid.getPatientName(0).getFamilyName().getSurname().setValue(patient.getFamilyName());
		pid.getPatientName(0).getGivenName().setValue(patient.getGivenName());
		pid.getPatientName(0).getNameTypeCode().setValue("L");
		return pid;
	}



	public CX createCX(PID pid) throws HL7Exception{
		
		CX cx;
		cx = pid.getPatientIdentifierList(0);
		cx.getAssigningAuthority().getNamespaceID().setValue("OPENMRS");
		cx.getIdentifierTypeCode().setValue("QWER");
		cx.getIDNumber().setValue(patient.getId().toString());
		return cx;
	}

}
