
package com.majescomastek.stgicd.ws.meta.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsernamePasswordAuth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SSOAuth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IWAAuthentication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SecretKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TokenAuthentication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceAccountAuthentication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication", propOrder = {
    "usernamePasswordAuth",
    "ssoAuth",
    "iwaAuthentication",
    "tokenAuthentication",
    "serviceAccountAuthentication"
})
public class Authentication {

    @XmlElement(name = "UsernamePasswordAuth")
    protected Authentication.UsernamePasswordAuth usernamePasswordAuth;
    @XmlElement(name = "SSOAuth")
    protected Authentication.SSOAuth ssoAuth;
    @XmlElement(name = "IWAAuthentication")
    protected Authentication.IWAAuthentication iwaAuthentication;
    @XmlElement(name = "TokenAuthentication")
    protected Authentication.TokenAuthentication tokenAuthentication;
    @XmlElement(name = "ServiceAccountAuthentication")
    protected Authentication.ServiceAccountAuthentication serviceAccountAuthentication;

    /**
     * Gets the value of the usernamePasswordAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication.UsernamePasswordAuth }
     *     
     */
    public Authentication.UsernamePasswordAuth getUsernamePasswordAuth() {
        return usernamePasswordAuth;
    }

    /**
     * Sets the value of the usernamePasswordAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication.UsernamePasswordAuth }
     *     
     */
    public void setUsernamePasswordAuth(Authentication.UsernamePasswordAuth value) {
        this.usernamePasswordAuth = value;
    }

    /**
     * Gets the value of the ssoAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication.SSOAuth }
     *     
     */
    public Authentication.SSOAuth getSSOAuth() {
        return ssoAuth;
    }

    /**
     * Sets the value of the ssoAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication.SSOAuth }
     *     
     */
    public void setSSOAuth(Authentication.SSOAuth value) {
        this.ssoAuth = value;
    }

    /**
     * Gets the value of the iwaAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication.IWAAuthentication }
     *     
     */
    public Authentication.IWAAuthentication getIWAAuthentication() {
        return iwaAuthentication;
    }

    /**
     * Sets the value of the iwaAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication.IWAAuthentication }
     *     
     */
    public void setIWAAuthentication(Authentication.IWAAuthentication value) {
        this.iwaAuthentication = value;
    }

    /**
     * Gets the value of the tokenAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication.TokenAuthentication }
     *     
     */
    public Authentication.TokenAuthentication getTokenAuthentication() {
        return tokenAuthentication;
    }

    /**
     * Sets the value of the tokenAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication.TokenAuthentication }
     *     
     */
    public void setTokenAuthentication(Authentication.TokenAuthentication value) {
        this.tokenAuthentication = value;
    }

    /**
     * Gets the value of the serviceAccountAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication.ServiceAccountAuthentication }
     *     
     */
    public Authentication.ServiceAccountAuthentication getServiceAccountAuthentication() {
        return serviceAccountAuthentication;
    }

    /**
     * Sets the value of the serviceAccountAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication.ServiceAccountAuthentication }
     *     
     */
    public void setServiceAccountAuthentication(Authentication.ServiceAccountAuthentication value) {
        this.serviceAccountAuthentication = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SecretKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "domain",
        "user",
        "secretKey"
    })
    public static class IWAAuthentication {

        @XmlElement(name = "Domain", required = true)
        protected String domain;
        @XmlElement(name = "User", required = true)
        protected String user;
        @XmlElement(name = "SecretKey", required = true)
        protected String secretKey;

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(String value) {
            this.user = value;
        }

        /**
         * Gets the value of the secretKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecretKey() {
            return secretKey;
        }

        /**
         * Sets the value of the secretKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecretKey(String value) {
            this.secretKey = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "token"
    })
    public static class SSOAuth {

        @XmlElement(name = "Username", required = true)
        protected String username;
        @XmlElement(name = "Token", required = true)
        protected String token;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "token"
    })
    public static class ServiceAccountAuthentication {

        @XmlElement(name = "Token", required = true)
        protected String token;

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "token",
        "timeStamp"
    })
    public static class TokenAuthentication {

        @XmlElement(name = "Token", required = true)
        protected String token;
        @XmlElement(name = "TimeStamp", required = true)
        protected String timeStamp;

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeStamp(String value) {
            this.timeStamp = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "password"
    })
    public static class UsernamePasswordAuth {

        @XmlElement(name = "Username", required = true)
        protected String username;
        @XmlElement(name = "Password", required = true)
        protected String password;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }

}
