
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationHealthStatusValue.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationHealthStatusValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HLSTAT"/>
 *     &lt;enumeration value="IVDRG"/>
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="DRUG"/>
 *     &lt;enumeration value="PGNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationHealthStatusValue")
@XmlEnum
public enum ObservationHealthStatusValue {

    HLSTAT,
    IVDRG,
    DISABLE,
    DRUG,
    PGNT;

    public String value() {
        return name();
    }

    public static ObservationHealthStatusValue fromValue(String v) {
        return valueOf(v);
    }

}
