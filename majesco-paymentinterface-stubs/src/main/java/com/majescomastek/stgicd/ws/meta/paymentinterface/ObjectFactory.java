
package com.majescomastek.stgicd.ws.meta.paymentinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader.PaymentDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Servicerequest;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface.Serviceresponse;
import com.majescomastek.stgicd.ws.meta.paymentinterface.paymentresponsedepositheader.PaymentResponseDepositHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.paymentinterface.requestresponse.RequestResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.paymentinterface package. 
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

    private final static QName _SERVICEREQUEST_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "SERVICEREQUEST");
    private final static QName _PaymentDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentDetail");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "Message");
    private final static QName _PaymentResponseDepositHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentResponseDepositHeader");
    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "serviceResponse");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "service");
    private final static QName _RequestHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "RequestHeader");
    private final static QName _PaymentDepositHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "PaymentDepositHeader");
    private final static QName _SERVICERESPONSE_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "SERVICERESPONSE");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "RequestResponse");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/paymentinterface", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.paymentinterface
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
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "SERVICEREQUEST")
    public JAXBElement<Servicerequest> createSERVICEREQUEST(Servicerequest value) {
        return new JAXBElement<Servicerequest>(_SERVICEREQUEST_QNAME, Servicerequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "PaymentDetail")
    public JAXBElement<Object> createPaymentDetail(Object value) {
        return new JAXBElement<Object>(_PaymentDetail_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "Message")
    public JAXBElement<Object> createMessage(Object value) {
        return new JAXBElement<Object>(_Message_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponseDepositHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "PaymentResponseDepositHeader")
    public JAXBElement<PaymentResponseDepositHeader> createPaymentResponseDepositHeader(PaymentResponseDepositHeader value) {
        return new JAXBElement<PaymentResponseDepositHeader>(_PaymentResponseDepositHeader_QNAME, PaymentResponseDepositHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDepositHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "PaymentDepositHeader")
    public JAXBElement<PaymentDepositHeader> createPaymentDepositHeader(PaymentDepositHeader value) {
        return new JAXBElement<PaymentDepositHeader>(_PaymentDepositHeader_QNAME, PaymentDepositHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serviceresponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "SERVICERESPONSE")
    public JAXBElement<Serviceresponse> createSERVICERESPONSE(Serviceresponse value) {
        return new JAXBElement<Serviceresponse>(_SERVICERESPONSE_QNAME, Serviceresponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/paymentinterface", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
