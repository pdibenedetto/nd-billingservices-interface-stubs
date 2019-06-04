
package com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleaseresponse.HoldReleaseResponse;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.outboundresponse.OutboundResponse;


/**
 * <p>Java class for serviceresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceresponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="HoldReleaseResponse" type="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface/holdreleaseresponse}holdReleaseResponse" minOccurs="0"/>
 *         &lt;element name="outboundResponse" type="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface/outboundresponse}outboundResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceresponse", propOrder = {
    "holdReleaseResponse",
    "outboundResponse"
})
public class Serviceresponse
    extends BaseWSVo
{

    @XmlElement(name = "HoldReleaseResponse")
    protected HoldReleaseResponse holdReleaseResponse;
    protected OutboundResponse outboundResponse;

    /**
     * Gets the value of the holdReleaseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HoldReleaseResponse }
     *     
     */
    public HoldReleaseResponse getHoldReleaseResponse() {
        return holdReleaseResponse;
    }

    /**
     * Sets the value of the holdReleaseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldReleaseResponse }
     *     
     */
    public void setHoldReleaseResponse(HoldReleaseResponse value) {
        this.holdReleaseResponse = value;
    }

    /**
     * Gets the value of the outboundResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundResponse }
     *     
     */
    public OutboundResponse getOutboundResponse() {
        return outboundResponse;
    }

    /**
     * Sets the value of the outboundResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundResponse }
     *     
     */
    public void setOutboundResponse(OutboundResponse value) {
        this.outboundResponse = value;
    }

}
