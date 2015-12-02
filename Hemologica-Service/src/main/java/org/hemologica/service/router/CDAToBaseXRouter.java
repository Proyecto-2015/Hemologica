package org.hemologica.service.router;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.service.utils.xml.XMLUtils;
import org.springframework.integration.router.AbstractMappingMessageRouter;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CDAToBaseXRouter extends AbstractMessageRouter{

	public String route(Message<?> arg0){

		String cda = (String)arg0.getPayload();
		try {
			
			Document cdaDoc = XMLUtils.stringToDocument(cda);
			String value = XMLUtils.executeXPathString(cdaDoc, "/ClinicalDocument/code/@code");
			System.out.println("Route to: "+ value);
			
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
		
		Collection<MessageChannel> ret = new ArrayList<MessageChannel>();
		String cda = (String)message.getPayload();
		try {
			
			Document cdaDoc = XMLUtils.stringToDocument(cda);
			String value = XMLUtils.executeXPathString(cdaDoc, "/ClinicalDocument/code/@code");
			System.out.println("Route to: "+ value);
			switch (value) {
			case "4321000179102":
				ret.add(this.getChannelResolver().resolveDestination("inBasexTransfusionOut"));
				break;
			case "4321000179101":
				ret.add(this.getChannelResolver().resolveDestination("inBasexDonationOut"));
				break;
			case "4321000179103":
				ret.add(this.getChannelResolver().resolveDestination("inBasexLaboratoryOut"));
				break;
			}
			return ret;
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
