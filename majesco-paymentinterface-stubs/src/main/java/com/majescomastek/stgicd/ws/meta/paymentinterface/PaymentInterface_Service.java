
package com.majescomastek.stgicd.ws.meta.paymentinterface;

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
@WebServiceClient(name = "PaymentInterface", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", wsdlLocation = "/META-INF/wsdl/PaymentInterface.wsdl")
public class PaymentInterface_Service
    extends Service
{

    private final static URL PAYMENTINTERFACE_WSDL_LOCATION;
    private final static WebServiceException PAYMENTINTERFACE_EXCEPTION;
    private final static QName PAYMENTINTERFACE_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentInterface");

    static {
        PAYMENTINTERFACE_WSDL_LOCATION = com.majescomastek.stgicd.ws.meta.paymentinterface.PaymentInterface_Service.class.getResource("/META-INF/wsdl/PaymentInterface.wsdl");
        WebServiceException e = null;
        if (PAYMENTINTERFACE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/META-INF/wsdl/PaymentInterface.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PAYMENTINTERFACE_EXCEPTION = e;
    }

    public PaymentInterface_Service() {
        super(__getWsdlLocation(), PAYMENTINTERFACE_QNAME);
    }

    public PaymentInterface_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PAYMENTINTERFACE_QNAME, features);
    }

    public PaymentInterface_Service(URL wsdlLocation) {
        super(wsdlLocation, PAYMENTINTERFACE_QNAME);
    }

    public PaymentInterface_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PAYMENTINTERFACE_QNAME, features);
    }

    public PaymentInterface_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentInterface_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PaymentInterface
     */
    @WebEndpoint(name = "PaymentInterfacePort")
    public PaymentInterface getPaymentInterfacePort() {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentInterfacePort"), PaymentInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentInterface
     */
    @WebEndpoint(name = "PaymentInterfacePort")
    public PaymentInterface getPaymentInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentInterfacePort"), PaymentInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PAYMENTINTERFACE_EXCEPTION!= null) {
            throw PAYMENTINTERFACE_EXCEPTION;
        }
        return PAYMENTINTERFACE_WSDL_LOCATION;
    }

}