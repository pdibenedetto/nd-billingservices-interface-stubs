
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.paymentinstrumentinforesponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.BaseWSVo;


/**
 * <p>Java class for paymentInstrumentInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentInstrumentInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentInstrumentInfoResponse", propOrder = {
    "tokenId"
})
public class PaymentInstrumentInfoResponse
    extends BaseWSVo
{

    @XmlElement(name = "TokenId")
    protected String tokenId;

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

}
