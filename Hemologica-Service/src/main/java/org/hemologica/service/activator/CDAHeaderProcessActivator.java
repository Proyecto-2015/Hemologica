package org.hemologica.service.activator;

import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class CDAHeaderProcessActivator {

	public String process(Document cda) throws TransformerException{
		
		DOMSource domSource = new DOMSource(cda);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		String msg = writer.toString();
		System.out.println("#########################");
		System.out.println(msg);
		System.out.println("#########################");
		return msg;
		
	}
}
