
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CardClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CARD"/>
 *     &lt;enumeration value="PEDCARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardClinPracticeSetting")
@XmlEnum
public enum CardClinPracticeSetting {

    CARD,
    PEDCARD;

    public String value() {
        return name();
    }

    public static CardClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
