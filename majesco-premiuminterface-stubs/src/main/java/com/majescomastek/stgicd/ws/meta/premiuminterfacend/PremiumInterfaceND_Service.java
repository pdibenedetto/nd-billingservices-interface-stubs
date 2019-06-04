
package com.majescomastek.stgicd.ws.meta.premiuminterfacend;

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
@WebServiceClient(name = "PremiumInterfaceND", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", wsdlLocation = "/META-INF/wsdl/PremiumInterfaceND.wsdl")
public class PremiumInterfaceND_Service
    extends Service
{

    private final static URL PREMIUMINTERFACEND_WSDL_LOCATION;
    private final static WebServiceException PREMIUMINTERFACEND_EXCEPTION;
    private final static QName PREMIUMINTERFACEND_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "PremiumInterfaceND");

    static {
        PREMIUMINTERFACEND_WSDL_LOCATION = com.majescomastek.stgicd.ws.meta.premiuminterfacend.PremiumInterfaceND_Service.class.getResource("/META-INF/wsdl/PremiumInterfaceND.wsdl");
        WebServiceException e = null;
        if (PREMIUMINTERFACEND_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/META-INF/wsdl/PremiumInterfaceND.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PREMIUMINTERFACEND_EXCEPTION = e;
    }

    public PremiumInterfaceND_Service() {
        super(__getWsdlLocation(), PREMIUMINTERFACEND_QNAME);
    }

    public PremiumInterfaceND_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PREMIUMINTERFACEND_QNAME, features);
    }

    public PremiumInterfaceND_Service(URL wsdlLocation) {
        super(wsdlLocation, PREMIUMINTERFACEND_QNAME);
    }

    public PremiumInterfaceND_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PREMIUMINTERFACEND_QNAME, features);
    }

    public PremiumInterfaceND_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PremiumInterfaceND_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PremiumInterfaceND
     */
    @WebEndpoint(name = "PremiumInterfaceNDPort")
    public PremiumInterfaceND getPremiumInterfaceNDPort() {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "PremiumInterfaceNDPort"), PremiumInterfaceND.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PremiumInterfaceND
     */
    @WebEndpoint(name = "PremiumInterfaceNDPort")
    public PremiumInterfaceND getPremiumInterfaceNDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "PremiumInterfaceNDPort"), PremiumInterfaceND.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PREMIUMINTERFACEND_EXCEPTION!= null) {
            throw PREMIUMINTERFACEND_EXCEPTION;
        }
        return PREMIUMINTERFACEND_WSDL_LOCATION;
    }

}