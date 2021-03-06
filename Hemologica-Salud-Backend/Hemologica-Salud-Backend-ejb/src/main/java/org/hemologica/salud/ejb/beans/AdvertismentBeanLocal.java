package org.hemologica.salud.ejb.beans;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Local;

import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataEmailSent;
import org.hemologica.datatypes.DataEmailToSend;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.MailData;

@Local
public interface AdvertismentBeanLocal {

	List<DataCampaign> getCampaigns(String cant);

	DataResponse sendCampaign(DataCampaign dataCampaign);

	DataCampaign getCampaign(String campaignId);

	DataResponse sendMessage(MailData mailData);
	
	boolean addEmail(DataEmailToSend emailToSend);
	
	boolean removeEmail(DataEmailToSend emailToSend);
	
	boolean addEmailSent(DataEmailSent emailToSend);

	List<DataEmailToSend> getEmailsToSend(Calendar instance);

}
