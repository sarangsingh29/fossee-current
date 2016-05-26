//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 04:32:45 PM IST 
//


package xcos;

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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}Array"/>
 *           &lt;element ref="{}ScilabDouble"/>
 *           &lt;element ref="{}ScilabString"/>
 *           &lt;element ref="{}ScilabBoolean"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{}ScilabInteger"/>
 *           &lt;element ref="{}mxPoint" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}add" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="as" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="scilabClass" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "scilabInteger",
    "mxPoint",
    "add"
})
@XmlRootElement(name = "Array")
public class Array {

    @XmlElements({
        @XmlElement(name = "Array", type = Array.class),
        @XmlElement(name = "ScilabDouble", type = ScilabDouble.class),
        @XmlElement(name = "ScilabString", type = ScilabString.class),
        @XmlElement(name = "ScilabBoolean", type = ScilabBoolean.class)
    })
    protected List<Object> arrayOrScilabDoubleOrScilabString;
    @XmlElement(name = "ScilabInteger")
    protected ScilabInteger scilabInteger;
    protected List<MxPoint> mxPoint;
    protected List<Add> add;
    @XmlAttribute(name = "as")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String as;
    @XmlAttribute(name = "scilabClass", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String scilabClass;

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
     * {@link ScilabBoolean }
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
     * Gets the value of the scilabInteger property.
     * 
     * @return
     *     possible object is
     *     {@link ScilabInteger }
     *     
     */
    public ScilabInteger getScilabInteger() {
        return scilabInteger;
    }

    /**
     * Sets the value of the scilabInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScilabInteger }
     *     
     */
    public void setScilabInteger(ScilabInteger value) {
        this.scilabInteger = value;
    }

    /**
     * Gets the value of the mxPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mxPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMxPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MxPoint }
     * 
     * 
     */
    public List<MxPoint> getMxPoint() {
        if (mxPoint == null) {
            mxPoint = new ArrayList<MxPoint>();
        }
        return this.mxPoint;
    }

    /**
     * Gets the value of the add property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the add property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Add }
     * 
     * 
     */
    public List<Add> getAdd() {
        if (add == null) {
            add = new ArrayList<Add>();
        }
        return this.add;
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
     * Gets the value of the scilabClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScilabClass() {
        return scilabClass;
    }

    /**
     * Sets the value of the scilabClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScilabClass(String value) {
        this.scilabClass = value;
    }

}
