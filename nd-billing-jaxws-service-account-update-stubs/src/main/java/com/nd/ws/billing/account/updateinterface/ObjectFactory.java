package com.nd.ws.billing.account.updateinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.nd.ws.billing.account.updateinterface package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory
{

    private final static QName _ExecuteAccountUpdateResponse_QNAME = new QName(
        "http://com/nd/ws/billing/account/updateinterface",
        "executeAccountUpdateResponse");

    private final static QName _ExecuteAccountUpdate_QNAME = new QName(
        "http://com/nd/ws/billing/account/updateinterface",
        "executeAccountUpdate");

    private final static QName _Exception_QNAME = new QName(
        "http://com/nd/ws/billing/account/updateinterface",
        "Exception");

    private final static QName _AccountWorkflowRequest_QNAME = new QName(
        "http://com/nd/ws/billing/account/updateinterface",
        "accountWorkflowRequest");

    private final static QName _AccountWorkflowResponse_QNAME = new QName(
        "http://com/nd/ws/billing/account/updateinterface",
        "accountWorkflowResponse");

    private final static QName _PolicyRecurringEftTokenId_QNAME = new QName("",
                                                                            "RecurringEftTokenId");

    private final static QName
        _PolicyPreviousPolicyEffDate_QNAME =
        new QName("", "PreviousPolicyEffDate");

    private final static QName _PolicyPolicyInceptionDate_QNAME = new QName("",
                                                                            "PolicyInceptionDate");

    private final static QName _PolicyRequestedDueDay_QNAME = new QName("",
                                                                        "RequestedDueDay");

    private final static QName _InstrumentDetailEmailID_QNAME = new QName("",
                                                                          "EmailID");

    private final static QName _EntityDoingBusinessAsName_QNAME = new QName("",
                                                                            "DoingBusinessAsName");

    private final static QName _EntitySourceSystemEntityCode_QNAME = new QName(
        "",
        "SourceSystemEntityCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nd.ws.billing.account.updateinterface
     */
    public ObjectFactory()
    {
    }

    /**
     * Create an instance of {@link Authentication }
     */
    public Authentication createAuthentication()
    {
        return new Authentication();
    }

    /**
     * Create an instance of {@link AccountWorkflowRequest }
     */
    public AccountWorkflowRequest createAccountWorkflowRequest()
    {
        return new AccountWorkflowRequest();
    }

    /**
     * Create an instance of {@link AccountWorkflowResponse }
     */
    public AccountWorkflowResponse createAccountWorkflowResponse()
    {
        return new AccountWorkflowResponse();
    }

    /**
     * Create an instance of {@link ExecuteAccountUpdateResponse }
     */
    public ExecuteAccountUpdateResponse createExecuteAccountUpdateResponse()
    {
        return new ExecuteAccountUpdateResponse();
    }

    /**
     * Create an instance of {@link Exception }
     */
    public Exception createException()
    {
        return new Exception();
    }

    /**
     * Create an instance of {@link ExecuteAccountUpdate }
     */
    public ExecuteAccountUpdate createExecuteAccountUpdate()
    {
        return new ExecuteAccountUpdate();
    }

    /**
     * Create an instance of {@link PolicyEntity }
     */
    public PolicyEntity createPolicyEntity()
    {
        return new PolicyEntity();
    }

    /**
     * Create an instance of {@link RequestSearchDetails }
     */
    public RequestSearchDetails createRequestSearchDetails()
    {
        return new RequestSearchDetails();
    }

    /**
     * Create an instance of {@link EntityAddress }
     */
    public EntityAddress createEntityAddress()
    {
        return new EntityAddress();
    }

    /**
     * Create an instance of {@link RequestResponse }
     */
    public RequestResponse createRequestResponse()
    {
        return new RequestResponse();
    }

    /**
     * Create an instance of {@link RequestHeader }
     */
    public RequestHeader createRequestHeader()
    {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link InstrumentDetail }
     */
    public InstrumentDetail createInstrumentDetail()
    {
        return new InstrumentDetail();
    }

    /**
     * Create an instance of {@link Entity }
     */
    public Entity createEntity()
    {
        return new Entity();
    }

    /**
     * Create an instance of {@link Policy }
     */
    public Policy createPolicy()
    {
        return new Policy();
    }

    /**
     * Create an instance of {@link Authentication.UsernamePasswordAuth }
     */
    public Authentication.UsernamePasswordAuth createAuthenticationUsernamePasswordAuth()
    {
        return new Authentication.UsernamePasswordAuth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteAccountUpdateResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://com/nd/ws/billing/account/updateinterface",
                    name = "executeAccountUpdateResponse")
    public JAXBElement<ExecuteAccountUpdateResponse> createExecuteAccountUpdateResponse(
        ExecuteAccountUpdateResponse value
                                                                                       )
    {
        return new JAXBElement<ExecuteAccountUpdateResponse>(
            _ExecuteAccountUpdateResponse_QNAME,
            ExecuteAccountUpdateResponse.class,
            null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteAccountUpdate }{@code >}}
     */
    @XmlElementDecl(namespace = "http://com/nd/ws/billing/account/updateinterface",
                    name = "executeAccountUpdate")
    public JAXBElement<ExecuteAccountUpdate> createExecuteAccountUpdate(
        ExecuteAccountUpdate value
                                                                       )
    {
        return new JAXBElement<ExecuteAccountUpdate>(_ExecuteAccountUpdate_QNAME,
                                                     ExecuteAccountUpdate.class,
                                                     null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     */
    @XmlElementDecl(namespace = "http://com/nd/ws/billing/account/updateinterface",
                    name = "Exception")
    public JAXBElement<Exception> createException(Exception value)
    {
        return new JAXBElement<Exception>(_Exception_QNAME,
                                          Exception.class,
                                          null,
                                          value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountWorkflowRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://com/nd/ws/billing/account/updateinterface",
                    name = "accountWorkflowRequest")
    public JAXBElement<AccountWorkflowRequest> createAccountWorkflowRequest(
        AccountWorkflowRequest value
                                                                           )
    {
        return new JAXBElement<AccountWorkflowRequest>(
            _AccountWorkflowRequest_QNAME,
            AccountWorkflowRequest.class,
            null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountWorkflowResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://com/nd/ws/billing/account/updateinterface",
                    name = "accountWorkflowResponse")
    public JAXBElement<AccountWorkflowResponse> createAccountWorkflowResponse(
        AccountWorkflowResponse value
                                                                             )
    {
        return new JAXBElement<AccountWorkflowResponse>(
            _AccountWorkflowResponse_QNAME,
            AccountWorkflowResponse.class,
            null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "RecurringEftTokenId",
                    scope = Policy.class)
    public JAXBElement<String> createPolicyRecurringEftTokenId(String value)
    {
        return new JAXBElement<String>(_PolicyRecurringEftTokenId_QNAME,
                                       String.class,
                                       Policy.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "PreviousPolicyEffDate",
                    scope = Policy.class)
    public JAXBElement<XMLGregorianCalendar> createPolicyPreviousPolicyEffDate(
        XMLGregorianCalendar value
                                                                              )
    {
        return new JAXBElement<XMLGregorianCalendar>(
            _PolicyPreviousPolicyEffDate_QNAME,
            XMLGregorianCalendar.class,
            Policy.class,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "PolicyInceptionDate",
                    scope = Policy.class)
    public JAXBElement<XMLGregorianCalendar> createPolicyPolicyInceptionDate(
        XMLGregorianCalendar value
                                                                            )
    {
        return new JAXBElement<XMLGregorianCalendar>(
            _PolicyPolicyInceptionDate_QNAME,
            XMLGregorianCalendar.class,
            Policy.class,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "RequestedDueDay",
                    scope = Policy.class)
    public JAXBElement<Long> createPolicyRequestedDueDay(Long value)
    {
        return new JAXBElement<Long>(_PolicyRequestedDueDay_QNAME,
                                     Long.class,
                                     Policy.class,
                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "EmailID",
                    scope = InstrumentDetail.class)
    public JAXBElement<String> createInstrumentDetailEmailID(String value)
    {
        return new JAXBElement<String>(_InstrumentDetailEmailID_QNAME,
                                       String.class,
                                       InstrumentDetail.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "DoingBusinessAsName",
                    scope = Entity.class)
    public JAXBElement<String> createEntityDoingBusinessAsName(String value)
    {
        return new JAXBElement<String>(_EntityDoingBusinessAsName_QNAME,
                                       String.class,
                                       Entity.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "RecurringEftTokenId",
                    scope = Entity.class)
    public JAXBElement<String> createEntityRecurringEftTokenId(String value)
    {
        return new JAXBElement<String>(_PolicyRecurringEftTokenId_QNAME,
                                       String.class,
                                       Entity.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "SourceSystemEntityCode",
                    scope = Entity.class)
    public JAXBElement<String> createEntitySourceSystemEntityCode(String value)
    {
        return new JAXBElement<String>(_EntitySourceSystemEntityCode_QNAME,
                                       String.class,
                                       Entity.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "",
                    name = "RequestedDueDay",
                    scope = Entity.class)
    public JAXBElement<Long> createEntityRequestedDueDay(Long value)
    {
        return new JAXBElement<Long>(_PolicyRequestedDueDay_QNAME,
                                     Long.class,
                                     Entity.class,
                                     value);
    }
}
