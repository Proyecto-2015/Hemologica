package hemologica.mpi.service.impl;

import java.io.Serializable;

import javax.jws.WebService;

import hemologica.mpi.service.IMPIService;
import hemologica.mpi.service.message.request.AddPatientRequest;
import hemologica.mpi.service.message.request.DeletePatientRequest;
import hemologica.mpi.service.message.request.FindPatientRequest;
import hemologica.mpi.service.message.request.QueryPatientRequest;
import hemologica.mpi.service.message.response.AddPatientResponse;
import hemologica.mpi.service.message.response.DeletePatientResponse;
import hemologica.mpi.service.message.response.EditPatientResponse;
import hemologica.mpi.service.message.response.FindPatientResponse;
import hemologica.mpi.service.message.response.QueryPatientResponse;

@WebService(
		endpointInterface="hemologica.mpi.service.IMPIService",
		serviceName="MPIService",
		name="MPI",
		portName="MPIPort",
		targetNamespace="http://www.hemologica.org/mpi/MPIService"	
)
public class MPIServiceImpl implements IMPIService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public FindPatientResponse findPatient(FindPatientRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryPatientResponse queryPatient(QueryPatientRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddPatientResponse addPatient(AddPatientRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EditPatientResponse editPatient(EditPatientResponse req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeletePatientResponse deletePatient(DeletePatientRequest req) {
		// TODO Auto-generated method stub
		return null;
	}	

}
