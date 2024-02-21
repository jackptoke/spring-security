//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 MLCs have multiple locations.
 *             
 * 
 * <p>Java class for BaseMLCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMLCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}HarnessPartAttributes"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="elecid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="type" default="node"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="node"/&gt;
 *             &lt;enumeration value="cavity"/&gt;
 *             &lt;enumeration value="wireend"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="optionexpression" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMLCType")
@XmlSeeAlso({
    MLCType.class
})
public class BaseMLCType {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "elecid")
    protected String elecid;
    @XmlAttribute(name = "quantity")
    protected Double quantity;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "optionexpression")
    protected String optionexpression;
    @XmlAttribute(name = "supplierpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierpart;
    @XmlAttribute(name = "customerpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String customerpart;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    protected String partrevision;
    @XmlAttribute(name = "incBom")
    protected Boolean incBom;
    @XmlAttribute(name = "librarytypecode")
    protected String librarytypecode;
    @XmlAttribute(name = "shortdescription")
    protected String shortdescription;
    @XmlAttribute(name = "architecturalCost")
    protected Double architecturalCost;
    @XmlAttribute(name = "weight")
    protected Double weight;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "displayName")
    protected String displayName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the elecid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElecid() {
        return elecid;
    }

    /**
     * Sets the value of the elecid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElecid(String value) {
        this.elecid = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "node";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the optionexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionexpression() {
        return optionexpression;
    }

    /**
     * Sets the value of the optionexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionexpression(String value) {
        this.optionexpression = value;
    }

    /**
     * Gets the value of the supplierpart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierpart() {
        return supplierpart;
    }

    /**
     * Sets the value of the supplierpart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierpart(String value) {
        this.supplierpart = value;
    }

    /**
     * Gets the value of the customerpart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerpart() {
        return customerpart;
    }

    /**
     * Sets the value of the customerpart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerpart(String value) {
        this.customerpart = value;
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
     * Gets the value of the incBom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncBom() {
        return incBom;
    }

    /**
     * Sets the value of the incBom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncBom(Boolean value) {
        this.incBom = value;
    }

    /**
     * Gets the value of the librarytypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarytypecode() {
        return librarytypecode;
    }

    /**
     * Sets the value of the librarytypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarytypecode(String value) {
        this.librarytypecode = value;
    }

    /**
     * Gets the value of the shortdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortdescription() {
        return shortdescription;
    }

    /**
     * Sets the value of the shortdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortdescription(String value) {
        this.shortdescription = value;
    }

    /**
     * Gets the value of the architecturalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArchitecturalCost() {
        return architecturalCost;
    }

    /**
     * Sets the value of the architecturalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArchitecturalCost(Double value) {
        this.architecturalCost = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}
