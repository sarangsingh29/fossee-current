//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 02:15:07 PM IST 
//


package xcos;

import java.math.BigDecimal;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}Array"/>
 *           &lt;element ref="{}mxGraphModel"/>
 *         &lt;/choice>
 *         &lt;element ref="{}mxCell"/>
 *         &lt;element ref="{}mxPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="as" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="background" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="finalIntegrationTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="gridEnabled" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="integratorAbsoluteTolerance" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="integratorRelativeTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxIntegrationTimeInterval" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="solver" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="toleranceOnTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOrMxGraphModel",
    "mxCell",
    "mxPoint"
})
@XmlRootElement(name = "SuperBlockDiagram")
public class SuperBlockDiagram {

    @XmlElements({
        @XmlElement(name = "Array", type = Array.class),
        @XmlElement(name = "mxGraphModel", type = MxGraphModel.class)
    })
    protected List<Object> arrayOrMxGraphModel;
    @XmlElement(required = true)
    protected MxCell mxCell;
    protected MxPoint mxPoint;
    @XmlAttribute(name = "as", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String as;
    @XmlAttribute(name = "background")
    protected BigInteger background;
    @XmlAttribute(name = "finalIntegrationTime")
    protected BigDecimal finalIntegrationTime;
    @XmlAttribute(name = "gridEnabled")
    protected BigInteger gridEnabled;
    @XmlAttribute(name = "integratorAbsoluteTolerance")
    protected Double integratorAbsoluteTolerance;
    @XmlAttribute(name = "integratorRelativeTolerance")
    protected BigDecimal integratorRelativeTolerance;
    @XmlAttribute(name = "maxIntegrationTimeInterval")
    protected BigDecimal maxIntegrationTimeInterval;
    @XmlAttribute(name = "solver")
    protected BigDecimal solver;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "toleranceOnTime")
    protected BigDecimal toleranceOnTime;

    /**
     * Gets the value of the arrayOrMxGraphModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOrMxGraphModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOrMxGraphModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * {@link MxGraphModel }
     * 
     * 
     */
    public List<Object> getArrayOrMxGraphModel() {
        if (arrayOrMxGraphModel == null) {
            arrayOrMxGraphModel = new ArrayList<Object>();
        }
        return this.arrayOrMxGraphModel;
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
     * Gets the value of the mxPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MxPoint }
     *     
     */
    public MxPoint getMxPoint() {
        return mxPoint;
    }

    /**
     * Sets the value of the mxPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxPoint }
     *     
     */
    public void setMxPoint(MxPoint value) {
        this.mxPoint = value;
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
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackground(BigInteger value) {
        this.background = value;
    }

    /**
     * Gets the value of the finalIntegrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalIntegrationTime() {
        return finalIntegrationTime;
    }

    /**
     * Sets the value of the finalIntegrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalIntegrationTime(BigDecimal value) {
        this.finalIntegrationTime = value;
    }

    /**
     * Gets the value of the gridEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridEnabled() {
        return gridEnabled;
    }

    /**
     * Sets the value of the gridEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridEnabled(BigInteger value) {
        this.gridEnabled = value;
    }

    /**
     * Gets the value of the integratorAbsoluteTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntegratorAbsoluteTolerance() {
        return integratorAbsoluteTolerance;
    }

    /**
     * Sets the value of the integratorAbsoluteTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntegratorAbsoluteTolerance(Double value) {
        this.integratorAbsoluteTolerance = value;
    }

    /**
     * Gets the value of the integratorRelativeTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntegratorRelativeTolerance() {
        return integratorRelativeTolerance;
    }

    /**
     * Sets the value of the integratorRelativeTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntegratorRelativeTolerance(BigDecimal value) {
        this.integratorRelativeTolerance = value;
    }

    /**
     * Gets the value of the maxIntegrationTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxIntegrationTimeInterval() {
        return maxIntegrationTimeInterval;
    }

    /**
     * Sets the value of the maxIntegrationTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxIntegrationTimeInterval(BigDecimal value) {
        this.maxIntegrationTimeInterval = value;
    }

    /**
     * Gets the value of the solver property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSolver() {
        return solver;
    }

    /**
     * Sets the value of the solver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSolver(BigDecimal value) {
        this.solver = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the toleranceOnTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToleranceOnTime() {
        return toleranceOnTime;
    }

    /**
     * Sets the value of the toleranceOnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToleranceOnTime(BigDecimal value) {
        this.toleranceOnTime = value;
    }

}
