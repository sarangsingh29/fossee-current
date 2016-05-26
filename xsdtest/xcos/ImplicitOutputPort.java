//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 02:15:07 PM IST 
//


package xcos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Orientation" minOccurs="0"/>
 *         &lt;element ref="{}mxGeometry"/>
 *       &lt;/sequence>
 *       &lt;attribute name="as" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="connectable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="connectedLinkId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dataColumns" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dataLines" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dataType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ordering" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parent" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orientation",
    "mxGeometry"
})
@XmlRootElement(name = "ImplicitOutputPort")
public class ImplicitOutputPort {

    @XmlElement(name = "Orientation")
    protected Orientation orientation;
    @XmlElement(required = true)
    protected MxGeometry mxGeometry;
    @XmlAttribute(name = "as")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String as;
    @XmlAttribute(name = "connectable")
    protected BigInteger connectable;
    @XmlAttribute(name = "connectedLinkId")
    protected BigInteger connectedLinkId;
    @XmlAttribute(name = "dataColumns")
    protected BigInteger dataColumns;
    @XmlAttribute(name = "dataLines")
    protected BigInteger dataLines;
    @XmlAttribute(name = "dataType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dataType;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "ordering", required = true)
    protected BigInteger ordering;
    @XmlAttribute(name = "parent", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String parent;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String value;
    @XmlAttribute(name = "visible")
    protected BigInteger visible;

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link Orientation }
     *     
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orientation }
     *     
     */
    public void setOrientation(Orientation value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the mxGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link MxGeometry }
     *     
     */
    public MxGeometry getMxGeometry() {
        return mxGeometry;
    }

    /**
     * Sets the value of the mxGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxGeometry }
     *     
     */
    public void setMxGeometry(MxGeometry value) {
        this.mxGeometry = value;
    }

    /**
     * Gets the value of the as property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs() {
        return as;
    }

    /**
     * Sets the value of the as property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs(String value) {
        this.as = value;
    }

    /**
     * Gets the value of the connectable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectable() {
        return connectable;
    }

    /**
     * Sets the value of the connectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectable(BigInteger value) {
        this.connectable = value;
    }

    /**
     * Gets the value of the connectedLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectedLinkId() {
        return connectedLinkId;
    }

    /**
     * Sets the value of the connectedLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectedLinkId(BigInteger value) {
        this.connectedLinkId = value;
    }

    /**
     * Gets the value of the dataColumns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataColumns() {
        return dataColumns;
    }

    /**
     * Sets the value of the dataColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataColumns(BigInteger value) {
        this.dataColumns = value;
    }

    /**
     * Gets the value of the dataLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLines() {
        return dataLines;
    }

    /**
     * Sets the value of the dataLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataLines(BigInteger value) {
        this.dataLines = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
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
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdering(BigInteger value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisible(BigInteger value) {
        this.visible = value;
    }

}
