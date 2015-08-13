
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActAdjudicationResultActionCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdjudicationResultActionCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DISPLAY"/>
 *     &lt;enumeration value="FORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActAdjudicationResultActionCode")
@XmlEnum
public enum ActAdjudicationResultActionCode {

    DISPLAY,
    FORM;

    public String value() {
        return name();
    }

    public static ActAdjudicationResultActionCode fromValue(String v) {
        return valueOf(v);
    }

}