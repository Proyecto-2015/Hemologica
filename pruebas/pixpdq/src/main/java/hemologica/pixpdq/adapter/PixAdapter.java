package hemologica.pixpdq.adapter;

import java.util.List;
import java.util.Set;

import org.openhealthtools.openexchange.datamodel.Identifier;
import org.openhealthtools.openexchange.datamodel.MessageHeader;
import org.openhealthtools.openexchange.datamodel.Patient;
import org.openhealthtools.openexchange.datamodel.PatientIdentifier;
import org.openhealthtools.openpixpdq.api.IPixManagerAdapter;
import org.openhealthtools.openpixpdq.api.PixManagerException;
import org.openhie.openempi.openpixpdqadapter.PixManagerAdapter;

public class PixAdapter extends PixManagerAdapter implements IPixManagerAdapter{

	@Override
	public Set<Identifier> getDomainIdentifiers(Set<Identifier> arg0) {
		return super.getDomainIdentifiers(arg0);
	}

	@Override
	public Identifier getGlobalDomainIdentifier(Identifier arg0) {
		return super.getGlobalDomainIdentifier(arg0);
	}

	@Override
	public List<PatientIdentifier> createPatient(Patient arg0,
			MessageHeader arg1) throws PixManagerException {
		return super.createPatient(arg0, arg1);
	}

	@Override
	public List<PatientIdentifier> findPatientIds(PatientIdentifier arg0,
			MessageHeader arg1) throws PixManagerException {
		return findPatientIds(arg0, arg1);
	}

	@Override
	public boolean isValidPatient(PatientIdentifier arg0, MessageHeader arg1)
			throws PixManagerException {
		return isValidPatient(arg0, arg1);
	}

	@Override
	public List<List<PatientIdentifier>> mergePatients(Patient arg0,
			Patient arg1, MessageHeader arg2) throws PixManagerException {
		return mergePatients(arg0, arg1, arg2);
	}

	@Override
	public List<List<PatientIdentifier>> updatePatient(Patient arg0,
			MessageHeader arg1) throws PixManagerException {
		return updatePatient(arg0, arg1);
	}

}
