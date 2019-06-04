
package com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.inboundwhatiftransactiondetail;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;


/**
 * <p>Java class for inboundTransactionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundTransactionDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCurrencyCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionCurrencyReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundTransactionDetail", propOrder = {
    "commissionPercent",
    "receivableCode",
    "transactionCurrencyCommissionAmount",
    "transactionCurrencyReceivableAmount"
})
public class InboundTransactionDetail
    extends BaseWSVo
{

    @XmlElement(name = "CommissionPercent")
    protected BigDecimal commissionPercent;
    @XmlElement(name = "ReceivableCode")
    protected String receivableCode;
    @XmlElement(name = "TransactionCurrencyCommissionAmount")
    protected BigDecimal transactionCurrencyCommissionAmount;
    @XmlElement(name = "TransactionCurrencyReceivableAmount")
    protected BigDecimal transactionCurrencyReceivableAmount;

    /**
     * Gets the value of the commissionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Sets the value of the commissionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPercent(BigDecimal value) {
        this.commissionPercent = value;
    }

    /**
     * Gets the value of the receivableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivableCode() {
        return receivableCode;
    }

    /**
     * Sets the value of the receivableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivableCode(String value) {
        this.receivableCode = value;
    }

    /**
     * Gets the value of the transactionCurrencyCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionCurrencyCommissionAmount() {
        return transactionCurrencyCommissionAmount;
    }

    /**
     * Sets the value of the transactionCurrencyCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionCurrencyCommissionAmount(BigDecimal value) {
        this.transactionCurrencyCommissionAmount = value;
    }

    /**
     * Gets the value of the transactionCurrencyReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionCurrencyReceivableAmount() {
        return transactionCurrencyReceivableAmount;
    }

    /**
     * Sets the value of the transactionCurrencyReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionCurrencyReceivableAmount(BigDecimal value) {
        this.transactionCurrencyReceivableAmount = value;
    }

}
