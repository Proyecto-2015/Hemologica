package org.hemologica.salud.ejb.business;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;

import org.hemologica.constants.Constants;
import org.hemologica.dao.constants.ConstantsCDA;
import org.hemologica.dao.enums.SentOptions;
import org.hemologica.dao.model.BloodAboTypesCode;
import org.hemologica.dao.model.BloodDTypesCode;
import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.Notification;
import org.hemologica.dao.model.NotificationsPerson;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.datatypes.MailData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.impl.StatisticsBean;
import org.hemologica.salud.ejb.utils.XMLUtils;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;

public class NotificationThread extends Thread{
	
	private Logger logger = Logger.getLogger(NotificationThread.class.getName());
	
	private MailData mailData;
	private EntityManager em;
	
	public NotificationThread(MailData mailData, EntityManager em) {
		
		this.mailData = mailData;
		this.em = em;
		
	}
	
	
	@Override
	public void run() {
		
		if(mailData != null){
			
			Notification notification = new Notification();
			
			List<String> andClauses = new ArrayList<>();
			List<String> orClauses = new ArrayList<>();
			
			if(mailData.getMessageOption() != null){
				
				MessageSendOption messageSendOption = new MessageSendOption();
				messageSendOption.setId(mailData.getMessageOption().getCode());
				messageSendOption.setLabel(mailData.getMessageOption().getDisplayName());
				notification.setMessageSendOption(messageSendOption);
				
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				Calendar dateFromMale = Calendar.getInstance();
				dateFromMale.add(Calendar.MONTH, (-1)*Constants.MONTHS_MALE);
				
				Calendar dateFromFemale = Calendar.getInstance();
				dateFromFemale.add(Calendar.MONTH, (-1)*Constants.MONTHS_FEMALE);
				
				/**
				 * Filtro para ver si tiene alguna donacion muy reciente
				 */
				if(mailData.getMessageOption().getCode().equals(Constants.MESSAGE_OPTION_ENABLED)){
					
					String dateMale = ConstantsCDA.GENDER + "='" + Constants.DONOR_MALE + "' and "
							+ ConstantsCDA.DONATION_DATE + ">'" + sdfCDA.format(dateFromMale.getTime()) + "'";
					
					orClauses.add(dateMale);
					
					String dateFemale = ConstantsCDA.GENDER + "='" + Constants.DONOR_FEMALE + "' and "
							+ ConstantsCDA.DONATION_DATE + ">'" + sdfCDA.format(dateFromFemale.getTime()) + "'";
					
					orClauses.add(dateFemale);
					
				};
				
				/**
				 * Filtro rechazo permanente.
				 */
				String reject = ConstantsCDA.DONATION_STATE_PATH + "='" + Constants.DONATION_STATE_REJECTED + "' and " + 
						ConstantsCDA.DONATION_FAIL_TYPE + "='" + Constants.DONATION_FAIL_TYPE_PERMANENT + "'";
				
				orClauses.add(reject);
				
				/**
				 * Filtro si tiene donacion rechada por un tiempo que incluye el de hoy
				 */			
//				if(days != null){
//					
//					SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
//					Calendar date = Calendar.getInstance();
//					
//					try {
//						
//						date.setTime(sdf2.parse(data.getDate()));
//						
//					} catch (ParseException e) {
//						logger.log(Level.SEVERE, "Error al parsear la fecha ", e);
//					}
//					
//					date.add(Calendar.DAY_OF_MONTH, Integer.parseInt(days));
//					dataDonationFail.setDate(sdf2.format(date.getTime()));
//									
//				}
//				
//				
//				String rejectTemporal = ConstantsCDA.DONATION_STATE_PATH + "='" + Constants.DONATION_STATE_REJECTED + "' and " + 
//						ConstantsCDA.DONATION_FAIL_TYPE + "='" + Constants.DONATION_FAIL_TYPE_TEMPORAL + "' and ";
//				
//				orClauses.add(rejectTemporal);
			}
			
			
			if(mailData.getBloodTypeABO() != null){
			
				BloodAboTypesCode blood = FactoryDAO.getbloodDAO(em).findBloodAboTypesCodeByCode(mailData.getBloodTypeABO().getCode());
				notification.setBloodTypeABO(blood);
				
			}
			
			if(mailData.getBloodTypeRH() != null){
				
				BloodDTypesCode blood = FactoryDAO.getbloodDAO(em).findBloodDTypesCodeByCode(mailData.getBloodTypeRH().getCode());
				notification.setBloodTypeRH(blood);
				
			}
			
			if(mailData.getBloodType() != null){
				
				BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeByCode(mailData.getBloodTypeRH().getCode());
				notification.setBloodType(blood);
				
				if(blood != null){
					
					String queryBlood = ConstantsCDA.BLOOD_TYPE_PATH + "='" + blood.getConcept().getConceptCode() + "'";
					andClauses.add(queryBlood);
					
				}
				
			}
			
			notification.setText(mailData.getText());
			notification.setSubject(mailData.getSubject());
			
			
			/**
			 * Personas
			 */
			
			Properties prop = new Properties();
			Session session = null;
			final String username;
			final String password;
			try {
				
				prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("hemosalud.properties"));
				username = prop.getProperty("mail.username");
				password = prop.getProperty("mail.password");
				
				if(username == null || password == null)
					return;
				
				session = Session.getInstance(prop, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
				
			} catch (IOException e) {
				
				logger.log(Level.SEVERE, "Error al leer el archivo de propiedades hemosalud.properties", e);
				return;
			}
			
			List<NotificationsPerson> persons = new ArrayList<>();
			
			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				if(p.getAllowNotificationNeedDonor()){
				
					List<String> orClausesCDAsIds = new ArrayList<>();
					for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
			
						String query = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
						"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
						orClausesCDAsIds.add(query);
						
					}
					List<List<String>> or = new ArrayList<>();
					or.add(orClauses);
					try {
						
						if((andClauses.size() == 0 && orClauses.size() ==0) ||
								(andClauses.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,null,orClausesCDAsIds,null) > 0
								&& XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(null,or,orClausesCDAsIds,null) == 0) || 
								(andClauses.size() == 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(null,or,orClausesCDAsIds,null) == 0)){
							
							NotificationsPerson notificationPerson = new NotificationsPerson();
							notificationPerson.setPerson(p);
							notificationPerson.setNotification(notification);
							notificationPerson.setSentOption(SentOptions.NOT_SENT);
							persons.add(notificationPerson);
							
							/**
							 * Enviar mail
							 */
							Message message = new MimeMessage(session);
															
							try {
								
								message.setFrom(new InternetAddress(username));
								InternetAddress[] ret = new InternetAddress[1];
								ret[0] = new InternetAddress(p.getPersonEmail());
								
								message.setRecipients(RecipientType.TO, ret);
								message.setSubject(notification.getSubject());
								
								message.setContent(notification.getText(), "text/html");
			
								Transport.send(message);
								notificationPerson.setSentOption(SentOptions.NOT_SENT);
								
							} catch (AddressException e) {
								
								logger.log(Level.SEVERE, "Error al enviar el mail AddressException", e);
								
								notificationPerson.setSentOption(SentOptions.ERROR);
								
							} catch (MessagingException e) {
								
								logger.log(Level.SEVERE, "Error al enviar el mail MessagingException", e);
								notificationPerson.setSentOption(SentOptions.ERROR);
							}
							

						}
						
					
					
					} catch (XMLDataBaseException e) {
						
						logger.log(Level.SEVERE, "Error al ir a buscar los cdas al baseX", e);
						
					}
				}
	
			}
			
			//TODO Agregar las personas y mandar mails.
			notification.setNotificationsPersons(persons);
			
			FactoryDAO.getNotificationDAO(em).create(notification);
			
		}
		
	}

	public MailData getMailData() {
		return mailData;
	}

	public void setMailData(MailData mailData) {
		this.mailData = mailData;
	}

}
