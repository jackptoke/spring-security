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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             
 * 
 * <p>Java class for HarnessMulticoreEndType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HarnessMulticoreEndType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="addpart" type="{http://www.mentor.com/harness/Schema/bridgesharness}AdditionalComponentType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}MulticoreCutBackAttributes"/&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarnessMulticoreEndType", propOrder = {
    "addpart"
})
public class HarnessMulticoreEndType {

    protected List<AdditionalComponentType> addpart;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "cutbackchangetype")
    protected String cutbackchangetype;
    @XmlAttribute(name = "cutbackchangevalue")
    protected String cutbackchangevalue;
    @XmlAttribute(name = "cutbackvalue")
    protected String cutbackvalue;
    @XmlAttribute(name = "unmodifiedcutbackvalue")
    protected String unmodifiedcutbackvalue;
    @XmlAttribute(name = "unmodifieduntwistedvalue")
    protected String unmodifieduntwistedvalue;
    @XmlAttribute(name = "untwistedchangetype")
    protected String untwistedchangetype;
    @XmlAttribute(name = "untwistedchangevalue")
    protected String untwistedchangevalue;
    @XmlAttribute(name = "untwistedvalue")
    protected String untwistedvalue;

    /**
     * Gets the value of the addpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalComponentType }
     * 
     * 
     */
    public List<AdditionalComponentType> getAddpart() {
        if (addpart == null) {
            addpart = new ArrayList<AdditionalComponentType>();
        }
        return this.addpart;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the cutbackchangetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutbackchangetype() {
        return cutbackchangetype;
    }

    /**
     * Sets the value of the cutbackchangetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutbackchangetype(String value) {
        this.cutbackchangetype = value;
    }

    /**
     * Gets the value of the cutbackchangevalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutbackchangevalue() {
        return cutbackchangevalue;
    }

    /**
     * Sets the value of the cutbackchangevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutbackchangevalue(String value) {
        this.cutbackchangevalue = value;
    }

    /**
     * Gets the value of the cutbackvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutbackvalue() {
        return cutbackvalue;
    }

    /**
     * Sets the value of the cutbackvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutbackvalue(String value) {
        this.cutbackvalue = value;
    }

    /**
     * Gets the value of the unmodifiedcutbackvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmodifiedcutbackvalue() {
        return unmodifiedcutbackvalue;
    }

    /**
     * Sets the value of the unmodifiedcutbackvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmodifiedcutbackvalue(String value) {
        this.unmodifiedcutbackvalue = value;
    }

    /**
     * Gets the value of the unmodifieduntwistedvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmodifieduntwistedvalue() {
        return unmodifieduntwistedvalue;
    }

    /**
     * Sets the value of the unmodifieduntwistedvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmodifieduntwistedvalue(String value) {
        this.unmodifieduntwistedvalue = value;
    }

    /**
     * Gets the value of the untwistedchangetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntwistedchangetype() {
        return untwistedchangetype;
    }

    /**
     * Sets the value of the untwistedchangetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntwistedchangetype(String value) {
        this.untwistedchangetype = value;
    }

    /**
     * Gets the value of the untwistedchangevalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntwistedchangevalue() {
        return untwistedchangevalue;
    }

    /**
     * Sets the value of the untwistedchangevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntwistedchangevalue(String value) {
        this.untwistedchangevalue = value;
    }

    /**
     * Gets the value of the untwistedvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntwistedvalue() {
        return untwistedvalue;
    }

    /**
     * Sets the value of the untwistedvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntwistedvalue(String value) {
        this.untwistedvalue = value;
    }

}
