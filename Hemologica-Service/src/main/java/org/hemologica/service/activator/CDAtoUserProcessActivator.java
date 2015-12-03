package org.hemologica.service.activator;

import org.hemologica.service.business.IUserBean;
import org.hemologica.service.datatype.MailData;
import org.hemologica.service.datatype.UserData;

import com.google.gson.Gson;

public class CDAtoUserProcessActivator {

	
	private IUserBean userBean;
	
	public String process(String userData){
		
			UserData data = new Gson().fromJson(userData, UserData.class);
			MailData mailData = userBean.createUser(data);
			return mailData != null ? new Gson().toJson(mailData) : null;
			
	}

	public IUserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(IUserBean userBean) {
		this.userBean = userBean;
	}
	
}
