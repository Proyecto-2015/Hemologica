
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClinicalResearchEventReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClinicalResearchEventReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="TRM"/>
 *     &lt;enumeration value="UNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClinicalResearchEventReason")
@XmlEnum
public enum ClinicalResearchEventReason {

    RET,
    SCH,
    TRM,
    UNS;

    public String value() {
        return name();
    }

    public static ClinicalResearchEventReason fromValue(String v) {
        return valueOf(v);
    }

}
