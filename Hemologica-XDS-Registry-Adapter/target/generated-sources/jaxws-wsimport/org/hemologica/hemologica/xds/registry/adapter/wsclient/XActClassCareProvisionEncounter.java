
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActClassCareProvisionEncounter.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionEncounter">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PCPR"/>
 *     &lt;enumeration value="ENC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionEncounter")
@XmlEnum
public enum XActClassCareProvisionEncounter {

    PCPR,
    ENC;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionEncounter fromValue(String v) {
        return valueOf(v);
    }

}
