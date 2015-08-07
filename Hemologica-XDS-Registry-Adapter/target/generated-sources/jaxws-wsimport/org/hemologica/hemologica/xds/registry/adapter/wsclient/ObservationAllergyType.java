
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationAllergyType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationAllergyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ALG"/>
 *     &lt;enumeration value="DALG"/>
 *     &lt;enumeration value="EALG"/>
 *     &lt;enumeration value="FALG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationAllergyType")
@XmlEnum
public enum ObservationAllergyType {

    ALG,
    DALG,
    EALG,
    FALG;

    public String value() {
        return name();
    }

    public static ObservationAllergyType fromValue(String v) {
        return valueOf(v);
    }

}
