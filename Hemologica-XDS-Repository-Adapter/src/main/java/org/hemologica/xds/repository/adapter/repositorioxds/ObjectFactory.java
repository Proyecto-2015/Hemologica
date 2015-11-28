
package org.hemologica.xds.repository.adapter.repositorioxds;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.hemologica.xds.repository.adapter.ihe.iti.xds_b._2007.RetrieveDocumentSetRequestTypeDocumentRequest;
import org.hemologica.xds.repository.adapter.ihe.iti.xds_b._2007.RetrieveDocumentSetResponseTypeDocumentResponse;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.ExternalIdentifierType;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.LocalizedStringType;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryError;
import org.hemologica.xds.repository.adapter.oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryErrorList;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the repositorioxds package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PROVIDEANDREGISTERDOCUMENTSETResponse_QNAME = new QName("RepositorioXDS", "PROVIDEANDREGISTERDOCUMENTSETResponse");
    private final static QName _RETRIEVEDOCUMENTSETResponse_QNAME = new QName("RepositorioXDS", "RETRIEVEDOCUMENTSETResponse");
    private final static QName _RegistryResponseType_QNAME = new QName("RepositorioXDS", "RegistryResponseType");
    private final static QName _RegistryErrorList_QNAME = new QName("RepositorioXDS", "RegistryErrorList");
    private final static QName _RetrieveDocumentSetResponseTypeDocumentResponse_QNAME = new QName("RepositorioXDS", "RetrieveDocumentSetResponseType.DocumentResponse");
    private final static QName _PING_QNAME = new QName("RepositorioXDS", "PING");
    private final static QName _PINGResponse_QNAME = new QName("RepositorioXDS", "PINGResponse");
    private final static QName _SlotType1_QNAME = new QName("RepositorioXDS", "SlotType1");
    private final static QName _DocumentsRequest_QNAME = new QName("RepositorioXDS", "DocumentsRequest");
    private final static QName _RegistryError_QNAME = new QName("RepositorioXDS", "RegistryError");
    private final static QName _SubmitObjectsRequest_QNAME = new QName("RepositorioXDS", "SubmitObjectsRequest");
    private final static QName _ClassificationType_QNAME = new QName("RepositorioXDS", "ClassificationType");
    private final static QName _RetrieveDocumentSetRequestTypeDocumentRequest_QNAME = new QName("RepositorioXDS", "RetrieveDocumentSetRequestType.DocumentRequest");
    private final static QName _ExternalIdentifierType_QNAME = new QName("RepositorioXDS", "ExternalIdentifierType");
    private final static QName _RETRIEVEDOCUMENTSET_QNAME = new QName("RepositorioXDS", "RETRIEVEDOCUMENTSET");
    private final static QName _DocumentType_QNAME = new QName("RepositorioXDS", "DocumentType");
    private final static QName _ExtrinsicObjectType_QNAME = new QName("RepositorioXDS", "ExtrinsicObjectType");
    private final static QName _AssociationType1_QNAME = new QName("RepositorioXDS", "AssociationType1");
    private final static QName _LocalizedStringType_QNAME = new QName("RepositorioXDS", "LocalizedStringType");
    private final static QName _RegistryPackageType_QNAME = new QName("RepositorioXDS", "RegistryPackageType");
    private final static QName _PROVIDEANDREGISTERDOCUMENTSET_QNAME = new QName("RepositorioXDS", "PROVIDEANDREGISTERDOCUMENTSET");
    private final static QName _SubmitObjectsRequestRegistryObjectList_QNAME = new QName("RepositorioXDS", "SubmitObjectsRequest.RegistryObjectList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: repositorioxds
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PROVIDEANDREGISTERDOCUMENTSET }
     * 
     */
    public PROVIDEANDREGISTERDOCUMENTSET createPROVIDEANDREGISTERDOCUMENTSET() {
        return new PROVIDEANDREGISTERDOCUMENTSET();
    }

    /**
     * Create an instance of {@link SubmitObjectsRequestRegistryObjectList }
     * 
     */
    public SubmitObjectsRequestRegistryObjectList createSubmitObjectsRequestRegistryObjectList() {
        return new SubmitObjectsRequestRegistryObjectList();
    }

    /**
     * Create an instance of {@link RegistryPackageType }
     * 
     */
    public RegistryPackageType createRegistryPackageType() {
        return new RegistryPackageType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link ExtrinsicObjectType }
     * 
     */
    public ExtrinsicObjectType createExtrinsicObjectType() {
        return new ExtrinsicObjectType();
    }

    /**
     * Create an instance of {@link RETRIEVEDOCUMENTSET }
     * 
     */
    public RETRIEVEDOCUMENTSET createRETRIEVEDOCUMENTSET() {
        return new RETRIEVEDOCUMENTSET();
    }

    /**
     * Create an instance of {@link SubmitObjectsRequest }
     * 
     */
    public SubmitObjectsRequest createSubmitObjectsRequest() {
        return new SubmitObjectsRequest();
    }

    /**
     * Create an instance of {@link DocumentsRequest }
     * 
     */
    public DocumentsRequest createDocumentsRequest() {
        return new DocumentsRequest();
    }

    /**
     * Create an instance of {@link PINGResponse }
     * 
     */
    public PINGResponse createPINGResponse() {
        return new PINGResponse();
    }

    /**
     * Create an instance of {@link PING }
     * 
     */
    public PING createPING() {
        return new PING();
    }

    /**
     * Create an instance of {@link RegistryResponseType }
     * 
     */
    public RegistryResponseType createRegistryResponseType() {
        return new RegistryResponseType();
    }

    /**
     * Create an instance of {@link PROVIDEANDREGISTERDOCUMENTSETResponse }
     * 
     */
    public PROVIDEANDREGISTERDOCUMENTSETResponse createPROVIDEANDREGISTERDOCUMENTSETResponse() {
        return new PROVIDEANDREGISTERDOCUMENTSETResponse();
    }

    /**
     * Create an instance of {@link RETRIEVEDOCUMENTSETResponse }
     * 
     */
    public RETRIEVEDOCUMENTSETResponse createRETRIEVEDOCUMENTSETResponse() {
        return new RETRIEVEDOCUMENTSETResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PROVIDEANDREGISTERDOCUMENTSETResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "PROVIDEANDREGISTERDOCUMENTSETResponse")
    public JAXBElement<PROVIDEANDREGISTERDOCUMENTSETResponse> createPROVIDEANDREGISTERDOCUMENTSETResponse(PROVIDEANDREGISTERDOCUMENTSETResponse value) {
        return new JAXBElement<PROVIDEANDREGISTERDOCUMENTSETResponse>(_PROVIDEANDREGISTERDOCUMENTSETResponse_QNAME, PROVIDEANDREGISTERDOCUMENTSETResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RETRIEVEDOCUMENTSETResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RETRIEVEDOCUMENTSETResponse")
    public JAXBElement<RETRIEVEDOCUMENTSETResponse> createRETRIEVEDOCUMENTSETResponse(RETRIEVEDOCUMENTSETResponse value) {
        return new JAXBElement<RETRIEVEDOCUMENTSETResponse>(_RETRIEVEDOCUMENTSETResponse_QNAME, RETRIEVEDOCUMENTSETResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RegistryResponseType")
    public JAXBElement<RegistryResponseType> createRegistryResponseType(RegistryResponseType value) {
        return new JAXBElement<RegistryResponseType>(_RegistryResponseType_QNAME, RegistryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryErrorList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RegistryErrorList")
    public JAXBElement<RegistryErrorList> createRegistryErrorList(RegistryErrorList value) {
        return new JAXBElement<RegistryErrorList>(_RegistryErrorList_QNAME, RegistryErrorList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentSetResponseTypeDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RetrieveDocumentSetResponseType.DocumentResponse")
    public JAXBElement<RetrieveDocumentSetResponseTypeDocumentResponse> createRetrieveDocumentSetResponseTypeDocumentResponse(RetrieveDocumentSetResponseTypeDocumentResponse value) {
        return new JAXBElement<RetrieveDocumentSetResponseTypeDocumentResponse>(_RetrieveDocumentSetResponseTypeDocumentResponse_QNAME, RetrieveDocumentSetResponseTypeDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PING }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "PING")
    public JAXBElement<PING> createPING(PING value) {
        return new JAXBElement<PING>(_PING_QNAME, PING.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "PINGResponse")
    public JAXBElement<PINGResponse> createPINGResponse(PINGResponse value) {
        return new JAXBElement<PINGResponse>(_PINGResponse_QNAME, PINGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "SlotType1")
    public JAXBElement<SlotType1> createSlotType1(SlotType1 value) {
        return new JAXBElement<SlotType1>(_SlotType1_QNAME, SlotType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "DocumentsRequest")
    public JAXBElement<DocumentsRequest> createDocumentsRequest(DocumentsRequest value) {
        return new JAXBElement<DocumentsRequest>(_DocumentsRequest_QNAME, DocumentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RegistryError")
    public JAXBElement<RegistryError> createRegistryError(RegistryError value) {
        return new JAXBElement<RegistryError>(_RegistryError_QNAME, RegistryError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitObjectsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "SubmitObjectsRequest")
    public JAXBElement<SubmitObjectsRequest> createSubmitObjectsRequest(SubmitObjectsRequest value) {
        return new JAXBElement<SubmitObjectsRequest>(_SubmitObjectsRequest_QNAME, SubmitObjectsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "ClassificationType")
    public JAXBElement<ClassificationType> createClassificationType(ClassificationType value) {
        return new JAXBElement<ClassificationType>(_ClassificationType_QNAME, ClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentSetRequestTypeDocumentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RetrieveDocumentSetRequestType.DocumentRequest")
    public JAXBElement<RetrieveDocumentSetRequestTypeDocumentRequest> createRetrieveDocumentSetRequestTypeDocumentRequest(RetrieveDocumentSetRequestTypeDocumentRequest value) {
        return new JAXBElement<RetrieveDocumentSetRequestTypeDocumentRequest>(_RetrieveDocumentSetRequestTypeDocumentRequest_QNAME, RetrieveDocumentSetRequestTypeDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "ExternalIdentifierType")
    public JAXBElement<ExternalIdentifierType> createExternalIdentifierType(ExternalIdentifierType value) {
        return new JAXBElement<ExternalIdentifierType>(_ExternalIdentifierType_QNAME, ExternalIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RETRIEVEDOCUMENTSET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RETRIEVEDOCUMENTSET")
    public JAXBElement<RETRIEVEDOCUMENTSET> createRETRIEVEDOCUMENTSET(RETRIEVEDOCUMENTSET value) {
        return new JAXBElement<RETRIEVEDOCUMENTSET>(_RETRIEVEDOCUMENTSET_QNAME, RETRIEVEDOCUMENTSET.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentType_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtrinsicObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "ExtrinsicObjectType")
    public JAXBElement<ExtrinsicObjectType> createExtrinsicObjectType(ExtrinsicObjectType value) {
        return new JAXBElement<ExtrinsicObjectType>(_ExtrinsicObjectType_QNAME, ExtrinsicObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "AssociationType1")
    public JAXBElement<AssociationType1> createAssociationType1(AssociationType1 value) {
        return new JAXBElement<AssociationType1>(_AssociationType1_QNAME, AssociationType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "LocalizedStringType")
    public JAXBElement<LocalizedStringType> createLocalizedStringType(LocalizedStringType value) {
        return new JAXBElement<LocalizedStringType>(_LocalizedStringType_QNAME, LocalizedStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryPackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "RegistryPackageType")
    public JAXBElement<RegistryPackageType> createRegistryPackageType(RegistryPackageType value) {
        return new JAXBElement<RegistryPackageType>(_RegistryPackageType_QNAME, RegistryPackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PROVIDEANDREGISTERDOCUMENTSET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "PROVIDEANDREGISTERDOCUMENTSET")
    public JAXBElement<PROVIDEANDREGISTERDOCUMENTSET> createPROVIDEANDREGISTERDOCUMENTSET(PROVIDEANDREGISTERDOCUMENTSET value) {
        return new JAXBElement<PROVIDEANDREGISTERDOCUMENTSET>(_PROVIDEANDREGISTERDOCUMENTSET_QNAME, PROVIDEANDREGISTERDOCUMENTSET.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitObjectsRequestRegistryObjectList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "RepositorioXDS", name = "SubmitObjectsRequest.RegistryObjectList")
    public JAXBElement<SubmitObjectsRequestRegistryObjectList> createSubmitObjectsRequestRegistryObjectList(SubmitObjectsRequestRegistryObjectList value) {
        return new JAXBElement<SubmitObjectsRequestRegistryObjectList>(_SubmitObjectsRequestRegistryObjectList_QNAME, SubmitObjectsRequestRegistryObjectList.class, null, value);
    }

}
