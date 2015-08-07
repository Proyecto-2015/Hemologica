
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VerificationOutcomeValue.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationOutcomeValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACTPEND"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="ELG"/>
 *     &lt;enumeration value="INACT"/>
 *     &lt;enumeration value="INPNDUPD"/>
 *     &lt;enumeration value="INPNDINV"/>
 *     &lt;enumeration value="NELG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerificationOutcomeValue")
@XmlEnum
public enum VerificationOutcomeValue {

    ACTPEND,
    ACT,
    ELG,
    INACT,
    INPNDUPD,
    INPNDINV,
    NELG;

    public String value() {
        return name();
    }

    public static VerificationOutcomeValue fromValue(String v) {
        return valueOf(v);
    }

}
