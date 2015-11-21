package org.hemologica.service.datatype;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.util.logging.Logger;
import org.hemologica.empi.datatypes.Identifier;
import org.hemologica.service.utils.xml.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CDA {

	private static final Logger logger = Logger.getLogger(CDA.class.getName());

	private Document document;
	private Element documentHeader;
	private Element documentBody;
	private Map<String, String> userData;
	private List<Identifier> identifiers;
	private Identifier identifier;

	public CDA(Document document) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		this.document = document;
		splitHeaderBody();
		loadUserData();
	}

	public void splitHeaderBody() throws ParserConfigurationException, SAXException, IOException, TransformerException {

		NodeList nodes = document.getElementsByTagName("component");
		documentBody = (Element) nodes.item(0);
		documentHeader = XMLUtils.cloneDocument(document).getDocumentElement();
		documentHeader.removeChild(documentBody);

	}

	public void loadUserData() {

		userData = new HashMap<String, String>();

		Element patientElem = (Element) documentHeader.getElementsByTagName("patient").item(0);

		// obtener los nombres y apellidos
		Element patientName = (Element) patientElem.getElementsByTagName("name").item(0);

		NodeList nodes = patientName.getElementsByTagName("given");
		userData.put("primerNombre", nodes.item(0).getNodeValue());
		if (nodes.getLength() > 1) {
			userData.put("segundoNombre", nodes.item(0).getNodeValue());
		}
		nodes = patientName.getElementsByTagName("family");
		userData.put("primerApellido", nodes.item(0).getNodeValue());
		if (nodes.getLength() > 1) {
			userData.put("segundoApellido", nodes.item(0).getNodeValue());
		}

		// obtener identificador
		nodes = patientElem.getElementsByTagName("id");
		if (nodes != null && nodes.getLength() > 0) {
			userData.put("patientIdentifier", nodes.item(0).getNodeValue());
		}

		// obtener fecha de nacimiento
		nodes = patientElem.getElementsByTagName("birthTime");
		if (nodes != null && nodes.getLength() > 0) {
			userData.put("birthday", nodes.item(0).getNodeValue());
		}

		// obtener sexo
		nodes = patientElem.getElementsByTagName("administrativeGenderCode");
		if (nodes != null && nodes.getLength() > 0) {
			userData.put("sex", nodes.item(0).getAttributes().getNamedItem("code").getNodeValue());
		}

		// obtener lugar de nacimiento
		nodes = patientElem.getElementsByTagName("birthPlace");
		if (nodes != null && nodes.getLength() > 0) {
			userData.put("birthdayPlace", nodes.item(0).getNodeValue());
		}
		
		
		// obtener datos de contacto
		nodes = patientElem.getElementsByTagName("telecom");
		Element elem;
		for(int i = 0; i < nodes.getLength(); ++i){
			elem = (Element) nodes.item(i);
			
			//obtener telefono
			if(elem.getAttribute("value").startsWith("tel:")){
				userData.put("phone", elem.getAttribute("value").replaceAll("tel:", ""));
			
			} //obtener mail
			else if(elem.getAttribute("value").startsWith("mailto:")){

				userData.put("email", elem.getAttribute("value").replaceAll("mailto", ""));
			}
		}

	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Element getDocumentHeader() {
		return documentHeader;
	}

	public void setDocumentHeader(Element documentHeader) {
		this.documentHeader = documentHeader;
	}

	public Element getDocumentBody() {
		return documentBody;
	}

	public void setDocumentBody(Element documentBody) {
		this.documentBody = documentBody;
	}

	public Map<String, String> getUserData() {
		return userData;
	}

	public void setUserData(Map<String, String> userData) {
		this.userData = userData;
	}

	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

}
