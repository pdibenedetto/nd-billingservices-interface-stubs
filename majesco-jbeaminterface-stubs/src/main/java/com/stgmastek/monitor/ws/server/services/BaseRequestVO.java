package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRequestVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="baseRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="requestTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRequestVO", propOrder = {
    "requestTime",
    "requestType"
})
@XmlSeeAlso({
                InstructionParameter.class,
                ReqInstallationVO.class,
                ReqUserDetailsVO.class,
                ReqSearchBatch.class,
                ReqBatch.class,
                ReqVersionVO.class,
                UserInfo.class,
                ReqInstructionLog.class
            })
public class BaseRequestVO
    extends BaseVO
{

  protected Long requestTime;

  protected String requestType;

  /**
   * Gets the value of the requestTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getRequestTime()
  {
    return requestTime;
  }

  /**
   * Sets the value of the requestTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setRequestTime(Long value)
  {
    this.requestTime = value;
  }

  /**
   * Gets the value of the requestType property.
   *
   * @return possible object is {@link String }
   */
  public String getRequestType()
  {
    return requestType;
  }

  /**
   * Sets the value of the requestType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRequestType(String value)
  {
    this.requestType = value;
  }

}
