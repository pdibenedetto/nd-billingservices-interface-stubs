
package com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InboundInstrumentsDetail;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.inboundinstrumentinformation.InstrumentDetailResponse;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.paymentinstrumentinforesponse.PaymentInstrumentInfoResponse;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestresponse.Message;
import com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation.requestresponse.RequestResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation package. 
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

    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "serviceResponse");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "service");
    private final static QName _PaymentInstrumentInfoResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "PaymentInstrumentInfoResponse");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "Message");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "RequestResponse");
    private final static QName _InstrumentDetailResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "InstrumentDetailResponse");
    private final static QName _RequestHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "RequestHeader");
    private final static QName _InboundInstrumentsDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "InboundInstrumentsDetail");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.inboundinstrumentinformation
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInstrumentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "PaymentInstrumentInfoResponse")
    public JAXBElement<PaymentInstrumentInfoResponse> createPaymentInstrumentInfoResponse(PaymentInstrumentInfoResponse value) {
        return new JAXBElement<PaymentInstrumentInfoResponse>(_PaymentInstrumentInfoResponse_QNAME, PaymentInstrumentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "InstrumentDetailResponse")
    public JAXBElement<InstrumentDetailResponse> createInstrumentDetailResponse(InstrumentDetailResponse value) {
        return new JAXBElement<InstrumentDetailResponse>(_InstrumentDetailResponse_QNAME, InstrumentDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundInstrumentsDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "InboundInstrumentsDetail")
    public JAXBElement<InboundInstrumentsDetail> createInboundInstrumentsDetail(InboundInstrumentsDetail value) {
        return new JAXBElement<InboundInstrumentsDetail>(_InboundInstrumentsDetail_QNAME, InboundInstrumentsDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/inboundinstrumentinformation", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
