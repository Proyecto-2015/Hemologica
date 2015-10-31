package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.SelectItem;


import javax.annotation.PostConstruct;

public class ApplicationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967430387332405694L;
	
	
	@PostConstruct
	public void init(){
		
	}

	public List<SelectItem> getItems(String code){
		return null;
	}
	
}
