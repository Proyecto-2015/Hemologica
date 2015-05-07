package hemologica.pixpdq.utils;

import hemologica.pixpdq.message.QBP_Q22;
import hemologica.pixpdq.message.QBP_Q23;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A31;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v25.segment.EVN;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.message.QCN_J01;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;

public interface ICreateMessageUtils{
	
	public ADT_A01 create_ADT_A01(); /* PIX */
	public ADT_A04 create_ADT_A04(); /* PIX */
	public ADT_A08 create_ADT_A08(); /* PIX */
	public ADT_A31 create_ADT_A31(); /* PIX */
	public ADT_A40 create_ADT_A40(); /* PIX */
	public QBP_Q22 create_QBP_Q22(); /* PDQ */
	public QBP_Q23 create_QBP_Q23(); /* PIX */
	public QCN_J01 create_QCN_J01(); /* PDQ */
	

}
