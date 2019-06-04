
package com.majescomastek.stgicd.ws.meta.entityinterface.requestresponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.entityinterface.BaseWSVo;


/**
 * <p>Java class for requestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/entityinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://com/majescomastek/stgicd/ws/meta/entityinterface/requestresponse}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestSeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SourceSystemRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "requestResponse", propOrder = {
    "message",
    "processStatusFlag",
    "requestSeq",
    "sourceSystemRequestNo",
    "successFlag"
})
public class RequestResponse
    extends BaseWSVo
{

    @XmlElement(name = "Message")
    protected List<Message> message;
    @XmlElement(name = "ProcessStatusFlag")
    protected String processStatusFlag;
    @XmlElement(name = "RequestSeq")
    protected BigDecimal requestSeq;
    @XmlElement(name = "SourceSystemRequestNo")
    protected String sourceSystemRequestNo;
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
     * Gets the value of the requestSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestSeq() {
        return requestSeq;
    }

    /**
     * Sets the value of the requestSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestSeq(BigDecimal value) {
        this.requestSeq = value;
    }

    /**
     * Gets the value of the sourceSystemRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemRequestNo() {
        return sourceSystemRequestNo;
    }

    /**
     * Sets the value of the sourceSystemRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemRequestNo(String value) {
        this.sourceSystemRequestNo = value;
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
