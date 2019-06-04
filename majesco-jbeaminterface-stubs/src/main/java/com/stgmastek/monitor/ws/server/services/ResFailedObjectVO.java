package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resFailedObjectVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resFailedObjectVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="failedObjectsData" type="{http://services.server.ws.monitor.stgmastek.com/}failedObjectDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resFailedObjectVO", propOrder = {
    "failedObjectsData"
})
public class ResFailedObjectVO
    extends BaseResponseVO
{

  @XmlElement(nillable = true)
  protected List<FailedObjectDetails> failedObjectsData;

  /**
   * Gets the value of the failedObjectsData property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the failedObjectsData property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFailedObjectsData().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link FailedObjectDetails }
   */
  public List<FailedObjectDetails> getFailedObjectsData()
  {
    if (failedObjectsData == null)
    {
      failedObjectsData = new ArrayList<FailedObjectDetails>();
    }
    return this.failedObjectsData;
  }

}
