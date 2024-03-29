
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryInput;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryOutput;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BillingInquiryInterface", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface")
@XmlSeeAlso({
    com.majescomastek.stgicd.ws.meta.authentication.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.billinginquiryinterface.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.billinginquiryinterface.inputrequest.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.ObjectFactory.class
})
public interface BillingInquiryInterface {


    /**
     * 
     * @param userAuthentication
     * @param inputMsg
     * @return
     *     returns com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryOutput
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "service", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", className = "com.majescomastek.stgicd.ws.meta.billinginquiryinterface.Service")
    @ResponseWrapper(localName = "serviceResponse", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", className = "com.majescomastek.stgicd.ws.meta.billinginquiryinterface.ServiceResponse")
    public BillingInquiryOutput service(
        @WebParam(name = "inputMsg", targetNamespace = "")
        BillingInquiryInput inputMsg,
        @WebParam(name = "UserAuthentication", targetNamespace = "")
        Authentication userAuthentication)
        throws Exception_Exception
    ;

}
