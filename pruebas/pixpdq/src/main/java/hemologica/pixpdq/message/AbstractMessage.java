package hemologica.pixpdq.message;

import java.text.SimpleDateFormat;
import java.util.Locale;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;


public abstract class AbstractMessage {

	protected ca.uhn.hl7v2.model.AbstractMessage message;
	protected static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
	
	public abstract AbstractSegment createMSH() throws HL7Exception;
	public abstract AbstractSegment createENV() throws HL7Exception;
	public abstract AbstractSegment createPV1() throws HL7Exception;
	public abstract AbstractSegment createPID() throws HL7Exception;
	
	
	public String encode(int flag) throws HL7Exception{
	
		String encodedMessage;
		Parser parser;

		if(flag==1){
			parser = new DefaultXMLParser();
		}else{
			parser = new PipeParser();
		}
		
		encodedMessage = parser.encode(message);
		System.out.println(encodedMessage);
		return encodedMessage;
	}
	
}
