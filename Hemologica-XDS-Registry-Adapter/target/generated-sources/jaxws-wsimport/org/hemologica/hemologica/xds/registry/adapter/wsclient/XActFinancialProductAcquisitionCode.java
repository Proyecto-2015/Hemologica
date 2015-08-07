
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActFinancialProductAcquisitionCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActFinancialProductAcquisitionCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="SALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActFinancialProductAcquisitionCode")
@XmlEnum
public enum XActFinancialProductAcquisitionCode {

    RENT,
    SALE;

    public String value() {
        return name();
    }

    public static XActFinancialProductAcquisitionCode fromValue(String v) {
        return valueOf(v);
    }

}
