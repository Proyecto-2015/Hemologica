
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInvoiceDetailGenericAdjudicatorCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericAdjudicatorCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COIN"/>
 *     &lt;enumeration value="DEDUCTIBLE"/>
 *     &lt;enumeration value="COPAYMENT"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="SPEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailGenericAdjudicatorCode")
@XmlEnum
public enum ActInvoiceDetailGenericAdjudicatorCode {

    COIN,
    DEDUCTIBLE,
    COPAYMENT,
    PAY,
    SPEND;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericAdjudicatorCode fromValue(String v) {
        return valueOf(v);
    }

}
