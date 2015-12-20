package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.MailData;
import org.hemologica.salud.factories.RestFactory;

public class MessageBB implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(MessageBB.class.getName());
	
	private MailData mailData;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	
	@PostConstruct
    public void init() {
		
		mailData = new MailData();
			
	}
	
	public void submit(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		bundle = app.getResourceBundle(context, languageVarName);
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_send_error"));
		
		try {
			
			DataResponse response = RestFactory.getServicesClient().sendMessage(mailData);

			if(response != null && response.getCode() == 0){
				
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, bundle.getString("message_send_success"));
	
			}
			mailData = new MailData();
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}

	public MailData getMailData() {
		return mailData;
	}

	public void setMailData(MailData mailData) {
		this.mailData = mailData;
	}
	
	public void clean(){
		
		mailData = new MailData();
		
	}
}
