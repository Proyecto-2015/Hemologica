package org.hemologica.service.activator;

import org.hemologica.xmldatabase.connection.impl.BaseXConnection;

public class CDAtoBaseXProcessActivator {
	
	private BaseXConnection connectionDonation;
	private BaseXConnection connectionTransfusion;
	private BaseXConnection connectionLaboratory;

	public String process(String cdaString) {

		try {
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}


	public BaseXConnection getConnectionDonation() {
		return connectionDonation;
	}


	public void setConnectionDonation(BaseXConnection connectionDonation) {
		this.connectionDonation = connectionDonation;
	}


	public BaseXConnection getConnectionTransfusion() {
		return connectionTransfusion;
	}


	public void setConnectionTransfusion(BaseXConnection connectionTransfusion) {
		this.connectionTransfusion = connectionTransfusion;
	}


	public BaseXConnection getConnectionLaboratory() {
		return connectionLaboratory;
	}


	public void setConnectionLaboratory(BaseXConnection connectionLaboratory) {
		this.connectionLaboratory = connectionLaboratory;
	}
	
}
