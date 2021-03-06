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
 *       &lt;/sequence>
 *       &lt;attribute name="blockType" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="interfaceFunctionName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ordering" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parent" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="simulationFunctionName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="simulationFunctionType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="style" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "mxGeometry"
})
@XmlRootElement(name = "PrintBlock")
public class PrintBlock {

    @XmlElement(name = "ScilabString", required = true)
    protected ScilabString scilabString;
    @XmlElements({
        @XmlElement(name = "Array", type = Array.class),
        @XmlElement(name = "ScilabDouble", type = ScilabDouble.class)
    })
    protected List<Object> arrayOrScilabDouble;
    @XmlElement(required = true)
    protected MxGeometry mxGeometry;
    @XmlAttribute(name = "blockType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String blockType;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "interfaceFunctionName", required = true)
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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String simulationFunctionName;
    @XmlAttribute(name = "simulationFunctionType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String simulationFunctionType;
    @XmlAttribute(name = "style", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String value;

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

}
