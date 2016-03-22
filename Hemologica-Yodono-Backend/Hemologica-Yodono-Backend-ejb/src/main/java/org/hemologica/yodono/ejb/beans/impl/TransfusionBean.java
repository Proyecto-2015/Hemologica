package org.hemologica.yodono.ejb.beans.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDocument;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import org.hemologica.yodono.ejb.beans.TransfusionBeanLocal;
import org.hemologica.yodono.utils.FactoryBeans;
import org.hemologica.yodono.utils.XMLUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Session Bean implementation class TransfusionBean
 */
@Stateless
@LocalBean
public class TransfusionBean implements TransfusionBeanLocal {

	private static final Logger logger = Logger.getLogger(TransfusionBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	
    public TransfusionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataTransfusion> getTransfusionsUserId(Long userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		
		List<DataTransfusion> listReturn = new ArrayList<>();
		
		List<PersonsRecord> cdasIds = FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(userId);
		
		for(PersonsRecord personsRecord : cdasIds){
			
			String cda = XMLDataBaseFactory.getIXMLDataBaseTransfusions().getElementCDAId(personsRecord.getPersonsRecordCdaRoot(), personsRecord.getPersonsRecordCdaExtension());
			if(cda != null){
				Document document= XMLUtils.stringToDocument(cda);
				DataTransfusion dataDonacion = getDataTransfusion(document);
				listReturn.add(dataDonacion);
			}
		}
		
		return listReturn;
	}
	
private DataTransfusion getDataTransfusion(Document document) throws XPathExpressionException, DOMException, SAXException, IOException, ParserConfigurationException {
		
		DataTransfusion data = new DataTransfusion();
		
		/**
		 * Banco de Sangre e Institucion
		 */
		DataBank dataBank = FactoryBeans.getCenterBean().getBankById(XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root"));
		data.setBank(dataBank);
		data.setInstitution(dataBank.getInstitution());
		
		/**
		 * id Transfusion
		 */
		data.setId(XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@root"));
		
		/**
		 * Id donacion asociada 
		 */
		data.setAssociatedDonation(XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen[descendant-or-self::node()//@code=\"122563008\"]//id//@extension"));
		
		/**
		 * Id bolsa 
		 */
		data.setProductCode(XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen[descendant-or-self::node()//@code=\"122564002\"]//id//@extension"));
		
		
		/**
		 * Responsable
		 */
		
		DataResponsiblePerson dataResponsiblePerson = new DataResponsiblePerson();
		data.setResponsibleTransfusionPerson(dataResponsiblePerson);
		
		dataResponsiblePerson.setFirstName(XMLUtils.executeXPathString(document, "/ClinicalDocument/author/assignedAuthor/assignedPerson/name/given/text()"));
		dataResponsiblePerson.setFirstLastName(XMLUtils.executeXPathString(document, "/ClinicalDocument/author/assignedAuthor/assignedPerson/name/family/text()"));
		
		
		String documentResponsiblePerson = XMLUtils.executeXPathString(document, "/ClinicalDocument/author/assignedAuthor/id/@root");
		
		DataDocument dataDocument = new DataDocument();
		dataResponsiblePerson.setDocuments(dataDocument);
		if(documentResponsiblePerson != null && (!"".equals(documentResponsiblePerson))){
			
			String documentNumber = documentResponsiblePerson.substring(documentResponsiblePerson.lastIndexOf(".")+1, documentResponsiblePerson.length()-1);
			dataDocument.setDocumentNumber(documentNumber);
			
			documentResponsiblePerson = documentResponsiblePerson.substring(0, documentResponsiblePerson.lastIndexOf("."));
			String documentTypeS = documentResponsiblePerson.substring(documentResponsiblePerson.lastIndexOf(".")+1, documentResponsiblePerson.length());
			
			DocumentsTypesCode documentType = FactoryDAO.getCodesDAO(em).getDocumentsTypeByCode(documentTypeS);
			if(documentType != null){
				DataCode documentTypeCode = new DataCode();
				documentTypeCode.setCode(documentType.getDocumentsTypeCodeValue());
				documentTypeCode.setDisplayName(documentType.getDocumentsTypeCodeLabel());
				dataDocument.setDocumentType(documentType.getDocumentsTypeCodeLabel());
			}
			
			documentResponsiblePerson = documentResponsiblePerson.substring(0, documentResponsiblePerson.lastIndexOf("."));
			String documentCountryS = documentResponsiblePerson.substring(documentResponsiblePerson.lastIndexOf(".")+1, documentResponsiblePerson.length());
			
			CountriesCode country = FactoryDAO.getCodesDAO(em).getCountryByCode(documentCountryS);
			if(country != null){
				DataCode countryCode = new DataCode();
				countryCode.setCode(country.getCountryCodeLabel());
				countryCode.setDisplayName(country.getCountryCodeLabel());
				dataDocument.setDocumentCountry(country.getCountryCodeLabel());
			}
			
		}

		/**
		 * Data Person
		 */
		DataPerson dataPerson = this.getDataPersonFromDocument(document);
		data.setPerson(dataPerson);
//		DataPerson dataPerson = new DataPerson();
//		data.setPerson(dataPerson);
//		
//		String genderCode = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code");
//		
//		DataCode gender = FactoryBeans.getCodeBeans().getGenderCodeById(genderCode);
//		dataPerson.setGender(gender);
//		
//		dataPerson.setFirstName(XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/name/given/text()"));
//		dataPerson.setFirstLastName(XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/name/family/text()"));
//		
//		String birthday = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value");
//		SimpleDateFormat sdfAge = new SimpleDateFormat("yyyyMMdd");
//		try {
//			
//			Date dateBir = sdfAge.parse(birthday);
//			Calendar date = Calendar.getInstance();
//			date.setTime(dateBir);
////			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR), date.get(Calendar.MONDAY), date.get(Calendar.DAY_OF_MONTH));
//			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR), date.get(Calendar.MONTH) +1 , date.get(Calendar.DAY_OF_MONTH));
//			LocalDate now = new LocalDate();
//			Years age = Years.yearsBetween(birthdate, now);
//			
//			dataPerson.setAge(String.valueOf(age.getYears()));
//			
//		} catch (ParseException e) {
//			
//			logger.log(Level.SEVERE, "Error al parsear la fecha de nacimiento", e);
//			
//		}
//		String documentPerson = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/id/@root");
//		if(documentPerson != null){
//			
//			String documentNumber = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length()-1);
//			dataPerson.setDocumentNumber(documentNumber);
//			
//			documentPerson = documentPerson.substring(0, documentPerson.lastIndexOf("."));
//			String documentTypeS = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length());
//			
//			DocumentsTypesCode documentType = FactoryDAO.getCodesDAO(em).getDocumentsTypeByCode(documentTypeS);
//			if(documentType != null){
//				DataCode documentTypeCode = new DataCode();
//				documentTypeCode.setCode(documentType.getDocumentsTypeCodeValue());
//				documentTypeCode.setDisplayName(documentType.getDocumentsTypeCodeLabel());
//				dataPerson.setDocumentType(documentTypeCode);
//			}
//			
//			documentPerson = documentPerson.substring(0, documentPerson.lastIndexOf("."));
//			String documentCountryS = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length());
//			
//			CountriesCode country = FactoryDAO.getCodesDAO(em).getCountryByCode(documentCountryS);
//			if(country != null){
//				DataCode countryCode = new DataCode();
//				countryCode.setCode(country.getCountryCodeLabel());
//				countryCode.setDisplayName(country.getCountryCodeLabel());
//				dataPerson.setDocumentType(countryCode);
//			}
//			
//		}

		/**
		 * Fecha 
		 */
		String dateString = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//effectiveTime//low/@value");
		if(dateString != null && !dateString.equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date;
			try {
				date = sdf.parse(dateString);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				data.setDate(sdf2.format(date));
				
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "error al formatear la fecha", e);
				
			}
		}
		
		/**
		 * Components
		 */
		
		List<Document> components = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure");
		if(components!= null && components.size()==1){
			
			Document d = components.get(0);

				/**
				 * Transfusion
				 */	
				
				data.setDataProduct(FactoryBeans.getCodeBeans().getProductBySnomedCode(XMLUtils.executeXPathString(d, "//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code")));
				String v = XMLUtils.executeXPathString(d, "//procedure/entryRelationship/observation/value/@value");
				String vUnit = XMLUtils.executeXPathString(d, "//procedure/entryRelationship/observation/value/@unit");
				data.setVolume(v + " " + vUnit);
				
				
				/**
				 * Eventos adeversos
				 */
				List<DataTransfusionEvent> events = new ArrayList<>();
				List<Document> eventsDoc = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship");
				
				if(eventsDoc != null){
					
					for(Document docEvent : eventsDoc){
												
						String event = XMLUtils.executeXPathString(docEvent, "/entryRelationship/observation/code/@code");
						DataCode dataEvent = FactoryBeans.getCodeBeans().getTransfusionEventBySnomedCode(event);
						
						DataTransfusionEvent dataTransfusionEvent = new DataTransfusionEvent();
						dataTransfusionEvent.setEvent(dataEvent);
						
						String severity = XMLUtils.executeXPathString(docEvent, "/entryRelationship/observation/interpretationCode/@code");
						DataCode dataSeverity = FactoryBeans.getCodeBeans().getSeverityBySnomedCode(severity);
						
						dataTransfusionEvent.setSeverity(dataSeverity);
						
						events.add(dataTransfusionEvent);
						
					}
					data.setEvents(events);
				}

		}
		
		List<Document> componentAnalysis = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/organizer/component");
		
		List<DataLaboratoryResult> laboratoryResultList = new ArrayList<>();
		
		for(Document d : componentAnalysis){
			/**
			 * Analisis pre transfusionales 
			 */
					
			DataLaboratoryResult dataLaboratoryResult = new DataLaboratoryResult();
			dataLaboratoryResult.setAnalysis(FactoryBeans.getCodeBeans().getTransfusionAnalysisBySnomedCode(XMLUtils.executeXPathString(d, "/component/observation/entryRelationship/observation/code/@code")));
			dataLaboratoryResult.setResult(FactoryBeans.getCodeBeans().getResultBySnomedCode(XMLUtils.executeXPathString(d, "/component/observation/entryRelationship/observation/value/@code")));
			
			laboratoryResultList.add(dataLaboratoryResult);

		}
		
		data.setLaboratoryResults(laboratoryResultList);
		
		return data;
	}
	
	private DataTransfusion getDataTransfusion2(Document document) throws XPathExpressionException {
		
		DataTransfusion data = new DataTransfusion();
		
		/**
		 * Banco de Sangre e Institucion
		 */
		DataBank dataBank = FactoryBeans.getCenterBean().getBankById(XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root"));
		data.setBank(dataBank);
		data.setInstitution(dataBank.getInstitution());
			
		/**
		 * Fecha 
		 */
		String dateString = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//effectiveTime//low/@value");
		if(dateString != null && !dateString.equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date;
			try {
				date = sdf.parse(dateString);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				data.setDate(sdf2.format(date));
				
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "error al formatear la fecha", e);
				
			}
		}
		
		/**
		 * Components
		 */
		
		List<Document> components = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component");
		for(Document d : components){
			
			String componentCode = XMLUtils.executeXPathString(d, "/ClinicalDocument/component/structuredBody/component/section/code/@code");

			if(componentCode.equals("54790000") ){
				/**
				 * Transfusion
				 */	
				
				data.setDataProduct(FactoryBeans.getCodeBeans().getProductBySnomedCode(XMLUtils.executeXPathString(d, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code")));
				String v = XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/value/@value");
				String vUnit = XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/value/@unit");
				data.setVolume(v + " " + vUnit);
				
				
				/**
				 * Eventos adeversos
				 */
				List<DataTransfusionEvent> events = new ArrayList<>();
				List<Document> eventsDoc = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship");
				
				if(eventsDoc != null){
					
					for(Document docEvent : eventsDoc){
						
						String event = XMLUtils.executeXPathString(docEvent, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/code/@code");
						DataCode dataEvent = FactoryBeans.getCodeBeans().getTransfusionEventBySnomedCode(event);
						
						DataTransfusionEvent dataTransfusionEvent = new DataTransfusionEvent();
						dataTransfusionEvent.setEvent(dataEvent);
						
						String severity = XMLUtils.executeXPathString(docEvent, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/interpretationCode/@code");
						DataCode dataSeverity = FactoryBeans.getCodeBeans().getSeverityBySnomedCode(severity);
						
						dataTransfusionEvent.setSeverity(dataSeverity);
						
						events.add(dataTransfusionEvent);
						
					}
					data.setEvents(events);
				}
				
				
				
				
			}else if(componentCode.equals("127795003")){ 
				/**
				 * Analisis pre transfusionales - esto es medio trucho.
				 */
				
				List<DataLaboratoryResult> laboratoryResultList = new ArrayList<>();
				List<Document> analysis = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship");
				
				if(analysis != null){
					
					for(Document docAnalysis : analysis){
						
						DataLaboratoryResult dataLaboratoryResult = new DataLaboratoryResult();
						dataLaboratoryResult.setAnalysis(FactoryBeans.getCodeBeans().getTransfusionAnalysisBySnomedCode(XMLUtils.executeXPathString(docAnalysis, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/code/@code")));
						dataLaboratoryResult.setResult(FactoryBeans.getCodeBeans().getResultBySnomedCode(XMLUtils.executeXPathString(docAnalysis, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/value/@code")));
						
						laboratoryResultList.add(dataLaboratoryResult);
					}
				}
				
				data.setLaboratoryResults(laboratoryResultList);
			}
			
		}
		
		return data;
	}
	
	/**
	 * Obtener datos personales del donante 
	 * @param documet CDA 
	 * @return person data
	 * @throws XPathExpressionException 
	 */
	private DataPerson getDataPersonFromDocument(Document document) throws XPathExpressionException {

//		String root = XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root");
//		String extension = XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root");
		
		String root = XMLUtils.executeXPathString(document, "/ClinicalDocument/id/@root");
		String extension = XMLUtils.executeXPathString(document, "/ClinicalDocument/id/@extension");
		PersonsRecord pr = FactoryDAO.getPeronRecordDAO(em).getCDAsRootExtension(root, extension);

		// ACA desencripto
		Identification perId = FactoryDAO.getIIdentificationDAO(em)
				.getIdentificationByCode(CryptoConverter.decrypt(pr.getIdentificationRef()));

		Person p = perId.getPerson();
		DataPerson dp = new DataPerson();
		dp.setFirstName(p.getPersonFirstName());
		dp.setFirstLastName(p.getPersonFirstLastname());

			
		if(p.getDocuments() != null && p.getDocuments().size() != 0){
				
			if(p.getDocuments().get(0).getCountriesCode() != null){
				DataCode documentCountry = new DataCode();
				documentCountry.setCode(p.getDocuments().get(0).getCountriesCode().getCountryCodeValue());
				documentCountry.setDisplayName(p.getDocuments().get(0).getCountriesCode().getCountryCodeLabel());
				dp.setDocumentCountry(documentCountry);
			}
			
			if(p.getDocuments().get(0).getDocumentsTypesCode() != null){
				DataCode documentType = new DataCode();
				documentType.setCode(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeValue());
				documentType.setDisplayName(p.getDocuments().get(0).getDocumentsTypesCode().getDocumentsTypeCodeLabel());
				dp.setDocumentType(documentType);
			}
			
			dp.setDocumentNumber((p.getDocuments().get(0).getDocumentNumber() == null) ? "" :p.getDocuments().get(0).getDocumentNumber());
				
		}

		return dp;

	}
}
