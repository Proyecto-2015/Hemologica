package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.salud.factories.RestFactory;


public class CampaignsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CampaignsBB.class.getName());
	
	private DataCampaign campaign = new DataCampaign();

	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	
	public DataCampaign getCampaign() {
		
		return campaign;
	}

	public void setCampaign(DataCampaign campaign) {
		this.campaign = campaign;
	}
	
	@PostConstruct
	public void init(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		bundle = app.getResourceBundle(context, languageVarName);
		
		DataCampaign campaignNew = (DataCampaign) context.getExternalContext().getSessionMap().get("campaignNew");
		if(campaignNew != null){
			
			campaign = campaignNew;
			
		}
		
	}
	
	public void submit(){
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_send_campaign_error"));
		
		Calendar today = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		campaign.setDate(format.format(today.getTime()));
		
		DataResponse response = RestFactory.getServicesClient().getSendCampaign(campaign);
		
		if(response != null && response.getCode() == 0){
			
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, bundle.getString("message_send_campaign_success"));
			
			FacesContext context = FacesContext.getCurrentInstance();
			context.getExternalContext().getSessionMap().put("campaignNew", null);
			
			campaign = new DataCampaign();
			
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		logger.info("submit");
	}
	
	public void clean(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().put("campaignNew", null);
		
		campaign = new DataCampaign();
		
	}
	
	public String preview(){
		
		boolean error = false;
		if(campaign.getTitle() == null || campaign.getTitle().equals("")){
			
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_title_empty"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			error = true;
		}
		if(campaign.getSummary() == null || campaign.getSummary().equals("")){
			
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_summary_empty"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			error = true;
		}
		if(campaign.getSubtitle() == null || campaign.getSubtitle().equals("")){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_subtitle_empty"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			error = true;
		}
		if(campaign.getText() == null || campaign.getText().equals("")){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_text_empty"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			error = true;
		}
		if(error){
			
			return null;
			
		}else{
			
			Calendar today = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			campaign.setDate(format.format(today.getTime()));
			
			FacesContext context = FacesContext.getCurrentInstance();
			campaign.setId("-1");
			context.getExternalContext().getSessionMap().put("campaignNew", campaign);
			
			return "campaignsPrev";
			
		}
		
		
	}
	
}
