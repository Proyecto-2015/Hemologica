
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActCoverageQuantityLimitCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageQuantityLimitCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NETAMT"/>
 *     &lt;enumeration value="NETAMT"/>
 *     &lt;enumeration value="UNITPRICE"/>
 *     &lt;enumeration value="UNITPRICE"/>
 *     &lt;enumeration value="UNITQTY"/>
 *     &lt;enumeration value="UNITQTY"/>
 *     &lt;enumeration value="COVPRD"/>
 *     &lt;enumeration value="COVPRD"/>
 *     &lt;enumeration value="LFEMX"/>
 *     &lt;enumeration value="PRDMX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageQuantityLimitCode")
@XmlEnum
public enum ActCoverageQuantityLimitCode {

    NETAMT,
    UNITPRICE,
    UNITQTY,
    COVPRD,
    LFEMX,
    PRDMX;

    public String value() {
        return name();
    }

    public static ActCoverageQuantityLimitCode fromValue(String v) {
        return valueOf(v);
    }

}
