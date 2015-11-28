package org.hemologica.service.activator;

import org.hemologica.service.datatype.CDA;
import org.hemologica.service.utils.xml.XMLUtils;
import org.hemologica.xds.repository.adapter.client.IRepositoryXDS;

import com.google.gson.Gson;

public class CDAtoXDSProcessActivator {

	private IRepositoryXDS xdsRepositoryAdapter;

	public String process(String cdaString) {

		try {
			
			CDA cda = new CDA(XMLUtils.stringToDocument(cdaString));
			
//			CDA cda = new Gson().fromJson(cdaString, CDA.class);
		
			cda.loadXDSData();

			xdsRepositoryAdapter.saveCDA(cda.getAuthorPerson(), cda.getAuthorInstitution(), cda.getAuthorRole(),
					cda.getCodingSchemeLOINCId(), cda.getCodingSchemeLOINCname(), cda.getCodingSchemeSNOMEDCTId(),
					cda.getCodingSchemeSNOMEDCTName(), cda.getLanguageCode(), cda.getPID5(), cda.getPID7(),
					cda.getPID8(), cda.getCdaID(), cda.getCdaDocumentType(), cda.getCda(), cda.getSubmissionTime());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public IRepositoryXDS getXdsRepositoryAdapter() {
		return xdsRepositoryAdapter;
	}

	public void setXdsRepositoryAdapter(IRepositoryXDS xdsRepositoryAdapter) {
		this.xdsRepositoryAdapter = xdsRepositoryAdapter;
	}

}
