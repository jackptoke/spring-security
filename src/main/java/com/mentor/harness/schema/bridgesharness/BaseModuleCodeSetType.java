//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * There is a single modulecode set in a design (first child element) to describe all modulecodes and variant module codes used.
 * 
 * <p>Java class for BaseModuleCodeSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseModuleCodeSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="modulecode" type="{http://www.mentor.com/harness/Schema/bridgesharness}BaseModuleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="variantmodulecode" type="{http://www.mentor.com/harness/Schema/bridgesharness}BaseVariantModuleCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseModuleCodeSetType", propOrder = {
    "modulecodeAndVariantmodulecode"
})
@XmlSeeAlso({
    com.mentor.harness.schema.bridgesharness.Harnessdesign.Modulecodeset.class
})
public class BaseModuleCodeSetType {

    @XmlElements({
        @XmlElement(name = "modulecode", type = BaseModuleCodeType.class),
        @XmlElement(name = "variantmodulecode", type = BaseVariantModuleCodeType.class)
    })
    protected List<Object> modulecodeAndVariantmodulecode;

    /**
     * Gets the value of the modulecodeAndVariantmodulecode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the modulecodeAndVariantmodulecode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulecodeAndVariantmodulecode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseModuleCodeType }
     * {@link BaseVariantModuleCodeType }
     * 
     * 
     */
    public List<Object> getModulecodeAndVariantmodulecode() {
        if (modulecodeAndVariantmodulecode == null) {
            modulecodeAndVariantmodulecode = new ArrayList<Object>();
        }
        return this.modulecodeAndVariantmodulecode;
    }

}
