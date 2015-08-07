
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CodeIsNotValid.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeIsNotValid">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CODE_INVAL"/>
 *     &lt;enumeration value="CODE_DEPREC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodeIsNotValid")
@XmlEnum
public enum CodeIsNotValid {

    CODE_INVAL,
    CODE_DEPREC;

    public String value() {
        return name();
    }

    public static CodeIsNotValid fromValue(String v) {
        return valueOf(v);
    }

}
