//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 03:26:39 PM IST 
//


package mxgraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}mxCell"/>
 *       &lt;/choice>
 *       &lt;attribute name="mavval" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mxCell"
})
@XmlRootElement(name = "root")
public class Root {

    protected List<MxCell> mxCell;
    @XmlAttribute(name = "mavval")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String mavval;

    /**
     * Gets the value of the mxCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mxCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMxCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MxCell }
     * 
     * 
     */
    public List<MxCell> getMxCell() {
        if (mxCell == null) {
            mxCell = new ArrayList<MxCell>();
        }
        return this.mxCell;
    }

    /**
     * Gets the value of the mavval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMavval() {
        return mavval;
    }

    /**
     * Sets the value of the mavval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMavval(String value) {
        this.mavval = value;
    }

}
