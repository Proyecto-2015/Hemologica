
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefillFirstHerePharmacySupplyType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillFirstHerePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RFF"/>
 *     &lt;enumeration value="RFFS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillFirstHerePharmacySupplyType")
@XmlEnum
public enum RefillFirstHerePharmacySupplyType {

    RFF,
    RFFS;

    public String value() {
        return name();
    }

    public static RefillFirstHerePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}
