package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resDropDownEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resDropDownEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="dropDownEntries" type="{http://services.server.ws.monitor.stgmastek.com/}dropDownEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resDropDownEntry", propOrder = {
    "dropDownEntries"
})
public class ResDropDownEntry
    extends BaseResponseVO
{

  @XmlElement(nillable = true)
  protected List<DropDownEntry> dropDownEntries;

  /**
   * Gets the value of the dropDownEntries property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dropDownEntries property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDropDownEntries().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DropDownEntry }
   */
  public List<DropDownEntry> getDropDownEntries()
  {
    if (dropDownEntries == null)
    {
      dropDownEntries = new ArrayList<DropDownEntry>();
    }
    return this.dropDownEntries;
  }

}
