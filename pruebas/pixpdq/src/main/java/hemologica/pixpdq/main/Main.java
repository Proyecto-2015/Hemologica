package hemologica.pixpdq.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.QBP_Q21;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.QPD;

public final class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
		
		try {
			
			QBP_Q21 query = new QBP_Q21();
			MSH mshSegment = query.getMSH();
			
			mshSegment.getFieldSeparator().setValue("|");
			mshSegment.getEncodingCharacters().setValue("^~\\&");

			mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
			mshSegment.getSendingFacility().getNamespaceID().setValue("OpenMRS");
			mshSegment.getReceivingApplication().getNamespaceID().setValue("PatientManager");
			mshSegment.getReceivingFacility().getNamespaceID().setValue("IHE");
			
			mshSegment.getProcessingID().getProcessingID().setValue("P");
			mshSegment.getSequenceNumber().setValue("456");
			mshSegment.getMessageType().getTriggerEvent().setValue("Q21");
			mshSegment.getMessageType().getMessageStructure().setValue("QBP_Q21");
			mshSegment.getMessageType().getMessageCode().setValue("QBP");
			mshSegment.getVersionID().getVersionID().setValue("2.5");
			mshSegment.getMessageControlID().setValue(sdf.format(Calendar.getInstance().getTime()));
			mshSegment.getDateTimeOfMessage().setValue(sdf.format(Calendar.getInstance().getTime()));
			
			QPD qpdSegment = query.getQPD();
	
			query.getRCP();
			
			
		} catch (HL7Exception e) {
			e.printStackTrace();
		}

	}

}
