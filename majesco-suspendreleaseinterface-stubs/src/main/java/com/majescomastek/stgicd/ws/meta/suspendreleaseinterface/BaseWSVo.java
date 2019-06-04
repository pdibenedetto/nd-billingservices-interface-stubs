
package com.majescomastek.stgicd.ws.meta.suspendreleaseinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleasedetails.HoldReleaseDetails;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleaseresponse.HoldReleaseResponse;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleaseresponse.Message;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.inboundrequest.InboundRequest;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.outboundresponse.OutboundResponse;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface.Servicerequest;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface.Serviceresponse;


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
    Servicerequest.class,
    HoldReleaseResponse.class,
    Message.class,
    OutboundResponse.class,
    HoldReleaseDetails.class,
    Serviceresponse.class,
    InboundRequest.class
})
public abstract class BaseWSVo {


}
