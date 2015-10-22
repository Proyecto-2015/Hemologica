package org.hemologica.yodono.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.context.FacesContext;
import org.hemologica.yodono.factories.RestFactory;

public class LanguageBB implements Serializable{
	
	private static final long serialVersionUID = 5800497220271872843L;
	private static Map<String,String> languages;
	private String language;
	
	static{
		languages = new HashMap<String,String>();
		languages.put("es","label_language_spanish" );
		languages.put("en","label_language_english");
		languages.put("fr","label_language_france");
		
	}
	
	public Map<String, String> getLanguagesInMap() {
		return languages;
	}
	
	public void setLanguages(Map<String, String> languages) {
		LanguageBB.languages = languages;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void languagesLocaleCodeChanged(){
		
		Map<String,String> params =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String language = params.get("action");
		this.language = language; 
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
		
//		try {
//			RestFactory.getServicesClient().login("paula", "1234");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}

}
