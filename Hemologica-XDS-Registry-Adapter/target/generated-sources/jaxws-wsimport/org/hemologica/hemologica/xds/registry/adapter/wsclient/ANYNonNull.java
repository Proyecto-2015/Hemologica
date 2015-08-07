
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The BooleanNonNull type is used where a Boolean cannot
 *             have a null value. A Boolean value can be either
 *             true or false.
 *          
 * 
 * <p>Clase Java para ANYNonNull complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ANYNonNull">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ANY">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANYNonNull")
@XmlSeeAlso({
    BN.class
})
public class ANYNonNull
    extends ANY
{


}
