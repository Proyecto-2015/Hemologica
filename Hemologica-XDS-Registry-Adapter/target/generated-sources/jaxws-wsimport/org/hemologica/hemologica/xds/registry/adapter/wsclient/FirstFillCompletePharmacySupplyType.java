
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FirstFillCompletePharmacySupplyType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FirstFillCompletePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FFC"/>
 *     &lt;enumeration value="FFCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FirstFillCompletePharmacySupplyType")
@XmlEnum
public enum FirstFillCompletePharmacySupplyType {

    FFC,
    FFCS;

    public String value() {
        return name();
    }

    public static FirstFillCompletePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}