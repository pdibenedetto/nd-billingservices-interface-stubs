
package com.nd.ws.billing.account.search;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://com/nd/ws/billing/account/searchinterface")
public class ExceptionException
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.nd.ws.billing.account.searchinterface.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ExceptionException(String message, com.nd.ws.billing.account.searchinterface.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ExceptionException(String message, com.nd.ws.billing.account.searchinterface.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.nd.ws.billing.account.searchinterface.Exception
     */
    public com.nd.ws.billing.account.searchinterface.Exception getFaultInfo() {
        return faultInfo;
    }

}
