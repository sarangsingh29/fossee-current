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
 *         &lt;element ref="{}mxGeometry"/>
 *         &lt;element ref="{}mxCell"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}ImplicitInputPort"/>
 *           &lt;element ref="{}ImplicitOutputPort"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mxGeometry",
    "mxCell",
    "implicitInputPortOrImplicitOutputPort"
})
@XmlRootElement(name = "ImplicitLink")
public class ImplicitLink {

    @XmlElement(required = true)
    protected MxGeometry mxGeometry;
    @XmlElement(required = true)
    protected MxCell mxCell;
    @XmlElements({
        @XmlElement(name = "ImplicitInputPort", type = ImplicitInputPort.class),
        @XmlElement(name = "ImplicitOutputPort", type = ImplicitOutputPort.class)
    })
    protected List<Object> implicitInputPortOrImplicitOutputPort;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;

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
     * Gets the value of the implicitInputPortOrImplicitOutputPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implicitInputPortOrImplicitOutputPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplicitInputPortOrImplicitOutputPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImplicitInputPort }
     * {@link ImplicitOutputPort }
     * 
     * 
     */
    public List<Object> getImplicitInputPortOrImplicitOutputPort() {
        if (implicitInputPortOrImplicitOutputPort == null) {
            implicitInputPortOrImplicitOutputPort = new ArrayList<Object>();
        }
        return this.implicitInputPortOrImplicitOutputPort;
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
