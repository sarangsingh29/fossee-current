//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 02:15:07 PM IST 
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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}Array"/>
 *           &lt;element ref="{}ScilabDouble"/>
 *           &lt;element ref="{}ScilabString"/>
 *         &lt;/choice>
 *         &lt;element ref="{}mxGeometry"/>
 *       &lt;/sequence>
 *       &lt;attribute name="angle" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="as" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="blockType" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="connectable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dependsOnT" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dependsOnU" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="interfaceFunctionName" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ordering" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parent" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="simulationFunctionName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="simulationFunctionType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="style" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "arrayOrScilabDoubleOrScilabString",
    "mxGeometry"
})
@XmlRootElement(name = "BasicBlock")
public class BasicBlock {

    @XmlElements({
        @XmlElement(name = "Array", type = Array.class),
        @XmlElement(name = "ScilabDouble", type = ScilabDouble.class),
        @XmlElement(name = "ScilabString", type = ScilabString.class)
    })
    protected List<Object> arrayOrScilabDoubleOrScilabString;
    @XmlElement(required = true)
    protected MxGeometry mxGeometry;
    @XmlAttribute(name = "angle")
    protected BigInteger angle;
    @XmlAttribute(name = "as")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String as;
    @XmlAttribute(name = "blockType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String blockType;
    @XmlAttribute(name = "connectable")
    protected BigInteger connectable;
    @XmlAttribute(name = "dependsOnT")
    protected BigInteger dependsOnT;
    @XmlAttribute(name = "dependsOnU")
    protected BigInteger dependsOnU;
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
    @XmlAttribute(name = "parent", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String parent;
    @XmlAttribute(name = "simulationFunctionName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String simulationFunctionName;
    @XmlAttribute(name = "simulationFunctionType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String simulationFunctionType;
    @XmlAttribute(name = "style", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;
    @XmlAttribute(name = "vertex")
    protected BigInteger vertex;
    @XmlAttribute(name = "visible")
    protected BigInteger visible;

    /**
     * Gets the value of the arrayOrScilabDoubleOrScilabString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOrScilabDoubleOrScilabString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOrScilabDoubleOrScilabString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * {@link ScilabDouble }
     * {@link ScilabString }
     * 
     * 
     */
    public List<Object> getArrayOrScilabDoubleOrScilabString() {
        if (arrayOrScilabDoubleOrScilabString == null) {
            arrayOrScilabDoubleOrScilabString = new ArrayList<Object>();
        }
        return this.arrayOrScilabDoubleOrScilabString;
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
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAngle(BigInteger value) {
        this.angle = value;
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
     * Gets the value of the blockType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * Sets the value of the blockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockType(String value) {
        this.blockType = value;
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
     * Gets the value of the dependsOnT property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDependsOnT() {
        return dependsOnT;
    }

    /**
     * Sets the value of the dependsOnT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDependsOnT(BigInteger value) {
        this.dependsOnT = value;
    }

    /**
     * Gets the value of the dependsOnU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDependsOnU() {
        return dependsOnU;
    }

    /**
     * Sets the value of the dependsOnU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDependsOnU(BigInteger value) {
        this.dependsOnU = value;
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
