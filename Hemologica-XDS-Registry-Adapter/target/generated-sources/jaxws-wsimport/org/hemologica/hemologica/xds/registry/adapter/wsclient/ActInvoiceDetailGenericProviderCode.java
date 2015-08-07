
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInvoiceDetailGenericProviderCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericProviderCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CANCAPT"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="ESA"/>
 *     &lt;enumeration value="FFSTOP"/>
 *     &lt;enumeration value="FNLFEE"/>
 *     &lt;enumeration value="FRSTFEE"/>
 *     &lt;enumeration value="MARKUP"/>
 *     &lt;enumeration value="MISSAPT"/>
 *     &lt;enumeration value="PERMBNS"/>
 *     &lt;enumeration value="PERFEE"/>
 *     &lt;enumeration value="RESTOCK"/>
 *     &lt;enumeration value="TRAVEL"/>
 *     &lt;enumeration value="URGENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailGenericProviderCode")
@XmlEnum
public enum ActInvoiceDetailGenericProviderCode {

    CANCAPT,
    DSC,
    ESA,
    FFSTOP,
    FNLFEE,
    FRSTFEE,
    MARKUP,
    MISSAPT,
    PERMBNS,
    PERFEE,
    RESTOCK,
    TRAVEL,
    URGENT;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericProviderCode fromValue(String v) {
        return valueOf(v);
    }

}
