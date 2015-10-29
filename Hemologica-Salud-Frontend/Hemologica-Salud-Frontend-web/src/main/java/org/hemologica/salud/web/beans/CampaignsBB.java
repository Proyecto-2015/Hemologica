package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.salud.factories.RestFactory;


public class CampaignsBB {
	
	private static final Logger logger = Logger.getLogger(CampaignsBB.class.getName());
	
	private List<MessageOptionData> messageOptions;
	private List<BloodTypeData> bloodTypes;
	private MailData mailData;
	
	@PostConstruct
    public void init() {
		
		try {
			mailData = new MailData();
			messageOptions = RestFactory.getServicesClient().getMessageOptions();
			bloodTypes = RestFactory.getServicesClient().getBloodTypes();
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}
	}
	
	public List<MessageOptionData> getMessageOptions() {
		return messageOptions;
	}
	public void setMessageOptions(List<MessageOptionData> messageOptions) {
		this.messageOptions = messageOptions;
	}

	public List<BloodTypeData> getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(List<BloodTypeData> bloodTypes) {
		this.bloodTypes = bloodTypes;
	}

	public MailData getMailData() {
		return mailData;
	}

	public void setMailData(MailData mailData) {
		this.mailData = mailData;
	}

	

}
