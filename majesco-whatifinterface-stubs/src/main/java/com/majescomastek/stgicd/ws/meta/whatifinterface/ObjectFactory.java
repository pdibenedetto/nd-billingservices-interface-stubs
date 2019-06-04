
package com.majescomastek.stgicd.ws.meta.whatifinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.Transaction;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.inboundwhatiftransactiondetail.InboundTransactionDetail;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.TransactionResponse;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.InstallmentScheduleSummaryByDueDate;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.installmentschedulesummarybyduedate.InstallmentScheduleSummaryByTransactionReceivable;
import com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface.ResponseTransactionSchedule;
import com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface.WhatIfTransactionSchedule;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.whatifinterface package. 
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

    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "service");
    private final static QName _Transaction_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "Transaction");
    private final static QName _InboundTransactionDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "InboundTransactionDetail");
    private final static QName _InstallmentScheduleSummaryByTransactionReceivable_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "InstallmentScheduleSummaryByTransactionReceivable");
    private final static QName _TransactionResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "TransactionResponse");
    private final static QName _WhatIfTransactionSchedule_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "WhatIfTransactionSchedule");
    private final static QName _RequestHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "RequestHeader");
    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "serviceResponse");
    private final static QName _InboundWhatIfTransactionDetail_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "InboundWhatIfTransactionDetail");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "Message");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "Exception");
    private final static QName _ResponseTransactionSchedule_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "responseTransactionSchedule");
    private final static QName _InstallmentScheduleSummaryByDueDate_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "InstallmentScheduleSummaryByDueDate");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/whatifinterface", "RequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.whatifinterface
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "Transaction")
    public JAXBElement<Transaction> createTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundTransactionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "InboundTransactionDetail")
    public JAXBElement<InboundTransactionDetail> createInboundTransactionDetail(InboundTransactionDetail value) {
        return new JAXBElement<InboundTransactionDetail>(_InboundTransactionDetail_QNAME, InboundTransactionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallmentScheduleSummaryByTransactionReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "InstallmentScheduleSummaryByTransactionReceivable")
    public JAXBElement<InstallmentScheduleSummaryByTransactionReceivable> createInstallmentScheduleSummaryByTransactionReceivable(InstallmentScheduleSummaryByTransactionReceivable value) {
        return new JAXBElement<InstallmentScheduleSummaryByTransactionReceivable>(_InstallmentScheduleSummaryByTransactionReceivable_QNAME, InstallmentScheduleSummaryByTransactionReceivable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "TransactionResponse")
    public JAXBElement<TransactionResponse> createTransactionResponse(TransactionResponse value) {
        return new JAXBElement<TransactionResponse>(_TransactionResponse_QNAME, TransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WhatIfTransactionSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "WhatIfTransactionSchedule")
    public JAXBElement<WhatIfTransactionSchedule> createWhatIfTransactionSchedule(WhatIfTransactionSchedule value) {
        return new JAXBElement<WhatIfTransactionSchedule>(_WhatIfTransactionSchedule_QNAME, WhatIfTransactionSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "InboundWhatIfTransactionDetail")
    public JAXBElement<Object> createInboundWhatIfTransactionDetail(Object value) {
        return new JAXBElement<Object>(_InboundWhatIfTransactionDetail_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "Message")
    public JAXBElement<Object> createMessage(Object value) {
        return new JAXBElement<Object>(_Message_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseTransactionSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "responseTransactionSchedule")
    public JAXBElement<ResponseTransactionSchedule> createResponseTransactionSchedule(ResponseTransactionSchedule value) {
        return new JAXBElement<ResponseTransactionSchedule>(_ResponseTransactionSchedule_QNAME, ResponseTransactionSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallmentScheduleSummaryByDueDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "InstallmentScheduleSummaryByDueDate")
    public JAXBElement<InstallmentScheduleSummaryByDueDate> createInstallmentScheduleSummaryByDueDate(InstallmentScheduleSummaryByDueDate value) {
        return new JAXBElement<InstallmentScheduleSummaryByDueDate>(_InstallmentScheduleSummaryByDueDate_QNAME, InstallmentScheduleSummaryByDueDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/whatifinterface", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

}
