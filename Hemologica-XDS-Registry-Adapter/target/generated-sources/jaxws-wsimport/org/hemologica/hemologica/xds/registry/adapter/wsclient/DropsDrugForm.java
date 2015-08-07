
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DropsDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DropsDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DROP"/>
 *     &lt;enumeration value="NDROP"/>
 *     &lt;enumeration value="OPDROP"/>
 *     &lt;enumeration value="ORDROP"/>
 *     &lt;enumeration value="OTDROP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DropsDrugForm")
@XmlEnum
public enum DropsDrugForm {

    DROP,
    NDROP,
    OPDROP,
    ORDROP,
    OTDROP;

    public String value() {
        return name();
    }

    public static DropsDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
