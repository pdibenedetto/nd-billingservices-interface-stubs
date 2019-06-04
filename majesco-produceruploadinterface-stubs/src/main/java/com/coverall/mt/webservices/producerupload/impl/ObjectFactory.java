
package com.coverall.mt.webservices.producerupload.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coverall.mt.webservices.producerupload.impl package. 
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

    private final static QName _ProducerUpload_QNAME = new QName("http://impl.producerupload.webservices.mt.coverall.com/", "producerUpload");
    private final static QName _ProducerUploadResponse_QNAME = new QName("http://impl.producerupload.webservices.mt.coverall.com/", "producerUploadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coverall.mt.webservices.producerupload.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProducerUpload }
     * 
     */
    public ProducerUpload createProducerUpload() {
        return new ProducerUpload();
    }

    /**
     * Create an instance of {@link ProducerUploadResponse }
     * 
     */
    public ProducerUploadResponse createProducerUploadResponse() {
        return new ProducerUploadResponse();
    }

    /**
     * Create an instance of {@link ProducerUploadServiceResponse }
     * 
     */
    public ProducerUploadServiceResponse createProducerUploadServiceResponse() {
        return new ProducerUploadServiceResponse();
    }

    /**
     * Create an instance of {@link ProducerUploadServiceRequest }
     * 
     */
    public ProducerUploadServiceRequest createProducerUploadServiceRequest() {
        return new ProducerUploadServiceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.producerupload.webservices.mt.coverall.com/", name = "producerUpload")
    public JAXBElement<ProducerUpload> createProducerUpload(ProducerUpload value) {
        return new JAXBElement<ProducerUpload>(_ProducerUpload_QNAME, ProducerUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerUploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.producerupload.webservices.mt.coverall.com/", name = "producerUploadResponse")
    public JAXBElement<ProducerUploadResponse> createProducerUploadResponse(ProducerUploadResponse value) {
        return new JAXBElement<ProducerUploadResponse>(_ProducerUploadResponse_QNAME, ProducerUploadResponse.class, null, value);
    }

}
