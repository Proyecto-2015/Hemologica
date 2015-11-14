package org.hemologica.services.business.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hemologica.dao.IPersonDAO;
import org.hemologica.empi.adapter.IEMPIAdapter;
import org.hemologica.empi.adapter.pixpdq.exception.PDQAdapterException;
import org.hemologica.empi.adapter.pixpdq.exception.PIXAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientResponse;
import org.hemologica.empi.datatypes.Identifier;
import org.hemologica.services.business.PersonBean;

public class PersonBeanImpl implements PersonBean, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5105280976531369972L;

	private IEMPIAdapter empi;
	private IPersonDAO personDAO;

	@Override
	public Identifier getID(Map<String, String> data) {

		try {

			PDQQueryPatientRequest pdqQueryPatientRequest = new PDQQueryPatientRequest(data);
			PDQQueryPatientResponse pdqQueryPatientResponse = empi.query(pdqQueryPatientRequest);
			List<Identifier> identifiers = pdqQueryPatientResponse.getIdetifiers("HEMOLOGICA");
			Identifier identifier = null;

			if (identifiers == null || identifiers.isEmpty()) {

				// Insert in Hemologica Database with DAO
				// identifier = personDAO.create(new Person(data));
				Map<String, String> values = this.getValuesFromData(data);
				values.put("patientIdentifier", identifier.getId());
				CreatePatientRequest createPatientRequest = new CreatePatientRequest(values);
				CreatePatientResponse createPatientResponse = empi.create(createPatientRequest);

			} else {

				// choose/get identifier
				identifier = identifiers.get(0);

				if (identifiers.size() > 1) {
					// send update to Hemologica Database to fix persons-records

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

	private Map<String, String> getValuesFromData(Map<String, String> data) {
		return data;
	}

	public IEMPIAdapter getEmpi() {
		return empi;
	}

	public void setEmpi(IEMPIAdapter empi) {
		this.empi = empi;
	}

	public IPersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(IPersonDAO personDAO) {
		this.personDAO = personDAO;
	}

}
