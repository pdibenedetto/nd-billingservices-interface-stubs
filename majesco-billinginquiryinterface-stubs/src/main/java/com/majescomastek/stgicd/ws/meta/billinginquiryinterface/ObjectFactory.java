
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryInput;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryOutput;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryEntityDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryInstallments;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryInvoiceDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryNOCDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryReceivableDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquirySummary;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryTransactions;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.inputrequest.InputRequest;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.Message;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.RequestResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.billinginquiryinterface package. 
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

    private final static QName _BillingInquiryTransactions_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryTransactions");
    private final static QName _BillingInquiryInvoiceDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInvoiceDetail");
    private final static QName _BillingInquiryEntityDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryEntityDetail");
    private final static QName _BillingInquiryInput_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInput");
    private final static QName _BillingInquiryNOCDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryNOCDetail");
    private final static QName _BillingInquiryOutput_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryOutput");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "service");
    private final static QName _BillingInquiryInstallments_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryInstallments");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "RequestResponse");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "Exception");
    private final static QName _BillingInquiryReceivableDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquiryReceivableDetail");
    private final static QName _InputRequest_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "InputRequest");
    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "serviceResponse");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "Message");
    private final static QName _BillingInquirySummary_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", "BillingInquirySummary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.billinginquiryinterface
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryTransactions")
    public JAXBElement<BillingInquiryTransactions> createBillingInquiryTransactions(BillingInquiryTransactions value) {
        return new JAXBElement<BillingInquiryTransactions>(_BillingInquiryTransactions_QNAME, BillingInquiryTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryInvoiceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryInvoiceDetail")
    public JAXBElement<BillingInquiryInvoiceDetail> createBillingInquiryInvoiceDetail(BillingInquiryInvoiceDetail value) {
        return new JAXBElement<BillingInquiryInvoiceDetail>(_BillingInquiryInvoiceDetail_QNAME, BillingInquiryInvoiceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryEntityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryEntityDetail")
    public JAXBElement<BillingInquiryEntityDetail> createBillingInquiryEntityDetail(BillingInquiryEntityDetail value) {
        return new JAXBElement<BillingInquiryEntityDetail>(_BillingInquiryEntityDetail_QNAME, BillingInquiryEntityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryInput")
    public JAXBElement<BillingInquiryInput> createBillingInquiryInput(BillingInquiryInput value) {
        return new JAXBElement<BillingInquiryInput>(_BillingInquiryInput_QNAME, BillingInquiryInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryNOCDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryNOCDetail")
    public JAXBElement<BillingInquiryNOCDetail> createBillingInquiryNOCDetail(BillingInquiryNOCDetail value) {
        return new JAXBElement<BillingInquiryNOCDetail>(_BillingInquiryNOCDetail_QNAME, BillingInquiryNOCDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryOutput")
    public JAXBElement<BillingInquiryOutput> createBillingInquiryOutput(BillingInquiryOutput value) {
        return new JAXBElement<BillingInquiryOutput>(_BillingInquiryOutput_QNAME, BillingInquiryOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryInstallments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryInstallments")
    public JAXBElement<BillingInquiryInstallments> createBillingInquiryInstallments(BillingInquiryInstallments value) {
        return new JAXBElement<BillingInquiryInstallments>(_BillingInquiryInstallments_QNAME, BillingInquiryInstallments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquiryReceivableDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquiryReceivableDetail")
    public JAXBElement<BillingInquiryReceivableDetail> createBillingInquiryReceivableDetail(BillingInquiryReceivableDetail value) {
        return new JAXBElement<BillingInquiryReceivableDetail>(_BillingInquiryReceivableDetail_QNAME, BillingInquiryReceivableDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "InputRequest")
    public JAXBElement<InputRequest> createInputRequest(InputRequest value) {
        return new JAXBElement<InputRequest>(_InputRequest_QNAME, InputRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingInquirySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface", name = "BillingInquirySummary")
    public JAXBElement<BillingInquirySummary> createBillingInquirySummary(BillingInquirySummary value) {
        return new JAXBElement<BillingInquirySummary>(_BillingInquirySummary_QNAME, BillingInquirySummary.class, null, value);
    }

}
