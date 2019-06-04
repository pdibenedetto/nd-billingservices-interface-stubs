
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface;

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
@WebServiceClient(name = "BillingInquiryInterface", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", wsdlLocation = "/META-INF/wsdl/BillingInquiryInterface.wsdl")
public class BillingInquiryInterface_Service
    extends Service
{

    private final static URL BILLINGINQUIRYINTERFACE_WSDL_LOCATION;
    private final static WebServiceException BILLINGINQUIRYINTERFACE_EXCEPTION;
    private final static QName BILLINGINQUIRYINTERFACE_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInterface");

    static {
        BILLINGINQUIRYINTERFACE_WSDL_LOCATION = com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BillingInquiryInterface_Service.class.getResource("/META-INF/wsdl/BillingInquiryInterface.wsdl");
        WebServiceException e = null;
        if (BILLINGINQUIRYINTERFACE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/META-INF/wsdl/BillingInquiryInterface.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        BILLINGINQUIRYINTERFACE_EXCEPTION = e;
    }

    public BillingInquiryInterface_Service() {
        super(__getWsdlLocation(), BILLINGINQUIRYINTERFACE_QNAME);
    }

    public BillingInquiryInterface_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BILLINGINQUIRYINTERFACE_QNAME, features);
    }

    public BillingInquiryInterface_Service(URL wsdlLocation) {
        super(wsdlLocation, BILLINGINQUIRYINTERFACE_QNAME);
    }

    public BillingInquiryInterface_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BILLINGINQUIRYINTERFACE_QNAME, features);
    }

    public BillingInquiryInterface_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillingInquiryInterface_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BillingInquiryInterface
     */
    @WebEndpoint(name = "BillingInquiryInterfacePort")
    public BillingInquiryInterface getBillingInquiryInterfacePort() {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInterfacePort"), BillingInquiryInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillingInquiryInterface
     */
    @WebEndpoint(name = "BillingInquiryInterfacePort")
    public BillingInquiryInterface getBillingInquiryInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInterfacePort"), BillingInquiryInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILLINGINQUIRYINTERFACE_EXCEPTION!= null) {
            throw BILLINGINQUIRYINTERFACE_EXCEPTION;
        }
        return BILLINGINQUIRYINTERFACE_WSDL_LOCATION;
    }

}