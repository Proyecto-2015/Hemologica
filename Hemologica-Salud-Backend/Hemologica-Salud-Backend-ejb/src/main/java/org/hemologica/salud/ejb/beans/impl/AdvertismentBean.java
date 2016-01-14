package org.hemologica.salud.ejb.beans.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.Advertisment;
import org.hemologica.dao.model.EmailSent;
import org.hemologica.dao.model.EmailToSend;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataEmailSent;
import org.hemologica.datatypes.DataEmailToSend;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.MailData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.AdvertismentBeanLocal;
import org.hemologica.salud.ejb.business.NotificationThread;
import org.hemologica.salud.ejb.utils.FactoryBeans;

/**
 * Session Bean implementation class AdvertismentBean
 */
@Stateless
@LocalBean
public class AdvertismentBean implements AdvertismentBeanLocal {

	
	private static final Logger logger = Logger.getLogger(AdvertismentBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public AdvertismentBean() {
        
    }

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		
		List<DataCampaign> listReturn = new ArrayList<>();
		List<Advertisment> list = FactoryDAO.getAdvertismentDAO(em).getCampaigns(cant);

		if (list != null) {
			for (Advertisment i : list) {
				DataCampaign dataIins = new DataCampaign();
				
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				if(i.getDate() != null)
					dataIins.setDate(format.format(i.getDate().getTime()));
				dataIins.setSubtitle(i.getSubtitle());
				dataIins.setId(String.valueOf(i.getId()));
				dataIins.setSummary(i.getSummary());
				dataIins.setText(i.getText());
				dataIins.setTitle(i.getTitle());
				
				listReturn.add(dataIins);
			}
		}
		
		return listReturn;
		
	}

	@Override
	public DataResponse sendCampaign(DataCampaign dataCampaign) {
		DataResponse response = new DataResponse();
		response.setCode(1);
		
		Advertisment advertisment = new Advertisment(); 
		
		advertisment.setTitle(dataCampaign.getTitle());
		advertisment.setSubtitle(dataCampaign.getSubtitle());
		advertisment.setSummary(dataCampaign.getSummary());
		advertisment.setText(dataCampaign.getText());
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar date = Calendar.getInstance();
		try {
			date.setTime(format.parse(dataCampaign.getDate()));
			advertisment.setDate(date);
			
			FactoryDAO.getAdvertismentDAO(em).create(advertisment);
			response.setCode(0);
			
		} catch (ParseException e) {
			logger.log(Level.SEVERE, "Error al parsear la fecha", e);
		}
			
		return response;
	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		
		Advertisment i = FactoryDAO.getAdvertismentDAO(em).getCampaign(campaignId);
		
		DataCampaign dataIins = null;
		if (i != null) {
			
			dataIins = new DataCampaign();
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			if(i.getDate() != null)
				dataIins.setDate(format.format(i.getDate().getTime()));
			dataIins.setSubtitle(i.getSubtitle());
			dataIins.setId(String.valueOf(i.getId()));
			dataIins.setSummary(i.getSummary());
			dataIins.setText(i.getText());
			dataIins.setTitle(i.getTitle());
				
		}
		
		return dataIins;
	}

	@Override
	public DataResponse sendMessage(MailData mailData) {
		
//		Notification notification = new Notification();
//		
//		if(mailData.getMessageOption() != null){
//			MessageSendOption messageSendOption = new MessageSendOption();
//			messageSendOption.setId(mailData.getMessageOption().getCode());
//			messageSendOption.setLabel(mailData.getMessageOption().getDisplayName());
//			notification.setMessageSendOption(messageSendOption);
//			
//		}
//		
//		if(mailData.getBloodTypeABO() != null){
//		
//			BloodAboTypesCode blood = FactoryDAO.getbloodDAO(em).findBloodAboTypesCodeByCode(mailData.getBloodTypeABO().getCode());
//			notification.setBloodTypeABO(blood);
//			
//		}
//		
//		if(mailData.getBloodTypeRH() != null){
//			
//			BloodDTypesCode blood = FactoryDAO.getbloodDAO(em).findBloodDTypesCodeByCode(mailData.getBloodTypeRH().getCode());
//			notification.setBloodTypeRH(blood);
//			
//		}
//		
//		notification.setText(mailData.getText());
//		notification.setSubject(mailData.getSubject());
//		
//		//TODO Agregar las personas y mandar mails.
//		
//		FactoryDAO.getNotificationDAO(em).create(notification);
		
		NotificationThread thread = new NotificationThread(mailData, em);
		//thread.start();
		
		DataResponse dataResponse = new DataResponse();
		dataResponse.setCode(0);
		
		return dataResponse;
		
	}

	@Override
	public boolean addEmail(DataEmailToSend emailToSend) {
		
		EmailToSend email = new EmailToSend();
		email.setEmailToSendDate(emailToSend.getEmailToSendDate());
		/**
		 * Descomentar esto
		 */
		
		//email.setEmailToSendPerson(FactoryDAO.getPeronDAO(em).getPersonsId(emailToSend.getEmailToSendPerson().getId()));
		email.setEmailToSendSubject(emailToSend.getEmailToSendSubject());
		email.setEmailToSendText(emailToSend.getEmailToSendText());
		
		return FactoryDAO.getAdvertismentDAO(em).createEmailToSend(email);
		
		
	}

	@Override
	public boolean removeEmail(DataEmailToSend emailToSend) {
		
		EmailToSend email = FactoryDAO.getAdvertismentDAO(em).getEmailById(emailToSend.getId());
		
		return FactoryDAO.getAdvertismentDAO(em).removeEmailToSend(email);
		
	}

	@Override
	public boolean addEmailSent(DataEmailSent emailToSend) {
		
		EmailSent email = new EmailSent();
		email.setEmailSentTo(emailToSend.getEmailSentTo());
		
		email.setEmailEffectiveSentDate(emailToSend.getEmailEffectiveSentDate());
		email.setEmailSentDate(emailToSend.getEmailSentDate());
		email.setEmailSentFrom(emailToSend.getEmailSentFrom());
		
		/**
		 * Descomentar esto
		 */
		email.setEmailSentPerson(FactoryDAO.getPeronDAO(em).getPersonsId(emailToSend.getEmailToSentPerson().getId()));
		
		email.setEmailSentSubject(emailToSend.getEmailSentSubject());
		email.setEmailSentText(emailToSend.getEmailSentText());
		
		return FactoryDAO.getAdvertismentDAO(em).createEmailSent(email);
		
	}

	@Override
	public List<DataEmailToSend> getEmailsToSend(Calendar instance) {
		
		List<EmailToSend> emails = FactoryDAO.getAdvertismentDAO(em).getEmailsToSend(instance);
		List<DataEmailToSend> emailsToSend = new ArrayList<>();
		
		for(EmailToSend email : emails){
			
			DataEmailToSend dataEmail = new DataEmailToSend();
			dataEmail.setEmailToSendDate(email.getEmailToSendDate());
			dataEmail.setEmailToSendPerson(FactoryBeans.getPersonBean().getDataPeron(email.getEmailToSendPerson()));
			dataEmail.setEmailToSendSubject(email.getEmailToSendSubject());
			dataEmail.setEmailToSendText(email.getEmailToSendText());
			dataEmail.setId(email.getEmailToSendId());
			
			emailsToSend.add(dataEmail);
			
		}
		
		return emailsToSend;
	}

}
