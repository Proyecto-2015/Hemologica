package org.hemologica.service.business.impl;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.impl.IdentificationDAOImpl;
import org.hemologica.dao.impl.PersonDAOImpl;
import org.hemologica.dao.impl.PersonRecordDAOImpl;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.empi.adapter.IEMPIAdapter;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientResponse;
import org.hemologica.empi.datatypes.Identifier;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.service.business.IPersonBean;
import org.hemologica.service.utils.xml.XMLUtils;
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

	private static final Logger logger = Logger.getLogger(PersonBean.class.getName());

	private BaseXConnection baseXConnectionDonations;
	private BaseXConnection baseXConnectionTransfusion;
	private BaseXConnection baseXConnectionLaboratory;
	private IEMPIAdapter empi;
	private IRepositoryXDS xdsRepository;
	private String cdaDonationCode; 	// 4321000179101
	private String cdaTransfusionCode; 	// 4321000179102
	private String cdaLaboratoryCode; 	// 4321000179103

	@PersistenceContext(unitName = "Hemologica-Service-PU")
	private EntityManager em;

	@Transactional
	@Override
	public Person processCDAwithEMPIandDatabases(Map<String, String> data, String cda) throws Exception {

		PDQQueryPatientRequest pdqQueryPatientRequest = new PDQQueryPatientRequest(data);
		PDQQueryPatientResponse pdqQueryPatientResponse = empi.query(pdqQueryPatientRequest);
		List<Identifier> identifiers = pdqQueryPatientResponse.getIdetifiers(empi.getMyDomain());
		Identifier identifier = null;

		Person person = null;

//		EntityTransaction tx = this.em.getTransaction();
		try {

//			tx.begin();

			org.w3c.dom.Document doc = XMLUtils.stringToDocument(cda);
			String cdaRoot = XMLUtils.executeXPathString(doc, "/ClinicalDocument/id/@root");
			String cdaExtension = XMLUtils.executeXPathString(doc, "/ClinicalDocument/id/@extension");
			String cdaType = XMLUtils.executeXPathString(doc, "/ClinicalDocument/code/@code");

			if (identifiers == null || identifiers.isEmpty()) {

				// Insert in Hemologica Database with DAO
				identifier = new Identifier();
				identifier.setId(data.get("patientIdentifier"));
				identifier.setDomain(data.get(empi.getMyDomain()));

				// Create Person in database
				person = this.createPersonAndRecord(data, cdaRoot, cdaExtension).getPerson();

				Map<String, String> values = this.getValuesFromData(data);
				values.put("patientIdentifier", identifier.getId());
				CreatePatientRequest createPatientRequest = new CreatePatientRequest(values);
				CreatePatientResponse createPatientResponse = empi.create(createPatientRequest);

				// if(!createPatientResponse.getSuccess()){
				// throw new Exception("TODO put message ");
				// }

				logger.log(Level.INFO, "Process CDA EMPI" + data);

			} else {

				// choose/get identifier
				identifier = identifiers.get(0);
				if (identifiers.size() > 1) {
					// send update to Hemologica Database to fix persons-records
					this.fixPersonIdentifier(identifier, identifiers);

				}
				Identification identification = this.getPersonByEMPIIdentifier(identifier);
				this.createRecord(identification, cdaRoot, cdaExtension);
				person = identification.getPerson();

			}

			if (cdaType.equals(cdaDonationCode)) {
				baseXConnectionTransfusion.addElement(cdaRoot + "." + cdaExtension, cda);
			} else if (cdaType.equals(cdaTransfusionCode)) {
				baseXConnectionLaboratory.addElement(cdaRoot + "." + cdaExtension, cda);
			} else if (cdaType.equals(cdaLaboratoryCode)) {
				baseXConnectionDonations.addElement(cdaRoot + "." + cdaExtension, cda);
			}

//			tx.commit();

		} catch (Exception ex) {

//			if (tx.isActive()) {
//				tx.rollback();
//			}
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}

		return person;

	}

	private Identification createPersonAndRecord(Map<String, String> data, String cdaRoot, String cdaExtension) {

		Identification identification = this.createPerson(data);
		PersonsRecord personsRecord = new PersonsRecord();
//		personsRecord.setIdentification(identification); 12-12-2015 change bruno
		personsRecord.setIdentificationRef(CryptoConverter.encrypt(identification.getId().toString()));
		personsRecord.setPersonsRecordCdaExtension(cdaExtension);
		personsRecord.setPersonsRecordCdaRoot(cdaRoot);
		IPersonRecordDAO personRecordDAO = new PersonRecordDAOImpl(em);
		personRecordDAO.create(personsRecord);
		return identification;

	}

	private Identification getPersonByEMPIIdentifier(Identifier iden) {

		IIdentificationDAO identificationDAO = new IdentificationDAOImpl(em);
		return identificationDAO.getIdentificationByCode(iden.getId());

	}

	private PersonsRecord createRecord(Identification identification, String cdaRoot, String cdaExtension) {

		PersonsRecord personsRecord = new PersonsRecord();
//		personsRecord.setIdentification(identification); 12-12-2015 change bruno
		personsRecord.setIdentificationRef(CryptoConverter.encrypt(identification.getId().toString()));
		personsRecord.setPersonsRecordCdaExtension(cdaExtension);
		personsRecord.setPersonsRecordCdaRoot(cdaRoot);
		IPersonRecordDAO personRecordDAO = new PersonRecordDAOImpl(em);
		return personRecordDAO.create(personsRecord);

	}

	private Identification createPerson(Map<String, String> data) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Person person = new Person();
		person.setPersonFirstName(data.get("name"));
		person.setPersonSecondName(data.get("secondName"));
		person.setPersonFirstLastname(data.get("surname"));
		person.setPersonSecondLastname(data.get("secondSurname"));
		try {
			person.setPersonBirthday(sdf.parse(data.get("birthday")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		person.setPersonEmail(data.get("email"));
		person.setPersonTelephone(data.get("phone"));
		person.setPersonAddress("addresStreet");
		person.setZipCode(data.get("addresZipPostalCode"));

		Identification identification = new Identification();
		identification.setIdentificacionCode(data.get("patientIdentifier"));

		IPersonDAO personDAO = new PersonDAOImpl(em);
		IIdentificationDAO identificationDAO = new IdentificationDAOImpl(em);

		person = personDAO.create(person);
		identification.setPerson(person);
		identification = identificationDAO.create(identification);

		return identification;
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

	public BaseXConnection getBaseXConnectionDonations() {
		return baseXConnectionDonations;
	}

	public void setBaseXConnectionDonations(BaseXConnection baseXConnectionDonations) {
		this.baseXConnectionDonations = baseXConnectionDonations;
	}

	public BaseXConnection getBaseXConnectionTransfusion() {
		return baseXConnectionTransfusion;
	}

	public void setBaseXConnectionTransfusion(BaseXConnection baseXConnectionTransfusion) {
		this.baseXConnectionTransfusion = baseXConnectionTransfusion;
	}

	public BaseXConnection getBaseXConnectionLaboratory() {
		return baseXConnectionLaboratory;
	}

	public void setBaseXConnectionLaboratory(BaseXConnection baseXConnectionLaboratory) {
		this.baseXConnectionLaboratory = baseXConnectionLaboratory;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public String getCdaDonationCode() {
		return cdaDonationCode;
	}

	public void setCdaDonationCode(String cdaDonationCode) {
		this.cdaDonationCode = cdaDonationCode;
	}

	public String getCdaTransfusionCode() {
		return cdaTransfusionCode;
	}

	public void setCdaTransfusionCode(String cdaTransfusionCode) {
		this.cdaTransfusionCode = cdaTransfusionCode;
	}

	public String getCdaLaboratoryCode() {
		return cdaLaboratoryCode;
	}

	public void setCdaLaboratoryCode(String cdaLaboratoryCode) {
		this.cdaLaboratoryCode = cdaLaboratoryCode;
	}

}
