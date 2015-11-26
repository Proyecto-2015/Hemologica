package org.hemologica.service.activator;

import org.hemologica.service.datatype.CDA;
import org.hemologica.xds.respository.adapter.client.IRepositoryXDS;

import com.google.gson.Gson;

public class CDAtoXDSProcessActivator {

	private IRepositoryXDS xdsRepositoryAdapter;
	
	public String process(String cdaString){
		
		CDA cda = new Gson().fromJson(cdaString, CDA.class);
		
		
		xdsRepositoryAdapter.saveCDA(
				cda.getAuthorPerson(), 
				cda.getAuthorInstitution(), 
				cda.getAuthorRole(), 
				cda.getCodingSchemeLOINCId(), 
				cda.getCodingSchemeLOINCname(), 
				cda.getCodingSchemeSNOMEDCTId(),
				cda.getCodingSchemeSNOMEDCTName(),
				cda.getLanguageCode(),
				cda.getPID5(),
				cda.getPID7(),
				cda.getPID8(),
				cda.getCdaID(),
				cda.getCdaDocumentType(),
				cda.getCda(),
				cda.getSubmissionTime()
				);
		
		return null;
	}

	public IRepositoryXDS getXdsRepositoryAdapter() {
		return xdsRepositoryAdapter;
	}

	public void setXdsRepositoryAdapter(IRepositoryXDS xdsRepositoryAdapter) {
		this.xdsRepositoryAdapter = xdsRepositoryAdapter;
	}
	
}
