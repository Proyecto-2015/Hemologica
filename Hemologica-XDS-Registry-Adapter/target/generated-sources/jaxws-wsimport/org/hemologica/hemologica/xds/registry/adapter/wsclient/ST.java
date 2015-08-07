
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The character string data type stands for text data,
 *             primarily intended for machine processing (e.g.,
 *             sorting, querying, indexing, etc.) Used for names,
 *             symbols, and formal expressions.
 *          
 * 
 * <p>Clase Java para ST complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ST">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ED">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{urn:hl7-org:v3}TEL" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{urn:hl7-org:v3}ED" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="representation" type="{urn:hl7-org:v3}BinaryDataEncoding" fixed="TXT" />
 *       &lt;attribute name="mediaType" type="{urn:hl7-org:v3}cs" fixed="text/plain" />
 *       &lt;attribute name="language" type="{urn:hl7-org:v3}cs" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST")
@XmlSeeAlso({
    SC.class,
    ENXP.class,
    ADXP.class
})
public class ST
    extends ED
{


}
