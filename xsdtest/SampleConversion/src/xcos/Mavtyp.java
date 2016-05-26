//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 03:01:04 PM IST 
//


package xcos;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mavtyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mavtyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Array" minOccurs="0"/>
 *         &lt;element ref="{}mxUndoManager" minOccurs="0"/>
 *         &lt;element ref="{}mxGraphModel"/>
 *         &lt;element ref="{}mxCell"/>
 *         &lt;element ref="{}mxPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="background" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="debugLevel" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="finalIntegrationTime" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="gridEnabled" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="integratorAbsoluteTolerance" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="integratorRelativeTolerance" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="maxIntegrationTimeInterval" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxIntegrationTimeinterval" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maximumStepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="modified" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="opened" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="realTimeScaling" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="savedFile" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="solver" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="toleranceOnTime" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mavtyp", propOrder = {
    "array",
    "mxUndoManager",
    "mxGraphModel",
    "mxCell",
    "mxPoint"
})
public class Mavtyp {

    @XmlElement(name = "Array")
    protected Array array;
    protected MxUndoManager mxUndoManager;
    @XmlElement(required = true)
    protected MxGraphModel mxGraphModel;
    @XmlElement(required = true)
    protected MxCell mxCell;
    protected MxPoint mxPoint;
    @XmlAttribute(name = "background", required = true)
    protected BigInteger background;
    @XmlAttribute(name = "debugLevel")
    protected BigInteger debugLevel;
    @XmlAttribute(name = "finalIntegrationTime")
    protected Double finalIntegrationTime;
    @XmlAttribute(name = "gridEnabled")
    protected BigInteger gridEnabled;
    @XmlAttribute(name = "integratorAbsoluteTolerance")
    protected Double integratorAbsoluteTolerance;
    @XmlAttribute(name = "integratorRelativeTolerance")
    protected Double integratorRelativeTolerance;
    @XmlAttribute(name = "maxIntegrationTimeInterval")
    protected BigDecimal maxIntegrationTimeInterval;
    @XmlAttribute(name = "maxIntegrationTimeinterval")
    protected BigDecimal maxIntegrationTimeinterval;
    @XmlAttribute(name = "maximumStepSize")
    protected BigDecimal maximumStepSize;
    @XmlAttribute(name = "modified")
    protected BigInteger modified;
    @XmlAttribute(name = "opened")
    protected BigInteger opened;
    @XmlAttribute(name = "realTimeScaling")
    protected BigDecimal realTimeScaling;
    @XmlAttribute(name = "savedFile")
    @XmlSchemaType(name = "anySimpleType")
    protected String savedFile;
    @XmlAttribute(name = "solver")
    protected BigDecimal solver;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "toleranceOnTime")
    protected Double toleranceOnTime;

    /**
     * Gets the value of the array property.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     */
    public void setArray(Array value) {
        this.array = value;
    }

    /**
     * Gets the value of the mxUndoManager property.
     * 
     * @return
     *     possible object is
     *     {@link MxUndoManager }
     *     
     */
    public MxUndoManager getMxUndoManager() {
        return mxUndoManager;
    }

    /**
     * Sets the value of the mxUndoManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxUndoManager }
     *     
     */
    public void setMxUndoManager(MxUndoManager value) {
        this.mxUndoManager = value;
    }

    /**
     * Gets the value of the mxGraphModel property.
     * 
     * @return
     *     possible object is
     *     {@link MxGraphModel }
     *     
     */
    public MxGraphModel getMxGraphModel() {
        return mxGraphModel;
    }

    /**
     * Sets the value of the mxGraphModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxGraphModel }
     *     
     */
    public void setMxGraphModel(MxGraphModel value) {
        this.mxGraphModel = value;
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
     * Gets the value of the debugLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDebugLevel() {
        return debugLevel;
    }

    /**
     * Sets the value of the debugLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDebugLevel(BigInteger value) {
        this.debugLevel = value;
    }

    /**
     * Gets the value of the finalIntegrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinalIntegrationTime() {
        return finalIntegrationTime;
    }

    /**
     * Sets the value of the finalIntegrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinalIntegrationTime(Double value) {
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
     *     {@link Double }
     *     
     */
    public Double getIntegratorRelativeTolerance() {
        return integratorRelativeTolerance;
    }

    /**
     * Sets the value of the integratorRelativeTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntegratorRelativeTolerance(Double value) {
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
     * Gets the value of the maxIntegrationTimeinterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxIntegrationTimeinterval() {
        return maxIntegrationTimeinterval;
    }

    /**
     * Sets the value of the maxIntegrationTimeinterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxIntegrationTimeinterval(BigDecimal value) {
        this.maxIntegrationTimeinterval = value;
    }

    /**
     * Gets the value of the maximumStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStepSize() {
        return maximumStepSize;
    }

    /**
     * Sets the value of the maximumStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumStepSize(BigDecimal value) {
        this.maximumStepSize = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModified(BigInteger value) {
        this.modified = value;
    }

    /**
     * Gets the value of the opened property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpened() {
        return opened;
    }

    /**
     * Sets the value of the opened property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpened(BigInteger value) {
        this.opened = value;
    }

    /**
     * Gets the value of the realTimeScaling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealTimeScaling() {
        return realTimeScaling;
    }

    /**
     * Sets the value of the realTimeScaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealTimeScaling(BigDecimal value) {
        this.realTimeScaling = value;
    }

    /**
     * Gets the value of the savedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedFile() {
        return savedFile;
    }

    /**
     * Sets the value of the savedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedFile(String value) {
        this.savedFile = value;
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
     *     {@link Double }
     *     
     */
    public Double getToleranceOnTime() {
        return toleranceOnTime;
    }

    /**
     * Sets the value of the toleranceOnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setToleranceOnTime(Double value) {
        this.toleranceOnTime = value;
    }

}
