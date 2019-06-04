
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.receivabledetails.InboundTransactionCommission;


/**
 * <p>Java class for receivableDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivableDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivableCommission" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction/receivabledetails}inboundTransactionCommission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "receivableDetails", propOrder = {
    "commissionPercent",
    "receivableCode",
    "receivableCommission",
    "subLocation",
    "transactionCurrencyCommissionAmount",
    "transactionCurrencyReceivableAmount"
})
public class ReceivableDetails
    extends BaseWSVo
{

    @XmlElement(name = "CommissionPercent")
    protected BigDecimal commissionPercent;
    @XmlElement(name = "ReceivableCode")
    protected String receivableCode;
    @XmlElement(name = "ReceivableCommission")
    protected List<InboundTransactionCommission> receivableCommission;
    @XmlElement(name = "SubLocation")
    protected String subLocation;
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
     * Gets the value of the receivableCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundTransactionCommission }
     * 
     * 
     */
    public List<InboundTransactionCommission> getReceivableCommission() {
        if (receivableCommission == null) {
            receivableCommission = new ArrayList<InboundTransactionCommission>();
        }
        return this.receivableCommission;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLocation() {
        return subLocation;
    }

    /**
     * Sets the value of the subLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLocation(String value) {
        this.subLocation = value;
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
