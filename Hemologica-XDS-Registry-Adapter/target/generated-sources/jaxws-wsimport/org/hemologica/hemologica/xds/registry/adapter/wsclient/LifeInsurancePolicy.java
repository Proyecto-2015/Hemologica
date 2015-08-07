
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LifeInsurancePolicy.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LifeInsurancePolicy">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIFE"/>
 *     &lt;enumeration value="ANNU"/>
 *     &lt;enumeration value="TLIFE"/>
 *     &lt;enumeration value="ULIFE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LifeInsurancePolicy")
@XmlEnum
public enum LifeInsurancePolicy {

    LIFE,
    ANNU,
    TLIFE,
    ULIFE;

    public String value() {
        return name();
    }

    public static LifeInsurancePolicy fromValue(String v) {
        return valueOf(v);
    }

}
