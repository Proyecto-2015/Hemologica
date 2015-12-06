package org.hemologica.service.datatype;

import java.io.Serializable;
import java.util.ArrayList;

public class MailData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String from;
	private String subject;
	private String content;
	private String token;
	private ArrayList<String> addressTO;
	private ArrayList<String> addressCC;
	private ArrayList<String> addressBCC;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArrayList<String> getAddressTO() {
		return addressTO;
	}

	public void setAddressTO(ArrayList<String> addressTO) {
		this.addressTO = addressTO;
	}

	public ArrayList<String> getAddressCC() {
		return addressCC;
	}

	public void setAddressCC(ArrayList<String> addressCC) {
		this.addressCC = addressCC;
	}

	public ArrayList<String> getAddressBCC() {
		return addressBCC;
	}

	public void setAddressBCC(ArrayList<String> addressBCC) {
		this.addressBCC = addressBCC;
	}

}
