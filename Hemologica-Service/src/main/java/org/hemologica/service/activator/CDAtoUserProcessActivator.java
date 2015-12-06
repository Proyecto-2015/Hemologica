package org.hemologica.service.activator;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hemologica.service.business.IUserBean;
import org.hemologica.service.datatype.MailData;
import org.hemologica.service.datatype.UserData;

import com.google.gson.Gson;

public class CDAtoUserProcessActivator {

	private IUserBean userBean;
	private static final Logger logger = Logger.getLogger(CDAtoUserProcessActivator.class.getName());
	
	public String process(String userData){
		
			UserData data = new Gson().fromJson(userData, UserData.class);
			try{
				MailData mailData = userBean.createUser(data);
				return mailData != null ? new Gson().toJson(mailData) : null;
			}catch(Exception ex){
				logger.log(Level.SEVERE, ex.getMessage(), ex);
			}
			return null;
	}

	public IUserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(IUserBean userBean) {
		this.userBean = userBean;
	}
	
}
