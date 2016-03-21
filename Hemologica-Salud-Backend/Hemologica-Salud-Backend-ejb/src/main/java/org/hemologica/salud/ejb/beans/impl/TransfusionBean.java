package org.hemologica.salud.ejb.beans.impl;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.constants.Constants;
import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.SearchFilterCode;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDocument;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.TransfusionBeanLocal;
import org.hemologica.salud.ejb.cdas.ClinicalDocumentType;
import org.hemologica.salud.ejb.cdas.CodeType;
import org.hemologica.salud.ejb.cdas.ComponentType;
import org.hemologica.salud.ejb.utils.CdaUtils;
import org.hemologica.salud.ejb.utils.FactoryBeans;
import org.hemologica.salud.ejb.utils.XMLUtils;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@Stateless
@LocalBean
public class TransfusionBean implements TransfusionBeanLocal, Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(TransfusionBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
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
		if(documentResponsiblePerson != null){
			
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
			//String procedure = XMLUtils.executeXPathString(document,"/ClinicalDocument/component/structuredBody/component/section/entry/procedure");
			
			//String componentCode = XMLUtils.executeXPathString(d, "/component/section/code/@code");

//			if(componentCode.equals("54790000") ){
				/**
				 * Transfusion
				 */	
				
				data.setDataProduct(FactoryBeans.getCodeBeans().getProductBySnomedCode(XMLUtils.executeXPathString(d, "//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code")));
				String v = XMLUtils.executeXPathString(d, "/procedure/entryRelationship/observation/value/@value");
				String vUnit = XMLUtils.executeXPathString(d, "/procedure/entryRelationship/observation/value/@unit");
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

	@Override
	public DataResponse addTransfusion(DataTransfusion dataTransfusion) {
		
		DataResponse dataResponse = new DataResponse();
		
		/**
		 *  Devuelve el documentos con las partes que son comunes a todos los cdas.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		ClinicalDocumentType clinicalDocumentType = CdaUtils.getCDAStructure(dataTransfusion.getPerson(),dataTransfusion.getTime(),dataTransfusion.getBank(),dataTransfusion.getResponsibleTransfusionPerson());
		
		/**
		 * CODIGO del Documento y Titulo -- Donacion.
		 */
		CodeType codeType = new CodeType();
		codeType.setCode(Constants.DOCUMENT_CODE_TRANSFUSION);
		clinicalDocumentType.setCode(codeType);	
		clinicalDocumentType.setTitle("Transfusion de sangre");
		
		/**
		 * Devuelve el componente con los datos de la donacion.
		 */
		ComponentType componentType = CdaUtils.getComponentTransfusion(dataTransfusion,em);
		clinicalDocumentType.setComponent(componentType);
		
		try {

			File file = new File(Constants.CDA_PATH +"/"+ clinicalDocumentType.getId().getRoot()+"."+clinicalDocumentType.getId().getExtension()+ ".xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocumentType.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(clinicalDocumentType, file);
			jaxbMarshaller.marshal(clinicalDocumentType, System.out);
			
			dataResponse.setCode(0);
			
		} catch (JAXBException e) {
			
			logger.log(Level.SEVERE, "Error al guardar el documento en el sistema de archivos", e);
			dataResponse.setCode(1);
			
		}
		
		return dataResponse;
	}

	@Override
	public DataTransfusion getDataTransfusionSpecimenId(String code, String institutionCode) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, DOMException {
		
		try {
			
			String cda = XMLDataBaseFactory.getIXMLDataBaseTransfusions().getTransfusionCDABySpecimenId(institutionCode,code);
			if(cda!= null && !cda.equals("")){
				Document document= XMLUtils.stringToDocument(cda);
				return getDataTransfusion(document);
				
			}
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al recuperar el documento de la base de datos xml", e);
		}
		
		return new DataTransfusion();
	}

	@Override
	public List<DataTransfusion> getTransfusionsFilters(List<DataSearchFilter> filters) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, DOMException {
		
		List<String> queries = new ArrayList<>();
		
		for(DataSearchFilter filter :filters){
			
			if(filter.getValueString() != null && !filter.getValueString().equals("")){
				
				SearchFilterCode search = FactoryDAO.getCodesDAO(em).getSearchFilterByCode(filter.getCode());
				if(search != null){
				
					String query = search.getSearchFilterCodesPath() + "/contains(.,'"+ filter.getValueString() +"')";
					queries.add(query);
				}
			}
		}
		
		List<DataTransfusion> listReturn = new ArrayList<>();
		List<String> cdas;
		try {
			cdas = XMLDataBaseFactory.getIXMLDataBaseTransfusions().getElements(queries);
			
			if(cdas != null && cdas.size() != 0){
				for(String cda : cdas){
				
					Document document= XMLUtils.stringToDocument(cda);
					DataTransfusion dataDonacion = getDataTransfusion(document);
					listReturn.add(dataDonacion);
				}
			}
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al procesar loss documentos cda ", e);
		}

		return listReturn;
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

		String genderCode = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code");
		
		DataCode gender = FactoryBeans.getCodeBeans().getGenderCodeById(genderCode);
		dp.setGender(gender);

		String birthday = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value");
		SimpleDateFormat sdfAge = new SimpleDateFormat("yyyyMMdd");
		try {
			
			Date dateBir = sdfAge.parse(birthday);
			Calendar date = Calendar.getInstance();
			date.setTime(dateBir);
//			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR), date.get(Calendar.MONDAY), date.get(Calendar.DAY_OF_MONTH));
			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR), date.get(Calendar.MONTH) +1 , date.get(Calendar.DAY_OF_MONTH));
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			
			dp.setAge(String.valueOf(age.getYears()));
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha de nacimiento", e);
			
		}
		
		return dp;

	}
	
}
