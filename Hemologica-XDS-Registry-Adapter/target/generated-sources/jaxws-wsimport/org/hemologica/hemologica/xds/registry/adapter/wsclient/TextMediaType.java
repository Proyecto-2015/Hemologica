
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TextMediaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TextMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="text/x-hl7-ft"/>
 *     &lt;enumeration value="text/html"/>
 *     &lt;enumeration value="text/plain"/>
 *     &lt;enumeration value="text/rtf"/>
 *     &lt;enumeration value="text/sgml"/>
 *     &lt;enumeration value="text/xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextMediaType")
@XmlEnum
public enum TextMediaType {

    @XmlEnumValue("text/x-hl7-ft")
    TEXT_X_HL_7_FT("text/x-hl7-ft"),
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml");
    private final String value;

    TextMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextMediaType fromValue(String v) {
        for (TextMediaType c: TextMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}