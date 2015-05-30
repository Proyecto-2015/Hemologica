package hemologica.mpi.service;

import hemologica.mpi.service.message.request.AddPatientRequest;
import hemologica.mpi.service.message.request.DeletePatientRequest;
import hemologica.mpi.service.message.request.FindPatientRequest;
import hemologica.mpi.service.message.request.QueryPatientRequest;
import hemologica.mpi.service.message.response.AddPatientResponse;
import hemologica.mpi.service.message.response.DeletePatientResponse;
import hemologica.mpi.service.message.response.EditPatientResponse;
import hemologica.mpi.service.message.response.FindPatientResponse;
import hemologica.mpi.service.message.response.QueryPatientResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(serviceName = "MPIService")
public interface IMPIService {

	@WebMethod(operationName = "findPatient")
	public FindPatientResponse findPatient(@WebParam(name = "request") FindPatientRequest req);
	
	@WebMethod(operationName = "queryPatient")
	public QueryPatientResponse queryPatient(@WebParam(name = "request") QueryPatientRequest req);
	
	@WebMethod(operationName = "addPatient")
	public AddPatientResponse addPatient(@WebParam(name = "request") AddPatientRequest req);
	
	@WebMethod(operationName = "editPatient")
	public EditPatientResponse editPatient(@WebParam(name = "request") EditPatientResponse req);
	
	@WebMethod(operationName = "deletePatient")
	public DeletePatientResponse deletePatient(@WebParam(name = "request") DeletePatientRequest req);
	
}
