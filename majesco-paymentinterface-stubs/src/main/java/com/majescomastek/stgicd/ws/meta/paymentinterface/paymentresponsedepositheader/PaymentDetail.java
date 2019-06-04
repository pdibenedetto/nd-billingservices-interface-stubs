
package com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.paymentinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.paymentdetail.Message;


/**
 * <p>Java class for paymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/paymentinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/paymentresponsedepositheader/paymentdetail}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentDepositSeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentSeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProcessStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemTransactionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentDetail", propOrder = {
    "message",
    "paymentDepositSeq",
    "paymentId",
    "paymentSeq",
    "processStatusFlag",
    "sourceSystemTransactionNo",
    "successFlag"
})
public class PaymentDetail
    extends BaseWSVo
{

    @XmlElement(name = "Message")
    protected List<Message> message;
    @XmlElement(name = "PaymentDepositSeq")
    protected BigDecimal paymentDepositSeq;
    @XmlElement(name = "PaymentId")
    protected String paymentId;
    @XmlElement(name = "PaymentSeq")
    protected BigDecimal paymentSeq;
    @XmlElement(name = "ProcessStatusFlag")
    protected String processStatusFlag;
    @XmlElement(name = "SourceSystemTransactionNo")
    protected String sourceSystemTransactionNo;
    @XmlElement(name = "SuccessFlag")
    protected String successFlag;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    /**
     * Gets the value of the paymentDepositSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentDepositSeq() {
        return paymentDepositSeq;
    }

    /**
     * Sets the value of the paymentDepositSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentDepositSeq(BigDecimal value) {
        this.paymentDepositSeq = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the paymentSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentSeq() {
        return paymentSeq;
    }

    /**
     * Sets the value of the paymentSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentSeq(BigDecimal value) {
        this.paymentSeq = value;
    }

    /**
     * Gets the value of the processStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatusFlag() {
        return processStatusFlag;
    }

    /**
     * Sets the value of the processStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatusFlag(String value) {
        this.processStatusFlag = value;
    }

    /**
     * Gets the value of the sourceSystemTransactionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemTransactionNo() {
        return sourceSystemTransactionNo;
    }

    /**
     * Sets the value of the sourceSystemTransactionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemTransactionNo(String value) {
        this.sourceSystemTransactionNo = value;
    }

    /**
     * Gets the value of the successFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessFlag() {
        return successFlag;
    }

    /**
     * Sets the value of the successFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessFlag(String value) {
        this.successFlag = value;
    }

}
