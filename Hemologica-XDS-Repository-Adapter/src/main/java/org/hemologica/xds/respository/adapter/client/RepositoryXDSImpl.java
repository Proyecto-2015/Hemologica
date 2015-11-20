package org.hemologica.xds.respository.adapter.client;

import java.io.StringWriter;
import java.util.Base64;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.hemologica.xds.respository.adapter.repositorioxds.Adocumentrepository;
import org.hemologica.xds.respository.adapter.repositorioxds.AdocumentrepositoryServicesService;
import org.hemologica.xds.respository.adapter.repositorioxds.DocumentType;
import org.hemologica.xds.respository.adapter.repositorioxds.DocumentsRequest;
import org.hemologica.xds.respository.adapter.repositorioxds.ExtrinsicObjectType;
import org.hemologica.xds.respository.adapter.repositorioxds.PROVIDEANDREGISTERDOCUMENTSET;
import org.hemologica.xds.respository.adapter.repositorioxds.RegistryPackageType;
import org.hemologica.xds.respository.adapter.repositorioxds.RegistryResponseType;
import org.hemologica.xds.respository.adapter.repositorioxds.SubmitObjectsRequest;
import org.hemologica.xds.respository.adapter.repositorioxds.SubmitObjectsRequestRegistryObjectList;

public class RepositoryXDSImpl implements IRepositoryXDS {

	private static final Logger logger = Logger.getLogger(RepositoryXDSImpl.class.getName());
	
	@Override
	public void saveCDA(String authorPerson , String authorInstitution,
			String authorRole, String codingSchemeLOINCId, String codingSchemeLOINCname,
			String codingSchemeSNOMEDCTId,String codingSchemeSNOMEDCTName,
			String languageCode, String cdaID,String cdaDocumentType, String cda) {
		
		logger.info("Crear Mensaje");
		
		PROVIDEANDREGISTERDOCUMENTSET pro = getProvideAndRegisterDocumentSet(authorPerson , authorInstitution,
				authorRole, codingSchemeLOINCId, codingSchemeLOINCname,
				codingSchemeSNOMEDCTId,codingSchemeSNOMEDCTName,
				languageCode, cdaID,cdaDocumentType, cda);
		
		
		logger.info("aDocumentrepositoryServices ");
		
		AdocumentrepositoryServicesService aDocumentrepositoryServices = new AdocumentrepositoryServicesService();	
		Adocumentrepository adocumentrepository = aDocumentrepositoryServices.getAdocumentrepositoryPort();
		BindingProvider port = (BindingProvider) adocumentrepository;
		
		// para definir la url a la cual envia los mensajes
		port.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://appliancePS:8082/RepositorioXDS/adocumentrepository_services");
		
		logger.info("Llamar al servicio " + aDocumentrepositoryServices.getWSDLDocumentLocation().toString());
		
		
		try {
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(PROVIDEANDREGISTERDOCUMENTSET.class);
			Marshaller m = context.createMarshaller();
			m.marshal(pro, writer);
			// output string to console
			String theXML = writer.toString();
			System.out.println(theXML);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		try{
		
			RegistryResponseType response = adocumentrepository.provideandregisterdocumentset(pro.getSubmitobjectsrequest(),pro.getDocumentsrequest());
			logger.info("Response " + response.getStatus());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
		
		
	}
	
	private PROVIDEANDREGISTERDOCUMENTSET getProvideAndRegisterDocumentSet(String authorPerson , String authorInstitution,
			String authorRole, String codingSchemeLOINCId, String codingSchemeLOINCname,
			String codingSchemeSNOMEDCTId,String codingSchemeSNOMEDCTName,
			String languageCode, String cdaID, String cdaDocumentType, String cda){
		
		
		SubmitObjectsRequest submitObjectsRequest = new SubmitObjectsRequest();
		
		submitObjectsRequest.setId("1");
		submitObjectsRequest.setComment("");
		
		SubmitObjectsRequestRegistryObjectList registryObjectList = new SubmitObjectsRequestRegistryObjectList();
		
		/**
		 * Association
		 */
		AssociationType1 associationType1 = new AssociationType1();
		associationType1.setAssociationType(Constants.associationType1HasMember);
		associationType1.setId(Constants.associationTypeNumber);
		
		SlotType1 slotType1 = new SlotType1();
		slotType1.setName("");
		slotType1.setSlotType("");
		slotType1.getValue().add("ejemplo");
		associationType1.getSlot().add(slotType1);
		
		// asociacion 
		associationType1.setSourceObject(Constants.associationSourceObject);
		associationType1.setTargetObject(Constants.associationTargerObject);
		
		registryObjectList.getAssociation().add(associationType1);
			
		/**
		 * Classification
		 */
		
		ClassificationType classificationType = new ClassificationType();
		// XDSSubmissionSet - urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd
		classificationType.setClassificationNode("urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd");
		classificationType.setClassificationScheme("");
		classificationType.setClassifiedObject(Constants.associationSourceObject);
		
		
		SlotType1 slotType = new SlotType1();
		slotType.setName("");
		slotType.setSlotType("");
		slotType.getValue().add("ejemplo");
		classificationType.getSlot().add(slotType);
		
		// <Name charset="" lang="" value="ejemplo">
		LocalizedStringType localizedStringType = new LocalizedStringType();
		localizedStringType.setValue("ejemplo");
		classificationType.getName().add(localizedStringType);
		
		
		registryObjectList.getClassification().add(classificationType);
		
		
		/**
		 * ExtrinsicObject
		 */
		
		ExtrinsicObjectType extrinsicObjectType = new ExtrinsicObjectType();
		// Id es unico
		extrinsicObjectType.setId(cdaID);
		extrinsicObjectType.setMimeType(Constants.mimeType);
		
		extrinsicObjectType.setObjectType(Constants.XDSDocumentEntry); 
		extrinsicObjectType.setStatus(Constants.statusCode);
	
		/**
		 * ExtrinsicObject.Classification
		 */		
		
		/**
		 *  ExtrinsicObject.Classification - XDSDocumentEntry.author - urn:uuid:93606bcf-9494-43ec-9b4e-a7748d1a838d
		 */
		ClassificationType classificationAuthor = new ClassificationType();
		classificationAuthor.setClassificationScheme(Constants.XDSDocumentEntryAuthor);
		classificationAuthor.setId("cl1");
		
		//Este numero no se que es pero aparece en muchas clasificaciones 
		classificationAuthor.setClassificationNode(Constants.classificationNode);
		
		// <Name charset="" lang="" value="ejemplo">
		LocalizedStringType localizedStringAuthor = new LocalizedStringType();
		localizedStringAuthor.setValue("ejemplo");
		classificationAuthor.getName().add(localizedStringAuthor);
		
//		<Slot name="authorPerson" slotType="">
//      <Value xmlns="">1234567^PEREZ^JUAN^^^^^^^^^&amp;2.16.858.0.2.16.86.1.0.0.212567060019.0001&amp;ISO</Value>
//		</Slot>
		SlotType1 slotTypeAuthorPerson = new SlotType1();
		slotTypeAuthorPerson.setName(Constants.authorPerson);
		slotTypeAuthorPerson.setSlotType("");
		slotTypeAuthorPerson.getValue().add(authorPerson);
		classificationAuthor.getSlot().add(slotTypeAuthorPerson);
		
//		<Slot name="authorInstitution" slotType="">
//      <Value xmlns="">ASESP^^^^^^^^^2.16.858.0.2.16.86.1.0.0.212567060019</Value>
//		</Slot>
		SlotType1 slotTypeAuthorInstitution = new SlotType1();
		slotTypeAuthorInstitution.setName(Constants.authorInstitution);
		slotTypeAuthorInstitution.setSlotType("");
		slotTypeAuthorInstitution.getValue().add(authorInstitution);
		classificationAuthor.getSlot().add(slotTypeAuthorInstitution);
		
//		<Slot name="authorRole" slotType="">
//      <Value xmlns="">MÈdico</Value>
//		</Slot>
		SlotType1 slotTypeAuthorRole = new SlotType1();
		slotTypeAuthorRole.setName(Constants.authorRole);
		slotTypeAuthorRole.setSlotType("");
		slotTypeAuthorRole.getValue().add(authorRole);
		classificationAuthor.getSlot().add(slotTypeAuthorRole);
		
		extrinsicObjectType.getClassification().add(classificationAuthor);
		
		/**
		 *  ExtrinsicObject.Classification - XDSDocumentEntry.classCode - urn:uuid:41a5887f-8865-4c09-adf7-e362475b143a
		 *  Tipo de Documento - Nos faltan loc codigos
		 */
		ClassificationType classificationClassCode = new ClassificationType();
		classificationClassCode.setClassificationScheme(Constants.XDSDocumentEntryClassCode);
		classificationClassCode.setId("cl2");
		classificationClassCode.setNodeRepresentation(codingSchemeLOINCId); // CODIGO LOINC DEL DOCUMENTO
		//Mismo que XDSDocumentEntry.author
		//TODO ver estoooo
		classificationClassCode.setClassificationNode("urn:uuid:fc104250-3992-4c43-94e2-aa77fa4e2f99");
		
//		<Name charset="" lang="" value="Hoja de consulta ambulatoria">
//        </Name>
//        <Slot name="codingScheme" slotType="">
//                <Value xmlns="">LOINC</Value>
//        </Slot>
		
		LocalizedStringType localizedStringCode = new LocalizedStringType();
		localizedStringCode.setValue(codingSchemeLOINCname);
		classificationClassCode.getName().add(localizedStringCode);
		
		SlotType1 slotClassCode = new SlotType1();
		slotClassCode.setName(Constants.codingScheme);
		slotClassCode.setSlotType("");
		slotClassCode.getValue().add(Constants.LOINC);
		classificationClassCode.getSlot().add(slotClassCode);
		
		extrinsicObjectType.getClassification().add(classificationClassCode);
		
		/**
		 *  ExtrinsicObject.Classification - XDSDocumentEntry.confidentialityCode - urn:uuid:f4f85eac-e6cb-4883-b524-f2705394840f
		 */
		
		/**
		 *  ExtrinsicObject.Classification - XDSDocumentEntry.formatCode - urn:uuid:a09d5840-386c-46f2-b5ad-9c3699a4309d
		 */
		
		/**
		 *  ExtrinsicObject.Classification - XDSDocumentEntry.typeCode - urn:uuid:f0306f51-975f-434e-a61c-c59651d33983
		 *  SNOMED-CT procedimiento?
		 */
		ClassificationType classificationTypeCode = new ClassificationType();
		classificationTypeCode.setClassificationScheme(Constants.XDSDocumentEntryTypeCode);
		classificationTypeCode.setId("cl6");
		classificationTypeCode.setNodeRepresentation(codingSchemeSNOMEDCTId); // CODIGO SNOMEDCT DEL DOCUMENTO
		//Mismo que XDSDocumentEntry.author
		//TODO ver estoooo
		classificationTypeCode.setClassificationNode("urn:uuid:fc104250-3992-4c43-94e2-aa77fa4e2f99");
		
//		<Name charset="" lang="" value="Hoja de consulta ambulatoria">
//        </Name>
//        <Slot name="codingScheme" slotType="">
//                <Value xmlns="">LOINC</Value>
//        </Slot>
		
		LocalizedStringType localizedTypeCode = new LocalizedStringType();
		localizedTypeCode.setValue(codingSchemeSNOMEDCTName);
		classificationTypeCode.getName().add(localizedTypeCode);
		
		SlotType1 slotTypeCode = new SlotType1();
		slotTypeCode.setName(Constants.codingScheme);
		slotTypeCode.setSlotType("");
		slotTypeCode.getValue().add(Constants.SNOMEDCT);
		classificationTypeCode.getSlot().add(slotTypeCode);
		
		extrinsicObjectType.getClassification().add(classificationTypeCode);
		
		
		/**
		 * Description -- FaltA
		 */
		
		LocalizedStringType localizedExtrinsicObject = new LocalizedStringType();
		localizedExtrinsicObject.setValue(Constants.descriptionValue);
		
		extrinsicObjectType.getDescription().add(localizedExtrinsicObject);
		
		
		/**
		 *  ExternalIdentifierType
		 */
		
		/**
		 *  ExtrinsicObject.ExternalIdentifierType - XDSDocumentEntry.patientId - urn:uuid:58a6f841-87b3-4a3e-92fd-a8ffeff98427
		 */
		ExternalIdentifierType externalIdentifierPatientId = new ExternalIdentifierType();
		externalIdentifierPatientId.setIdentificationScheme(Constants.XDSDocumentEntryPatientId);
		externalIdentifierPatientId.setId("ei1");
		//ID PERSONA
		//TODO ver estooo
		externalIdentifierPatientId.setValue("111111111^^^&amp;2.16.858.2.10002825.69020&amp;ISO");
		
		// No se que es esto.
		//TODO ver estooo
		externalIdentifierPatientId.setRegistryObject("urn:uuid:fc104250-3992-4c43-94e2-aa77fa4e2f99");
		
		LocalizedStringType localizedPatientId = new LocalizedStringType();
		localizedPatientId.setValue(Constants.labelXDSDocumentEntrypatientId);
		externalIdentifierPatientId.getName().add(localizedPatientId);
		
		extrinsicObjectType.getExternalIdentifier().add(externalIdentifierPatientId);
		
		/**
		 *  ExtrinsicObject.ExternalIdentifierType - XDSDocumentEntry.uniqueId - urn:uuid:2e82c1f6-a085-4c72-9da3-8640a32e42ab
		 */
		ExternalIdentifierType externalIdentifierUniqueId = new ExternalIdentifierType();
		externalIdentifierUniqueId.setIdentificationScheme(Constants.XDSDocumentEntryUniqueId);
		externalIdentifierUniqueId.setId("ei1");
		
		// ID?
		externalIdentifierUniqueId.setValue("2.16.858.2.10002825.67430.20150717093107.7672.");
		
		// No se que es esto.
		externalIdentifierUniqueId.setRegistryObject("urn:uuid:fc104250-3992-4c43-94e2-aa77fa4e2f99");
		
		LocalizedStringType localizedUniqueId = new LocalizedStringType();
		localizedUniqueId.setValue(Constants.labelXDSDocumentEntryUniqueId);
		externalIdentifierUniqueId.getName().add(localizedUniqueId);
		
		extrinsicObjectType.getExternalIdentifier().add(externalIdentifierUniqueId);
		
		
		/**
		 * Propiedades extrinsicObjectType
		 */
		
		LocalizedStringType localizedName = new LocalizedStringType();
		//TODO ver estoo
		localizedName.setValue("OncologÌa MÈdica");
		extrinsicObjectType.getName().add(localizedName);
		
		/**
		 * creationTime
		 */
//		SlotType1 slotCreationTime = new SlotType1();
//		slotCreationTime.setName("creationTime");
//		slotCreationTime.setSlotType("");
//		slotCreationTime.getValue().add("20150717");
//		extrinsicObjectType.getSlot().add(slotTypeCode);
		
		/**
		 * languageCode
		 */
//		SlotType1 slotLanguageCode = new SlotType1();
//		slotLanguageCode.setName("languageCode");
//		slotLanguageCode.setSlotType("");
//		slotLanguageCode.getValue().add("es-uy");
//		extrinsicObjectType.getSlot().add(slotLanguageCode);
		
		/**
		 * slotServiceStartTime
		 */
//		SlotType1 slotServiceStartTime = new SlotType1();
//		slotServiceStartTime.setName("serviceStartTime");
//		slotServiceStartTime.setSlotType("");
//		slotServiceStartTime.getValue().add("20150717091600");
//		extrinsicObjectType.getSlot().add(slotServiceStartTime);
		
		/**
		 * serviceStopTime
		 */
//		SlotType1 slotServiceStopTime = new SlotType1();
//		slotServiceStopTime.setName("serviceStopTime");
//		slotServiceStopTime.setSlotType("");
//		slotServiceStopTime.getValue().add("20150717093100");
//		extrinsicObjectType.getSlot().add(slotServiceStopTime);
		
		/**
		 * sourcePatientId
		 */
//		SlotType1 slotSourcePatientId = new SlotType1();
//		slotSourcePatientId.setName("sourcePatientId");
//		slotSourcePatientId.setSlotType("");
//		slotSourcePatientId.getValue().add("3333^^^&amp;HCEO&amp;HCEO");
//		extrinsicObjectType.getSlot().add(slotSourcePatientId);
		
		/**
		 * sourcePatientInfo
		 */
		
		//TODO ver estoo
		SlotType1 slotSourcePatientInfo = new SlotType1();
		slotSourcePatientInfo.setName("sourcePatientId");
		slotSourcePatientInfo.setSlotType("");
		slotSourcePatientInfo.getValue().add("");
		slotSourcePatientInfo.getValue().add("PID-5|RODRIGUEZ^MARIA             ^^^^");
		slotSourcePatientInfo.getValue().add("PID-7|19321115");
		slotSourcePatientInfo.getValue().add("PID-8|1");
		slotSourcePatientInfo.getValue().add("");
		extrinsicObjectType.getSlot().add(slotSourcePatientInfo);
		
		/**
		 * legalAuthenticator
		 */
//		SlotType1 slotLegalAuthenticator = new SlotType1();
//		slotLegalAuthenticator.setName("legalAuthenticator");
//		slotLegalAuthenticator.setSlotType("");
//		extrinsicObjectType.getSlot().add(slotLegalAuthenticator);
		
		/**
		 * repositoryUniqueId
		 */
//		SlotType1 slotRepositoryUniqueId = new SlotType1();
//		slotRepositoryUniqueId.setName("repositoryUniqueId");
//		slotRepositoryUniqueId.setSlotType("");
//		slotRepositoryUniqueId.getValue().add("2.16.858.2.10002825.67430.2222");
//		extrinsicObjectType.getSlot().add(slotRepositoryUniqueId);
		
		
		
		registryObjectList.getExtrinsicObject().add(extrinsicObjectType);

		
		/**
		 * RegistryPackage
		 */
		
		RegistryPackageType registryPackageType = new RegistryPackageType();
		// mismo que associationType1.setSourceObject
		registryPackageType.setId(Constants.associationSourceObject);
		
		
		
		/**
		 * RegistryPackage.Classification
		 */
		
		/**
		 * RegistryPackage.Classification XDSSubmissionSet.author - urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e12d
		 */
		
		
		ClassificationType classificationRegistryAuthor = new ClassificationType();
		classificationRegistryAuthor.setClassificationScheme(Constants.XDSSubmissionSetAuthor);
		
		// mismo que associationType1.setSourceObject
		classificationRegistryAuthor.setClassifiedObject(Constants.associationSourceObject);
		
		//id
		classificationRegistryAuthor.setId("urn:uuid:a7058bb9-b4e4-4307-basx-e3f0ab85e11d");
		
		LocalizedStringType localizedRegistryAuthor = new LocalizedStringType();
		localizedRegistryAuthor.setValue("ejemplo");
		classificationRegistryAuthor.getName().add(localizedRegistryAuthor);
		
		SlotType1 slotRegistryAuthor = new SlotType1();
		slotRegistryAuthor.setName(Constants.authorPerson);
		slotRegistryAuthor.setSlotType("");
		slotRegistryAuthor.getValue().add(authorInstitution);
		classificationRegistryAuthor.getSlot().add(slotRegistryAuthor);
		
		SlotType1 slotAuthorInstitution = new SlotType1();
		slotAuthorInstitution.setName(Constants.authorInstitution);
		slotAuthorInstitution.setSlotType("");
		slotAuthorInstitution.getValue().add(authorInstitution);
		classificationRegistryAuthor.getSlot().add(slotAuthorInstitution);
		
		SlotType1 slotRegistryAuthorRole = new SlotType1();
		slotRegistryAuthorRole.setName(Constants.authorRole);
		slotRegistryAuthorRole.setSlotType("");
		slotRegistryAuthorRole.getValue().add(authorRole);
		classificationRegistryAuthor.getSlot().add(slotRegistryAuthorRole);
		
		registryPackageType.getClassification().add(classificationRegistryAuthor);
		
		/**
		 * RegistryPackage.Classification XDSSubmissionSet.contentTypeCode - urn:uuid:aa543740-bdda-424e-8c96-df4873be8500
		 */
		
		ClassificationType classificationRegistryTypeCode = new ClassificationType();
		classificationRegistryTypeCode.setClassificationScheme(Constants.XDSSubmissionSetContentTypeCode);
		
		// mismo que associationType1.setSourceObject
		classificationRegistryTypeCode.setClassifiedObject(Constants.associationSourceObject);
		
		//id
		classificationRegistryTypeCode.setId("urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e55e");
		
		LocalizedStringType localizedRegistryTypeCode = new LocalizedStringType();
		
		//TODO ver esto
		localizedRegistryTypeCode.setValue("Nota de consulta");
		classificationRegistryTypeCode.getName().add(localizedRegistryTypeCode);
		
		SlotType1 slotRegistryTypeCode = new SlotType1();
		slotRegistryTypeCode.setName(Constants.codingScheme);
		slotRegistryTypeCode.setSlotType("");
		slotRegistryTypeCode.getValue().add(Constants.SNOMEDCT);
		classificationRegistryTypeCode.getSlot().add(slotRegistryTypeCode);
		
		registryPackageType.getClassification().add(classificationRegistryTypeCode);
		
		/**
		 *  ExternalIdentifierType
		 */
		
		/**
		 *  ExtrinsicObject.ExternalIdentifierType - XDSSubmissionSet.uniqueId - urn:uuid:96fdda7c-d067-4183-912e-bf5ee74998a8
		 */
		ExternalIdentifierType externalIdentifierRegistryUniqueId = new ExternalIdentifierType();
		externalIdentifierRegistryUniqueId.setIdentificationScheme(Constants.XDSSubmissionSetUniqueId);
		externalIdentifierRegistryUniqueId.setId("urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e23w");
		
		// mismo que associationType1.setSourceObject
		externalIdentifierRegistryUniqueId.setRegistryObject(Constants.associationSourceObject);
		
		//TODO ver esto
		externalIdentifierRegistryUniqueId.setValue("1.3.6.1.4.1.21367.2005.3.9999.33");
		
		LocalizedStringType localizedRegistryUniqueId = new LocalizedStringType();
		localizedRegistryUniqueId.setValue(Constants.labelXDSSubmissionSetUniqueId);
		externalIdentifierRegistryUniqueId.getName().add(localizedRegistryUniqueId);
		
		registryPackageType.getExternalIdentifier().add(externalIdentifierRegistryUniqueId);
		
		/**
		 *  ExtrinsicObject.ExternalIdentifierType - XDSSubmissionSet.sourceId - urn:uuid:554ac39e-e3fe-47fe-b233-965d2a147832
		 */
		ExternalIdentifierType externalIdentifierRegistrySourceId = new ExternalIdentifierType();
		externalIdentifierRegistrySourceId.setIdentificationScheme(Constants.XDSSubmissionSetSourceId);
		externalIdentifierRegistrySourceId.setId("urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab854321");
		
		// mismo que associationType1.setSourceObject
		externalIdentifierRegistrySourceId.setRegistryObject(Constants.associationSourceObject);
		externalIdentifierRegistrySourceId.setValue("1.3.6.1.4.1.21367.2005.3.9999.10");
		
		LocalizedStringType localizedRegistrySourceId = new LocalizedStringType();
		localizedRegistrySourceId.setValue(Constants.labelXDSSubmissionSetSourceId);
		externalIdentifierRegistrySourceId.getName().add(localizedRegistrySourceId);
		
		registryPackageType.getExternalIdentifier().add(externalIdentifierRegistrySourceId);
		
		/**
		 *  ExtrinsicObject.ExternalIdentifierType - XDSSubmissionSet.patientId - urn:uuid:6b5aea1a-874d-4603-a4bc-96a0a7b38446
		 */
		ExternalIdentifierType externalIdentifierRegistryPatientId = new ExternalIdentifierType();
		externalIdentifierRegistryPatientId.setIdentificationScheme(Constants.XDSSubmissionSetPatientId);
		externalIdentifierRegistryPatientId.setId("urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85r21q");
		
		// mismo que associationType1.setSourceObject
		externalIdentifierRegistryPatientId.setRegistryObject(Constants.associationSourceObject);
		externalIdentifierRegistryPatientId.setValue("1111111^^^&amp;2.16.858.2.10002825.69020&amp;ISO");
		
		LocalizedStringType localizedRegistryPatientId = new LocalizedStringType();
		localizedRegistryPatientId.setValue(Constants.labelXDSSubmissionSetPatientId);
		externalIdentifierRegistryPatientId.getName().add(localizedRegistryPatientId);
		
		registryPackageType.getExternalIdentifier().add(externalIdentifierRegistryPatientId);
		
		/**
		 * LocalizedStringType
		 */
		LocalizedStringType localizedString = new LocalizedStringType();
		localizedString.setValue("Consulta (procedimiento)");
		registryPackageType.getLocalizedString().add(localizedString);
		
		LocalizedStringType localizedNameRegistryPackage = new LocalizedStringType();
		localizedNameRegistryPackage.setValue("Consulta oncolÛgica");
		registryPackageType.getName().add(localizedRegistrySourceId);
		
		SlotType1 slotRegistryPackage = new SlotType1();
		slotRegistryPackage.setName("submissionTime");
		slotRegistryPackage.setSlotType("");
		slotRegistryPackage.getValue().add("20150717093107");
		registryPackageType.getSlot().add(slotRegistryPackage);
	
		registryObjectList.getRegistryPackage().add(registryPackageType);
		
		/**
		 * Documentsrequest
		 * 
		 * DONDE VA EL CDA
		 */
		DocumentsRequest documentsRequest = new DocumentsRequest();
		documentsRequest.setDummy("?");
		
		
		DocumentType documentType = new DocumentType();
		documentType.setId(cdaDocumentType);
		
		byte[]   bytesEncoded = Base64.getEncoder().encode(cda.getBytes());
		String cdaString = new String(bytesEncoded);
		
		
		documentType.setData(cdaString);
		
		//TODO no se si esta bien
		documentsRequest.getDocument().add(documentType);
		
		submitObjectsRequest.setRegistryObjectList(registryObjectList);
		
		PROVIDEANDREGISTERDOCUMENTSET provideAndRegisterDocument = new PROVIDEANDREGISTERDOCUMENTSET();
		
		provideAndRegisterDocument.setDocumentsrequest(documentsRequest);
		provideAndRegisterDocument.setSubmitobjectsrequest(submitObjectsRequest);

		return provideAndRegisterDocument;
		
		
	}

}
