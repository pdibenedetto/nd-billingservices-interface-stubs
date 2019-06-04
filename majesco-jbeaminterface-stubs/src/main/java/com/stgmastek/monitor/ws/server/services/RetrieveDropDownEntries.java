package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveDropDownEntries complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retrieveDropDownEntries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DropDownIdentifierList" type="{http://services.server.ws.monitor.stgmastek.com/}configParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveDropDownEntries", propOrder = {
    "dropDownIdentifierList"
})
public class RetrieveDropDownEntries
{

  @XmlElement(name = "DropDownIdentifierList")
  protected List<ConfigParameter> dropDownIdentifierList;

  /**
   * Gets the value of the dropDownIdentifierList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dropDownIdentifierList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDropDownIdentifierList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ConfigParameter }
   */
  public List<ConfigParameter> getDropDownIdentifierList()
  {
    if (dropDownIdentifierList == null)
    {
      dropDownIdentifierList = new ArrayList<ConfigParameter>();
    }
    return this.dropDownIdentifierList;
  }

}
