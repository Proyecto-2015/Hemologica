package org.hemologica.salud.ejb.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import org.hemologica.constants.Constants;
import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.DonationTypesCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.ResultsCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.cdas.AdministrativeGenderCodeType;
import org.hemologica.salud.ejb.cdas.AssignedAuthorType;
import org.hemologica.salud.ejb.cdas.AssignedCustodianType;
import org.hemologica.salud.ejb.cdas.AssignedPersonType;
import org.hemologica.salud.ejb.cdas.AuthorType;
import org.hemologica.salud.ejb.cdas.BirthTimeType;
import org.hemologica.salud.ejb.cdas.ClinicalDocumentType;
import org.hemologica.salud.ejb.cdas.CodeType;
import org.hemologica.salud.ejb.cdas.ComponentType;
import org.hemologica.salud.ejb.cdas.ConfidentialityCodeType;
import org.hemologica.salud.ejb.cdas.CustodianType;
import org.hemologica.salud.ejb.cdas.EffectiveTimeType;
import org.hemologica.salud.ejb.cdas.EntryRelationshipType;
import org.hemologica.salud.ejb.cdas.EntryType;
import org.hemologica.salud.ejb.cdas.IdType;
import org.hemologica.salud.ejb.cdas.InterpretationCodeType;
import org.hemologica.salud.ejb.cdas.LanguageCodeType;
import org.hemologica.salud.ejb.cdas.NameType;
import org.hemologica.salud.ejb.cdas.ObservationType;
import org.hemologica.salud.ejb.cdas.OrganizerType;
import org.hemologica.salud.ejb.cdas.PatientRoleType;
import org.hemologica.salud.ejb.cdas.PatientType;
import org.hemologica.salud.ejb.cdas.ProcedureType;
import org.hemologica.salud.ejb.cdas.RecordTargetType;
import org.hemologica.salud.ejb.cdas.RepresentedCustodianOrganizationType;
import org.hemologica.salud.ejb.cdas.RepresentedOrganizationType;
import org.hemologica.salud.ejb.cdas.SectionType;
import org.hemologica.salud.ejb.cdas.SpecimenPlayingEntityType;
import org.hemologica.salud.ejb.cdas.SpecimenRoleType;
import org.hemologica.salud.ejb.cdas.SpecimenType;
import org.hemologica.salud.ejb.cdas.StatusCodeType;
import org.hemologica.salud.ejb.cdas.StructuredBodyType;
import org.hemologica.salud.ejb.cdas.TelecomType;
import org.hemologica.salud.ejb.cdas.TimeType;
import org.hemologica.salud.ejb.cdas.TypeIdType;
import org.hemologica.salud.ejb.cdas.ValueType;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class CdaUtils {
	
	/**
	 * Crea el elemento clinicaDocument con la informacion de la persona.
	 * @param dataPerson
	 * @return
	 */
	
	private static final Logger logger = Logger.getLogger(CdaUtils.class.getName());
	
	public static ClinicalDocumentType getCDAStructure(DataPerson dataPerson,String date, DataBank dataBank, DataResponsiblePerson dataDoctor){
		
		ClinicalDocumentType clinicalDocumentType = new ClinicalDocumentType();
		
		/**
		 * typeId
		 */
		TypeIdType typeIdType = new TypeIdType();
		typeIdType.setRoot(Constants.CDA_TYPE_ID_ROOT);
		typeIdType.setExtension(Constants.CDA_TYPE_ID_EXTENSION);
		clinicalDocumentType.setTypeId(typeIdType);
		
		/**
		 * IDENTIFICADOR DEL CDA ---
		 */

		IdType idType = new IdType();
		idType.setRoot(Constants.OID_HEMOLOGICA_CDA);
		idType.setExtension(FactoryBeans.getCodeBeans().getNewCDAid());
		clinicalDocumentType.setId(idType);
		
		/**
		 * Fecha que se genero el cda.
		 */
		EffectiveTimeType effectiveTimeType = new EffectiveTimeType();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		effectiveTimeType.setEffectiveTimeTypeValue(Long.valueOf(sdf.format(Calendar.getInstance().getTime())));
		clinicalDocumentType.setEffectiveTime(effectiveTimeType);
		
		/**
		 * Confidencialidad
		 */
		ConfidentialityCodeType confidentialityCodeType = new ConfidentialityCodeType();
		confidentialityCodeType.setCodeSystem(Constants.CONFIDENTIALITY_CODE_SYSTEM);
		confidentialityCodeType.setCodeSystemName(Constants.CONFIDENTIALITY_CODE_SYSTEM_NAME);
		confidentialityCodeType.setCode(Constants.CONFIDENTIALITY_CODE_N);
		confidentialityCodeType.setDisplayName(Constants.CONFIDENTIALITY_CODE_N_DISPLAY_NAME);
		clinicalDocumentType.setConfidentialityCode(confidentialityCodeType);
		
		/**
		 * Language
		 */
		LanguageCodeType languageCodeType = new LanguageCodeType();
		languageCodeType.setCode(Constants.LANGUAGE_UY_CODE);
		clinicalDocumentType.setLanguageCode(languageCodeType);
		
		/**
		 * Record Target
		 */
		RecordTargetType recordTargetType = new RecordTargetType();
		recordTargetType.setTypeCode(Constants.RCT);
		recordTargetType.setContextControlCode(Constants.OP);
		
		/**
		 * Patient Role
		 */
		PatientRoleType patientRoleType = new PatientRoleType();
		patientRoleType.setClassCode(Constants.PAT);
		
		IdType idTypeRecordTarget = new IdType();
		idTypeRecordTarget.setRoot(Constants.OID_HCE_HEMOLOGICA_CDA);
		idTypeRecordTarget.setExtension(FactoryBeans.getCodeBeans().getNewHcCDAid());
		patientRoleType.setId(idTypeRecordTarget);
		
		if(dataPerson.getTelephone()!= null && !dataPerson.getTelephone().equals("")){
			
			TelecomType telcomTypeTel = new TelecomType();
			telcomTypeTel.setUse(Constants.USE_HP);
			telcomTypeTel.setTelecomTypeValue(Constants.TEL + dataPerson.getTelephone());
			patientRoleType.getTelecom().add(telcomTypeTel);
		}
		
		if(dataPerson.getEmail()!= null && !dataPerson.getEmail().equals("")){
			
			TelecomType telcomTypeTel = new TelecomType();
			telcomTypeTel.setUse(Constants.USE_HP);
			telcomTypeTel.setTelecomTypeValue(Constants.MAIL + dataPerson.getEmail());
			patientRoleType.getTelecom().add(telcomTypeTel);
		}
		
		/**
		 * Patient
		 */
		PatientType PatientType = new PatientType();
		PatientType.setClassCode(Constants.PSN);
		PatientType.setDeterminerCode(Constants.INSTANCE);
		
		IdType idPerson = new IdType();
		idPerson.setRoot(Constants.ID_OID_PATH + "." + dataPerson.getDocumentCountry().getCode()+"."+dataPerson.getDocumentType().getCode()+"."+dataPerson.getDocumentNumber());
		PatientType.setId(idPerson);
		
		NameType nameType = new NameType();
		if(dataPerson.getFirstName()!= null)
			nameType.getGiven().add(dataPerson.getFirstName());
		
		if(dataPerson.getSecondName()!=null)
			nameType.getGiven().add(dataPerson.getSecondName());
		
		if(dataPerson.getSecondName()!=null)
			nameType.getFamily().add(dataPerson.getFirstLastName());
		
		if(dataPerson.getSecondLastName()!=null)
			nameType.getFamily().add(dataPerson.getSecondLastName());
		
		PatientType.setName(nameType);
		
		if(dataPerson.getGender()!= null){
			
			AdministrativeGenderCodeType administrativeGenderCodeType = new AdministrativeGenderCodeType();
			administrativeGenderCodeType.setCodeSystem(Constants.GENDER_SYSTEM_CODE);
			administrativeGenderCodeType.setCode(new Byte(dataPerson.getGender().getCode()));
			PatientType.setAdministrativeGenderCode(administrativeGenderCodeType);
			
		}
		if(dataPerson.getBirthdayDate() != null && !dataPerson.getBirthdayDate().equals("")){
			
			BirthTimeType birthTimeType = new BirthTimeType();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
			try {
				
				birthTimeType.setBirthTimeTypeValue(Integer.valueOf(sdf2.format(sdf1.parse(dataPerson.getBirthdayDate()))));
				
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
			PatientType.setBirthTime(birthTimeType);
			
		}
		
		patientRoleType.setPatient(PatientType);
		recordTargetType.setPatientRole(patientRoleType);
		clinicalDocumentType.setRecordTarget(recordTargetType);
		
		/**
		 * Author
		 */
		AuthorType authorType = new AuthorType();
		authorType.setContextControlCode(Constants.OP);
		authorType.setTypeCode(Constants.AUT);
		
		if(date != null){
			
			TimeType timeType = new TimeType();
			timeType.setTimeTypeValue(Long.valueOf(date));
			authorType.setTime(timeType);
			
		}
		
		/**
		 * assignedAuthor
		 */
		AssignedAuthorType assignedAuthorType = new AssignedAuthorType();
		assignedAuthorType.setClassCode(Constants.ASSIGNED);
		
		IdType idAuthor = new IdType();
		
		if(dataDoctor != null && dataDoctor.getDocuments()!= null){
			idAuthor.setRoot(Constants.ID_OID_PATH + "." + dataDoctor.getDocuments().getDocumentCountry()
					+"."+dataDoctor.getDocuments().getDocumentType()+"."+dataDoctor.getDocuments().getDocumentNumber());
			assignedAuthorType.setId(idAuthor);
		}
		
		AssignedPersonType assignedPersonType =new AssignedPersonType();
		
		NameType nameAuthor = new NameType();
		if(dataDoctor.getFirstName()!= null)
			nameAuthor.getGiven().add(dataDoctor.getFirstName());
		
		if(dataDoctor.getSecondName()!=null)
			nameAuthor.getGiven().add(dataDoctor.getSecondName());
		
		if(dataDoctor.getSecondName()!=null)
			nameAuthor.getFamily().add(dataDoctor.getFirstLastName());
		
		if(dataDoctor.getSecondLastName()!=null)
			nameAuthor.getFamily().add(dataDoctor.getSecondLastName());
		
		assignedPersonType.setName(nameAuthor);
		
		assignedAuthorType.setAssignedPerson(assignedPersonType);
		
		RepresentedOrganizationType representedOrganizationType = new RepresentedOrganizationType();
		
		if(dataBank != null){
		
			IdType idTypeBank = new IdType();
			idTypeBank.setRoot(dataBank.getCode());
			representedOrganizationType.setId(idTypeBank);
			representedOrganizationType.setName(dataBank.getName());
			
		}
		assignedAuthorType.setRepresentedOrganization(representedOrganizationType);
		
		authorType.setAssignedAuthor(assignedAuthorType);
		
		clinicalDocumentType.setAuthor(authorType);
		
		/**
		 * Custodian
		 */
		CustodianType custodianType = new CustodianType();
		
		AssignedCustodianType assignedCustodianType = new AssignedCustodianType();
		
		RepresentedCustodianOrganizationType representedCustodianOrganizationType = new RepresentedCustodianOrganizationType();
		
		IdType idHemologica = new IdType();
		idHemologica.setRoot(Constants.OID_HEMOLOGICA);
		
		representedCustodianOrganizationType.setId(idHemologica);
		representedCustodianOrganizationType.setName(Constants.HEMOLOGICA_NAME);
		
		assignedCustodianType.setRepresentedCustodianOrganization(representedCustodianOrganizationType);
		
		custodianType.setAssignedCustodian(assignedCustodianType);
		
		clinicalDocumentType.setCustodian(custodianType);
		
		return clinicalDocumentType;
	}

	public static ComponentType getComponentDonation(DataDonation dataDonacion, EntityManager em) {
		
		ComponentType componentType = new ComponentType();
		
		StructuredBodyType structuredBodyType = new StructuredBodyType();
		
		ComponentType component = new ComponentType();
		
		/**
		 * Section
		 */
		SectionType SectionType = new SectionType();
		
		/**
		 * Entry
		 */
		
		EntryType entryType = new EntryType();
		SectionType.getEntry().add(entryType);
		
		ProcedureType procedureType = new ProcedureType();
		procedureType.setClassCode(Constants.PROC);
		procedureType.setMoodCode(Constants.EVN);
		
		IdType idDonation = new IdType();
		idDonation.setRoot("id");
		procedureType.setId(idDonation);
		
		CodeType codeType = new CodeType();
		codeType.setCodeSystem(Constants.SNOMED_CODE);
		codeType.setCodeSystemName(Constants.SNOMED_NAME);
		
		/**
		 * tipo de donacion.
		 */
		DonationTypesCode donationTypesCode = FactoryDAO.getCodesDAO(em).getDonationTypeByCode(dataDonacion.getDonationType().getCode());
		
		codeType.setCode(Long.valueOf(donationTypesCode.getConcept().getConceptCode()));
		
		if(donationTypesCode.getConcept().getConceptsDisplays() != null && donationTypesCode.getConcept().getConceptsDisplays().size() !=0){
			
			codeType.setDisplayName(donationTypesCode.getConcept().getConceptsDisplays().get(0).getConceptLabel());
			
		}
		procedureType.setCode(codeType);
		
		/**
		 * effectiveTime
		 */
		EffectiveTimeType effectiveTime = new EffectiveTimeType();
		procedureType.setEffectiveTime(effectiveTime);

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");
		
//		if(dataDonacion.getExtractionTimeBegin()!= null){
//			
//			LowType lowType = new LowType();
//			lowType.setValue5(Long.valueOf(dataDonacion.getExtractionTimeBegin()));
//			effectiveTime.getContent().add((Serializable) lowType);
//		}		
//		
//		
//		if(dataDonacion.getExtractionTimeEnd()!= null){
//			
//			HighType highType = new HighType();
//			highType.setValue6(Long.valueOf(dataDonacion.getExtractionTimeEnd()));
//			effectiveTime.getContent().add((Serializable) highType);
//			
//		}
		
		/**
		 * Tipo de Donante
		 */
		if(dataDonacion.getDataDonorType() != null){
			EntryType entryDonorType = new EntryType();
			
			ObservationType observartionDonorType = new ObservationType();
			observartionDonorType.setClassCode(Constants.OBS);
			observartionDonorType.setMoodCode(Constants.EVN);
			CodeType codeDonorType = new CodeType();
			codeDonorType.setCode(Long.valueOf(dataDonacion.getDataDonorType().getCode()));
//			codeDonorType.setDisplayName(dataDonacion.getDataDonorType().getDisplayName());
			
			observartionDonorType.setCode(codeDonorType);
			entryDonorType.setObservation(observartionDonorType);
			SectionType.getEntry().add(entryDonorType);
		}
		
		
		
		/**
		 * Status Code
		 */
		
		StatusCodeType statusCodeType = new StatusCodeType();
		if(dataDonacion.getState().getCode().equals(Constants.COMPLETED)){
			/**
			 * Realizada
			 */
			statusCodeType.setCode(Constants.COMPLETED);
			
			/**
			 * Specimen
			 */
			SpecimenType specimenType = new SpecimenType();
			specimenType.setTypeCode(Constants.SPC);
			SpecimenRoleType specimenRoleType = new SpecimenRoleType();
			specimenRoleType.setClassCode(Constants.SPEC);
			
			IdType idBlood = new IdType();
			idBlood.setRoot(dataDonacion.getBloodCode());
			specimenRoleType.setId(idBlood);
			
			specimenType.setSpecimenRole(specimenRoleType);
			procedureType.getSpecimen().add(specimenType);
			
			/**
			 * Grupo Sanguineo
			 */
			EntryRelationshipType entryRelationshipType = new EntryRelationshipType();
			entryRelationshipType.setTypeCode(Constants.COMP);
			
			ObservationType observationType = new ObservationType();
			observationType.setClassCode(Constants.OBS);
			observationType.setMoodCode(Constants.EVN);
			
			CodeType codeTypeBloodType = new CodeType();
			codeTypeBloodType.setCodeSystem(Constants.SNOMED_CODE);
			codeTypeBloodType.setCodeSystemName(Constants.SNOMED_NAME);
			if(dataDonacion.getBloodABOType() != null && dataDonacion.getBloodDType() != null){
				
				BloodTypes bloodType = FactoryDAO.getbloodDAO(em).getBloodTypeCodeByABORHCodes(dataDonacion.getBloodABOType().getCode(),
						dataDonacion.getBloodDType().getCode());
				
				if(bloodType != null){
					
					codeTypeBloodType.setCode(Long.valueOf(bloodType.getConcept().getConceptCode()));
					if(bloodType.getConcept().getConceptsDisplays()!= null && bloodType.getConcept().getConceptsDisplays().size()!=0){
						
						codeTypeBloodType.setDisplayName(bloodType.getConcept().getConceptsDisplays().get(0).getConceptLabel());
						
					}
				}
			}
			
			procedureType.getEntryRelationship().add(entryRelationshipType);
			observationType.setCode(codeTypeBloodType);
			entryRelationshipType.setObservation(observationType);
			
			/**
			 * Eventos adeversos si corresponden
			 */
			 if(dataDonacion.getEvents()!= null && dataDonacion.getEvents().size()!=0){
				 
				 EntryType entryTypeEvents = new EntryType();
				 ObservationType observationTypeEvents = new ObservationType();
				 observationTypeEvents.setClassCode(Constants.OBS);
				 observationTypeEvents.setMoodCode(Constants.EVN);
				 observationTypeEvents.setCode(new CodeType());
				 
				 entryTypeEvents.setObservation(observationTypeEvents);
				 
				 for(DataDonationEvent event : dataDonacion.getEvents()){
					 
					 EntryRelationshipType entryRelationshipTypeEvent = new EntryRelationshipType();
					 entryRelationshipTypeEvent.setTypeCode(Constants.CAUS);
					 
					 ObservationType observationTypeEvent = new ObservationType();
					 observationTypeEvent.setClassCode(Constants.OBS);
					 observationTypeEvent.setMoodCode(Constants.EVN);
					 
					 CodeType codeTypeEvent = new CodeType();
					 codeTypeEvent.setCodeSystem(Constants.SNOMED_CODE);
					 codeTypeEvent.setCodeSystemName(Constants.SNOMED_NAME);
					 
					 DonationEventsCode donationEvent = FactoryDAO.getCodesDAO(em).getDonationsEventById(event.getEvent().getCode());
					 if(donationEvent != null){
						 
						 codeTypeEvent.setCode(Long.valueOf(donationEvent.getConcept().getConceptCode()));
						 if(donationEvent.getConcept().getConceptsDisplays() != null && donationEvent.getConcept().getConceptsDisplays().size()!= 0){
							 
							 codeType.setDisplayName(donationEvent.getConcept().getConceptsDisplays().get(0).getConceptLabel());
							 
						 }
					 }
					 
					 observationTypeEvent.setCode(codeTypeEvent);
					 
					 InterpretationCodeType interpretationCodeType = new InterpretationCodeType();
					 interpretationCodeType.setCodeSystem(Constants.SNOMED_CODE);
					 interpretationCodeType.setCodeSystemName(Constants.SNOMED_NAME);
					 
					 EventSeverityCode severity = FactoryDAO.getCodesDAO(em).getSeverityById(event.getSeverity().getCode());
					 if(severity != null){
						 
						 interpretationCodeType.setCode(Integer.valueOf(severity.getConcept().getConceptCode()));
						 
						 if(severity.getConcept().getConceptsDisplays() != null && severity.getConcept().getConceptsDisplays().size()!= 0){
							 
							 interpretationCodeType.setDisplayName(severity.getConcept().getConceptsDisplays().get(0).getConceptLabel());
							 
						 }
					 }
					 
					 observationTypeEvent.setInterpretationCode(interpretationCodeType);
					 entryRelationshipTypeEvent.setObservation(observationTypeEvent);
					 
					 observationTypeEvents.getEntryRelationship().add(entryRelationshipTypeEvent);
				 }
				 
				 entryTypeEvents.setObservation(observationTypeEvents);
				 
				 SectionType.getEntry().add(entryTypeEvents);
			 }
			
			
		}else if(dataDonacion.getState().getCode().equals(Constants.CANCELED)){
			/**
			 * Cancelada
			 */
			statusCodeType.setCode(Constants.CANCELED);
			
			EntryRelationshipType entryRelationshipTypeEvent = new EntryRelationshipType();
			entryRelationshipTypeEvent.setTypeCode(Constants.CAUS);
			 
			 ObservationType observationTypeEvent = new ObservationType();
			 observationTypeEvent.setClassCode(Constants.OBS);
			 observationTypeEvent.setMoodCode(Constants.EVN);
			 
			 entryRelationshipTypeEvent.setObservation(observationTypeEvent);
			 
			 CodeType codeTypeEvent = new CodeType();
			 codeTypeEvent.setCodeSystem(Constants.SNOMED_CODE);
			 codeTypeEvent.setCodeSystemName(Constants.SNOMED_NAME);
			 
			 //Motivo de rechazo
			 if(dataDonacion.getFail()!=null && dataDonacion.getFail().getCause()!=null){
				
				 DonationFailCausesCode failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(dataDonacion.getFail().getCause().getCode());
				 if(failCause != null){
					 
					 codeTypeEvent.setCode(Long.valueOf(failCause.getConcept().getConceptCode()));
					 if(failCause.getConcept().getConceptsDisplays() != null && failCause.getConcept().getConceptsDisplays().size()!= 0){
						 
						 codeType.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
						 
					 }
				 }
				 
				 observationTypeEvent.setCode(codeTypeEvent);
				 
				 ValueType valueType = new ValueType();
				 valueType.setCodeSystem(Constants.SNOMED_CODE);
				 valueType.setCodeSystemName(Constants.SNOMED_NAME);
				 
				 DonationFailTypeCode failType = FactoryDAO.getCodesDAO(em).getRejectionTypesById(dataDonacion.getFail().getRejectionType().getCode());
				 if(failType != null){
					 
					 valueType.setCode(Integer.valueOf(failType.getConcept().getConceptCode()));
					 if(failType.getConcept().getConceptsDisplays() != null && failType.getConcept().getConceptsDisplays().size()!= 0){
						 
						 valueType.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
						 
					 }
				 }
				 
				 observationTypeEvent.getValue().add(valueType);
				 
				 if(dataDonacion.getFail().getDate()!=null && dataDonacion.getDate() != null){
					 
					 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					 
					 try {
						 
						int days = Days.daysBetween(new DateTime(sdf.parse(dataDonacion.getDate())), new DateTime(sdf.parse(dataDonacion.getFail().getDate()))).getDays();
						ValueType valueDays = new ValueType();
						valueDays.setUnit(Constants.DAYS);
						valueDays.setValueTypeValue(new Byte(String.valueOf(days)));
						
						observationTypeEvent.getValue().add(valueDays);
						
					} catch (ParseException e) {
						
						logger.log(Level.SEVERE, "Error al parsear las fechas", e);
						
					}
					 
				 }
			 }
			 
			 procedureType.getEntryRelationship().add(entryRelationshipTypeEvent);

		}
		
		
		procedureType.setStatusCode(statusCodeType);
		entryType.setProcedure(procedureType);
		
		
		component.setSection(SectionType);
		structuredBodyType.getComponent().add(component);
		componentType.setStructuredBody(structuredBodyType);

		return componentType;
	}

	public static ComponentType getComponentLaboratory(DataDonation dataDonacion, EntityManager em) {
		
		ComponentType componentType = new ComponentType();
		
		StructuredBodyType structuredBodyType = new StructuredBodyType();
		componentType.setStructuredBody(structuredBodyType);
		
		ComponentType component = new ComponentType();
		structuredBodyType.getComponent().add(component);
		
		/**
		 * Section
		 */
		SectionType SectionType = new SectionType();
		component.setSection(SectionType);
		
		/**
		 * Entry
		 */
		
		EntryType entryType = new EntryType();
		SectionType.getEntry().add(entryType);
		
		OrganizerType organizerType = new OrganizerType();
		organizerType.setClassCode(Constants.BATTERY);
		organizerType.setMoodCode(Constants.EVN);
		
		entryType.setOrganizer(organizerType);
		
		IdType idPrueba = new IdType();
		idPrueba.setRoot("id");
		organizerType.setId(idPrueba);
		

		StatusCodeType statusCodeType = new StatusCodeType();
		statusCodeType.setCode(Constants.COMPLETED);
		organizerType.setStatusCode(statusCodeType);
		
		EffectiveTimeType effectiveTimeType = new EffectiveTimeType();
		effectiveTimeType.setEffectiveTimeTypeValue(Long.valueOf(dataDonacion.getTime()));
		organizerType.setEffectiveTime(effectiveTimeType);
		
		SpecimenType specimenType = new SpecimenType();
		specimenType.setTypeCode(Constants.SPC);
		SpecimenRoleType specimenRoleType = new SpecimenRoleType();
		specimenRoleType.setClassCode(Constants.SPEC);
		
		IdType idBlood = new IdType();
		idBlood.setRoot(dataDonacion.getBloodCode());
		specimenRoleType.setId(idBlood);
		
		specimenType.setSpecimenRole(specimenRoleType);
		organizerType.setSpecimen(specimenType);
		
		
		for(DataLaboratoryResult laboratory : dataDonacion.getLabResults()){
			ComponentType componentTypeLab = new ComponentType();
			ObservationType observationTypeLab = new ObservationType();
			observationTypeLab.setMoodCode(Constants.EVN);
			observationTypeLab.setClassCode(Constants.OBS);
			
			componentTypeLab.setObservation(observationTypeLab);
			
			
			IdType idPruebaLab = new IdType();
			idPruebaLab.setRoot("idprueba");
			observationTypeLab.setId(idPruebaLab);
			
			CodeType codeTypeLab = new CodeType();
			codeTypeLab.setCodeSystem(Constants.SNOMED_CODE);
			codeTypeLab.setCodeSystemName(Constants.SNOMED_NAME);
			 			
			DonationLaboratoyCode failCause = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(laboratory.getAnalysis().getCode());
			 if(failCause != null){
				 
				 codeTypeLab.setCode(Long.valueOf(failCause.getConcept().getConceptCode()));
				 if(failCause.getConcept().getConceptsDisplays() != null && failCause.getConcept().getConceptsDisplays().size()!= 0){
					 
					 codeTypeLab.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
					 
				 }
			 }
			 
			 observationTypeLab.setCode(codeTypeLab);
			 
			 StatusCodeType statusCodeLab = new StatusCodeType();
			 statusCodeLab.setCode(Constants.COMPLETED);
			 
			 observationTypeLab.setStatusCode(statusCodeLab);
			 
			 ValueType value = new ValueType();
			 value.setCodeSystem(Constants.SNOMED_CODE);
			 value.setCodeSystemName(Constants.SNOMED_NAME);
			
			 ResultsCode resultCode = FactoryDAO.getCodesDAO(em).getResultById(laboratory.getResult().getCode());
			 if(resultCode != null){
				 
				 value.setCode(Integer.valueOf(resultCode.getConcept().getConceptCode()));
				 if(resultCode.getConcept().getConceptsDisplays() != null && resultCode.getConcept().getConceptsDisplays().size()!= 0){
					 
					 value.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
					 
				 }
			 }
			 observationTypeLab.getValue().add(value);
			 
			 organizerType.getComponent().add(componentTypeLab);
			
		}	
		
		return componentType;
	}

	public static ComponentType getComponentTransfusion(DataTransfusion dataTransfusion, EntityManager em) {
		
		ComponentType componentType = new ComponentType();
		
		StructuredBodyType structuredBodyType = new StructuredBodyType();
		componentType.setStructuredBody(structuredBodyType);
		
		ComponentType component = new ComponentType();
		structuredBodyType.getComponent().add(component);
		
		/**
		 * Section
		 */
		SectionType SectionType = new SectionType();
		component.setSection(SectionType);
		
		/**
		 * Entry
		 */
		
		EntryType entryType = new EntryType();
		SectionType.getEntry().add(entryType);
		
		ProcedureType procedureType = new ProcedureType();
		procedureType.setClassCode(Constants.PROC);
		procedureType.setMoodCode(Constants.EVN);
		entryType.setProcedure(procedureType);
		
		IdType idDonation = new IdType();
		idDonation.setRoot("id");
		procedureType.setId(idDonation);
		
		CodeType codeType = new CodeType();
		codeType.setCodeSystem(Constants.SNOMED_CODE);
		codeType.setCodeSystemName(Constants.SNOMED_NAME);
		codeType.setCode(Constants.TRANSFUSION_CODE);
		codeType.setDisplayName(Constants.TRANSFUSION_DISPLAY);
		
		procedureType.setCode(codeType);
		
		/**
		 * Status Code
		 */
		
		StatusCodeType statusCodeType = new StatusCodeType();
		statusCodeType.setCode(Constants.COMPLETED);
		
		procedureType.setStatusCode(statusCodeType);
		
		/**
		 * effectiveTime
		 */
		EffectiveTimeType effectiveTime = new EffectiveTimeType();
		procedureType.setEffectiveTime(effectiveTime);

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");
		
//		if(dataDonacion.getExtractionTimeBegin()!= null){
//			
//			LowType lowType = new LowType();
//			lowType.setValue5(Long.valueOf(dataDonacion.getExtractionTimeBegin()));
//			effectiveTime.getContent().add((Serializable) lowType);
//		}		
//		
//		
//		if(dataDonacion.getExtractionTimeEnd()!= null){
//			
//			HighType highType = new HighType();
//			highType.setValue6(Long.valueOf(dataDonacion.getExtractionTimeEnd()));
//			effectiveTime.getContent().add((Serializable) highType);
//			
//		}
		
		procedureType.setEffectiveTime(effectiveTime);
		
		/**
		 * Specimen Donacion
		 */
		/**
		 * Specimen
		 */
		SpecimenType specimenProduct = new SpecimenType();
		specimenProduct.setTypeCode(Constants.SPC);
		SpecimenRoleType specimenRoleProduct = new SpecimenRoleType();
		specimenRoleProduct.setClassCode(Constants.SPEC);
		
		IdType idProduct = new IdType();
		idProduct.setRoot(dataTransfusion.getProductCode());
		specimenRoleProduct.setId(idProduct);
		
		SpecimenPlayingEntityType specimenPlayingEntityTypeProduct = new SpecimenPlayingEntityType();
		CodeType codeTypeSpecimenProduct = new CodeType();
		codeTypeSpecimenProduct.setCodeSystem(Constants.SNOMED_CODE);
		codeTypeSpecimenProduct.setCodeSystemName(Constants.SNOMED_NAME);
		codeTypeSpecimenProduct.setCode(Constants.SPECIMEN_PRODUCT_CODE);
		codeTypeSpecimenProduct.setDisplayName(Constants.SPECIMEN_PRODUCT_DISPLAY);
		
		specimenPlayingEntityTypeProduct.setCode(codeTypeSpecimenProduct);
		specimenRoleProduct.setSpecimenPlayingEntity(specimenPlayingEntityTypeProduct);
		specimenProduct.setSpecimenRole(specimenRoleProduct);
		procedureType.getSpecimen().add(specimenProduct);
		
		/**
		 * Specimen Donacion
		 */
		/**
		 * Specimen
		 */
		SpecimenType specimenDonacion = new SpecimenType();
		specimenDonacion.setTypeCode(Constants.SPC);
		SpecimenRoleType specimenRoleDonacion = new SpecimenRoleType();
		specimenRoleDonacion.setClassCode(Constants.SPEC);
		
		IdType idBlood = new IdType();
		idBlood.setRoot(dataTransfusion.getAssociatedDonation());
		specimenRoleDonacion.setId(idBlood);
		
		SpecimenPlayingEntityType specimenPlayingEntityType = new SpecimenPlayingEntityType();
		CodeType codeTypeSpecimenDonation = new CodeType();
		codeTypeSpecimenDonation.setCodeSystem(Constants.SNOMED_CODE);
		codeTypeSpecimenDonation.setCodeSystemName(Constants.SNOMED_NAME);
		codeTypeSpecimenDonation.setCode(Constants.SPECIMEN_DONATION_CODE);
		codeTypeSpecimenDonation.setDisplayName(Constants.SPECIMEN_DONATION_DISPLAY);

		specimenPlayingEntityType.setCode(codeTypeSpecimenDonation);
		specimenRoleDonacion.setSpecimenPlayingEntity(specimenPlayingEntityType);
		specimenDonacion.setSpecimenRole(specimenRoleDonacion);
		procedureType.getSpecimen().add(specimenDonacion);
		
		
		/**
		 * Producto
		 */
		EntryRelationshipType entryRelationshipType = new EntryRelationshipType();
		entryRelationshipType.setTypeCode(Constants.COMP);
		procedureType.getEntryRelationship().add(entryRelationshipType);
		
		ObservationType observationType = new ObservationType();
		entryRelationshipType.setObservation(observationType);
		observationType.setClassCode(Constants.OBS);
		observationType.setMoodCode(Constants.EVN);
		
		CodeType codeTypeUnit = new CodeType();
		codeTypeUnit.setCodeSystem(Constants.SNOMED_CODE);
		codeTypeUnit.setCodeSystemName(Constants.SNOMED_NAME);
		 
			
		UnitsType productType = FactoryDAO.getCodesDAO(em).getProductById(dataTransfusion.getDataProduct().getCode());
		if(productType != null){
			 
			codeTypeUnit.setCode(Long.valueOf(productType.getConcept().getConceptCode()));
			 if(productType.getConcept().getConceptsDisplays() != null && productType.getConcept().getConceptsDisplays().size()!= 0){
				 
				 codeType.setDisplayName(productType.getConcept().getConceptsDisplays().get(0).getConceptLabel());
				 
			 }
		}
		
		/**
		 * Volumen del produto
		 */
		EntryRelationshipType entryRelationshipTypeVolume = new EntryRelationshipType();
		entryRelationshipTypeVolume.setTypeCode(Constants.SPRT);
		procedureType.getEntryRelationship().add(entryRelationshipTypeVolume);
		
		ObservationType observationTypeVolume = new ObservationType();
		entryRelationshipTypeVolume.setObservation(observationTypeVolume);
		observationTypeVolume.setClassCode(Constants.OBS);
		observationTypeVolume.setMoodCode(Constants.EVN);
		
		CodeType codeTypeEventVolume = new CodeType();
		codeTypeEventVolume.setCodeSystem(Constants.SNOMED_CODE);
		codeTypeEventVolume.setCodeSystemName(Constants.SNOMED_NAME);
		codeTypeEventVolume.setCode(Constants.VOLUME_CODE);
		codeTypeEventVolume.setDisplayName(Constants.SNOMED_NAME);
		
		observationTypeVolume.setCode(codeTypeEventVolume);
		
		ValueType valueType = new ValueType();
		valueType.setUnit(Constants.ML);
		if(dataTransfusion.getVolume()!= null && !dataTransfusion.getVolume().equals(""))
			valueType.setValueTypeValue(new Byte(dataTransfusion.getVolume()));
			 
		observationType.setCode(codeTypeUnit);	
		
		/**
		 * Eventos adeversos si corresponden
		 */
		 if(dataTransfusion.getEvents()!= null && dataTransfusion.getEvents().size()!=0){
			 
			 EntryType entryTypeEvents = new EntryType();
			 ObservationType observationTypeEvents = new ObservationType();
			 observationTypeEvents.setClassCode(Constants.OBS);
			 observationTypeEvents.setMoodCode(Constants.EVN);
			 observationTypeEvents.setCode(new CodeType());
			 
			 entryTypeEvents.setObservation(observationTypeEvents);
			 
			 for(DataTransfusionEvent event : dataTransfusion.getEvents()){
				 
				 EntryRelationshipType entryRelationshipTypeEvent = new EntryRelationshipType();
				 entryRelationshipTypeEvent.setTypeCode(Constants.CAUS);
				 
				 ObservationType observationTypeEvent = new ObservationType();
				 observationTypeEvent.setClassCode(Constants.OBS);
				 observationTypeEvent.setMoodCode(Constants.EVN);
				 
				 CodeType codeTypeEvent = new CodeType();
				 codeTypeEvent.setCodeSystem(Constants.SNOMED_CODE);
				 codeTypeEvent.setCodeSystemName(Constants.SNOMED_NAME);
				 
				 TransfusionEventsCode transfusionEvent = FactoryDAO.getCodesDAO(em).getTransfusionEventById(event.getEvent().getCode());
				 if(transfusionEvent != null){
					 
					 codeTypeEvent.setCode(Long.valueOf(transfusionEvent.getConcept().getConceptCode()));
					 if(transfusionEvent.getConcept().getConceptsDisplays() != null && transfusionEvent.getConcept().getConceptsDisplays().size()!= 0){
						 
						 codeType.setDisplayName(transfusionEvent.getConcept().getConceptsDisplays().get(0).getConceptLabel());
						 
					 }
				 }
				 
				 observationTypeEvent.setCode(codeTypeEvent);
				 
				 InterpretationCodeType interpretationCodeType = new InterpretationCodeType();
				 interpretationCodeType.setCodeSystem(Constants.SNOMED_CODE);
				 interpretationCodeType.setCodeSystemName(Constants.SNOMED_NAME);
				 
				 EventSeverityCode severity = FactoryDAO.getCodesDAO(em).getSeverityById(event.getSeverity().getCode());
				 if(severity != null){
					 
					 interpretationCodeType.setCode(Integer.valueOf(severity.getConcept().getConceptCode()));
					 
					 if(severity.getConcept().getConceptsDisplays() != null && severity.getConcept().getConceptsDisplays().size()!= 0){
						 
						 interpretationCodeType.setDisplayName(severity.getConcept().getConceptsDisplays().get(0).getConceptLabel());
						 
					 }
				 }
				 
				 observationTypeEvent.setInterpretationCode(interpretationCodeType);
				 entryRelationshipTypeEvent.setObservation(observationTypeEvent);
				 
				 observationTypeEvents.getEntryRelationship().add(entryRelationshipTypeEvent);
			 }
			 
			 entryTypeEvents.setObservation(observationTypeEvents);
			 
			 SectionType.getEntry().add(entryTypeEvents);
		 }
		 
		 /**
		  * Analisis si corresponde
		  */
		 if(dataTransfusion.getLaboratoryResults()!= null && dataTransfusion.getLaboratoryResults().size() != 0){
		 
			 ComponentType componenteAnalysis = new ComponentType();
			 structuredBodyType.getComponent().add(componenteAnalysis);
			 
			 SectionType sectionTypeAnalysis = new SectionType();
			 componenteAnalysis.setSection(sectionTypeAnalysis);
			  
			 EntryType entryAnalysis = new EntryType();
			 sectionTypeAnalysis.getEntry().add(entryAnalysis);
			 
			 OrganizerType organizerType = new OrganizerType();
			 organizerType.setClassCode(Constants.BATTERY);
			 organizerType.setMoodCode(Constants.EVN);
			 
			 entryAnalysis.setOrganizer(organizerType);
			 
			 StatusCodeType statusCodeTypeAnalysis = new StatusCodeType();
			 statusCodeTypeAnalysis.setCode(Constants.COMPLETED);
			 
			 organizerType.setStatusCode(statusCodeTypeAnalysis);
			 
			 for(DataLaboratoryResult laboratory : dataTransfusion.getLaboratoryResults()){
				 
					ComponentType componentTypeLab = new ComponentType();
					ObservationType observationTypeLab = new ObservationType();
					observationTypeLab.setMoodCode(Constants.EVN);
					observationTypeLab.setClassCode(Constants.OBS);
					
					componentTypeLab.setObservation(observationTypeLab);
					

					CodeType codeTypeLab = new CodeType();
					codeTypeLab.setCodeSystem(Constants.SNOMED_CODE);
					codeTypeLab.setCodeSystemName(Constants.SNOMED_NAME);
					 			
					TransfusionLaboratoryCode failCause = FactoryDAO.getCodesDAO(em).getTransfusionAnalysisById(laboratory.getAnalysis().getCode());
					 if(failCause != null){
						 
						 codeTypeLab.setCode(Long.valueOf(failCause.getConcept().getConceptCode()));
						 if(failCause.getConcept().getConceptsDisplays() != null && failCause.getConcept().getConceptsDisplays().size()!= 0){
							 
							 codeTypeLab.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
							 
						 }
					 }
					 
					 observationTypeLab.setCode(codeTypeLab);
					 
					 StatusCodeType statusCodeLab = new StatusCodeType();
					 statusCodeLab.setCode(Constants.COMPLETED);
					 
					 observationTypeLab.setStatusCode(statusCodeLab);
					 
					 ValueType value = new ValueType();
					 value.setCodeSystem(Constants.SNOMED_CODE);
					 value.setCodeSystemName(Constants.SNOMED_NAME);
					
					 ResultsCode resultCode = FactoryDAO.getCodesDAO(em).getResultById(laboratory.getResult().getCode());
					 if(resultCode != null){
						 
						 value.setCode(Integer.valueOf(resultCode.getConcept().getConceptCode()));
						 if(resultCode.getConcept().getConceptsDisplays() != null && resultCode.getConcept().getConceptsDisplays().size()!= 0){
							 
							 value.setDisplayName(failCause.getConcept().getConceptsDisplays().get(0).getConceptLabel());
							 
						 }
					 }
					 observationTypeLab.getValue().add(value);
					 
					 organizerType.getComponent().add(componentTypeLab);
					
				}
			  componenteAnalysis.setSection(sectionTypeAnalysis);
		 }
		 
		 
		 
		
		return componentType;
	}

	
}
