
package com.coverall.mt.webservices.producerupload.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producerUploadServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producerUploadServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uploadXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "producerUploadServiceRequest", propOrder = {
    "uploadXML"
})
public class ProducerUploadServiceRequest {

    protected String uploadXML;

    /**
     * Gets the value of the uploadXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadXML() {
        return uploadXML;
    }

    /**
     * Sets the value of the uploadXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadXML(String value) {
        this.uploadXML = value;
    }

}
