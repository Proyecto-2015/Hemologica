package hemologica.mpi.service.message.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="addPatientRequest")
public class AddPatientRequest extends AbstractRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
