package org.hemologica.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
		name="Service",
		serviceName="Service",
		wsdlLocation=""
)
public interface Service {
	
	@WebMethod(operationName="PROVIDE_CDA")
	public void provideCDA(String cda);

}
