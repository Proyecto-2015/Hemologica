
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInvoiceDetailTaxCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailTaxCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FST"/>
 *     &lt;enumeration value="HST"/>
 *     &lt;enumeration value="PST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailTaxCode")
@XmlEnum
public enum ActInvoiceDetailTaxCode {

    FST,
    HST,
    PST;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailTaxCode fromValue(String v) {
        return valueOf(v);
    }

}
