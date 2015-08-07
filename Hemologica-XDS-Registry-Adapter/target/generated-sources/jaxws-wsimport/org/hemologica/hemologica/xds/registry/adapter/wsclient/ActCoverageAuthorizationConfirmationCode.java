
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActCoverageAuthorizationConfirmationCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageAuthorizationConfirmationCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUTH"/>
 *     &lt;enumeration value="NAUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageAuthorizationConfirmationCode")
@XmlEnum
public enum ActCoverageAuthorizationConfirmationCode {

    AUTH,
    NAUTH;

    public String value() {
        return name();
    }

    public static ActCoverageAuthorizationConfirmationCode fromValue(String v) {
        return valueOf(v);
    }

}
