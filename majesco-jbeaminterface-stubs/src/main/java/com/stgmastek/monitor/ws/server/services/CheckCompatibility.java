package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCompatibility complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="checkCompatibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://services.server.ws.monitor.stgmastek.com/}reqVersionVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCompatibility", propOrder = {
    "version"
})
public class CheckCompatibility
{

  protected ReqVersionVO version;

  /**
   * Gets the value of the version property.
   *
   * @return possible object is {@link ReqVersionVO }
   */
  public ReqVersionVO getVersion()
  {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value allowed object is {@link ReqVersionVO }
   */
  public void setVersion(ReqVersionVO value)
  {
    this.version = value;
  }

}
