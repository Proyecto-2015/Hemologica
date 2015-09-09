package org.hemologica.empi.adapter.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.ExtraComponents;
import ca.uhn.hl7v2.model.GenericComposite;
import ca.uhn.hl7v2.model.GenericPrimitive;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v25.message.QBP_Q21;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.QPD;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.util.Terser;

public class UtilTest {

	@Test
	public void testQuery() {

//		String msg_string = "MSH|^~\\&|NIST_SENDER^^|NIST^^|NIST_RECEIVER^^|NIST^^|20101101161157||QBP^Q23^QBP_Q21|NIST-101101161157166|P|2.5\r\nQPD|IHE PIX Query|QRY1248968460880|HEMO-111^^^HEMOLOGICA\r\nRCP|I";

//		PipeParser parser = new PipeParser();

//		try {
			
//			Map<String, String> context = new HashMap<String, String>();
//			context.put("sendingApplication", "HEMOLOGICA_SEND");
//			context.put("sendingFacility", "HEMOLOGICA");
//			context.put("receivingApplication", "EMPI_RECEIVE");
//			context.put("receivingFacility", "EMPI");
//			context.put("aa_namespace", "HEMOLOGICA");
//			context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
//			context.put("aa_universal_id_type", "OID");
//			
//			Map<String, String> values = new HashMap<String, String>();
//			values.put("identifier", "HEMO-111");
//			values.put("domain", "HEMOLOGICA");
//			
//			QBP_Q21 msg = new QBP_Q21();
//			
//			// MSH
//			msg.initQuickstart("QBP", "Q23", context.get("processingId"));
//			MSH msh = msg.getMSH();
//			msh.getMsh3_SendingApplication().getNamespaceID().setValue(context.get("sendingApplication"));
//			msh.getMsh4_SendingFacility().getNamespaceID().setValue(context.get("sendingFacility"));
//			msh.getMsh5_ReceivingApplication().getNamespaceID().setValue(context.get("receivingApplication"));
//			msh.getMsh6_ReceivingFacility().getNamespaceID().setValue(context.get("receivingFacility"));
//			msh.getMsh13_SequenceNumber().setValue("123");
//
//			// QPD
//			QPD qpd = msg.getQPD();
//			Varies varies = qpd.getQpd3_UserParametersInsuccessivefields();
//			GenericComposite elem = new GenericComposite(msg);
//			Type[] items = elem.getComponents();
//			
//			Varies identifierVaries = (Varies) items[0];
//			Varies domainVaries = (Varies) items[3];
//			GenericPrimitive identifierData = (GenericPrimitive) identifierVaries.getData();
//			identifierData.setValue(values.get("identifier"));
//			GenericPrimitive domainData = (GenericPrimitive) domainVaries.getData();
//			domainData.setValue(values.get("domain"));
//			varies.setData(elem);
//			
//			
//			String result = parser.encode(msg);
//
//		} catch (HL7Exception e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
