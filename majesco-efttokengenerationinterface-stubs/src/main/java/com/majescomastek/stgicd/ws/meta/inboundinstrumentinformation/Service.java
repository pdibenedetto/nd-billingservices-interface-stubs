
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InboundInstrumentsDetail;


/**
 * <p>Java class for service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputMsg" type="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation/inboundinstrumentinformation}inboundInstrumentsDetail" minOccurs="0"/>
 *         &lt;element name="UserAuthentication" type="{http://com/majescomastek/stgicd/ws/meta/authentication}authentication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service", propOrder = {
    "inputMsg",
    "userAuthentication"
})
public class Service {

    protected InboundInstrumentsDetail inputMsg;
    @XmlElement(name = "UserAuthentication")
    protected Authentication userAuthentication;

    /**
     * Gets the value of the inputMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InboundInstrumentsDetail }
     *     
     */
    public InboundInstrumentsDetail getInputMsg() {
        return inputMsg;
    }

    /**
     * Sets the value of the inputMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundInstrumentsDetail }
     *     
     */
    public void setInputMsg(InboundInstrumentsDetail value) {
        this.inputMsg = value;
    }

    /**
     * Gets the value of the userAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getUserAuthentication() {
        return userAuthentication;
    }

    /**
     * Sets the value of the userAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setUserAuthentication(Authentication value) {
        this.userAuthentication = value;
    }

}