
package com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.paymentinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader.PaymentDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestheader.RequestHeader;


/**
 * <p>Java class for servicerequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicerequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/paymentinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="PaymentDepositHeader" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/paymentdepositheader}paymentDepositHeader" maxOccurs="unbounded"/>
 *         &lt;element name="RequestHeader" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/requestheader}requestHeader"/>
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
    "paymentDepositHeader",
    "requestHeader"
})
public class Servicerequest
    extends BaseWSVo
{

    @XmlElement(name = "PaymentDepositHeader", required = true)
    protected List<PaymentDepositHeader> paymentDepositHeader;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;

    /**
     * Gets the value of the paymentDepositHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDepositHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDepositHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDepositHeader }
     * 
     * 
     */
    public List<PaymentDepositHeader> getPaymentDepositHeader() {
        if (paymentDepositHeader == null) {
            paymentDepositHeader = new ArrayList<PaymentDepositHeader>();
        }
        return this.paymentDepositHeader;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
