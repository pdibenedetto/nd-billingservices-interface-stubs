
package com.majescomastek.stgicd.ws.meta.suspendreleaseinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleasedetails.HoldReleaseDetails;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleaseresponse.HoldReleaseResponse;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.holdreleaseresponse.Message;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.inboundrequest.InboundRequest;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.outboundresponse.OutboundResponse;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface.Servicerequest;
import com.majescomastek.stgicd.ws.meta.suspendreleaseinterface.suspendreleaseinterface.Serviceresponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.suspendreleaseinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SERVICEREQUEST_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "SERVICEREQUEST");
    private final static QName _OutboundResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "outboundResponse");
    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "serviceResponse");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "service");
    private final static QName _HoldReleaseResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "HoldReleaseResponse");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "Message");
    private final static QName _HoldReleaseDetails_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "HoldReleaseDetails");
    private final static QName _SERVICERESPONSE_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "SERVICERESPONSE");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "Exception");
    private final static QName _InboundRequest_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", "InboundRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.suspendreleaseinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsernamePasswordAuth }
     * 
     */
    public UsernamePasswordAuth createUsernamePasswordAuth() {
        return new UsernamePasswordAuth();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceAccountAuthentication }
     * 
     */
    public ServiceAccountAuthentication createServiceAccountAuthentication() {
        return new ServiceAccountAuthentication();
    }

    /**
     * Create an instance of {@link IWAAuthentication }
     * 
     */
    public IWAAuthentication createIWAAuthentication() {
        return new IWAAuthentication();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link SSOAuth }
     * 
     */
    public SSOAuth createSSOAuth() {
        return new SSOAuth();
    }

    /**
     * Create an instance of {@link TokenAuthentication }
     * 
     */
    public TokenAuthentication createTokenAuthentication() {
        return new TokenAuthentication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Servicerequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "SERVICEREQUEST")
    public JAXBElement<Servicerequest> createSERVICEREQUEST(Servicerequest value) {
        return new JAXBElement<Servicerequest>(_SERVICEREQUEST_QNAME, Servicerequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutboundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "outboundResponse")
    public JAXBElement<OutboundResponse> createOutboundResponse(OutboundResponse value) {
        return new JAXBElement<OutboundResponse>(_OutboundResponse_QNAME, OutboundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoldReleaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "HoldReleaseResponse")
    public JAXBElement<HoldReleaseResponse> createHoldReleaseResponse(HoldReleaseResponse value) {
        return new JAXBElement<HoldReleaseResponse>(_HoldReleaseResponse_QNAME, HoldReleaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoldReleaseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "HoldReleaseDetails")
    public JAXBElement<HoldReleaseDetails> createHoldReleaseDetails(HoldReleaseDetails value) {
        return new JAXBElement<HoldReleaseDetails>(_HoldReleaseDetails_QNAME, HoldReleaseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serviceresponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "SERVICERESPONSE")
    public JAXBElement<Serviceresponse> createSERVICERESPONSE(Serviceresponse value) {
        return new JAXBElement<Serviceresponse>(_SERVICERESPONSE_QNAME, Serviceresponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/suspendreleaseinterface", name = "InboundRequest")
    public JAXBElement<InboundRequest> createInboundRequest(InboundRequest value) {
        return new JAXBElement<InboundRequest>(_InboundRequest_QNAME, InboundRequest.class, null, value);
    }

}
