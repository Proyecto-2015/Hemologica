package org.hemologica.service.datatype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.mail.Address;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class MailData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String from;
	private String subject;
	private String content;
	private String token;
	private LinkedList<String> addressTO;
	private LinkedList<String> addressCC;
	private LinkedList<String> addressBCC;
	
	
	public void addAddressTO(String a){
		if(addressTO == null){
			addressTO = new LinkedList<String>();
		}
		addressTO.add(a);
	}
	
	public void addAddressCC(String a){
		
		if(addressCC == null){
			addressCC = new LinkedList<String>();
		}
		addressCC.add(a);
	}
	
	public void addAddressBCC(String a){
		if(addressBCC == null){
			addressBCC = new LinkedList<String>();
		}
		addressBCC.add(a);
	}
	
	public Address[] addressTO() throws AddressException{
		
		if(addressTO == null)
			return null;
		
		InternetAddress[] ret = new InternetAddress[addressTO.size()];
		int i = 0;
		for(String address : addressTO){
			ret[i++] = new InternetAddress(address);
		}
		return ret;
	}
	
	public Address[] addressCC() throws AddressException{
		
		if(addressCC == null)
			return null;
		
		InternetAddress[] ret = new InternetAddress[addressCC.size()];
		int i = 0;
		for(String address : addressCC){
			ret[i++] = new InternetAddress(address);
		}
		return ret;
	}
	
	public Address[] addressBCC() throws AddressException{
		
		if(addressBCC == null)
			return null;
		
		InternetAddress[] ret = new InternetAddress[addressBCC.size()];
		int i = 0;
		for(String address : addressBCC){
			ret[i++] = new InternetAddress(address);
		}
		return ret;
	}

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

	public LinkedList<String> getAddressTO() {
		return addressTO;
	}

	public void setAddressTO(LinkedList<String> addressTO) {
		this.addressTO = addressTO;
	}

	public LinkedList<String> getAddressCC() {
		return addressCC;
	}

	public void setAddressCC(LinkedList<String> addressCC) {
		this.addressCC = addressCC;
	}

	public LinkedList<String> getAddressBCC() {
		return addressBCC;
	}

	public void setAddressBCC(LinkedList<String> addressBCC) {
		this.addressBCC = addressBCC;
	}

}
