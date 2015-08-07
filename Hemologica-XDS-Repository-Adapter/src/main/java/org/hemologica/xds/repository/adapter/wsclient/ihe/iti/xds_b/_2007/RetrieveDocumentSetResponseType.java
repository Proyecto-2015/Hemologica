
package ihe.iti.xds_b._2007;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;


/**
 * <p>Clase Java para RetrieveDocumentSetResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentSetResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryResponse"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="DocumentResponse" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="HomeCommunityId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
 *                     &lt;element name="RepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
 *                     &lt;element name="DocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
 *                     &lt;element name="NewRepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
 *                     &lt;element name="NewDocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
 *                     &lt;element name="mimeType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
 *                     &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDocumentSetResponseType", propOrder = {
    "registryResponse",
    "documentResponse"
})
public class RetrieveDocumentSetResponseType {

    @XmlElement(name = "RegistryResponse", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", required = true)
    protected RegistryResponseType registryResponse;
    @XmlElement(name = "DocumentResponse")
    protected List<RetrieveDocumentSetResponseType.DocumentResponse> documentResponse;

    /**
     * Obtiene el valor de la propiedad registryResponse.
     * 
     * @return
     *     possible object is
     *     {@link RegistryResponseType }
     *     
     */
    public RegistryResponseType getRegistryResponse() {
        return registryResponse;
    }

    /**
     * Define el valor de la propiedad registryResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryResponseType }
     *     
     */
    public void setRegistryResponse(RegistryResponseType value) {
        this.registryResponse = value;
    }

    /**
     * Gets the value of the documentResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveDocumentSetResponseType.DocumentResponse }
     * 
     * 
     */
    public List<RetrieveDocumentSetResponseType.DocumentResponse> getDocumentResponse() {
        if (documentResponse == null) {
            documentResponse = new ArrayList<RetrieveDocumentSetResponseType.DocumentResponse>();
        }
        return this.documentResponse;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="HomeCommunityId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
     *         &lt;element name="RepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
     *         &lt;element name="DocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
     *         &lt;element name="NewRepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
     *         &lt;element name="NewDocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" minOccurs="0"/&gt;
     *         &lt;element name="mimeType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
     *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "homeCommunityId",
        "repositoryUniqueId",
        "documentUniqueId",
        "newRepositoryUniqueId",
        "newDocumentUniqueId",
        "mimeType",
        "document"
    })
    public static class DocumentResponse {

        @XmlElement(name = "HomeCommunityId")
        protected String homeCommunityId;
        @XmlElement(name = "RepositoryUniqueId", required = true)
        protected String repositoryUniqueId;
        @XmlElement(name = "DocumentUniqueId", required = true)
        protected String documentUniqueId;
        @XmlElement(name = "NewRepositoryUniqueId")
        protected String newRepositoryUniqueId;
        @XmlElement(name = "NewDocumentUniqueId")
        protected String newDocumentUniqueId;
        @XmlElement(required = true)
        protected String mimeType;
        @XmlElement(name = "Document", required = true)
        protected byte[] document;

        /**
         * Obtiene el valor de la propiedad homeCommunityId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomeCommunityId() {
            return homeCommunityId;
        }

        /**
         * Define el valor de la propiedad homeCommunityId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomeCommunityId(String value) {
            this.homeCommunityId = value;
        }

        /**
         * Obtiene el valor de la propiedad repositoryUniqueId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepositoryUniqueId() {
            return repositoryUniqueId;
        }

        /**
         * Define el valor de la propiedad repositoryUniqueId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepositoryUniqueId(String value) {
            this.repositoryUniqueId = value;
        }

        /**
         * Obtiene el valor de la propiedad documentUniqueId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentUniqueId() {
            return documentUniqueId;
        }

        /**
         * Define el valor de la propiedad documentUniqueId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentUniqueId(String value) {
            this.documentUniqueId = value;
        }

        /**
         * Obtiene el valor de la propiedad newRepositoryUniqueId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewRepositoryUniqueId() {
            return newRepositoryUniqueId;
        }

        /**
         * Define el valor de la propiedad newRepositoryUniqueId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewRepositoryUniqueId(String value) {
            this.newRepositoryUniqueId = value;
        }

        /**
         * Obtiene el valor de la propiedad newDocumentUniqueId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDocumentUniqueId() {
            return newDocumentUniqueId;
        }

        /**
         * Define el valor de la propiedad newDocumentUniqueId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDocumentUniqueId(String value) {
            this.newDocumentUniqueId = value;
        }

        /**
         * Obtiene el valor de la propiedad mimeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMimeType() {
            return mimeType;
        }

        /**
         * Define el valor de la propiedad mimeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMimeType(String value) {
            this.mimeType = value;
        }

        /**
         * Obtiene el valor de la propiedad document.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getDocument() {
            return document;
        }

        /**
         * Define el valor de la propiedad document.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setDocument(byte[] value) {
            this.document = value;
        }

    }

}
