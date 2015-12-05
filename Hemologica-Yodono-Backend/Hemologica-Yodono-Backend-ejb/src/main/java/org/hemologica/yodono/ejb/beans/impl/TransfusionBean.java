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
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import org.hemologica.yodono.ejb.beans.TransfusionBeanLocal;
import org.hemologica.yodono.utils.FactoryBeans;
import org.hemologica.yodono.utils.XMLUtils;
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

	private DataTransfusion getDataTransfusion(Document document) throws XPathExpressionException {
		
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
						dataLaboratoryResult.setResult(FactoryBeans.getCodeBeans().getBooleanResultBySnomedCode(XMLUtils.executeXPathString(docAnalysis, "/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/value/@code")));
						
						laboratoryResultList.add(dataLaboratoryResult);
					}
				}
				
				data.setLaboratoryResults(laboratoryResultList);
			}
			
		}
		
		return data;
	}

}
