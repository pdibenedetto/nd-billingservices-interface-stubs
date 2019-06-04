
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.paymentinstrumentinforesponse.PaymentInstrumentInfoResponse;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestresponse.RequestResponse;


/**
 * <p>Java class for instrumentDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrumentDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="PaymentInstrumentInfoResponse" type="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation/paymentinstrumentinforesponse}paymentInstrumentInfoResponse" minOccurs="0"/>
 *         &lt;element name="RequestResponse" type="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation/requestresponse}requestResponse" minOccurs="0"/>
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
@XmlType(name = "instrumentDetailResponse", propOrder = {
    "paymentInstrumentInfoResponse",
    "requestResponse"
})
public class InstrumentDetailResponse
    extends BaseWSVo
{

    @XmlElement(name = "PaymentInstrumentInfoResponse")
    protected PaymentInstrumentInfoResponse paymentInstrumentInfoResponse;
    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;

    /**
     * Gets the value of the paymentInstrumentInfoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentInfoResponse }
     *     
     */
    public PaymentInstrumentInfoResponse getPaymentInstrumentInfoResponse() {
        return paymentInstrumentInfoResponse;
    }

    /**
     * Sets the value of the paymentInstrumentInfoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentInfoResponse }
     *     
     */
    public void setPaymentInstrumentInfoResponse(PaymentInstrumentInfoResponse value) {
        this.paymentInstrumentInfoResponse = value;
    }

    /**
     * Gets the value of the requestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResponse }
     *     
     */
    public RequestResponse getRequestResponse() {
        return requestResponse;
    }

    /**
     * Sets the value of the requestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResponse }
     *     
     */
    public void setRequestResponse(RequestResponse value) {
        this.requestResponse = value;
    }

}
