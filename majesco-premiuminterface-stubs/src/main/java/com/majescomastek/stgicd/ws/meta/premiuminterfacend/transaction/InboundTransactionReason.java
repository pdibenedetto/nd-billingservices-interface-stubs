
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;


/**
 * <p>Java class for inboundTransactionReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundTransactionReason">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="InboundReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InboundReasonPriority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundTransactionReason", propOrder = {
    "inboundReasonCode",
    "inboundReasonPriority"
})
public class InboundTransactionReason
    extends BaseWSVo
{

    @XmlElement(name = "InboundReasonCode")
    protected String inboundReasonCode;
    @XmlElement(name = "InboundReasonPriority")
    protected BigDecimal inboundReasonPriority;

    /**
     * Gets the value of the inboundReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundReasonCode() {
        return inboundReasonCode;
    }

    /**
     * Sets the value of the inboundReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundReasonCode(String value) {
        this.inboundReasonCode = value;
    }

    /**
     * Gets the value of the inboundReasonPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInboundReasonPriority() {
        return inboundReasonPriority;
    }

    /**
     * Sets the value of the inboundReasonPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInboundReasonPriority(BigDecimal value) {
        this.inboundReasonPriority = value;
    }

}
