
package com.majescomastek.stgicd.ws.meta.premiuminterfacend;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.majescomastek.stgicd.ws.meta.premiuminterfacend.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, com.majescomastek.stgicd.ws.meta.premiuminterfacend.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, com.majescomastek.stgicd.ws.meta.premiuminterfacend.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.majescomastek.stgicd.ws.meta.premiuminterfacend.Exception
     */
    public com.majescomastek.stgicd.ws.meta.premiuminterfacend.Exception getFaultInfo() {
        return faultInfo;
    }

}
