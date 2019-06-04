
package com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.TransactionResponse;


/**
 * <p>Java class for responseTransactionSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseTransactionSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="RequestResponse" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/requestresponse}requestResponse" minOccurs="0"/>
 *         &lt;element name="TransactionResponse" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transactionresponse}transactionResponse" minOccurs="0"/>
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
@XmlType(name = "responseTransactionSchedule", propOrder = {
    "requestResponse",
    "transactionResponse"
})
public class ResponseTransactionSchedule
    extends BaseWSVo
{

    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;
    @XmlElement(name = "TransactionResponse")
    protected TransactionResponse transactionResponse;

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

    /**
     * Gets the value of the transactionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResponse }
     *     
     */
    public TransactionResponse getTransactionResponse() {
        return transactionResponse;
    }

    /**
     * Sets the value of the transactionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResponse }
     *     
     */
    public void setTransactionResponse(TransactionResponse value) {
        this.transactionResponse = value;
    }

}
