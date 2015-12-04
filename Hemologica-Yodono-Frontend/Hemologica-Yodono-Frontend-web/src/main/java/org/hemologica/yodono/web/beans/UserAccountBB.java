package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataUser;
import org.hemologica.yodono.factories.RestFactory;
import org.hemologica.yodono.web.utils.JSFUtils;
import org.primefaces.context.RequestContext;

public class UserAccountBB implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(UserAccountBB.class.getName());

	private ApplicationBB applicationBB;
	private SessionBB sessionBB;

	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";

	private DataUser user;
	private String repeatPassword;

	private Properties prop;

	@PostConstruct
	public void init() {
		
		
		prop = new Properties();
		try {
			prop.load(UserAccountBB.class.getClassLoader().getResourceAsStream("hemologica.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String token = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("token");
		logger.log(Level.INFO, "User account token: "+  token);
		
		if (token == null) {
			// TODO 403
			return;
		}

		try {

			user = RestFactory.getServicesClient().getUserFirstAccess(token);
			if (user == null) {
				// TODO 403
				return;
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO 403
		return;

		
		
	}
	
	
	public void update(){
		
		try {

			DataResponse resp = RestFactory.getServicesClient().updateUserFirstAccess(user);
			if(resp.getCode() == 0){
				JSFUtils.addGlobalInfoMessage("El usuario se ha guardado con éxtio");
				JSFUtils.redirect(prop.getProperty("cas.login.url"));
			}else{
				JSFUtils.addGlobalErrorMessage("El nombre de usuario ya existe");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public ResourceBundle getBundle() {
		return bundle;
	}

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	public String getLanguageVarName() {
		return languageVarName;
	}

	public void setLanguageVarName(String languageVarName) {
		this.languageVarName = languageVarName;
	}

	public DataUser getUser() {
		return user;
	}

	public void setUser(DataUser user) {
		this.user = user;
	}


	public String getRepeatPassword() {
		return repeatPassword;
	}


	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

}
