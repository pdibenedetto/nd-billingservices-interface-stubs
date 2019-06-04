
package com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleasedetails.HoldReleaseDetails;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.inboundrequest.InboundRequest;


/**
 * <p>Java class for servicerequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicerequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="HoldReleaseDetails" type="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface/holdreleasedetails}holdReleaseDetails"/>
 *         &lt;element name="InboundRequest" type="{http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface/inboundrequest}inboundRequest"/>
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
@XmlType(name = "servicerequest", propOrder = {
    "holdReleaseDetails",
    "inboundRequest"
})
public class Servicerequest
    extends BaseWSVo
{

    @XmlElement(name = "HoldReleaseDetails", required = true)
    protected HoldReleaseDetails holdReleaseDetails;
    @XmlElement(name = "InboundRequest", required = true)
    protected InboundRequest inboundRequest;

    /**
     * Gets the value of the holdReleaseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link HoldReleaseDetails }
     *     
     */
    public HoldReleaseDetails getHoldReleaseDetails() {
        return holdReleaseDetails;
    }

    /**
     * Sets the value of the holdReleaseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldReleaseDetails }
     *     
     */
    public void setHoldReleaseDetails(HoldReleaseDetails value) {
        this.holdReleaseDetails = value;
    }

    /**
     * Gets the value of the inboundRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InboundRequest }
     *     
     */
    public InboundRequest getInboundRequest() {
        return inboundRequest;
    }

    /**
     * Sets the value of the inboundRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundRequest }
     *     
     */
    public void setInboundRequest(InboundRequest value) {
        this.inboundRequest = value;
    }

}
