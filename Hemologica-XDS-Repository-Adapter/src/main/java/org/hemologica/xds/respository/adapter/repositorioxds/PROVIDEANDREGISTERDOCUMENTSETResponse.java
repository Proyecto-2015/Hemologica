
package org.hemologica.xds.respository.adapter.repositorioxds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PROVIDEANDREGISTERDOCUMENTSETResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PROVIDEANDREGISTERDOCUMENTSETResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registryresponse" type="{RepositorioXDS}RegistryResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROVIDEANDREGISTERDOCUMENTSETResponse", namespace="tns:PROVIDEANDREGISTERDOCUMENTSETtns:PROVIDEANDREGISTERDOCUMENTSE", propOrder = {
    "registryresponse"
})
public class PROVIDEANDREGISTERDOCUMENTSETResponse {

    @XmlElement(name = "Registryresponse")
    protected RegistryResponseType registryresponse;

    /**
     * Obtiene el valor de la propiedad registryresponse.
     * 
     * @return
     *     possible object is
     *     {@link RegistryResponseType }
     *     
     */
    public RegistryResponseType getRegistryresponse() {
        return registryresponse;
    }

    /**
     * Define el valor de la propiedad registryresponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryResponseType }
     *     
     */
    public void setRegistryresponse(RegistryResponseType value) {
        this.registryresponse = value;
    }

}
