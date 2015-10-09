package org.hemologica.yodono.web.utils;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtils implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -897296536189129334L;
	
	public static void redirect(String url) throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect(url);
	}

	//add error messages
	public static void addGlobalErrorMessage(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null));
	}
	
	public static void addGlobalErrorMessage(String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, detail));
	}
	
	public static void addClientErrorMessage(String client, String msg){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null));
	}
	
	public static void addClientErrorMessage(String client, String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, detail));
	}
	
	
	//add warning messages
	public static void addGlobalWarnMessage(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, msg, null));
	}
	
	public static void addGlobalWarnMessage(String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, msg, detail));
	}
	
	public static void addClientWarnMessage(String client, String msg){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_WARN, msg, null));
	}
	
	public static void addClientWarnMessage(String client, String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_WARN, msg, detail));
	}
	
	
	//add information messages
	public static void addGlobalInfoMessage(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
	}
	
	public static void addGlobalInfoMessage(String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, detail));
	}
	
	public static void addClientInfoMessage(String client, String msg){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
	}
	
	public static void addClientInfoMessage(String client, String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, detail));
	}
	
	//add fatal messages
	public static void addGlobalFatalMessage(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, msg, null));
	}
	
	public static void addGlobalFatalMessage(String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, msg, detail));
	}
	
	public static void addClientFatalMessage(String client, String msg){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_FATAL, msg, null));
	}
	
	public static void addClientFatalMessage(String client, String msg, String detail){
		FacesContext.getCurrentInstance().addMessage(client, new FacesMessage(FacesMessage.SEVERITY_FATAL, msg, detail));
	}
	
	
	
	
	
	public static Map<String, Object> getSessionMap(){
		return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	}
	
	public static Object getSession(){
		return FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}
	
	public static Object getSession(boolean create){
		return FacesContext.getCurrentInstance().getExternalContext().getSession(create);
	}
	
}
