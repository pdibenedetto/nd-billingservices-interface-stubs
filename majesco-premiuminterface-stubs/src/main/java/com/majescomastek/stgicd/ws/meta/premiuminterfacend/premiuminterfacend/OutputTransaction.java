
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.premiuminterfacend;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transactionresponse.TransactionResponse;


/**
 * <p>Java class for outputTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="RequestResponse" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/requestresponse}requestResponse" minOccurs="0"/>
 *         &lt;element name="TransactionResponse" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transactionresponse}transactionResponse" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "outputTransaction", propOrder = {
    "requestResponse",
    "transactionResponse"
})
public class OutputTransaction
    extends BaseWSVo
{

    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;
    @XmlElement(name = "TransactionResponse")
    protected List<TransactionResponse> transactionResponse;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionResponse }
     * 
     * 
     */
    public List<TransactionResponse> getTransactionResponse() {
        if (transactionResponse == null) {
            transactionResponse = new ArrayList<TransactionResponse>();
        }
        return this.transactionResponse;
    }

}
