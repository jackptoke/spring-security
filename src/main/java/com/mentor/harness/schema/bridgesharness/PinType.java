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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/bridgesharness}BasePinType"&gt;
 *       &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}CommonElementsGroup"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ConnectivityCommonAttributes"/&gt;
 *       &lt;attribute name="cavity" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinType", propOrder = {
    "harnesslevel",
    "propertyGroup"
})
@XmlSeeAlso({
    DevicePinType.class
})
public class PinType
    extends BasePinType
{

    protected List<HarnessLevelType> harnesslevel;
    @XmlElements({
        @XmlElement(name = "property", type = BasePropertyType.class),
        @XmlElement(name = "variant", type = BaseVarianceType.class),
        @XmlElement(name = "functionalvariant", type = FunctionalVariantType.class),
        @XmlElement(name = "productionvariant", type = ProductionVariantType.class),
        @XmlElement(name = "refedmodule", type = BaseReferredModuleType.class)
    })
    protected List<Object> propertyGroup;
    @XmlAttribute(name = "cavity")
    protected Boolean cavity;
    @XmlAttribute(name = "harness")
    protected String harness;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    protected String partrevision;
    @XmlAttribute(name = "state")
    protected String state;

    /**
     * Gets the value of the harnesslevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the harnesslevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarnesslevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HarnessLevelType }
     * 
     * 
     */
    public List<HarnessLevelType> getHarnesslevel() {
        if (harnesslevel == null) {
            harnesslevel = new ArrayList<HarnessLevelType>();
        }
        return this.harnesslevel;
    }

    /**
     * Gets the value of the propertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePropertyType }
     * {@link BaseVarianceType }
     * {@link FunctionalVariantType }
     * {@link ProductionVariantType }
     * {@link BaseReferredModuleType }
     * 
     * 
     */
    public List<Object> getPropertyGroup() {
        if (propertyGroup == null) {
            propertyGroup = new ArrayList<Object>();
        }
        return this.propertyGroup;
    }

    /**
     * Gets the value of the cavity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCavity() {
        return cavity;
    }

    /**
     * Sets the value of the cavity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCavity(Boolean value) {
        this.cavity = value;
    }

    /**
     * Gets the value of the harness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarness() {
        return harness;
    }

    /**
     * Sets the value of the harness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarness(String value) {
        this.harness = value;
    }

    /**
     * Gets the value of the partnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * Sets the value of the partnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnumber(String value) {
        this.partnumber = value;
    }

    /**
     * Gets the value of the partrevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartrevision() {
        return partrevision;
    }

    /**
     * Sets the value of the partrevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartrevision(String value) {
        this.partrevision = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
