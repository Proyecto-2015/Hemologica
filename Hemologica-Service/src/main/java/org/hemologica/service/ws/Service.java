package org.hemologica.service.ws;

import java.text.ParseException;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.hemologica.service.datatype.MovementData;

@WebService(
		name="Service",
		serviceName="Service",
		wsdlLocation=""
)
public interface Service {
	
	@WebMethod(operationName="PROVIDE_CDA")
	public void provideCDA(String cda);
	
	@WebMethod(operationName="IMPORT_MOVEMENTS")
	public void importMovements(List<MovementData> movements ) throws ParseException;

}
