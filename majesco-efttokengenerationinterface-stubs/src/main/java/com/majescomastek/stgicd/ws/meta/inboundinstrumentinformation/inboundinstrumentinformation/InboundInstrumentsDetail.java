
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestheader.RequestHeader;


/**
 * <p>Java class for inboundInstrumentsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundInstrumentsDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation/requestheader}requestHeader"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundInstrumentsDetail", propOrder = {
    "requestHeader"
})
public class InboundInstrumentsDetail
    extends BaseWSVo
{

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
