
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.inputrequest.InputRequest;


/**
 * <p>Java class for billingInquiryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquiryInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="InputRequest" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/inputrequest}inputRequest" minOccurs="0"/>
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
@XmlType(name = "billingInquiryInput", propOrder = {
    "inputRequest"
})
public class BillingInquiryInput
    extends BaseWSVo
{

    @XmlElement(name = "InputRequest")
    protected InputRequest inputRequest;

    /**
     * Gets the value of the inputRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InputRequest }
     *     
     */
    public InputRequest getInputRequest() {
        return inputRequest;
    }

    /**
     * Sets the value of the inputRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputRequest }
     *     
     */
    public void setInputRequest(InputRequest value) {
        this.inputRequest = value;
    }

}
