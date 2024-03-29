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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Element to model splices. Splices may have multiple pins.
 *                 Splices can be located at an offset from the end of a bundle using a bundle position child element.
 *             
 * 
 * <p>Java class for SpliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/bridgesharness}BaseSpliceType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="pin" type="{http://www.mentor.com/harness/Schema/bridgesharness}CavityType" minOccurs="0"/&gt;
 *         &lt;element name="variantElement" type="{http://www.mentor.com/harness/Schema/bridgesharness}VariantElementType" minOccurs="0"/&gt;
 *         &lt;element name="addpart" type="{http://www.mentor.com/harness/Schema/bridgesharness}AdditionalComponentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.mentor.com/harness/Schema/bridgesharness}BundleLocationType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}CommonElementsGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ConnectivityCommonAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}IECNamingAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ArchitecturalAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}OriginAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}SupplierPartAttributes"/&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" default="splice"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="splice"/&gt;
 *             &lt;enumeration value="solslv"/&gt;
 *             &lt;enumeration value="uweld"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="incBom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="signal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="materialcode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="librarytypecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="insulationtype" default="HeatShrinkSleeve"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="HeatShrinkSleeve"/&gt;
 *             &lt;enumeration value="SpotTape"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="repositionable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="balanceable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="sealed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="striplength" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpliceType", propOrder = {
    "pinOrVariantElementOrAddpart"
})
public class SpliceType
    extends BaseSpliceType
{

    @XmlElements({
        @XmlElement(name = "pin", type = CavityType.class),
        @XmlElement(name = "variantElement", type = VariantElementType.class),
        @XmlElement(name = "addpart", type = AdditionalComponentType.class),
        @XmlElement(name = "Location", type = BundleLocationType.class),
        @XmlElement(name = "harnesslevel", type = HarnessLevelType.class),
        @XmlElement(name = "property", type = BasePropertyType.class),
        @XmlElement(name = "variant", type = BaseVarianceType.class),
        @XmlElement(name = "functionalvariant", type = FunctionalVariantType.class),
        @XmlElement(name = "productionvariant", type = ProductionVariantType.class),
        @XmlElement(name = "refedmodule", type = BaseReferredModuleType.class)
    })
    protected List<Object> pinOrVariantElementOrAddpart;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "incBom")
    protected Boolean incBom;
    @XmlAttribute(name = "signal")
    protected String signal;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "materialcode")
    protected String materialcode;
    @XmlAttribute(name = "librarytypecode")
    protected String librarytypecode;
    @XmlAttribute(name = "insulationtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insulationtype;
    @XmlAttribute(name = "repositionable")
    protected Boolean repositionable;
    @XmlAttribute(name = "balanceable")
    protected Boolean balanceable;
    @XmlAttribute(name = "sealed")
    protected Boolean sealed;
    @XmlAttribute(name = "striplength")
    protected Double striplength;
    @XmlAttribute(name = "harness")
    protected String harness;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    protected String partrevision;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "function")
    protected String function;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "architecturalCost")
    protected Double architecturalCost;
    @XmlAttribute(name = "weight")
    protected Double weight;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String origin;
    @XmlAttribute(name = "supplierpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierpart;
    @XmlAttribute(name = "customerpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String customerpart;

    /**
     * Gets the value of the pinOrVariantElementOrAddpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pinOrVariantElementOrAddpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinOrVariantElementOrAddpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CavityType }
     * {@link VariantElementType }
     * {@link AdditionalComponentType }
     * {@link BundleLocationType }
     * {@link HarnessLevelType }
     * {@link BasePropertyType }
     * {@link BaseVarianceType }
     * {@link FunctionalVariantType }
     * {@link ProductionVariantType }
     * {@link BaseReferredModuleType }
     * 
     * 
     */
    public List<Object> getPinOrVariantElementOrAddpart() {
        if (pinOrVariantElementOrAddpart == null) {
            pinOrVariantElementOrAddpart = new ArrayList<Object>();
        }
        return this.pinOrVariantElementOrAddpart;
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
            return "splice";
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
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignal(String value) {
        this.signal = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the materialcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialcode() {
        return materialcode;
    }

    /**
     * Sets the value of the materialcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialcode(String value) {
        this.materialcode = value;
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
     * Gets the value of the insulationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsulationtype() {
        if (insulationtype == null) {
            return "HeatShrinkSleeve";
        } else {
            return insulationtype;
        }
    }

    /**
     * Sets the value of the insulationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsulationtype(String value) {
        this.insulationtype = value;
    }

    /**
     * Gets the value of the repositionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepositionable() {
        return repositionable;
    }

    /**
     * Sets the value of the repositionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepositionable(Boolean value) {
        this.repositionable = value;
    }

    /**
     * Gets the value of the balanceable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBalanceable() {
        if (balanceable == null) {
            return true;
        } else {
            return balanceable;
        }
    }

    /**
     * Sets the value of the balanceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceable(Boolean value) {
        this.balanceable = value;
    }

    /**
     * Gets the value of the sealed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSealed() {
        return sealed;
    }

    /**
     * Sets the value of the sealed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSealed(Boolean value) {
        this.sealed = value;
    }

    /**
     * Gets the value of the striplength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStriplength() {
        return striplength;
    }

    /**
     * Sets the value of the striplength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStriplength(Double value) {
        this.striplength = value;
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
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
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

}
