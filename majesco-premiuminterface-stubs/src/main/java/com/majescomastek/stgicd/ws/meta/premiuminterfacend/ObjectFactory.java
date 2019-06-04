
package com.majescomastek.stgicd.ws.meta.premiuminterfacend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.premiuminterfacend.InboundPremiumTransaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.premiuminterfacend.OutputTransaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundCommissionSacrifice;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundEntity;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundSlidingScaleCommission;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundTransactionReason;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.ReceivableDetails;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.Transaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.inboundentity.InboundEntityAddress;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.receivabledetails.InboundTransactionCommission;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transactionresponse.TransactionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.premiuminterfacend package. 
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

    private final static QName _RequestHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "RequestHeader");
    private final static QName _ReceivableDetails_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "ReceivableDetails");
    private final static QName _TransactionResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "TransactionResponse");
    private final static QName _Transaction_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "Transaction");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "service");
    private final static QName _InboundTransactionReason_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundTransactionReason");
    private final static QName _OutputTransaction_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "OutputTransaction");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "RequestResponse");
    private final static QName _InboundCommissionSacrifice_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundCommissionSacrifice");
    private final static QName _InboundEntity_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundEntity");
    private final static QName _InboundEntityAddress_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundEntityAddress");
    private final static QName _InboundSlidingScaleCommission_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundSlidingScaleCommission");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "Exception");
    private final static QName _InboundTransactionCommission_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundTransactionCommission");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "Message");
    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "serviceResponse");
    private final static QName _InboundPremiumTransaction_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", "InboundPremiumTransaction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.premiuminterfacend
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivableDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "ReceivableDetails")
    public JAXBElement<ReceivableDetails> createReceivableDetails(ReceivableDetails value) {
        return new JAXBElement<ReceivableDetails>(_ReceivableDetails_QNAME, ReceivableDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "TransactionResponse")
    public JAXBElement<TransactionResponse> createTransactionResponse(TransactionResponse value) {
        return new JAXBElement<TransactionResponse>(_TransactionResponse_QNAME, TransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "Transaction")
    public JAXBElement<Transaction> createTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundTransactionReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundTransactionReason")
    public JAXBElement<InboundTransactionReason> createInboundTransactionReason(InboundTransactionReason value) {
        return new JAXBElement<InboundTransactionReason>(_InboundTransactionReason_QNAME, InboundTransactionReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "OutputTransaction")
    public JAXBElement<OutputTransaction> createOutputTransaction(OutputTransaction value) {
        return new JAXBElement<OutputTransaction>(_OutputTransaction_QNAME, OutputTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundCommissionSacrifice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundCommissionSacrifice")
    public JAXBElement<InboundCommissionSacrifice> createInboundCommissionSacrifice(InboundCommissionSacrifice value) {
        return new JAXBElement<InboundCommissionSacrifice>(_InboundCommissionSacrifice_QNAME, InboundCommissionSacrifice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundEntity")
    public JAXBElement<InboundEntity> createInboundEntity(InboundEntity value) {
        return new JAXBElement<InboundEntity>(_InboundEntity_QNAME, InboundEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundEntityAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundEntityAddress")
    public JAXBElement<InboundEntityAddress> createInboundEntityAddress(InboundEntityAddress value) {
        return new JAXBElement<InboundEntityAddress>(_InboundEntityAddress_QNAME, InboundEntityAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundSlidingScaleCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundSlidingScaleCommission")
    public JAXBElement<InboundSlidingScaleCommission> createInboundSlidingScaleCommission(InboundSlidingScaleCommission value) {
        return new JAXBElement<InboundSlidingScaleCommission>(_InboundSlidingScaleCommission_QNAME, InboundSlidingScaleCommission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundTransactionCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundTransactionCommission")
    public JAXBElement<InboundTransactionCommission> createInboundTransactionCommission(InboundTransactionCommission value) {
        return new JAXBElement<InboundTransactionCommission>(_InboundTransactionCommission_QNAME, InboundTransactionCommission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "Message")
    public JAXBElement<Object> createMessage(Object value) {
        return new JAXBElement<Object>(_Message_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundPremiumTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/premiuminterfacend", name = "InboundPremiumTransaction")
    public JAXBElement<InboundPremiumTransaction> createInboundPremiumTransaction(InboundPremiumTransaction value) {
        return new JAXBElement<InboundPremiumTransaction>(_InboundPremiumTransaction_QNAME, InboundPremiumTransaction.class, null, value);
    }

}
