
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoleClassIngredientEntityActiveIngredientByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassIngredientEntityActiveIngredientByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="ACTIB"/>
 *     &lt;enumeration value="ACTIM"/>
 *     &lt;enumeration value="ACTIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassIngredientEntityActiveIngredientByBOT")
@XmlEnum
public enum RoleClassIngredientEntityActiveIngredientByBOT {

    ACTI,
    ACTIB,
    ACTIM,
    ACTIR;

    public String value() {
        return name();
    }

    public static RoleClassIngredientEntityActiveIngredientByBOT fromValue(String v) {
        return valueOf(v);
    }

}
