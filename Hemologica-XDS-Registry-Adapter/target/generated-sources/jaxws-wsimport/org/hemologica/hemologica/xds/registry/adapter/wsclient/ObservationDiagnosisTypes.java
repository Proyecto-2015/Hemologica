
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationDiagnosisTypes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationDiagnosisTypes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="ADMDX"/>
 *     &lt;enumeration value="DISDX"/>
 *     &lt;enumeration value="INTDX"/>
 *     &lt;enumeration value="NOI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationDiagnosisTypes")
@XmlEnum
public enum ObservationDiagnosisTypes {

    DX,
    ADMDX,
    DISDX,
    INTDX,
    NOI;

    public String value() {
        return name();
    }

    public static ObservationDiagnosisTypes fromValue(String v) {
        return valueOf(v);
    }

}
