
package com.nd.ws.billing.account.createinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/createinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="EntityAddressList" type="{http://com/nd/ws/billing/account/createinterface}entityAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DoingBusinessAsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyEntity", propOrder = {
    "entityAddressList",
    "doingBusinessAsName",
    "entityType"
})
public class PolicyEntity
    extends BaseWSVo
{

    @XmlElement(name = "EntityAddressList")
    protected List<EntityAddress> entityAddressList;
    @XmlElement(name = "DoingBusinessAsName")
    protected String doingBusinessAsName;
    @XmlElement(name = "EntityType")
    protected String entityType;

    /**
     * Gets the value of the entityAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityAddress }
     * 
     * 
     */
    public List<EntityAddress> getEntityAddressList() {
        if (entityAddressList == null) {
            entityAddressList = new ArrayList<EntityAddress>();
        }
        return this.entityAddressList;
    }

    /**
     * Gets the value of the doingBusinessAsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoingBusinessAsName() {
        return doingBusinessAsName;
    }

    /**
     * Sets the value of the doingBusinessAsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoingBusinessAsName(String value) {
        this.doingBusinessAsName = value;
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

}
