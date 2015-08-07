
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for a person. A sequence of name parts, such as
 *             given name or family name, prefix, suffix, etc. PN differs
 *             from EN because the qualifier type cannot include LS
 *             (Legal Status).
 *          
 * 
 * <p>Clase Java para PN complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}EN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PN")
public class PN
    extends EN
{


}
