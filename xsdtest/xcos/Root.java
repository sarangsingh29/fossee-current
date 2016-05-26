//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 02:15:07 PM IST 
//


package xcos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}BasicBlock"/>
 *         &lt;element ref="{}CommandPort"/>
 *         &lt;element ref="{}ControlPort"/>
 *         &lt;element ref="{}ExplicitInputPort"/>
 *         &lt;element ref="{}ExplicitOutputPort"/>
 *         &lt;element ref="{}ImplicitInputPort"/>
 *         &lt;element ref="{}ImplicitOutputPort"/>
 *         &lt;element ref="{}mxCell"/>
 *         &lt;element ref="{}AfficheBlock"/>
 *         &lt;element ref="{}BigSom"/>
 *         &lt;element ref="{}CommandControlLink"/>
 *         &lt;element ref="{}ConstBlock"/>
 *         &lt;element ref="{}EventInBlock"/>
 *         &lt;element ref="{}EventOutBlock"/>
 *         &lt;element ref="{}ExplicitInBlock"/>
 *         &lt;element ref="{}ExplicitLink"/>
 *         &lt;element ref="{}ExplicitOutBlock"/>
 *         &lt;element ref="{}GainBlock"/>
 *         &lt;element ref="{}GroundBlock"/>
 *         &lt;element ref="{}ImplicitInBlock"/>
 *         &lt;element ref="{}ImplicitLink"/>
 *         &lt;element ref="{}ImplicitOutBlock"/>
 *         &lt;element ref="{}PrintBlock"/>
 *         &lt;element ref="{}Product"/>
 *         &lt;element ref="{}RoundBlock"/>
 *         &lt;element ref="{}SplitBlock"/>
 *         &lt;element ref="{}Summation"/>
 *         &lt;element ref="{}SuperBlock"/>
 *         &lt;element ref="{}TextBlock"/>
 *         &lt;element ref="{}VoltageSensorBlock"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "basicBlockOrCommandPortOrControlPort"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElements({
        @XmlElement(name = "BasicBlock", type = BasicBlock.class),
        @XmlElement(name = "CommandPort", type = CommandPort.class),
        @XmlElement(name = "ControlPort", type = ControlPort.class),
        @XmlElement(name = "ExplicitInputPort", type = ExplicitInputPort.class),
        @XmlElement(name = "ExplicitOutputPort", type = ExplicitOutputPort.class),
        @XmlElement(name = "ImplicitInputPort", type = ImplicitInputPort.class),
        @XmlElement(name = "ImplicitOutputPort", type = ImplicitOutputPort.class),
        @XmlElement(name = "mxCell", type = MxCell.class),
        @XmlElement(name = "AfficheBlock", type = AfficheBlock.class),
        @XmlElement(name = "BigSom", type = BigSom.class),
        @XmlElement(name = "CommandControlLink", type = CommandControlLink.class),
        @XmlElement(name = "ConstBlock", type = ConstBlock.class),
        @XmlElement(name = "EventInBlock", type = EventInBlock.class),
        @XmlElement(name = "EventOutBlock", type = EventOutBlock.class),
        @XmlElement(name = "ExplicitInBlock", type = ExplicitInBlock.class),
        @XmlElement(name = "ExplicitLink", type = ExplicitLink.class),
        @XmlElement(name = "ExplicitOutBlock", type = ExplicitOutBlock.class),
        @XmlElement(name = "GainBlock", type = GainBlock.class),
        @XmlElement(name = "GroundBlock", type = GroundBlock.class),
        @XmlElement(name = "ImplicitInBlock", type = ImplicitInBlock.class),
        @XmlElement(name = "ImplicitLink", type = ImplicitLink.class),
        @XmlElement(name = "ImplicitOutBlock", type = ImplicitOutBlock.class),
        @XmlElement(name = "PrintBlock", type = PrintBlock.class),
        @XmlElement(name = "Product", type = Product.class),
        @XmlElement(name = "RoundBlock", type = RoundBlock.class),
        @XmlElement(name = "SplitBlock", type = SplitBlock.class),
        @XmlElement(name = "Summation", type = Summation.class),
        @XmlElement(name = "SuperBlock", type = SuperBlock.class),
        @XmlElement(name = "TextBlock", type = TextBlock.class),
        @XmlElement(name = "VoltageSensorBlock", type = VoltageSensorBlock.class)
    })
    protected List<Object> basicBlockOrCommandPortOrControlPort;

    /**
     * Gets the value of the basicBlockOrCommandPortOrControlPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicBlockOrCommandPortOrControlPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicBlockOrCommandPortOrControlPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicBlock }
     * {@link CommandPort }
     * {@link ControlPort }
     * {@link ExplicitInputPort }
     * {@link ExplicitOutputPort }
     * {@link ImplicitInputPort }
     * {@link ImplicitOutputPort }
     * {@link MxCell }
     * {@link AfficheBlock }
     * {@link BigSom }
     * {@link CommandControlLink }
     * {@link ConstBlock }
     * {@link EventInBlock }
     * {@link EventOutBlock }
     * {@link ExplicitInBlock }
     * {@link ExplicitLink }
     * {@link ExplicitOutBlock }
     * {@link GainBlock }
     * {@link GroundBlock }
     * {@link ImplicitInBlock }
     * {@link ImplicitLink }
     * {@link ImplicitOutBlock }
     * {@link PrintBlock }
     * {@link Product }
     * {@link RoundBlock }
     * {@link SplitBlock }
     * {@link Summation }
     * {@link SuperBlock }
     * {@link TextBlock }
     * {@link VoltageSensorBlock }
     * 
     * 
     */
    public List<Object> getBasicBlockOrCommandPortOrControlPort() {
        if (basicBlockOrCommandPortOrControlPort == null) {
            basicBlockOrCommandPortOrControlPort = new ArrayList<Object>();
        }
        return this.basicBlockOrCommandPortOrControlPort;
    }

}