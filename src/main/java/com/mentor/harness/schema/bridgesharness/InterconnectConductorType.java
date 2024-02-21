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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InterconnectConductorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterconnectConductorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="connection" type="{http://www.mentor.com/harness/Schema/bridgesharness}ConnectionType"/&gt;
 *         &lt;element name="member" type="{http://www.mentor.com/harness/Schema/bridgesharness}InterconnectMemberType"/&gt;
 *         &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}CommonElementsGroup"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ConnectivityCommonAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}SupplierPartAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}BaseConnectivityCommonAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ArchitecturalAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterconnectConductorType", propOrder = {
    "connectionOrMemberOrHarnesslevel"
})
public class InterconnectConductorType {

    @XmlElements({
        @XmlElement(name = "connection", type = ConnectionType.class),
        @XmlElement(name = "member", type = InterconnectMemberType.class),
        @XmlElement(name = "harnesslevel", type = HarnessLevelType.class),
        @XmlElement(name = "property", type = BasePropertyType.class),
        @XmlElement(name = "variant", type = BaseVarianceType.class),
        @XmlElement(name = "functionalvariant", type = FunctionalVariantType.class),
        @XmlElement(name = "productionvariant", type = ProductionVariantType.class),
        @XmlElement(name = "refedmodule", type = BaseReferredModuleType.class)
    })
    protected List<Object> connectionOrMemberOrHarnesslevel;
    @XmlAttribute(name = "harness")
    protected String harness;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    protected String partrevision;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "supplierpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierpart;
    @XmlAttribute(name = "customerpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String customerpart;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "shortdescription")
    protected String shortdescription;
    @XmlAttribute(name = "optionexpression")
    protected String optionexpression;
    @XmlAttribute(name = "elecid")
    protected String elecid;
    @XmlAttribute(name = "design")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object design;
    @XmlAttribute(name = "architecturalCost")
    protected Double architecturalCost;
    @XmlAttribute(name = "weight")
    protected Double weight;

    /**
     * Gets the value of the connectionOrMemberOrHarnesslevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the connectionOrMemberOrHarnesslevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionOrMemberOrHarnesslevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionType }
     * {@link InterconnectMemberType }
     * {@link HarnessLevelType }
     * {@link BasePropertyType }
     * {@link BaseVarianceType }
     * {@link FunctionalVariantType }
     * {@link ProductionVariantType }
     * {@link BaseReferredModuleType }
     * 
     * 
     */
    public List<Object> getConnectionOrMemberOrHarnesslevel() {
        if (connectionOrMemberOrHarnesslevel == null) {
            connectionOrMemberOrHarnesslevel = new ArrayList<Object>();
        }
        return this.connectionOrMemberOrHarnesslevel;
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
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDesign(Object value) {
        this.design = value;
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

}
