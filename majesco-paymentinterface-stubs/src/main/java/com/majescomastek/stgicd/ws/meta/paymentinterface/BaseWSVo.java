
package com.majescomastek.stgicd.ws.meta.paymentinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader.PaymentDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Servicerequest;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Serviceresponse;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.PaymentResponseDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestresponse.RequestResponse;


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
    RequestResponse.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.requestresponse.Message.class,
    RequestHeader.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.paymentdetail.Message.class,
    PaymentResponseDepositHeader.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.PaymentDetail.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.Message.class,
    Serviceresponse.class,
    Servicerequest.class,
    PaymentDepositHeader.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader.PaymentDetail.class
})
public abstract class BaseWSVo {


}
