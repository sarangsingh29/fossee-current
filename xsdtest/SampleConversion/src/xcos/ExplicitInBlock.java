//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 03:01:04 PM IST 
//


package xcos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}ScilabString"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}Array"/>
 *           &lt;element ref="{}ScilabDouble"/>
 *         &lt;/choice>
 *         &lt;element ref="{}mxGeometry"/>
 *         &lt;element ref="{}mxCell" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="connectable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="interfaceFunctionName" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ordering" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="simulationFunctionName" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="simulationFunctionType" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="vertex" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "scilabString",
    "arrayOrScilabDouble",
    "mxGeometry",
    "mxCell"
})
@XmlRootElement(name = "ExplicitInBlock")
public class ExplicitInBlock {

    @XmlElement(name = "ScilabString", required = true)
    protected ScilabString scilabString;
    @XmlElements({
        @XmlElement(name = "Array", type = Array.class),
        @XmlElement(name = "ScilabDouble", type = ScilabDouble.class)
    })
    protected List<Object> arrayOrScilabDouble;
    @XmlElement(required = true)
    protected MxGeometry mxGeometry;
    protected MxCell mxCell;
    @XmlAttribute(name = "connectable")
    protected BigInteger connectable;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "interfaceFunctionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String interfaceFunctionName;
    @XmlAttribute(name = "ordering")
    protected BigInteger ordering;
    @XmlAttribute(name = "parent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String parent;
    @XmlAttribute(name = "simulationFunctionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String simulationFunctionName;
    @XmlAttribute(name = "simulationFunctionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String simulationFunctionType;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "value")
    protected BigInteger value;
    @XmlAttribute(name = "vertex")
    protected BigInteger vertex;
    @XmlAttribute(name = "visible")
    protected BigInteger visible;

    /**
     * Gets the value of the scilabString property.
     * 
     * @return
     *     possible object is
     *     {@link ScilabString }
     *     
     */
    public ScilabString getScilabString() {
        return scilabString;
    }

    /**
     * Sets the value of the scilabString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScilabString }
     *     
     */
    public void setScilabString(ScilabString value) {
        this.scilabString = value;
    }

    /**
     * Gets the value of the arrayOrScilabDouble property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOrScilabDouble property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOrScilabDouble().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * {@link ScilabDouble }
     * 
     * 
     */
    public List<Object> getArrayOrScilabDouble() {
        if (arrayOrScilabDouble == null) {
            arrayOrScilabDouble = new ArrayList<Object>();
        }
        return this.arrayOrScilabDouble;
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
     * Gets the value of the mxCell property.
     * 
     * @return
     *     possible object is
     *     {@link MxCell }
     *     
     */
    public MxCell getMxCell() {
        return mxCell;
    }

    /**
     * Sets the value of the mxCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxCell }
     *     
     */
    public void setMxCell(MxCell value) {
        this.mxCell = value;
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
     * Gets the value of the interfaceFunctionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceFunctionName() {
        return interfaceFunctionName;
    }

    /**
     * Sets the value of the interfaceFunctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceFunctionName(String value) {
        this.interfaceFunctionName = value;
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
     * Gets the value of the simulationFunctionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationFunctionName() {
        return simulationFunctionName;
    }

    /**
     * Sets the value of the simulationFunctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationFunctionName(String value) {
        this.simulationFunctionName = value;
    }

    /**
     * Gets the value of the simulationFunctionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationFunctionType() {
        return simulationFunctionType;
    }

    /**
     * Sets the value of the simulationFunctionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationFunctionType(String value) {
        this.simulationFunctionType = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the vertex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVertex() {
        return vertex;
    }

    /**
     * Sets the value of the vertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVertex(BigInteger value) {
        this.vertex = value;
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
