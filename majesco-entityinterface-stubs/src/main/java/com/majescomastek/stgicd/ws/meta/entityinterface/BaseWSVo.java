
package com.majescomastek.stgicd.ws.meta.entityinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.entityinterface.entity.Entity;
import com.majescomastek.stgicd.ws.meta.entityinterface.entity.InboundEntityAddress;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityinterface.InboundEntityInterface;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityinterface.OutputTransaction;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityresponse.EntityResponse;
import com.majescomastek.stgicd.ws.meta.entityinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.entityinterface.requestresponse.RequestResponse;


/**
 * <p>Java class for baseWSVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseWSVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseWSVo")
@XmlSeeAlso({
    Entity.class,
    InboundEntityInterface.class,
    OutputTransaction.class,
    RequestResponse.class,
    InboundEntityAddress.class,
    EntityResponse.class,
    RequestHeader.class,
    com.majescomastek.stgicd.ws.meta.entityinterface.entityresponse.Message.class,
    com.majescomastek.stgicd.ws.meta.entityinterface.requestresponse.Message.class
})
public abstract class BaseWSVo {


}
