
package com.nd.ws.billing.account.searchinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.nd.billing.model.account.response.Message;


/**
 * <p>Java class for requestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/searchinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="EntityList" type="{http://com/nd/ws/billing/account/searchinterface}entity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageList" type="{http://com/nd/billing/model/account/response}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "entityList",
    "processStatusFlag",
    "messageList",
    "requestDate",
    "sourceSystemRequestNo",
    "successFlag"
})
public class RequestResponse
    extends BaseWSVo
{

    @XmlElement(name = "EntityList")
    protected List<Entity> entityList;
    @XmlElement(name = "ProcessStatusFlag")
    protected String processStatusFlag;
    @XmlElement(name = "MessageList")
    protected List<Message> messageList;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "SourceSystemRequestNo")
    protected String sourceSystemRequestNo;
    @XmlElement(name = "SuccessFlag")
    protected String successFlag;

    /**
     * Gets the value of the entityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entity }
     * 
     * 
     */
    public List<Entity> getEntityList() {
        if (entityList == null) {
            entityList = new ArrayList<Entity>();
        }
        return this.entityList;
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
     * Gets the value of the messageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessageList() {
        if (messageList == null) {
            messageList = new ArrayList<Message>();
        }
        return this.messageList;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
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
