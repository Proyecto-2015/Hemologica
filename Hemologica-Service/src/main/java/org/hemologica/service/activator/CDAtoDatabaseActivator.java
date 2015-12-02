package org.hemologica.service.activator;

import org.hemologica.service.business.IPersonBean;
import org.hemologica.service.datatype.CDA;
import org.hemologica.service.utils.xml.XMLUtils;

public class CDAtoDatabaseActivator {

	private IPersonBean personBean;

	public String process(String cdaString) {

		try {

			CDA cda = new CDA(XMLUtils.stringToDocument(cdaString));
			
//			personBean.createPersonAndRecord(cda.getUserData(), cda.getRoot(), cda.getExtension());
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	

	public IPersonBean getPersonBean() {
		return personBean;
	}

	public void setPersonBean(IPersonBean personBean) {
		this.personBean = personBean;
	}

}
