package org.hemologica.service.datatype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hemologica.empi.datatypes.Identifier;
import org.w3c.dom.Document;

public class CDA {

	
	
	private Document document;
	private Document documentHeader;
	private Document documentBody;
	private Map<String,String> userData;
	private List<Identifier> identifiers;
	
	
	
	public CDA(Document document){
		this.document = document;
		splitHeaderBody();
		loadUserData();
	}
	
	
	public void splitHeaderBody(){
		//TODO
	}
	
	public void loadUserData(){
		//TODO
		userData = new HashMap<String, String>();
	}

	
	
	

	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}


	public Document getDocumentHeader() {
		return documentHeader;
	}


	public void setDocumentHeader(Document documentHeader) {
		this.documentHeader = documentHeader;
	}


	public Document getDocumentBody() {
		return documentBody;
	}


	public void setDocumentBody(Document documentBody) {
		this.documentBody = documentBody;
	}


	public Map<String, String> getUserData() {
		return userData;
	}


	public void setUserData(Map<String, String> userData) {
		this.userData = userData;
	}


	public List<Identifier> getIdentifiers() {
		return identifiers;
	}


	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}
	
	
}
