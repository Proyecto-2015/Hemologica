
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationEnvironmentalIntoleranceType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationEnvironmentalIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EINT"/>
 *     &lt;enumeration value="EALG"/>
 *     &lt;enumeration value="ENAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationEnvironmentalIntoleranceType")
@XmlEnum
public enum ObservationEnvironmentalIntoleranceType {

    EINT,
    EALG,
    ENAINT;

    public String value() {
        return name();
    }

    public static ObservationEnvironmentalIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
