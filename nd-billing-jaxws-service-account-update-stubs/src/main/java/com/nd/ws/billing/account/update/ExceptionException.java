package com.nd.ws.billing.account.update;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 */
@WebFault(name = "Exception",
          targetNamespace = "http://com/nd/ws/billing/account/updateinterface")
public class ExceptionException extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     */
    private com.nd.ws.billing.account.updateinterface.Exception faultInfo;

    /**
     *
     */
    public ExceptionException(String message,
                              com.nd.ws.billing.account.updateinterface.Exception faultInfo
                             )
    {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     */
    public ExceptionException(String message,
                              com.nd.ws.billing.account.updateinterface.Exception faultInfo,
                              Throwable cause
                             )
    {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * @return returns fault bean: com.nd.ws.billing.account.updateinterface.Exception
     */
    public com.nd.ws.billing.account.updateinterface.Exception getFaultInfo()
    {
        return faultInfo;
    }
}
