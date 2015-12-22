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
import org.hemologica.dao.enums.DataDonationStateEnum;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.GenderCode;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.SearchFilterCode;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.DonationBeanLocal;
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
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@Stateless
@LocalBean
public class DonationBean implements DonationBeanLocal, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(DonationBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public DonationBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataDonation> getDonationsUserId(Long userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		
		List<DataDonation> listReturn = new ArrayList<>();
		
		List<PersonsRecord> cdasIds = FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(userId);
		
		for(PersonsRecord personsRecord : cdasIds){
			
			String cda = XMLDataBaseFactory.getIXMLDataBaseDonations().getElementCDAId(personsRecord.getPersonsRecordCdaRoot(), personsRecord.getPersonsRecordCdaExtension());
			if(cda != null){
				
				Document document= XMLUtils.stringToDocument(cda);
				DataDonation dataDonacion = getDataDonation(document);
				listReturn.add(dataDonacion);
			}
		}
		
		return listReturn;
	}

	private DataDonation getDataDonation(Document document) throws XPathExpressionException, XMLDataBaseException, SAXException, IOException, ParserConfigurationException {
		
		DataDonation data = new DataDonation();
		
		/**
		 * id Donacion
		 */
		data.setId(XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@root"));
		
		/**
		 * Banco de Sangre e Institucion
		 */
		DataBank dataBank = FactoryBeans.getCenterBean().getBankById(XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root"));
		data.setBank(dataBank);
		data.setInstitution(dataBank.getInstitution());
		
		/**
		 * Tipo Donante -- No se como ponerlo.
		 */
//		data.setDataDonorType(dataDonorType);
		
		/**
		 * Data Person
		 */
		DataPerson dataPerson = new DataPerson();
		data.setPerson(dataPerson);
		
		String genderCode = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code");
		
		DataCode gender = FactoryBeans.getCodeBeans().getGenderCodeById(genderCode);
		dataPerson.setGender(gender);
		
		dataPerson.setFirstName(XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/name/given/text()"));
		dataPerson.setFirstLastName(XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/name/family/text()"));
		
		String birthday = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value");
		SimpleDateFormat sdfAge = new SimpleDateFormat("yyyyMMdd");
		try {
			
			Date dateBir = sdfAge.parse(birthday);
			Calendar date = Calendar.getInstance();
			date.setTime(dateBir);
			LocalDate birthdate = new LocalDate(date.get(Calendar.YEAR), date.get(Calendar.MONDAY), date.get(Calendar.DAY_OF_MONTH));
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			
			dataPerson.setAge(String.valueOf(age.getYears()));
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha de nacimiento", e);
			
		}
		
		String documentPerson = XMLUtils.executeXPathString(document, "/ClinicalDocument/recordTarget/patientRole/patient/id/@root");
		if(documentPerson != null){
			
			String documentNumber = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length()-1);
			dataPerson.setDocumentNumber(documentNumber);
			
			documentPerson = documentPerson.substring(0, documentPerson.lastIndexOf("."));
			String documentTypeS = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length());
			
			DocumentsTypesCode documentType = FactoryDAO.getCodesDAO(em).getDocumentsTypeByCode(documentTypeS);
			if(documentType != null){
				DataCode documentTypeCode = new DataCode();
				documentTypeCode.setCode(documentType.getDocumentsTypeCodeValue());
				documentTypeCode.setDisplayName(documentType.getDocumentsTypeCodeLabel());
				dataPerson.setDocumentType(documentTypeCode);
			}
			
			documentPerson = documentPerson.substring(0, documentPerson.lastIndexOf("."));
			String documentCountryS = documentPerson.substring(documentPerson.lastIndexOf(".")+1, documentPerson.length());
			
			CountriesCode country = FactoryDAO.getCodesDAO(em).getCountryByCode(documentCountryS);
			if(country != null){
				DataCode countryCode = new DataCode();
				countryCode.setCode(country.getCountryCodeLabel());
				countryCode.setDisplayName(country.getCountryCodeLabel());
				dataPerson.setDocumentType(countryCode);
			}
			
		}
		
		/**
		 * Tipo Donacion 
		 */
		String donationType = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//code//@code");
		data.setDonationType(FactoryBeans.getCodeBeans().getDonationTypeBySnomedCode(donationType));
			
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
		
		String completed = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//statusCode//@code");
		
		/**
		 * SE REALIZO LA DONACION
		 */
		if(completed != null && completed.equals(Constants.COMPLETED)){
			
			/**
			 * Estado
			 */
			DataCode state = new DataCode();
			state.setCode(DataDonationStateEnum.MADE.value);
			state.setDisplayName(DataDonationStateEnum.MADE.label);
			
			data.setState(state);
			
			/**
			 * Tipos de sangre
			 */
			String bloodType = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//code/@code");
			data.setBloodABOType(FactoryBeans.getCodeBeans().getABOBloodTypeCodeByBloodSnomedCode(bloodType));
			data.setBloodDType(FactoryBeans.getCodeBeans().getRHBloodTypeCodeByBloodSnomedCode(bloodType));
			data.setBloodType(FactoryBeans.getCodeBeans().getBloodTypeCodeBySnomedCode(bloodType));
			/**
			 * Eventos Adversos
			 */
			List<DataDonationEvent> events = new ArrayList<>();
			//List<Document> eventsDoc = XMLUtils.executeXPathStringList(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"CAUS\"]");
			List<Document> eventsDoc = XMLUtils.executeXPathStringList(document, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship");
			
			if(eventsDoc != null){
				
				for(Document d : eventsDoc){
					
					String event = XMLUtils.executeXPathString(d, "/entryRelationship/observation/code/@code");
					DataCode dataEvent = FactoryBeans.getCodeBeans().getDonationEventBySnomedCode(event);
					
					DataDonationEvent dataDonationEvent = new DataDonationEvent();
					dataDonationEvent.setEvent(dataEvent);
					
					String severity = XMLUtils.executeXPathString(d, "/entryRelationship/observation/interpretationCode/@code");
					DataCode dataSeverity = FactoryBeans.getCodeBeans().getSeverityBySnomedCode(severity);
					
					dataDonationEvent.setSeverity(dataSeverity);
					
					events.add(dataDonationEvent);
					
				}
				data.setEvents(events);
			}
			/**
			 * Resultados de laboratorio 
			 */
			String specimenRoot = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen//specimenRole//@root");
			String specimenExtension = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen//specimenRole//@extension");
			List<String> laboratories = XMLDataBaseFactory.getIXMLDataBaseLaboratory().getLaboratoryElementsBySpecimenId(specimenRoot, specimenExtension);
			
			List<DataLaboratoryResult> laboratoriesResults = new ArrayList<>();
			boolean approved = true;
			
			for(String lab : laboratories){
				
				Document doc = XMLUtils.stringToDocument(lab);
				DataLaboratoryResult dataLab = new DataLaboratoryResult();
				
				DataBank bankCode = FactoryBeans.getCenterBean().getBankById(XMLUtils.executeXPathString(doc, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root"));
				dataLab.setBank(bankCode);
				
				/**
				 * Analisis
				 */
				
				List<Document> analisis = XMLUtils.executeXPathStringList(doc, "//ClinicalDocument//component//structuredBody//component//section//entry//organizer//component");
				for(Document d : analisis){
					
					dataLab.setAnalysis(FactoryBeans.getCodeBeans().getDonationsAnalysisBySnomedCode(XMLUtils.executeXPathString(d, "//component//code//@code")));
					
					String dateS = XMLUtils.executeXPathString(d, "//component//effectiveTime//@value");
					
					if(dateS != null && !dateS.equals("")){
						
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
						Date date;
							try {
								date = sdf.parse(dateString);
							
							SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
							dataLab.setDate(sdf2.format(date));
							
						} catch (ParseException e) {
							
							logger.log(Level.SEVERE, "error al formatear la fecha", e);
							
						}
					}
					
					
					dataLab.setResult(FactoryBeans.getCodeBeans().getResultBySnomedCode(XMLUtils.executeXPathString(d, "//component//value//@code")));
					if(FactoryBeans.getCodeBeans().getBooleanResultBySnomedCode(XMLUtils.executeXPathString(d, "//component//value//@code")))
						approved = false;
					
					laboratoriesResults.add(dataLab);
					
				}	
			}
			data.setLabResults(laboratoriesResults);
			data.setApproved(approved);
			
		}else if(completed != null && completed.equals(Constants.CANCELED)){
			
			/**
			 * Estado
			 */
			DataCode state = new DataCode();
			state.setCode(DataDonationStateEnum.REJECTED.value);
			state.setDisplayName(DataDonationStateEnum.REJECTED.label);
			
			data.setState(state);
			
			/**
			 * No se realizo la donacion
			 */
			data.setApproved(false);
			
			DataDonationFail dataDonationFail = new DataDonationFail();
			dataDonationFail.setCause(FactoryBeans.getCodeBeans().getRejectionCauseBySnomedCode(XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/code/@code")));
			dataDonationFail.setRejectionType(FactoryBeans.getCodeBeans().getRejectionTypesBySnomedCode(XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code")));
	
			String days = XMLUtils.executeXPathString(document, "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/value/@value");
			if(days != null){
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				Calendar date = Calendar.getInstance();
				
				try {
					
					date.setTime(sdf2.parse(data.getDate()));
					
				} catch (ParseException e) {
					logger.log(Level.SEVERE, "Error al parsear la fecha ", e);
				}
				
				date.add(Calendar.DAY_OF_MONTH, Integer.parseInt(days));
				dataDonationFail.setDate(sdf2.format(date.getTime()));
								
			}

			data.setFail(dataDonationFail);
						
		}
		return data;
	}

	@Override
	public DataResponse addDonation(DataDonation dataDonacion) {
		
		DataResponse dataResponse = new DataResponse();
		
		/**
		 *  Devuelve el documentos con las partes que son comunes a todos los cdas.
		 */
		ClinicalDocumentType clinicalDocumentType = CdaUtils.getCDAStructure(dataDonacion.getPerson(),dataDonacion.getTime(),dataDonacion.getBank(),dataDonacion.getResponsiblePerson());
		
		/**
		 * CODIGO del Documento y Titulo -- Donacion.
		 */
		CodeType codeType = new CodeType();
		codeType.setCode(Constants.DOCUMENT_CODE_DONATION);
		clinicalDocumentType.setCode(codeType);	
		clinicalDocumentType.setTitle("Donacion de sangre");
		
		/**
		 * Devuelve el componente con los datos de la donacion.
		 */
		ComponentType componentType = CdaUtils.getComponentDonation(dataDonacion,em);
		clinicalDocumentType.setComponent(componentType);
		
		try {

			File file = new File(Constants.CDA_PATH + "/"+ clinicalDocumentType.getId().getRoot()+"."+clinicalDocumentType.getId().getExtension()+ ".xml");
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
		
		
		/**
		 * Si hay examenes de laboratorio
		 */
		/**
		 * CODIGO del Documento y Titulo -- Donacion.
		 */
		
		/**
		 *  Devuelve el documentos con las partes que son comunes a todos los cdas.
		 */
		if(dataDonacion.getLabResults() != null && dataDonacion.getLabResults().size() != 0){
		
			ClinicalDocumentType clinicalDocumentTypeLaboratory = CdaUtils.getCDAStructure(dataDonacion.getPerson(),dataDonacion.getTime(),dataDonacion.getBank(),dataDonacion.getResponsiblePerson());
			
			
			CodeType codeTypeLaboratory = new CodeType();
			codeTypeLaboratory.setCode(Constants.DOCUMENT_CODE_LABORATORY);
			clinicalDocumentTypeLaboratory.setCode(codeTypeLaboratory);	
			clinicalDocumentTypeLaboratory.setTitle("Analisis de laboratorio");
			
			/**
			 * Devuelve el componente con los datos de la donacion.
			 */
			ComponentType componentTypeLaboratory = CdaUtils.getComponentLaboratory(dataDonacion,em);
			clinicalDocumentTypeLaboratory.setComponent(componentTypeLaboratory);
			
			try {
	
				File file = new File(Constants.CDA_PATH + "/"+ clinicalDocumentTypeLaboratory.getId().getRoot()+"."+clinicalDocumentTypeLaboratory.getId().getExtension()+ ".xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocumentType.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(clinicalDocumentTypeLaboratory, file);
				jaxbMarshaller.marshal(clinicalDocumentTypeLaboratory, System.out);
				
				dataResponse.setCode(0);
				
			} catch (JAXBException e) {
				
				logger.log(Level.SEVERE, "Error al guardar el documento en el sistema de archivos", e);
				dataResponse.setCode(1);
				
			}	
		}
		return dataResponse;
		
	}

	@Override
	public DataDonation getDataDonationSpecimenId(String code, String institutionCode) throws XPathExpressionException, SAXException, IOException, ParserConfigurationException {
		
		try {
			
			String cda = XMLDataBaseFactory.getIXMLDataBaseDonations().getDonationCDABySpecimenId(institutionCode,code);
			if(cda!= null && !cda.equals("")){
				Document document= XMLUtils.stringToDocument(cda);
				return getDataDonation(document);
				
			}
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al recuperar el documento de la base de datos xml", e);
		}
		
		return new DataDonation();
	}

	@Override
	public List<DataDonation> getDonationsuser(List<DataSearchFilter> resultDonations) throws XPathExpressionException, SAXException, IOException, ParserConfigurationException {
		
		List<String> queries = new ArrayList<>();
		
		for(DataSearchFilter filter :resultDonations){
			
			if(filter.getValueString() != null && !filter.getValueString().equals("")){
				
				SearchFilterCode search = FactoryDAO.getCodesDAO(em).getSearchFilterByCode(filter.getCode());
				if(search != null){
				
					String query = search.getSearchFilterCodesPath() + "/contains(.,'"+ filter.getValueString() +"')";
					queries.add(query);
				}
			}
		}
		
		List<DataDonation> listReturn = new ArrayList<>();
		List<String> cdas;
		try {
			cdas = XMLDataBaseFactory.getIXMLDataBaseDonations().getLaboratoryElements(queries);
			
			if(cdas != null && cdas.size() != 0){
				for(String cda : cdas){
				
					Document document= XMLUtils.stringToDocument(cda);
					DataDonation dataDonacion = getDataDonation(document);
					listReturn.add(dataDonacion);
				}
			}
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al procesar loss documentos cda ", e);
		}

		return listReturn;
	}
	
}
