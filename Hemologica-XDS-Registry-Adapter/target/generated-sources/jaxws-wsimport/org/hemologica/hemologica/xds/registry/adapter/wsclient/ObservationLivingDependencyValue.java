
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationLivingDependencyValue.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationLivingDependencyValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIVDEP"/>
 *     &lt;enumeration value="RELDEP"/>
 *     &lt;enumeration value="SPSDEP"/>
 *     &lt;enumeration value="URELDEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationLivingDependencyValue")
@XmlEnum
public enum ObservationLivingDependencyValue {

    LIVDEP,
    RELDEP,
    SPSDEP,
    URELDEP;

    public String value() {
        return name();
    }

    public static ObservationLivingDependencyValue fromValue(String v) {
        return valueOf(v);
    }

}
