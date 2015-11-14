
package org.hemologica.xds.respository.adapter.repositorioxds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hemologica.xds.respository.adapter.ihe.iti.xds_b._2007.RetrieveDocumentSetRequestTypeDocumentRequest;


/**
 * <p>Clase Java para RETRIEVEDOCUMENTSET complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RETRIEVEDOCUMENTSET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retrievedocumentsetrequest" type="{urn:ihe:iti:xds-b:2007}RetrieveDocumentSetRequestType.DocumentRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETRIEVEDOCUMENTSET", propOrder = {
    "retrievedocumentsetrequest"
})
public class RETRIEVEDOCUMENTSET {

    @XmlElement(name = "Retrievedocumentsetrequest")
    protected List<RetrieveDocumentSetRequestTypeDocumentRequest> retrievedocumentsetrequest;

    /**
     * Gets the value of the retrievedocumentsetrequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrievedocumentsetrequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrievedocumentsetrequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveDocumentSetRequestTypeDocumentRequest }
     * 
     * 
     */
    public List<RetrieveDocumentSetRequestTypeDocumentRequest> getRetrievedocumentsetrequest() {
        if (retrievedocumentsetrequest == null) {
            retrievedocumentsetrequest = new ArrayList<RetrieveDocumentSetRequestTypeDocumentRequest>();
        }
        return this.retrievedocumentsetrequest;
    }

}
