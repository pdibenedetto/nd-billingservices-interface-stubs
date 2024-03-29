
package com.majescomastek.stgicd.ws.meta.paymentinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Servicerequest;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Serviceresponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentInterface", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface")
@XmlSeeAlso({
    com.majescomastek.stgicd.ws.meta.authentication.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.paymentdetail.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.requestheader.ObjectFactory.class,
    com.majescomastek.stgicd.ws.meta.paymentinterface.requestresponse.ObjectFactory.class
})
public interface PaymentInterface {


    /**
     * 
     * @param userAuthentication
     * @param inputMsg
     * @return
     *     returns com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Serviceresponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "service", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", className = "com.majescomastek.stgicd.ws.meta.paymentinterface.Service")
    @ResponseWrapper(localName = "serviceResponse", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", className = "com.majescomastek.stgicd.ws.meta.paymentinterface.ServiceResponse")
    public Serviceresponse service(
        @WebParam(name = "inputMsg", targetNamespace = "")
        Servicerequest inputMsg,
        @WebParam(name = "UserAuthentication", targetNamespace = "")
        Authentication userAuthentication)
        throws Exception_Exception
    ;

}
