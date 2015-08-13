
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryStatusCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryStatusCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="deliveredResponse"/>
 *     &lt;enumeration value="executing"/>
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="waitContinuedQueryResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryStatusCode")
@XmlEnum
public enum QueryStatusCode {

    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("deliveredResponse")
    DELIVERED_RESPONSE("deliveredResponse"),
    @XmlEnumValue("executing")
    EXECUTING("executing"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("waitContinuedQueryResponse")
    WAIT_CONTINUED_QUERY_RESPONSE("waitContinuedQueryResponse");
    private final String value;

    QueryStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatusCode fromValue(String v) {
        for (QueryStatusCode c: QueryStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}