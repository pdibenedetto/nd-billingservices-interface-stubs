
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquirySummary;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.RequestResponse;


/**
 * <p>Java class for billingInquiryOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquiryOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="BillingInquirySummary" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquirySummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestResponse" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/requestresponse}requestResponse" minOccurs="0"/>
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
@XmlType(name = "billingInquiryOutput", propOrder = {
    "billingInquirySummary",
    "requestResponse"
})
public class BillingInquiryOutput
    extends BaseWSVo
{

    @XmlElement(name = "BillingInquirySummary")
    protected List<BillingInquirySummary> billingInquirySummary;
    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;

    /**
     * Gets the value of the billingInquirySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquirySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquirySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquirySummary }
     * 
     * 
     */
    public List<BillingInquirySummary> getBillingInquirySummary() {
        if (billingInquirySummary == null) {
            billingInquirySummary = new ArrayList<BillingInquirySummary>();
        }
        return this.billingInquirySummary;
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
