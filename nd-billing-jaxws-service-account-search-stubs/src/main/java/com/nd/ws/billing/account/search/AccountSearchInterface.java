
package com.nd.ws.billing.account.search;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AccountSearchInterface", targetNamespace = "http://com/nd/ws/billing/account/search", wsdlLocation = "/META-INF/wsdl/AccountSearchInterface.wsdl")
public class AccountSearchInterface
    extends Service
{

    private final static URL ACCOUNTSEARCHINTERFACE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTSEARCHINTERFACE_EXCEPTION;
    private final static QName ACCOUNTSEARCHINTERFACE_QNAME = new QName("http://com/nd/ws/billing/account/search", "AccountSearchInterface");

    static {
        ACCOUNTSEARCHINTERFACE_WSDL_LOCATION = com.nd.ws.billing.account.search.AccountSearchInterface.class.getResource("/META-INF/wsdl/AccountSearchInterface.wsdl");
        WebServiceException e = null;
        if (ACCOUNTSEARCHINTERFACE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/META-INF/wsdl/AccountSearchInterface.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ACCOUNTSEARCHINTERFACE_EXCEPTION = e;
    }

    public AccountSearchInterface() {
        super(__getWsdlLocation(), ACCOUNTSEARCHINTERFACE_QNAME);
    }

    public AccountSearchInterface(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTSEARCHINTERFACE_QNAME, features);
    }

    public AccountSearchInterface(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTSEARCHINTERFACE_QNAME);
    }

    public AccountSearchInterface(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTSEARCHINTERFACE_QNAME, features);
    }

    public AccountSearchInterface(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountSearchInterface(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAccountSearchInterface
     */
    @WebEndpoint(name = "AccountSearchInterfacePort")
    public IAccountSearchInterface getAccountSearchInterfacePort() {
        return super.getPort(new QName("http://com/nd/ws/billing/account/search", "AccountSearchInterfacePort"), IAccountSearchInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAccountSearchInterface
     */
    @WebEndpoint(name = "AccountSearchInterfacePort")
    public IAccountSearchInterface getAccountSearchInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/nd/ws/billing/account/search", "AccountSearchInterfacePort"), IAccountSearchInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTSEARCHINTERFACE_EXCEPTION!= null) {
            throw ACCOUNTSEARCHINTERFACE_EXCEPTION;
        }
        return ACCOUNTSEARCHINTERFACE_WSDL_LOCATION;
    }

}
