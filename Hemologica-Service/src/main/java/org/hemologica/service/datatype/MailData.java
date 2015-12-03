package org.hemologica.service.datatype;

import java.net.InetAddress;
import java.util.ArrayList;


public class MailData {

	
	private String from;
	private String subjet;
	private String content;
	private ArrayList<InetAddress> addressTO;
	private ArrayList<InetAddress> addressCC;
	private ArrayList<InetAddress> addressBCC;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubjet() {
		return subjet;
	}
	public void setSubjet(String subjet) {
		this.subjet = subjet;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ArrayList<InetAddress> getAddressTO() {
		return addressTO;
	}
	public void setAddressTO(ArrayList<InetAddress> addressTO) {
		this.addressTO = addressTO;
	}
	public ArrayList<InetAddress> getAddressCC() {
		return addressCC;
	}
	public void setAddressCC(ArrayList<InetAddress> addressCC) {
		this.addressCC = addressCC;
	}
	public ArrayList<InetAddress> getAddressBCC() {
		return addressBCC;
	}
	public void setAddressBCC(ArrayList<InetAddress> addressBCC) {
		this.addressBCC = addressBCC;
	}
	
}
