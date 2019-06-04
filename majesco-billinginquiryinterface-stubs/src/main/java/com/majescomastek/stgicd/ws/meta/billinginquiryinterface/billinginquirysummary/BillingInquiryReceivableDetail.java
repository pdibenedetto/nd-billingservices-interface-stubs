
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BaseWSVo;


/**
 * <p>Java class for billingInquiryReceivableDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquiryReceivableDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AmountReceivedIncludingAdjustments" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionLiability" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableBilledAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingInquiryReceivableDetail", propOrder = {
    "amountReceivedIncludingAdjustments",
    "balance",
    "commissionLiability",
    "commissionPaid",
    "receivableAmount",
    "receivableBilledAmount",
    "receivableCategory",
    "receivableCode"
})
public class BillingInquiryReceivableDetail
    extends BaseWSVo
{

    @XmlElement(name = "AmountReceivedIncludingAdjustments")
    protected BigDecimal amountReceivedIncludingAdjustments;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "CommissionLiability")
    protected BigDecimal commissionLiability;
    @XmlElement(name = "CommissionPaid")
    protected BigDecimal commissionPaid;
    @XmlElement(name = "ReceivableAmount")
    protected BigDecimal receivableAmount;
    @XmlElement(name = "ReceivableBilledAmount")
    protected BigDecimal receivableBilledAmount;
    @XmlElement(name = "ReceivableCategory")
    protected String receivableCategory;
    @XmlElement(name = "ReceivableCode")
    protected String receivableCode;

    /**
     * Gets the value of the amountReceivedIncludingAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountReceivedIncludingAdjustments() {
        return amountReceivedIncludingAdjustments;
    }

    /**
     * Sets the value of the amountReceivedIncludingAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountReceivedIncludingAdjustments(BigDecimal value) {
        this.amountReceivedIncludingAdjustments = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the commissionLiability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionLiability() {
        return commissionLiability;
    }

    /**
     * Sets the value of the commissionLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionLiability(BigDecimal value) {
        this.commissionLiability = value;
    }

    /**
     * Gets the value of the commissionPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPaid() {
        return commissionPaid;
    }

    /**
     * Sets the value of the commissionPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPaid(BigDecimal value) {
        this.commissionPaid = value;
    }

    /**
     * Gets the value of the receivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * Sets the value of the receivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmount(BigDecimal value) {
        this.receivableAmount = value;
    }

    /**
     * Gets the value of the receivableBilledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableBilledAmount() {
        return receivableBilledAmount;
    }

    /**
     * Sets the value of the receivableBilledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableBilledAmount(BigDecimal value) {
        this.receivableBilledAmount = value;
    }

    /**
     * Gets the value of the receivableCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivableCategory() {
        return receivableCategory;
    }

    /**
     * Sets the value of the receivableCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivableCategory(String value) {
        this.receivableCategory = value;
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

}
