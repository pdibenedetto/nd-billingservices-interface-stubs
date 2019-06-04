package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqListenerInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqListenerInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}reqBatch">
 *       &lt;sequence>
 *         &lt;element name="listenerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqListenerInfo", propOrder = {
    "listenerId"
})
public class ReqListenerInfo
    extends ReqBatch
{

  protected Integer listenerId;

  /**
   * Gets the value of the listenerId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getListenerId()
  {
    return listenerId;
  }

  /**
   * Sets the value of the listenerId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setListenerId(Integer value)
  {
    this.listenerId = value;
  }

}
