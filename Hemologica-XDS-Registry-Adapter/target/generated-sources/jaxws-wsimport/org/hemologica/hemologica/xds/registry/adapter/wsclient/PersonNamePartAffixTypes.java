
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonNamePartAffixTypes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartAffixTypes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="VV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartAffixTypes")
@XmlEnum
public enum PersonNamePartAffixTypes {

    AC,
    NB,
    PR,
    VV;

    public String value() {
        return name();
    }

    public static PersonNamePartAffixTypes fromValue(String v) {
        return valueOf(v);
    }

}
