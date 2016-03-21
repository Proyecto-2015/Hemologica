package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.hemologica.datatypes.DataPerson;
import org.hemologica.yodono.factories.RestFactory;

public class SessionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534391148649719007L;

	private ApplicationBB applicationBB;
	private DataPerson dataUser;

	// TODO esto no va aca.
	@PostConstruct
	private void init() {

		try {

			/**
			 * Obtener nombre de usuario
			 */
			String username = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("edu.yale.its.tp.cas.client.filter.user");
			if (username != null) {
				dataUser = RestFactory.getServicesClient().getDataUser(username);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isLogin() {

		try {
			String username = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("edu.yale.its.tp.cas.client.filter.user");
			if (username != null) {

				dataUser = RestFactory.getServicesClient().getDataUser(username);

				return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public String logout(){
		((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false)).invalidate();
		return "campaigns";
	}

	public String redirectTo(String go) {

		System.out.println("REDIRECT TO: " + go);
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
