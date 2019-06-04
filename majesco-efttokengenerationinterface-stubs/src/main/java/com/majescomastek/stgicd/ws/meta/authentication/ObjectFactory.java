
package com.majescomastek.stgicd.ws.meta.authentication;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.majescomastek.stgicd.ws.meta.authentication package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.majescomastek.stgicd.ws.meta.authentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link Authentication.UsernamePasswordAuth }
     * 
     */
    public Authentication.UsernamePasswordAuth createAuthenticationUsernamePasswordAuth() {
        return new Authentication.UsernamePasswordAuth();
    }

    /**
     * Create an instance of {@link Authentication.SSOAuth }
     * 
     */
    public Authentication.SSOAuth createAuthenticationSSOAuth() {
        return new Authentication.SSOAuth();
    }

    /**
     * Create an instance of {@link Authentication.IWAAuthentication }
     * 
     */
    public Authentication.IWAAuthentication createAuthenticationIWAAuthentication() {
        return new Authentication.IWAAuthentication();
    }

    /**
     * Create an instance of {@link Authentication.TokenAuthentication }
     * 
     */
    public Authentication.TokenAuthentication createAuthenticationTokenAuthentication() {
        return new Authentication.TokenAuthentication();
    }

    /**
     * Create an instance of {@link Authentication.ServiceAccountAuthentication }
     * 
     */
    public Authentication.ServiceAccountAuthentication createAuthenticationServiceAccountAuthentication() {
        return new Authentication.ServiceAccountAuthentication();
    }

}
