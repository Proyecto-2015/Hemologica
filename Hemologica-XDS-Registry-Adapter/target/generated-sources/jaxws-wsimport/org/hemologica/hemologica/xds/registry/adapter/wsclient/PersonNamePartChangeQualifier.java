
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonNamePartChangeQualifier.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartChangeQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="SP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartChangeQualifier")
@XmlEnum
public enum PersonNamePartChangeQualifier {

    AD,
    BR,
    SP;

    public String value() {
        return name();
    }

    public static PersonNamePartChangeQualifier fromValue(String v) {
        return valueOf(v);
    }

}
