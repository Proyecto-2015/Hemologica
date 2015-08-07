
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NieceNephew.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NieceNephew">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NIENEPH"/>
 *     &lt;enumeration value="NEPHEW"/>
 *     &lt;enumeration value="NIECE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NieceNephew")
@XmlEnum
public enum NieceNephew {

    NIENEPH,
    NEPHEW,
    NIECE;

    public String value() {
        return name();
    }

    public static NieceNephew fromValue(String v) {
        return valueOf(v);
    }

}
