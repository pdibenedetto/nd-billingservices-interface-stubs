
package com.majescomastek.stgicd.ws.meta.entityinterface.entityresponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.entityinterface.BaseWSVo;


/**
 * <p>Java class for entityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/entityinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="EntityTransactionSeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://com/majescomastek/stgicd/ws/meta/entityinterface/entityresponse}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "entityResponse", propOrder = {
    "entityTransactionSeq",
    "entityType",
    "messages",
    "processStatusFlag",
    "sourceSystemEntityCode",
    "successFlag"
})
public class EntityResponse
    extends BaseWSVo
{

    @XmlElement(name = "EntityTransactionSeq")
    protected BigDecimal entityTransactionSeq;
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElement(name = "Messages")
    protected List<Message> messages;
    @XmlElement(name = "ProcessStatusFlag")
    protected String processStatusFlag;
    @XmlElement(name = "SourceSystemEntityCode")
    protected String sourceSystemEntityCode;
    @XmlElement(name = "SuccessFlag")
    protected String successFlag;

    /**
     * Gets the value of the entityTransactionSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntityTransactionSeq() {
        return entityTransactionSeq;
    }

    /**
     * Sets the value of the entityTransactionSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntityTransactionSeq(BigDecimal value) {
        this.entityTransactionSeq = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
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
     * Gets the value of the sourceSystemEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemEntityCode() {
        return sourceSystemEntityCode;
    }

    /**
     * Sets the value of the sourceSystemEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemEntityCode(String value) {
        this.sourceSystemEntityCode = value;
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
