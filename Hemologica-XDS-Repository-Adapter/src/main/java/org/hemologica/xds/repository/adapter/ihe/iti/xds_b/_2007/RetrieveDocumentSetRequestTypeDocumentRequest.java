
package org.hemologica.xds.repository.adapter.ihe.iti.xds_b._2007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetrieveDocumentSetRequestType.DocumentRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentSetRequestType.DocumentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="HomeCommunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepositoryUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDocumentSetRequestType.DocumentRequest", propOrder = {
    "documentUniqueId",
    "homeCommunityId",
    "repositoryUniqueId"
})
public class RetrieveDocumentSetRequestTypeDocumentRequest {

    @XmlElement(name = "DocumentUniqueId")
    protected String documentUniqueId;
    @XmlElement(name = "HomeCommunityId")
    protected String homeCommunityId;
    @XmlElement(name = "RepositoryUniqueId")
    protected String repositoryUniqueId;

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

}
