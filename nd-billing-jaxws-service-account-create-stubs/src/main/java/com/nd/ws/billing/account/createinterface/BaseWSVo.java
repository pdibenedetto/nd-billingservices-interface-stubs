
package com.nd.ws.billing.account.createinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.nd.billing.model.account.response.Message;


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
    AccountWorkflowRequest.class,
    AccountWorkflowResponse.class,
    PolicyEntity.class,
    RequestSearchDetails.class,
    EntityAddress.class,
    RequestResponse.class,
    RequestHeader.class,
    InstrumentDetail.class,
    Entity.class,
    Policy.class,
    Message.class
})
public abstract class BaseWSVo {


}
