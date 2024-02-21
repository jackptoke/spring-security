//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Position" type="{http://www.mentor.com/harness/Schema/bridgesharness}CartesianPointType"/&gt;
 *         &lt;element name="PlanarPosition" type="{http://www.mentor.com/harness/Schema/bridgesharness}CartesianPointType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.mentor.com/harness/Schema/bridgesharness}CommonElementsGroup"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/bridgesharness}OriginAttributeGroup"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shortdescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optionexpression" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" default="end"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="through"/&gt;
 *             &lt;enumeration value="end"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="viewFromNode" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "positionOrPlanarPositionOrHarnesslevel"
})
public class NodeType {

    @XmlElementRefs({
        @XmlElementRef(name = "Position", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PlanarPosition", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "harnesslevel", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "functionalvariant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "productionvariant", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "refedmodule", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> positionOrPlanarPositionOrHarnesslevel;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "shortname")
    protected String shortname;
    @XmlAttribute(name = "shortdescription")
    protected String shortdescription;
    @XmlAttribute(name = "optionexpression")
    protected String optionexpression;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "viewFromNode")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object viewFromNode;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String origin;

    /**
     * Gets the value of the positionOrPlanarPositionOrHarnesslevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the positionOrPlanarPositionOrHarnesslevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOrPlanarPositionOrHarnesslevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CartesianPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link HarnessLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseVarianceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalVariantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProductionVariantType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseReferredModuleType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPositionOrPlanarPositionOrHarnesslevel() {
        if (positionOrPlanarPositionOrHarnesslevel == null) {
            positionOrPlanarPositionOrHarnesslevel = new ArrayList<JAXBElement<?>>();
        }
        return this.positionOrPlanarPositionOrHarnesslevel;
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
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "end";
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

}
