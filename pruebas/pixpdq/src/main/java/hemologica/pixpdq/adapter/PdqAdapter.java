package hemologica.pixpdq.adapter;

import java.util.Set;
import org.openhealthtools.openexchange.datamodel.Identifier;
import org.openhealthtools.openexchange.datamodel.MessageHeader;
import org.openhealthtools.openpixpdq.api.IPdSupplierAdapter;
import org.openhealthtools.openpixpdq.api.PdSupplierException;
import org.openhealthtools.openpixpdq.api.PdqQuery;
import org.openhealthtools.openpixpdq.api.PdqResult;
import org.openhie.openempi.openpixpdqadapter.PdqSupplierAdapter;

public class PdqAdapter extends PdqSupplierAdapter implements IPdSupplierAdapter{

	@Override
	public Set<Identifier> getDomainIdentifiers(Set<Identifier> arg0) {
		
		return super.getDomainIdentifiers(arg0);
	}

	@Override
	public Identifier getGlobalDomainIdentifier(Identifier arg0) {
		return super.getGlobalDomainIdentifier(arg0);
	}

	@Override
	public void cancelQuery(String arg0, String arg1)
			throws PdSupplierException {
		
		super.cancelQuery(arg0,arg1);
	}

	@Override
	public PdqResult findPatients(PdqQuery arg0, MessageHeader arg1)
			throws PdSupplierException {
		return super.findPatients(arg0, arg1);
	}

}
