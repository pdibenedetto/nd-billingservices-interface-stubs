
package com.majescomastek.stgicd.ws.meta.entityinterface.entityinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.majescomastek.stgicd.ws.meta.entityinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.entityinterface.entity.Entity;
import com.majescomastek.stgicd.ws.meta.entityinterface.requestheader.RequestHeader;


/**
 * <p>Java class for inboundEntityInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundEntityInterface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/entityinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Entity" type="{http://com/majescomastek/stgicd/ws/meta/entityinterface/entity}entity" maxOccurs="unbounded"/>
 *         &lt;element name="RequestHeader" type="{http://com/majescomastek/stgicd/ws/meta/entityinterface/requestheader}requestHeader"/>
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
@XmlType(name = "inboundEntityInterface", propOrder = {
    "entity",
    "requestHeader"
})
public class InboundEntityInterface
    extends BaseWSVo
{

    @XmlElement(name = "Entity", required = true)
    protected List<Entity> entity;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entity }
     * 
     * 
     */
    public List<Entity> getEntity() {
        if (entity == null) {
            entity = new ArrayList<Entity>();
        }
        return this.entity;
    }

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
