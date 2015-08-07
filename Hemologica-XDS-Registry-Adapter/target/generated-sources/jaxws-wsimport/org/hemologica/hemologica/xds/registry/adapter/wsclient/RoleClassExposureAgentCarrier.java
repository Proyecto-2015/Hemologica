
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoleClassExposureAgentCarrier.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassExposureAgentCarrier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPAGTCAR"/>
 *     &lt;enumeration value="EXPVECTOR"/>
 *     &lt;enumeration value="FOMITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassExposureAgentCarrier")
@XmlEnum
public enum RoleClassExposureAgentCarrier {

    EXPAGTCAR,
    EXPVECTOR,
    FOMITE;

    public String value() {
        return name();
    }

    public static RoleClassExposureAgentCarrier fromValue(String v) {
        return valueOf(v);
    }

}
