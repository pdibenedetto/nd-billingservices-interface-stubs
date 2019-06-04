
package com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.paymentinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.PaymentResponseDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestresponse.RequestResponse;


/**
 * <p>Java class for serviceresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceresponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/paymentinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="PaymentResponseDepositHeader" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/paymentresponsedepositheader}paymentResponseDepositHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestResponse" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/requestresponse}requestResponse" minOccurs="0"/>
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
    "paymentResponseDepositHeader",
    "requestResponse"
})
public class Serviceresponse
    extends BaseWSVo
{

    @XmlElement(name = "PaymentResponseDepositHeader")
    protected List<PaymentResponseDepositHeader> paymentResponseDepositHeader;
    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;

    /**
     * Gets the value of the paymentResponseDepositHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentResponseDepositHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentResponseDepositHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentResponseDepositHeader }
     * 
     * 
     */
    public List<PaymentResponseDepositHeader> getPaymentResponseDepositHeader() {
        if (paymentResponseDepositHeader == null) {
            paymentResponseDepositHeader = new ArrayList<PaymentResponseDepositHeader>();
        }
        return this.paymentResponseDepositHeader;
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
