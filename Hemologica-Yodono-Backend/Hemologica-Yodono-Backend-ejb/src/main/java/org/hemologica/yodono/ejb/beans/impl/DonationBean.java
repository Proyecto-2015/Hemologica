package org.hemologica.yodono.ejb.beans.impl;

import java.io.IOException;
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
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import org.hemologica.yodono.ejb.beans.DonationBeanLocal;
import org.hemologica.yodono.utils.FactoryBeans;
import org.hemologica.yodono.utils.XMLUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Session Bean implementation class DonationBean
 */
@Stateless
@LocalBean
public class DonationBean implements DonationBeanLocal {
	
	private static final Logger logger = Logger.getLogger(DonationBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	
    public DonationBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DataDonation> getDonationsUserId(String userId) throws XMLDataBaseException, SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		
		List<DataDonation> listReturn = new ArrayList<>();
		
		List<PersonsRecord> cdasIds = FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(userId);
		
		for(PersonsRecord personsRecord : cdasIds){
			
			String cda = XMLDataBaseFactory.getIXMLDataBaseDonations().getElementCDAId(personsRecord.getPersonsRecordCdaRoot(), personsRecord.getPersonsRecordCdaExtension());
			
			Document document= XMLUtils.stringToDocument(cda);
			DataDonation dataDonacion = getDataDonation(document);
			listReturn.add(dataDonacion);
		}
		
		return listReturn;
	}

	private DataDonation getDataDonation(Document document) throws XPathExpressionException {
		
		DataDonation data = new DataDonation();
		
		/**
		 * Banco de Sangre e Institucion
		 */
		DataBank dataBank = FactoryBeans.getCenterBean().getBankById(XMLUtils.executeXPathString(document, "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root"));
		data.setBank(dataBank);
		data.setInstitution(dataBank.getInstitution());
		
		/**
		 * Tipos de sangre
		 */
		String bloodType = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//code/@code");
		data.setBloodABOType(FactoryBeans.getCodeBeans().getABOBloodTypeCodeByBloodSnomedCode(bloodType));
		data.setBloodDType(FactoryBeans.getCodeBeans().getRHBloodTypeCodeByBloodSnomedCode(bloodType));
		
		/**
		 * Tipo Donante -- No se como ponerlo.
		 */
//		data.setDataDonorType(dataDonorType);
		
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
		
		/**
		 * Eventos Adversos
		 */
		List<DataDonationEvent> events = new ArrayList<>();
		List<Document> eventsDoc = XMLUtils.executeXPathStringList(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"CAUS\"]");
		
		if(eventsDoc != null){
			
			for(Document d : eventsDoc){
				
				String event = XMLUtils.executeXPathString(d, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"CAUS\"]//observation//code/@code");
				DataCode dataEvent = FactoryBeans.getCodeBeans().getDonationEventBySnomedCode(event);
				
				DataDonationEvent dataDonationEvent = new DataDonationEvent();
				dataDonationEvent.setEvent(dataEvent);
				
				String severity = XMLUtils.executeXPathString(d, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//interpretationCode//@code");
				DataCode dataSeverity = FactoryBeans.getCodeBeans().getDonationSeverityBySnomedCode(severity);
				
				dataDonationEvent.setSeverity(dataSeverity);
				
			}
			data.setEvents(events);
		}
		/**
		 * Resultados de laboratorio 
		 */
		String specimenRoot = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen//specimenRole//@root");
		String specimenExtension = XMLUtils.executeXPathString(document, "//ClinicalDocument//component//structuredBody//component//section//entry//procedure//specimen//specimenRole//@extension");
		
		return data;
	}

}
