package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resBatchObjectVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resBatchObjectVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="batchObjectList" type="{http://services.server.ws.monitor.stgmastek.com/}batchObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resBatchObjectVO", propOrder = {
    "batchObjectList"
})
public class ResBatchObjectVO
    extends BaseResponseVO
{

  @XmlElement(nillable = true)
  protected List<BatchObject> batchObjectList;

  /**
   * Gets the value of the batchObjectList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the batchObjectList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBatchObjectList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link BatchObject }
   */
  public List<BatchObject> getBatchObjectList()
  {
    if (batchObjectList == null)
    {
      batchObjectList = new ArrayList<BatchObject>();
    }
    return this.batchObjectList;
  }

}
