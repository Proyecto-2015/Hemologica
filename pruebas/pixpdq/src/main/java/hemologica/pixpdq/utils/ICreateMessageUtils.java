package hemologica.pixpdq.utils;

import hemologica.pixpdq.message.QBP_Q22;
import hemologica.pixpdq.message.QBP_Q23;

import org.openmrs.Patient;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.v231.message.ADT_A01;
import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A31;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v26.message.QCN_J01;




public interface ICreateMessageUtils{
	
	public ADT_A01 create_ADT_A01(Patient patient) throws HL7Exception; /* PIX */
	public ADT_A04 create_ADT_A04(Patient patient) throws HL7Exception; /* PIX */
	public ADT_A08 create_ADT_A08(Patient patient) throws HL7Exception; /* PIX */
	public ADT_A31 create_ADT_A31(Patient patient) throws HL7Exception; /* PIX */
	public ADT_A40 create_ADT_A40(Patient patient) throws HL7Exception; /* PIX */
	public QBP_Q22 create_QBP_Q22() throws HL7Exception; /* PDQ */
	public QBP_Q23 create_QBP_Q23() throws HL7Exception; /* PIX */
	public QCN_J01 create_QCN_J01() throws HL7Exception; /* PDQ */
	
	public String encodeMessage(AbstractMessage message) throws HL7Exception;

	

}
