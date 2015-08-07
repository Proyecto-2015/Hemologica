
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcknowledgementDetailType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementDetailType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementDetailType")
@XmlEnum
public enum AcknowledgementDetailType {

    E,
    I,
    W;

    public String value() {
        return name();
    }

    public static AcknowledgementDetailType fromValue(String v) {
        return valueOf(v);
    }

}
