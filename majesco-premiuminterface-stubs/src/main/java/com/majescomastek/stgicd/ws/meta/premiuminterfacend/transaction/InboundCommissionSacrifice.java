
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;


/**
 * <p>Java class for inboundCommissionSacrifice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundCommissionSacrifice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="CommissionEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TranCurrencyCommissionSacrificeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundCommissionSacrifice", propOrder = {
    "commissionEntityCode",
    "commissionEntityType",
    "tranCurrencyCommissionSacrificeAmt"
})
public class InboundCommissionSacrifice
    extends BaseWSVo
{

    @XmlElement(name = "CommissionEntityCode")
    protected String commissionEntityCode;
    @XmlElement(name = "CommissionEntityType")
    protected String commissionEntityType;
    @XmlElement(name = "TranCurrencyCommissionSacrificeAmt")
    protected BigDecimal tranCurrencyCommissionSacrificeAmt;

    /**
     * Gets the value of the commissionEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionEntityCode() {
        return commissionEntityCode;
    }

    /**
     * Sets the value of the commissionEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionEntityCode(String value) {
        this.commissionEntityCode = value;
    }

    /**
     * Gets the value of the commissionEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionEntityType() {
        return commissionEntityType;
    }

    /**
     * Sets the value of the commissionEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionEntityType(String value) {
        this.commissionEntityType = value;
    }

    /**
     * Gets the value of the tranCurrencyCommissionSacrificeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranCurrencyCommissionSacrificeAmt() {
        return tranCurrencyCommissionSacrificeAmt;
    }

    /**
     * Sets the value of the tranCurrencyCommissionSacrificeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranCurrencyCommissionSacrificeAmt(BigDecimal value) {
        this.tranCurrencyCommissionSacrificeAmt = value;
    }

}
