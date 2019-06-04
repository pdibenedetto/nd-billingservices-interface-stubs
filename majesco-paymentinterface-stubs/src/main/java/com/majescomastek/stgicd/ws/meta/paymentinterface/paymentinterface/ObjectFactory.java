
package com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.paymentinterface.paymentinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Serviceresponse }
     * 
     */
    public Serviceresponse createServiceresponse() {
        return new Serviceresponse();
    }

    /**
     * Create an instance of {@link Servicerequest }
     * 
     */
    public Servicerequest createServicerequest() {
        return new Servicerequest();
    }

}
