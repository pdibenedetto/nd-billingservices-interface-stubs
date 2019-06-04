
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InstrumentDetailResponse;


/**
 * <p>Java class for serviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation/inboundinstrumentinformation}instrumentDetailResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "_return"
})
public class ServiceResponse {

    @XmlElement(name = "return")
    protected InstrumentDetailResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentDetailResponse }
     *     
     */
    public InstrumentDetailResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentDetailResponse }
     *     
     */
    public void setReturn(InstrumentDetailResponse value) {
        this._return = value;
    }

}
