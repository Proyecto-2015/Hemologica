
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultipartMediaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipartMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="multipart/x-hl7-cda-level-one"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultipartMediaType")
@XmlEnum
public enum MultipartMediaType {

    @XmlEnumValue("multipart/x-hl7-cda-level-one")
    MULTIPART_X_HL_7_CDA_LEVEL_ONE("multipart/x-hl7-cda-level-one");
    private final String value;

    MultipartMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultipartMediaType fromValue(String v) {
        for (MultipartMediaType c: MultipartMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
