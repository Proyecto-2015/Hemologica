
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_PhoneURLScheme.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PhoneURLScheme">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="tel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_PhoneURLScheme")
@XmlEnum
public enum XPhoneURLScheme {

    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("tel")
    TEL("tel");
    private final String value;

    XPhoneURLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPhoneURLScheme fromValue(String v) {
        for (XPhoneURLScheme c: XPhoneURLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
