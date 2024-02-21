//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TerminationMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="systemcalculated"/&gt;
 *     &lt;enumeration value="cutandterminate"/&gt;
 *     &lt;enumeration value="terminateseparately"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminationMethodType")
@XmlEnum
public enum TerminationMethodType {

    @XmlEnumValue("systemcalculated")
    SYSTEMCALCULATED("systemcalculated"),
    @XmlEnumValue("cutandterminate")
    CUTANDTERMINATE("cutandterminate"),
    @XmlEnumValue("terminateseparately")
    TERMINATESEPARATELY("terminateseparately");
    private final String value;

    TerminationMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminationMethodType fromValue(String v) {
        for (TerminationMethodType c: TerminationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
