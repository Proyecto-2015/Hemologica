package org.hemologica.service.datatype;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hemologica.empi.datatypes.Identifier;
import org.hemologica.service.utils.xml.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CDA {

	private static final Logger logger = Logger.getLogger(CDA.class.getName());

	private Document document;
	private Map<String, String> userData;
	private List<Identifier> identifiers;
	private Identifier identifier;
	private String patientIdentifier;
	private String authorPerson;
	private String authorInstitution;
	private String authorRole;
	private String codingSchemeLOINCId;
	private String codingSchemeLOINCname;
	private String codingSchemeSNOMEDCTId;
	private String codingSchemeSNOMEDCTName;
	private String languageCode;
	private String PID5;
	private String PID7;
	private String PID8;
	private String cdaID;
	private String cdaDocumentType;
	private String cda;
	private String submissionTime;
	private String root;
	private String extension;
	
	
	/**
	 * Remove personal data from CDA
	 * @param cda
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	public static String anonymize(String cda) throws SAXException, IOException, ParserConfigurationException, TransformerException{
		
		Document doc = XMLUtils.stringToDocument(cda);
		Node patient = doc.getElementsByTagName("patient").item(0);
		
		NodeList list = patient.getChildNodes();
		Node n = null;
		for(int i = 0; i < list.getLength(); ++i){
			
			n = list.item(i);
			if( n.getNodeName().equals("name") ||
				n.getNodeName().equals("id")
					){
				patient.removeChild(n);
			}
			
		}
		list = patient.getParentNode().getChildNodes();
		n = null;
		for(int i = 0; i < list.getLength(); ++i){
			
			n = list.item(i);
			if( n.getNodeName().equals("telecom")){
				patient.getParentNode().removeChild(n);
			}
			
		}

		String ret = XMLUtils.documentToString(doc);
		return ret;
	}

	public CDA(Document document) throws ParserConfigurationException, SAXException, IOException, TransformerException,
			XPathExpressionException {
		this.document = document;
		
		this.setRoot(XMLUtils.executeXPathString(this.document, "/ClinicalDocument/id/@root"));
		this.setExtension(XMLUtils.executeXPathString(this.document, "/ClinicalDocument/id/@extension"));
		loadUserData();
		// loadXDSData();
	}

	public void loadUserData() {

		userData = new HashMap<String, String>();

		try {
			
			 
			patientIdentifier = XMLUtils.executeXPathString(this.document, "/ClinicalDocument/recordTarget/patientRole/patient/@id");
						
			userData.put("patientIdentifier", patientIdentifier);
			
			Element patientElem = (Element) document.getElementsByTagName("patient").item(0);

			// obtener los nombres y apellidos
			Element patientName = (Element) patientElem.getElementsByTagName("name").item(0);

			NodeList nodes = patientName.getElementsByTagName("given");
			userData.put("name", nodes.item(0).getTextContent());
			if (nodes.getLength() > 1) {
				userData.put("secondName", nodes.item(1).getTextContent());
			}
			nodes = patientName.getElementsByTagName("family");
			userData.put("surname", nodes.item(0).getTextContent());
			if (nodes.getLength() > 1) {
				userData.put("secondSurname", nodes.item(1).getTextContent());
			}

			// obtener identificador
			nodes = patientElem.getElementsByTagName("id");
			if (nodes != null && nodes.getLength() > 0) {
				String id = nodes.item(0).getAttributes().getNamedItem("root").getTextContent();
				userData.put("patientIdentifier", id);
			}

			// obtener fecha de nacimiento
			nodes = patientElem.getElementsByTagName("birthTime");
			if (nodes != null && nodes.getLength() > 0) {
				userData.put("birthday", nodes.item(0).getAttributes().getNamedItem("value").getTextContent());
			}

			// obtener sexo
			nodes = patientElem.getElementsByTagName("administrativeGenderCode");
			if (nodes != null && nodes.getLength() > 0) {
				userData.put("sex", nodes.item(0).getAttributes().getNamedItem("code").getTextContent());
			}

			// obtener lugar de nacimiento
			nodes = patientElem.getElementsByTagName("birthPlace");
			if (nodes != null && nodes.getLength() > 0) {
				userData.put("birthdayPlace", nodes.item(0).getTextContent());
			}

			// obtener datos de contacto
			nodes = ((Element)patientElem.getParentNode()).getElementsByTagName("telecom");
			Element elem;
			for (int i = 0; i < nodes.getLength(); ++i) {
				elem = (Element) nodes.item(i);

				// obtener telefono
				if (elem.getAttribute("value").startsWith("tel:")) {
					userData.put("phone", elem.getAttribute("value").replaceAll("tel:", ""));

				} // obtener mail
				else if (elem.getAttribute("value").startsWith("mailto:")) {

					userData.put("email", elem.getAttribute("value").replaceAll("mailto:", ""));
				}
			}

		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}

	}

	
	
	public void loadXDSData() throws TransformerException, XPathExpressionException {

		// author
		String inst = "/ClinicalDocument/author/assignedAuthor/representedOrganization/";
		authorInstitution = XMLUtils.executeXPathString(document, inst + "name") + "^^^^^^^^^"
				+ XMLUtils.executeXPathString(document, inst + "id/@root");
		String person = "/ClinicalDocument/author/";
		authorPerson = XMLUtils.executeXPathString(document, person + "id/@extension") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/family[1]") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/family[2]") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/given[1]") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/given[2]") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/suffix") + "^"
				+ XMLUtils.executeXPathString(document, person + "assignedPerson/name/prefix") + "^^^^&"
				+ XMLUtils.executeXPathString(document, person + "id/@root") + "&ISO";

		authorRole = XMLUtils.executeXPathString(document, "/ClincicalDocument/author/participationFunction");

		// coding LOINC
		codingSchemeLOINCId = XMLUtils.executeXPathString(document, "/ClinicalDocument/code/@code");
		codingSchemeLOINCname = XMLUtils.executeXPathString(document, "/ClinicalDocument/code/@displayName");

		// coding SNOMED
		codingSchemeSNOMEDCTId = XMLUtils.executeXPathString(document,
				"/ClinicalDocument/component/structuredBody/component/section/entry/procedure/code/@code");
		codingSchemeSNOMEDCTName = XMLUtils.executeXPathString(document,
				"/ClinicalDocument/component/structuredBody/component/section/entry/procedure/code/@displayName");

		// pid
		person = "/ClinicalDocument/recordTarget/patientRole/patient/name/";
		PID5 = XMLUtils.executeXPathString(document, person + "family[1]") + "^"
				+ XMLUtils.executeXPathString(document, person + "family[2]") + "^"
				+ XMLUtils.executeXPathString(document, person + "given[1]") + "^"
				+ XMLUtils.executeXPathString(document, person + "given[2]") + "^"
				+ XMLUtils.executeXPathString(document, person + "suffix") + "^"
				+ XMLUtils.executeXPathString(document, person + "prefix");

		PID7 = XMLUtils.executeXPathString(document,
				"/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value");
		PID8 = XMLUtils.executeXPathString(document,
				"/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code");

		// language
		languageCode = XMLUtils.executeXPathString(document, "/ClinicalDocument/languageCode/@code");

		// submissionTime
		submissionTime = XMLUtils.executeXPathString(document, "/ClinicalDocument/effectiveTime/@value");

		// cda
		cda = XMLUtils.documentToString(document);
		cdaID = UUID.randomUUID().toString();

	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Element getDocumentHeader() {

		Element documentHeader;
		try {
			documentHeader = XMLUtils.cloneDocument(document).getDocumentElement();
			NodeList nodes = documentHeader.getElementsByTagName("component");
			Element documentBody = (Element) nodes.item(0);
			documentHeader.removeChild(documentBody);
			return documentHeader;

		} catch (SAXException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (ParserConfigurationException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} catch (TransformerException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;

	}

	public Element getDocumentBody() {
		NodeList nodes = document.getElementsByTagName("component");
		return (Element) nodes.item(0);

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

	public String getAuthorPerson() {
		return authorPerson;
	}

	public void setAuthorPerson(String authorPerson) {
		this.authorPerson = authorPerson;
	}

	public String getAuthorInstitution() {
		return authorInstitution;
	}

	public void setAuthorInstitution(String authorInstitution) {
		this.authorInstitution = authorInstitution;
	}

	public String getAuthorRole() {
		return authorRole;
	}

	public void setAuthorRole(String authorRole) {
		this.authorRole = authorRole;
	}

	public String getCodingSchemeLOINCId() {
		return codingSchemeLOINCId;
	}

	public void setCodingSchemeLOINCId(String codingSchemeLOINCId) {
		this.codingSchemeLOINCId = codingSchemeLOINCId;
	}

	public String getCodingSchemeLOINCname() {
		return codingSchemeLOINCname;
	}

	public void setCodingSchemeLOINCname(String codingSchemeLOINCname) {
		this.codingSchemeLOINCname = codingSchemeLOINCname;
	}

	public String getCodingSchemeSNOMEDCTId() {
		return codingSchemeSNOMEDCTId;
	}

	public void setCodingSchemeSNOMEDCTId(String codingSchemeSNOMEDCTId) {
		this.codingSchemeSNOMEDCTId = codingSchemeSNOMEDCTId;
	}

	public String getCodingSchemeSNOMEDCTName() {
		return codingSchemeSNOMEDCTName;
	}

	public void setCodingSchemeSNOMEDCTName(String codingSchemeSNOMEDCTName) {
		this.codingSchemeSNOMEDCTName = codingSchemeSNOMEDCTName;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getPID5() {
		return PID5;
	}

	public void setPID5(String pID5) {
		PID5 = pID5;
	}

	public String getPID7() {
		return PID7;
	}

	public void setPID7(String pID7) {
		PID7 = pID7;
	}

	public String getPID8() {
		return PID8;
	}

	public void setPID8(String pID8) {
		PID8 = pID8;
	}

	public String getCdaID() {
		return cdaID;
	}

	public void setCdaID(String cdaID) {
		this.cdaID = cdaID;
	}

	public String getCdaDocumentType() {
		return cdaDocumentType;
	}

	public void setCdaDocumentType(String cdaDocumentType) {
		this.cdaDocumentType = cdaDocumentType;
	}

	public String getCda() {
		return cda;
	}

	public void setCda(String cda) {
		this.cda = cda;
	}

	public String getSubmissionTime() {
		return submissionTime;
	}

	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}

	public String getPatientIdentifier() {
		return patientIdentifier;
	}

	public void setPatientIdentifier(String patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
