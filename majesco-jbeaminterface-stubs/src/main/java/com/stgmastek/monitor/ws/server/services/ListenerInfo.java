package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listenerInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="listenerInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="listenerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noOfObjectsExecuted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noOfObjectsFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noOfObjectsSkipped" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeTaken" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listenerInfo", propOrder = {
    "listenerId",
    "noOfObjectsExecuted",
    "noOfObjectsFailed",
    "noOfObjectsSkipped",
    "timeTaken"
})
public class ListenerInfo
    extends BaseVO
{

  protected Integer listenerId;

  protected Integer noOfObjectsExecuted;

  protected Integer noOfObjectsFailed;

  protected Integer noOfObjectsSkipped;

  protected Double timeTaken;

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

  /**
   * Gets the value of the noOfObjectsExecuted property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getNoOfObjectsExecuted()
  {
    return noOfObjectsExecuted;
  }

  /**
   * Sets the value of the noOfObjectsExecuted property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setNoOfObjectsExecuted(Integer value)
  {
    this.noOfObjectsExecuted = value;
  }

  /**
   * Gets the value of the noOfObjectsFailed property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getNoOfObjectsFailed()
  {
    return noOfObjectsFailed;
  }

  /**
   * Sets the value of the noOfObjectsFailed property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setNoOfObjectsFailed(Integer value)
  {
    this.noOfObjectsFailed = value;
  }

  /**
   * Gets the value of the noOfObjectsSkipped property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getNoOfObjectsSkipped()
  {
    return noOfObjectsSkipped;
  }

  /**
   * Sets the value of the noOfObjectsSkipped property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setNoOfObjectsSkipped(Integer value)
  {
    this.noOfObjectsSkipped = value;
  }

  /**
   * Gets the value of the timeTaken property.
   *
   * @return possible object is {@link Double }
   */
  public Double getTimeTaken()
  {
    return timeTaken;
  }

  /**
   * Sets the value of the timeTaken property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setTimeTaken(Double value)
  {
    this.timeTaken = value;
  }

}
