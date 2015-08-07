
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefillCompletePharmacySupplyType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillCompletePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RFC"/>
 *     &lt;enumeration value="RFCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillCompletePharmacySupplyType")
@XmlEnum
public enum RefillCompletePharmacySupplyType {

    RFC,
    RFCS;

    public String value() {
        return name();
    }

    public static RefillCompletePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}
