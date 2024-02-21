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
 * 
 *                 Wires have connections to pins. They may also have a centre-strip splice.
 *                 They may also have routes to describe which bundles they travel through.
 *             
 * 
 * <p>Java class for HarnessWireType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HarnessWireType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="connection" type="{http://www.mentor.com/harness/Schema/bridgesharness}HarnessWireEndType"/&gt;
 *         &lt;element name="centerstripsplice" type="{http://www.mentor.com/harness/Schema/bridgesharness}CenterStripSpliceType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="route" type="{http://www.mentor.com/harness/Schema/bridgesharness}ThroughBundleType"/&gt;
 *           &lt;element name="routenode" type="{http://www.mentor.com/harness/Schema/bridgesharness}ThroughNodeType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="wiremarker" type="{http://www.mentor.com/harness/Schema/bridgesharness}WireMarkerType"/&gt;
 *         &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}CommonElementsGroup"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}WireAttributesGroup"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}BaseConnectivityCommonAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}SupplierPartAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}LengthChangeAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ConnectivityCommonAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}ArchitecturalAttributes"/&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="librarytypecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="variantposition" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="routedbyconstraint" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarnessWireType", propOrder = {
    "connectionOrCenterstripspliceOrRoute"
})
public class HarnessWireType {

    @XmlElements({
        @XmlElement(name = "connection", type = HarnessWireEndType.class),
        @XmlElement(name = "centerstripsplice", type = CenterStripSpliceType.class),
        @XmlElement(name = "route", type = ThroughBundleType.class),
        @XmlElement(name = "routenode", type = ThroughNodeType.class),
        @XmlElement(name = "wiremarker", type = WireMarkerType.class),
        @XmlElement(name = "harnesslevel", type = HarnessLevelType.class),
        @XmlElement(name = "property", type = BasePropertyType.class),
        @XmlElement(name = "variant", type = BaseVarianceType.class),
        @XmlElement(name = "functionalvariant", type = FunctionalVariantType.class),
        @XmlElement(name = "productionvariant", type = ProductionVariantType.class),
        @XmlElement(name = "refedmodule", type = BaseReferredModuleType.class)
    })
    protected List<Object> connectionOrCenterstripspliceOrRoute;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "module")
    protected String module;
    @XmlAttribute(name = "librarytypecode")
    protected String librarytypecode;
    @XmlAttribute(name = "variantposition")
    protected Boolean variantposition;
    @XmlAttribute(name = "routedbyconstraint")
    protected Boolean routedbyconstraint;
    @XmlAttribute(name = "wirelength")
    protected String wirelength;
    @XmlAttribute(name = "wirecolor")
    protected String wirecolor;
    @XmlAttribute(name = "outsidediameter")
    protected String outsidediameter;
    @XmlAttribute(name = "wirecsa")
    protected String wirecsa;
    @XmlAttribute(name = "bendradius")
    protected String bendradius;
    @XmlAttribute(name = "wirematerial")
    protected String wirematerial;
    @XmlAttribute(name = "wiretype")
    protected String wiretype;
    @XmlAttribute(name = "wirespec")
    protected String wirespec;
    @XmlAttribute(name = "sepcode")
    protected String sepcode;
    @XmlAttribute(name = "wirenote")
    protected String wirenote;
    @XmlAttribute(name = "signal")
    protected String signal;
    @XmlAttribute(name = "secondarywirenumber")
    protected String secondarywirenumber;
    @XmlAttribute(name = "shield")
    protected Boolean shield;
    @XmlAttribute(name = "unmodifiedlength")
    protected String unmodifiedlength;
    @XmlAttribute(name = "incBom")
    protected Boolean incBom;
    @XmlAttribute(name = "incCut")
    protected Boolean incCut;
    @XmlAttribute(name = "wireCode")
    protected String wireCode;
    @XmlAttribute(name = "terminalMaterial")
    protected String terminalMaterial;
    @XmlAttribute(name = "bypass")
    protected Boolean bypass;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String origin;
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
    @XmlAttribute(name = "supplierpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierpart;
    @XmlAttribute(name = "customerpart")
    @XmlSchemaType(name = "anySimpleType")
    protected String customerpart;
    @XmlAttribute(name = "lengthchangetype")
    protected LengthChangeTypeAttribute lengthchangetype;
    @XmlAttribute(name = "lengthchangevalue")
    protected Double lengthchangevalue;
    @XmlAttribute(name = "harness")
    protected String harness;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    protected String partrevision;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "architecturalCost")
    protected Double architecturalCost;
    @XmlAttribute(name = "weight")
    protected Double weight;

    /**
     * Gets the value of the connectionOrCenterstripspliceOrRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the connectionOrCenterstripspliceOrRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionOrCenterstripspliceOrRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HarnessWireEndType }
     * {@link CenterStripSpliceType }
     * {@link ThroughBundleType }
     * {@link ThroughNodeType }
     * {@link WireMarkerType }
     * {@link HarnessLevelType }
     * {@link BasePropertyType }
     * {@link BaseVarianceType }
     * {@link FunctionalVariantType }
     * {@link ProductionVariantType }
     * {@link BaseReferredModuleType }
     * 
     * 
     */
    public List<Object> getConnectionOrCenterstripspliceOrRoute() {
        if (connectionOrCenterstripspliceOrRoute == null) {
            connectionOrCenterstripspliceOrRoute = new ArrayList<Object>();
        }
        return this.connectionOrCenterstripspliceOrRoute;
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
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
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
     * Gets the value of the variantposition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariantposition() {
        return variantposition;
    }

    /**
     * Sets the value of the variantposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariantposition(Boolean value) {
        this.variantposition = value;
    }

    /**
     * Gets the value of the routedbyconstraint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutedbyconstraint() {
        return routedbyconstraint;
    }

    /**
     * Sets the value of the routedbyconstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutedbyconstraint(Boolean value) {
        this.routedbyconstraint = value;
    }

    /**
     * Gets the value of the wirelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelength() {
        return wirelength;
    }

    /**
     * Sets the value of the wirelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelength(String value) {
        this.wirelength = value;
    }

    /**
     * Gets the value of the wirecolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirecolor() {
        return wirecolor;
    }

    /**
     * Sets the value of the wirecolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirecolor(String value) {
        this.wirecolor = value;
    }

    /**
     * Gets the value of the outsidediameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsidediameter() {
        return outsidediameter;
    }

    /**
     * Sets the value of the outsidediameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsidediameter(String value) {
        this.outsidediameter = value;
    }

    /**
     * Gets the value of the wirecsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirecsa() {
        return wirecsa;
    }

    /**
     * Sets the value of the wirecsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirecsa(String value) {
        this.wirecsa = value;
    }

    /**
     * Gets the value of the bendradius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBendradius() {
        return bendradius;
    }

    /**
     * Sets the value of the bendradius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBendradius(String value) {
        this.bendradius = value;
    }

    /**
     * Gets the value of the wirematerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirematerial() {
        return wirematerial;
    }

    /**
     * Sets the value of the wirematerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirematerial(String value) {
        this.wirematerial = value;
    }

    /**
     * Gets the value of the wiretype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiretype() {
        return wiretype;
    }

    /**
     * Sets the value of the wiretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiretype(String value) {
        this.wiretype = value;
    }

    /**
     * Gets the value of the wirespec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirespec() {
        return wirespec;
    }

    /**
     * Sets the value of the wirespec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirespec(String value) {
        this.wirespec = value;
    }

    /**
     * Gets the value of the sepcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSepcode() {
        return sepcode;
    }

    /**
     * Sets the value of the sepcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSepcode(String value) {
        this.sepcode = value;
    }

    /**
     * Gets the value of the wirenote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirenote() {
        return wirenote;
    }

    /**
     * Sets the value of the wirenote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirenote(String value) {
        this.wirenote = value;
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
     * Gets the value of the secondarywirenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarywirenumber() {
        return secondarywirenumber;
    }

    /**
     * Sets the value of the secondarywirenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarywirenumber(String value) {
        this.secondarywirenumber = value;
    }

    /**
     * Gets the value of the shield property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShield() {
        return shield;
    }

    /**
     * Sets the value of the shield property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShield(Boolean value) {
        this.shield = value;
    }

    /**
     * Gets the value of the unmodifiedlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmodifiedlength() {
        return unmodifiedlength;
    }

    /**
     * Sets the value of the unmodifiedlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmodifiedlength(String value) {
        this.unmodifiedlength = value;
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
     * Gets the value of the incCut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncCut() {
        return incCut;
    }

    /**
     * Sets the value of the incCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncCut(Boolean value) {
        this.incCut = value;
    }

    /**
     * Gets the value of the wireCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireCode() {
        return wireCode;
    }

    /**
     * Sets the value of the wireCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireCode(String value) {
        this.wireCode = value;
    }

    /**
     * Gets the value of the terminalMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalMaterial() {
        return terminalMaterial;
    }

    /**
     * Sets the value of the terminalMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalMaterial(String value) {
        this.terminalMaterial = value;
    }

    /**
     * Gets the value of the bypass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypass() {
        return bypass;
    }

    /**
     * Sets the value of the bypass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypass(Boolean value) {
        this.bypass = value;
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
     * Gets the value of the lengthchangetype property.
     * 
     * @return
     *     possible object is
     *     {@link LengthChangeTypeAttribute }
     *     
     */
    public LengthChangeTypeAttribute getLengthchangetype() {
        if (lengthchangetype == null) {
            return LengthChangeTypeAttribute.NEITHER;
        } else {
            return lengthchangetype;
        }
    }

    /**
     * Sets the value of the lengthchangetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthChangeTypeAttribute }
     *     
     */
    public void setLengthchangetype(LengthChangeTypeAttribute value) {
        this.lengthchangetype = value;
    }

    /**
     * Gets the value of the lengthchangevalue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLengthchangevalue() {
        return lengthchangevalue;
    }

    /**
     * Sets the value of the lengthchangevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLengthchangevalue(Double value) {
        this.lengthchangevalue = value;
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