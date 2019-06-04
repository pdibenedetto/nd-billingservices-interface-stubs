
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InboundInstrumentsDetail;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InstrumentDetailResponse;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.paymentinstrumentinforesponse.PaymentInstrumentInfoResponse;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestresponse.Message;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestresponse.RequestResponse;


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
    Message.class,
    PaymentInstrumentInfoResponse.class,
    RequestResponse.class,
    InboundInstrumentsDetail.class,
    InstrumentDetailResponse.class,
    RequestHeader.class
})
public abstract class BaseWSVo {


}
