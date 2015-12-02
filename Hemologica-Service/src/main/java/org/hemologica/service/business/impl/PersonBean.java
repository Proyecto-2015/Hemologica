package org.hemologica.service.business.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.IdentificationsHistory;
import org.hemologica.empi.adapter.IEMPIAdapter;
import org.hemologica.empi.adapter.pixpdq.exception.PDQAdapterException;
import org.hemologica.empi.adapter.pixpdq.exception.PIXAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientResponse;
import org.hemologica.empi.datatypes.Identifier;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.service.business.IPersonBean;
import org.hemologica.xds.repository.adapter.client.IRepositoryXDS;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component
public class PersonBean implements IPersonBean, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5105280976531369972L;

	private BaseXConnection baseXConnection;
	private IEMPIAdapter empi;
	private IRepositoryXDS xdsRepository;

	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;

	@Transactional
	@Override
	public Identifier getID(Map<String,String> data, String cda) {

		try {
			

			PDQQueryPatientRequest pdqQueryPatientRequest = new PDQQueryPatientRequest(data);
			PDQQueryPatientResponse pdqQueryPatientResponse = empi.query(pdqQueryPatientRequest);
			List<Identifier> identifiers = pdqQueryPatientResponse.getIdetifiers(empi.getMyDomain());
			Identifier identifier = null;
			
//			List<Identification> identifiersDB = this.getIdentificationsFromDatabase();
			

			if (identifiers == null || identifiers.isEmpty()) {

				// Insert in Hemologica Database with DAO
				identifier = this.createPerson(data);
				Map<String, String> values = this.getValuesFromData(data);
				values.put("patientIdentifier", identifier.getId());
				CreatePatientRequest createPatientRequest = new CreatePatientRequest(values);
				CreatePatientResponse createPatientResponse = empi.create(createPatientRequest);

			} else {

				// choose/get identifier
				identifier = identifiers.get(0);
				if (identifiers.size() > 1) {
					// send update to Hemologica Database to fix persons-records
					 this.fixPersonIdentifier(identifier, identifiers);
				}
			}
			
			
			return identifier;

		} catch (PDQAdapterException e) {
			e.printStackTrace();
		} catch (PIXAdapterException e) {
			e.printStackTrace();
		}

		return null;
	}


	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	private Identifier createPerson(Map<String, String> data) {
		return empi.createIdentifier();
	}

	private void fixPersonIdentifier(Identifier id, List<Identifier> ids) {

		IIdentificationDAO identificationDAO = FactoryDAO.getIIdentificationDAO(em);
		List<Identification> idsDB = new ArrayList<Identification>();
		Identification idDB = identificationDAO.getIdentificationByCode(id.getId());
		Identification idItem;
		for (Identifier i : ids) {
			idItem = identificationDAO.getIdentificationByCode(i.getId());
			if (idItem != null) {
				idsDB.add(idItem);
			}
			
		}
		identificationDAO.fix(idDB, idsDB);
	}

	private Map<String, String> getValuesFromData(Map<String, String> data) {
		return data;
	}

	public IEMPIAdapter getEmpi() {
		return empi;
	}

	public void setEmpi(IEMPIAdapter empi) {
		this.empi = empi;
	}

	public IRepositoryXDS getXdsRepository() {
		return xdsRepository;
	}

	public void setXdsRepository(IRepositoryXDS xdsRepository) {
		this.xdsRepository = xdsRepository;
	}


	public BaseXConnection getBaseXConnection() {
		return baseXConnection;
	}


	public void setBaseXConnection(BaseXConnection baseXConnection) {
		this.baseXConnection = baseXConnection;
	}

}