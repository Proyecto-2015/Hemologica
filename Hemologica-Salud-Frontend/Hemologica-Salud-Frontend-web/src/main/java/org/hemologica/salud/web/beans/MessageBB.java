package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.salud.factories.RestFactory;

//@Named("messageBB")
//@SessionScoped
public class MessageBB implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(MessageBB.class.getName());
	
	private List<MessageOptionData> messageOptions;
	private List<DataBloodType> bloodTypes;
	
	private MessageOptionData messageOption;
	private DataBloodType bloodType;
	
	private MailData mailData;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	
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
	
	public void submit(){
		
		logger.info("holaaaaaaaaaa");
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		bundle = app.getResourceBundle(context, languageVarName);
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_send_error"));
		
		try {
			
			mailData.setBloodType(bloodType);
			mailData.setMessageOption(messageOption);
			
			DataResponse response = RestFactory.getServicesClient().sendMessage(mailData);

			if(response != null && response.getCode() == 0){
				
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, bundle.getString("message_send_success"));
	
			}
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}
	
	public List<MessageOptionData> getMessageOptions() {
		return messageOptions;
	}
	public void setMessageOptions(List<MessageOptionData> messageOptions) {
		this.messageOptions = messageOptions;
	}

	public List<DataBloodType> getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(List<DataBloodType> bloodTypes) {
		this.bloodTypes = bloodTypes;
	}

	public MailData getMailData() {
		return mailData;
	}

	public void setMailData(MailData mailData) {
		this.mailData = mailData;
	}

	public MessageOptionData getMessageOption() {
		return messageOption;
	}

	public void setMessageOption(MessageOptionData messageOption) {
		this.messageOption = messageOption;
	}

	public DataBloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(DataBloodType bloodType) {
		this.bloodType = bloodType;
	}

}
