package org.hemologica.service.handler;

import org.hemologica.empi.adapter.IEMPIAdapter;

public class cdaHeaderProcessMessageHandler{

	private IEMPIAdapter empi;

	public String onMessage(String message) {
		System.out.println(message);
		return message;
	}

	public IEMPIAdapter getEmpi() {
		return empi;
	}

	public void setEmpi(IEMPIAdapter empi) {
		this.empi = empi;
	}
	
	
}
