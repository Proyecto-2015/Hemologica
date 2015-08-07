
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PharmacySupplyEventStockReasonCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PharmacySupplyEventStockReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FLRSTCK"/>
 *     &lt;enumeration value="LTC"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="PHARM"/>
 *     &lt;enumeration value="PROG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PharmacySupplyEventStockReasonCode")
@XmlEnum
public enum PharmacySupplyEventStockReasonCode {

    FLRSTCK,
    LTC,
    OFFICE,
    PHARM,
    PROG;

    public String value() {
        return name();
    }

    public static PharmacySupplyEventStockReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
