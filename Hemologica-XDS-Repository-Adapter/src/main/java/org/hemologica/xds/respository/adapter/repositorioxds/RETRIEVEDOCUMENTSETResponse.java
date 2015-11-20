
package org.hemologica.xds.respository.adapter.repositorioxds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hemologica.xds.respository.adapter.ihe.iti.xds_b._2007.RetrieveDocumentSetResponseTypeDocumentResponse;


/**
 * <p>Clase Java para RETRIEVEDOCUMENTSETResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RETRIEVEDOCUMENTSETResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retrievedocumentsetresponse" type="{urn:ihe:iti:xds-b:2007}RetrieveDocumentSetResponseType.DocumentResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETRIEVEDOCUMENTSETResponse", namespace="tns:RETRIVEDOCUMENTSETResponse", propOrder = {
    "retrievedocumentsetresponse"
})
public class RETRIEVEDOCUMENTSETResponse {

    @XmlElement(name = "Retrievedocumentsetresponse")
    protected List<RetrieveDocumentSetResponseTypeDocumentResponse> retrievedocumentsetresponse;

    /**
     * Gets the value of the retrievedocumentsetresponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrievedocumentsetresponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrievedocumentsetresponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveDocumentSetResponseTypeDocumentResponse }
     * 
     * 
     */
    public List<RetrieveDocumentSetResponseTypeDocumentResponse> getRetrievedocumentsetresponse() {
        if (retrievedocumentsetresponse == null) {
            retrievedocumentsetresponse = new ArrayList<RetrieveDocumentSetResponseTypeDocumentResponse>();
        }
        return this.retrievedocumentsetresponse;
    }

}
