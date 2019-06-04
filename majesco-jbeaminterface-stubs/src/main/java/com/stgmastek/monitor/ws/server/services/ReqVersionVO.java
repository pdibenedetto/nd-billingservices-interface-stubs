package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqVersionVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqVersionVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseRequestVO">
 *       &lt;sequence>
 *         &lt;element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqVersionVO", propOrder = {
    "majorVersion",
    "minorVersion"
})
public class ReqVersionVO
    extends BaseRequestVO
{

  protected String majorVersion;

  protected String minorVersion;

  /**
   * Gets the value of the majorVersion property.
   *
   * @return possible object is {@link String }
   */
  public String getMajorVersion()
  {
    return majorVersion;
  }

  /**
   * Sets the value of the majorVersion property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMajorVersion(String value)
  {
    this.majorVersion = value;
  }

  /**
   * Gets the value of the minorVersion property.
   *
   * @return possible object is {@link String }
   */
  public String getMinorVersion()
  {
    return minorVersion;
  }

  /**
   * Sets the value of the minorVersion property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMinorVersion(String value)
  {
    this.minorVersion = value;
  }

}
