
package com.majescomastek.stgicd.ws.meta.whatifinterface;

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
@WebServiceClient(name = "WhatIfInterface", targetNamespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", wsdlLocation = "/META-INF/wsdl/WhatIfInterface.wsdl")
public class WhatIfInterface_Service
    extends Service
{

    private final static URL WHATIFINTERFACE_WSDL_LOCATION;
    private final static WebServiceException WHATIFINTERFACE_EXCEPTION;
    private final static QName WHATIFINTERFACE_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "WhatIfInterface");

    static {
        WHATIFINTERFACE_WSDL_LOCATION = com.majescomastek.stgicd.ws.meta.whatifinterface.WhatIfInterface_Service.class.getResource("/META-INF/wsdl/WhatIfInterface.wsdl");
        WebServiceException e = null;
        if (WHATIFINTERFACE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/META-INF/wsdl/WhatIfInterface.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        WHATIFINTERFACE_EXCEPTION = e;
    }

    public WhatIfInterface_Service() {
        super(__getWsdlLocation(), WHATIFINTERFACE_QNAME);
    }

    public WhatIfInterface_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WHATIFINTERFACE_QNAME, features);
    }

    public WhatIfInterface_Service(URL wsdlLocation) {
        super(wsdlLocation, WHATIFINTERFACE_QNAME);
    }

    public WhatIfInterface_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WHATIFINTERFACE_QNAME, features);
    }

    public WhatIfInterface_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WhatIfInterface_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WhatIfInterface
     */
    @WebEndpoint(name = "WhatIfInterfacePort")
    public WhatIfInterface getWhatIfInterfacePort() {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "WhatIfInterfacePort"), WhatIfInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WhatIfInterface
     */
    @WebEndpoint(name = "WhatIfInterfacePort")
    public WhatIfInterface getWhatIfInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "WhatIfInterfacePort"), WhatIfInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WHATIFINTERFACE_EXCEPTION!= null) {
            throw WHATIFINTERFACE_EXCEPTION;
        }
        return WHATIFINTERFACE_WSDL_LOCATION;
    }

}
