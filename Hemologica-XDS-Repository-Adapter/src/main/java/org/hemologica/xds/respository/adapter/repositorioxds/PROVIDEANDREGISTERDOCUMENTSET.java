
package org.hemologica.xds.respository.adapter.repositorioxds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PROVIDEANDREGISTERDOCUMENTSET complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PROVIDEANDREGISTERDOCUMENTSET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Submitobjectsrequest" type="{RepositorioXDS}SubmitObjectsRequest" minOccurs="0"/>
 *         &lt;element name="Documentsrequest" type="{RepositorioXDS}DocumentsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROVIDEANDREGISTERDOCUMENTSET",namespace="tns:PROVIDEANDREGISTERDOCUMENTSET", propOrder = {
    "submitobjectsrequest",
    "documentsrequest"
})
public class PROVIDEANDREGISTERDOCUMENTSET {

    @XmlElement(name = "Submitobjectsrequest")
    protected SubmitObjectsRequest submitobjectsrequest;
    @XmlElement(name = "Documentsrequest")
    protected DocumentsRequest documentsrequest;

    /**
     * Obtiene el valor de la propiedad submitobjectsrequest.
     * 
     * @return
     *     possible object is
     *     {@link SubmitObjectsRequest }
     *     
     */
    public SubmitObjectsRequest getSubmitobjectsrequest() {
        return submitobjectsrequest;
    }

    /**
     * Define el valor de la propiedad submitobjectsrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitObjectsRequest }
     *     
     */
    public void setSubmitobjectsrequest(SubmitObjectsRequest value) {
        this.submitobjectsrequest = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsrequest.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsRequest }
     *     
     */
    public DocumentsRequest getDocumentsrequest() {
        return documentsrequest;
    }

    /**
     * Define el valor de la propiedad documentsrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsRequest }
     *     
     */
    public void setDocumentsrequest(DocumentsRequest value) {
        this.documentsrequest = value;
    }

}
