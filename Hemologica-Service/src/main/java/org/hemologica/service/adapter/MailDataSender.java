package org.hemologica.service.adapter;

import org.hemologica.service.datatype.MailData;
import org.hemologica.service.datatype.UserData;

import com.google.gson.Gson;

public class MailDataSender {
	
	
//	private IUserBean userBean;
	
	public void process(String serDataJSON){
		
		
		
		UserData data = new Gson().fromJson(serDataJSON, UserData.class);
		MailData mail = new MailData();
		
		
		
	}
	

}
