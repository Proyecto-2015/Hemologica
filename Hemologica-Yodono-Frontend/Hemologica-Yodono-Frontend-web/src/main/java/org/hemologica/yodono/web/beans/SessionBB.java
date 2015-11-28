package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.yodono.factories.RestFactory;

public class SessionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534391148649719007L;

	
	private ApplicationBB applicationBB;
	private DataPerson dataUser;
	
	//TODO esto no va aca.
	@PostConstruct
	private void init(){
		
		try {
			
			dataUser = RestFactory.getServicesClient().getDataUser("1");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String redirectTo(String go){
		
		System.out.println("REDIRECT TO: "+ go);
		return go;
		
	}
	
	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public DataPerson getDataUser() {
		return dataUser;
	}

	public void setDataUser(DataPerson dataUser) {
		this.dataUser = dataUser;
	}
	
}
