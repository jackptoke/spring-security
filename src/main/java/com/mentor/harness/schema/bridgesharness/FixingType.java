//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 A fixing can be specified at an optional number of locations.
 *                 This form is able to support multiple bundles simultaneously.
 *                 The location corresponds to the mid-point of the part.
 *                 The location can be further specified by the addition of the orientation attribute, useful for asymmetric parts.
 *                 Additionally, the length fixing attribute will determine the end points of the part on the bundle.
 *             
 * 
 * <p>Java class for FixingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}PropertyGroup"/&gt;
 *         &lt;element name="Location" type="{http://www.mentor.com/harness/Schema/bridgesharness}BundleLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addpart" type="{http://www.mentor.com/harness/Schema/bridgesharness}AdditionalComponentType"/&gt;
 *         &lt;element name="rotation" type="{http://www.mentor.com/harness/Schema/bridgesharness}Cartesian3DCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="alignment" type="{http://www.mentor.com/harness/Schema/bridgesharness}Cartesian3DCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.mentor.com/harness/Schema/bridgesharness}Cartesian3DCoordinate" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}OriginAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}HarnessPartAttributes"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="elecid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="fixingType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="clip"/&gt;
 *             &lt;enumeration value="grommet"/&gt;
 *             &lt;enumeration value="support"/&gt;
 *             &lt;enumeration value="other"/&gt;
 *             &lt;enumeration value="retainer"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optionexpression" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="materialcode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="colorcode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="viewFromNode" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="cliptype" type="{http://www.mentor.com/harness/Schema/bridgesharness}ClipType" default="cabletie" /&gt;
 *       &lt;attribute name="clipmount" type="{http://www.mentor.com/harness/Schema/bridgesharness}ClipMountingType" default="stud" /&gt;
 *       &lt;attribute name="offsetclip" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="layerNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixingType", propOrder = {
    "propertyAndVariantAndFunctionalvariant"
})
public class FixingType {

    @XmlElementRefs({
        @XmlElementRef(name = "property", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "functionalvariant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "productionvariant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "refedmodule", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Location", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "addpart", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rotation", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alignment", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "position", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> propertyAndVariantAndFunctionalvariant;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "elecid")
    protected String elecid;
    @XmlAttribute(name = "length")
    protected Double length;
    @XmlAttribute(name = "fixingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fixingType;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "optionexpression")
    protected String optionexpression;
    @XmlAttribute(name = "materialcode")
    protected String materialcode;
    @XmlAttribute(name = "colorcode")
    protected String colorcode;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "viewFromNode")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object viewFromNode;
    @XmlAttribute(name = "cliptype")
    protected ClipType cliptype;
    @XmlAttribute(name = "clipmount")
    protected ClipMountingType clipmount;
    @XmlAttribute(name = "offsetclip")
    protected Boolean offsetclip;
    @XmlAttribute(name = "layerNumber")
    protected BigInteger layerNumber;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String origin;
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
     * Gets the value of the propertyAndVariantAndFunctionalvariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAndVariantAndFunctionalvariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAndVariantAndFunctionalvariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseVarianceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalVariantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProductionVariantType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseReferredModuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link BundleLocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link Cartesian3DCoordinate }{@code >}
     * {@link JAXBElement }{@code <}{@link Cartesian3DCoordinate }{@code >}
     * {@link JAXBElement }{@code <}{@link Cartesian3DCoordinate }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPropertyAndVariantAndFunctionalvariant() {
        if (propertyAndVariantAndFunctionalvariant == null) {
            propertyAndVariantAndFunctionalvariant = new ArrayList<JAXBElement<?>>();
        }
        return this.propertyAndVariantAndFunctionalvariant;
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * Gets the value of the fixingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingType() {
        return fixingType;
    }

    /**
     * Sets the value of the fixingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingType(String value) {
        this.fixingType = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
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
     * Gets the value of the colorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorcode() {
        return colorcode;
    }

    /**
     * Sets the value of the colorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorcode(String value) {
        this.colorcode = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the viewFromNode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getViewFromNode() {
        return viewFromNode;
    }

    /**
     * Sets the value of the viewFromNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setViewFromNode(Object value) {
        this.viewFromNode = value;
    }

    /**
     * Gets the value of the cliptype property.
     * 
     * @return
     *     possible object is
     *     {@link ClipType }
     *     
     */
    public ClipType getCliptype() {
        if (cliptype == null) {
            return ClipType.CABLETIE;
        } else {
            return cliptype;
        }
    }

    /**
     * Sets the value of the cliptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClipType }
     *     
     */
    public void setCliptype(ClipType value) {
        this.cliptype = value;
    }

    /**
     * Gets the value of the clipmount property.
     * 
     * @return
     *     possible object is
     *     {@link ClipMountingType }
     *     
     */
    public ClipMountingType getClipmount() {
        if (clipmount == null) {
            return ClipMountingType.STUD;
        } else {
            return clipmount;
        }
    }

    /**
     * Sets the value of the clipmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClipMountingType }
     *     
     */
    public void setClipmount(ClipMountingType value) {
        this.clipmount = value;
    }

    /**
     * Gets the value of the offsetclip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffsetclip() {
        return offsetclip;
    }

    /**
     * Sets the value of the offsetclip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffsetclip(Boolean value) {
        this.offsetclip = value;
    }

    /**
     * Gets the value of the layerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLayerNumber() {
        return layerNumber;
    }

    /**
     * Sets the value of the layerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLayerNumber(BigInteger value) {
        this.layerNumber = value;
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
