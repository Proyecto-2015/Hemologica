package org.hemologica.service.datatype;

import javax.mail.Address;

public class MailData {

	private String from;
	private String subjet;
	private String content;
	private Address[] addressTO;
	private Address[] addressCC;
	private Address[] addressCCO;
	
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
	public Address[] getAddressTO() {
		return addressTO;
	}
	public void setAddressTO(Address[] addressTO) {
		this.addressTO = addressTO;
	}
	public Address[] getAddressCC() {
		return addressCC;
	}
	public void setAddressCC(Address[] addressCC) {
		this.addressCC = addressCC;
	}
	public Address[] getAddressCCO() {
		return addressCCO;
	}
	public void setAddressCCO(Address[] addressCCO) {
		this.addressCCO = addressCCO;
	}
	
	
	
}
