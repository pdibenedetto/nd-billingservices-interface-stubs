
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;


/**
 * <p>Java class for inboundSlidingScaleCommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundSlidingScaleCommission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumFrom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumTo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundSlidingScaleCommission", propOrder = {
    "commissionPercent",
    "premiumFrom",
    "premiumTo"
})
public class InboundSlidingScaleCommission
    extends BaseWSVo
{

    @XmlElement(name = "CommissionPercent")
    protected BigDecimal commissionPercent;
    @XmlElement(name = "PremiumFrom")
    protected BigDecimal premiumFrom;
    @XmlElement(name = "PremiumTo")
    protected BigDecimal premiumTo;

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
     * Gets the value of the premiumFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumFrom() {
        return premiumFrom;
    }

    /**
     * Sets the value of the premiumFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumFrom(BigDecimal value) {
        this.premiumFrom = value;
    }

    /**
     * Gets the value of the premiumTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumTo() {
        return premiumTo;
    }

    /**
     * Sets the value of the premiumTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumTo(BigDecimal value) {
        this.premiumTo = value;
    }

}
