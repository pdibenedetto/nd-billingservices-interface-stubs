
package com.majescomastek.stgicd.ws.meta.entityinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.majescomastek.stgicd.ws.meta.authentication.Authentication;
import com.majescomastek.stgicd.ws.meta.entityinterface.entity.Entity;
import com.majescomastek.stgicd.ws.meta.entityinterface.entity.InboundEntityAddress;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityinterface.InboundEntityInterface;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityinterface.OutputTransaction;
import com.majescomastek.stgicd.ws.meta.entityinterface.entityresponse.EntityResponse;
import com.majescomastek.stgicd.ws.meta.entityinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.entityinterface.requestresponse.RequestResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.entityinterface package. 
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

    private final static QName _ServiceResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "serviceResponse");
    private final static QName _Authentication_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "Authentication");
    private final static QName _Service_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "service");
    private final static QName _EntityResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "EntityResponse");
    private final static QName _Message_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "Message");
    private final static QName _InboundEntityInterface_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "InboundEntityInterface");
    private final static QName _Entity_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "Entity");
    private final static QName _InboundEntityAddress_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "InboundEntityAddress");
    private final static QName _Exception_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "Exception");
    private final static QName _RequestResponse_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "RequestResponse");
    private final static QName _RequestHeader_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "RequestHeader");
    private final static QName _OutputTransaction_QNAME = new QName("http://com/majescomastek/stgicd/ws/meta/entityinterface", "OutputTransaction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.entityinterface
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
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "EntityResponse")
    public JAXBElement<EntityResponse> createEntityResponse(EntityResponse value) {
        return new JAXBElement<EntityResponse>(_EntityResponse_QNAME, EntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "Message")
    public JAXBElement<Object> createMessage(Object value) {
        return new JAXBElement<Object>(_Message_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundEntityInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "InboundEntityInterface")
    public JAXBElement<InboundEntityInterface> createInboundEntityInterface(InboundEntityInterface value) {
        return new JAXBElement<InboundEntityInterface>(_InboundEntityInterface_QNAME, InboundEntityInterface.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "Entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InboundEntityAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "InboundEntityAddress")
    public JAXBElement<InboundEntityAddress> createInboundEntityAddress(InboundEntityAddress value) {
        return new JAXBElement<InboundEntityAddress>(_InboundEntityAddress_QNAME, InboundEntityAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "RequestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/majescomastek/stgicd/ws/meta/entityinterface", name = "OutputTransaction")
    public JAXBElement<OutputTransaction> createOutputTransaction(OutputTransaction value) {
        return new JAXBElement<OutputTransaction>(_OutputTransaction_QNAME, OutputTransaction.class, null, value);
    }

}
