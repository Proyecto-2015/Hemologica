package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.context.FacesContext;

public class LanguageBB implements Serializable{
	
	private static final long serialVersionUID = 5800497220271872843L;
	private static Map<String,String> languages;
	
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
	
	public void languagesLocaleCodeChanged(){
		
		Map<String,String> params =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String language = params.get("action");
		
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
	}

}
