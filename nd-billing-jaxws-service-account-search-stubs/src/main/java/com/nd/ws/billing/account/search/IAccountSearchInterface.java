
package com.nd.ws.billing.account.search;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.nd.ws.billing.account.searchinterface.AccountWorkflowRequest;
import com.nd.ws.billing.account.searchinterface.AccountWorkflowResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IAccountSearchInterface", targetNamespace = "http://com/nd/ws/billing/account/searchinterface")
@XmlSeeAlso({
    com.nd.ws.billing.account.searchinterface.ObjectFactory.class,
    com.nd.billing.model.account.response.ObjectFactory.class
})
public interface IAccountSearchInterface {


    /**
     * 
     * @param accountWorkflowRequest
     * @return
     *     returns com.nd.ws.billing.account.searchinterface.AccountWorkflowResponse
     * @throws ExceptionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeAccountSearch", targetNamespace = "http://com/nd/ws/billing/account/searchinterface", className = "com.nd.ws.billing.account.searchinterface.ExecuteAccountSearch")
    @ResponseWrapper(localName = "executeAccountSearchResponse", targetNamespace = "http://com/nd/ws/billing/account/searchinterface", className = "com.nd.ws.billing.account.searchinterface.ExecuteAccountSearchResponse")
    @Action(input = "http://com/nd/ws/billing/account/searchinterface/IAccountSearchInterface/executeAccountSearchRequest", output = "http://com/nd/ws/billing/account/searchinterface/IAccountSearchInterface/executeAccountSearchResponse", fault = {
        @FaultAction(className = ExceptionException.class, value = "http://com/nd/ws/billing/account/searchinterface/IAccountSearchInterface/executeAccountSearch/Fault/Exception_Exception")
    })
    public AccountWorkflowResponse executeAccountSearch(
        @WebParam(name = "AccountWorkflowRequest", targetNamespace = "")
        AccountWorkflowRequest accountWorkflowRequest)
        throws ExceptionException
    ;

}
