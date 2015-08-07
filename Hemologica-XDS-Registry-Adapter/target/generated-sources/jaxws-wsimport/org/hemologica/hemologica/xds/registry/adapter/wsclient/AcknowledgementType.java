
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcknowledgementType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementType")
@XmlEnum
public enum AcknowledgementType {

    CA,
    CE,
    CR,
    AA,
    AE,
    AR;

    public String value() {
        return name();
    }

    public static AcknowledgementType fromValue(String v) {
        return valueOf(v);
    }

}
