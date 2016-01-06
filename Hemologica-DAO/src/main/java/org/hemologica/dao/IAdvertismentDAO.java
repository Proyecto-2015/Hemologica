package org.hemologica.dao;

import java.util.Calendar;
import java.util.List;
import org.hemologica.dao.model.Advertisment;
import org.hemologica.dao.model.EmailSent;
import org.hemologica.dao.model.EmailToSend;


public interface IAdvertismentDAO extends IGenericDAO<Advertisment>{

	List<Advertisment> getCampaigns(String cant);

	Advertisment getCampaign(String campaignId);
	
	boolean createEmailToSend(EmailToSend emailToSend);
	
	boolean removeEmailToSend(EmailToSend emailToSend);
	
	boolean createEmailSent(EmailSent emailSent);

	EmailToSend getEmailById(Long id);

	List<EmailToSend> getEmailsToSend(Calendar instance);
	
}
