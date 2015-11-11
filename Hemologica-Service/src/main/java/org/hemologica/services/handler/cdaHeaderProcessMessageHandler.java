package org.hemologica.services.handler;

import org.hemologica.empi.adapter.IEMPIAdapter;

public class cdaHeaderProcessMessageHandler{

	private IEMPIAdapter empi;

	public String onMessage(String message) {
		System.out.println("In onMessage");
		System.out.println(message);
		String payload = message;
		return payload;
	}

	public IEMPIAdapter getEmpi() {
		return empi;
	}

	public void setEmpi(IEMPIAdapter empi) {
		this.empi = empi;
	}
	
	
}
