
package com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.InstallmentScheduleSummaryByDueDate;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.Message;


/**
 * <p>Java class for inboundWhatIfTransactionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundWhatIfTransactionDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="InstallmentScheduleSummarybyDueDate" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transactionresponse/inboundwhatiftransactiondetail}installmentScheduleSummaryByDueDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transactionresponse/inboundwhatiftransactiondetail}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundWhatIfTransactionDetail", propOrder = {
    "installmentScheduleSummarybyDueDate",
    "messages",
    "paymentPlan"
})
public class InboundWhatIfTransactionDetail
    extends BaseWSVo
{

    @XmlElement(name = "InstallmentScheduleSummarybyDueDate")
    protected List<InstallmentScheduleSummaryByDueDate> installmentScheduleSummarybyDueDate;
    @XmlElement(name = "Messages")
    protected List<Message> messages;
    @XmlElement(name = "PaymentPlan")
    protected String paymentPlan;

    /**
     * Gets the value of the installmentScheduleSummarybyDueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentScheduleSummarybyDueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentScheduleSummarybyDueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentScheduleSummaryByDueDate }
     * 
     * 
     */
    public List<InstallmentScheduleSummaryByDueDate> getInstallmentScheduleSummarybyDueDate() {
        if (installmentScheduleSummarybyDueDate == null) {
            installmentScheduleSummarybyDueDate = new ArrayList<InstallmentScheduleSummaryByDueDate>();
        }
        return this.installmentScheduleSummarybyDueDate;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the paymentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /**
     * Sets the value of the paymentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlan(String value) {
        this.paymentPlan = value;
    }

}
