
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryInput;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquiryinterface.BillingInquiryOutput;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryEntityDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryInstallments;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryInvoiceDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryNOCDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryReceivableDetail;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquirySummary;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary.BillingInquiryTransactions;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.inputrequest.InputRequest;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.Message;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.requestresponse.RequestResponse;


/**
 * <p>Java class for baseWSVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseWSVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseWSVo")
@XmlSeeAlso({
    RequestResponse.class,
    Message.class,
    BillingInquiryNOCDetail.class,
    BillingInquiryReceivableDetail.class,
    BillingInquirySummary.class,
    BillingInquiryTransactions.class,
    BillingInquiryEntityDetail.class,
    BillingInquiryInstallments.class,
    BillingInquiryInvoiceDetail.class,
    InputRequest.class,
    BillingInquiryOutput.class,
    BillingInquiryInput.class
})
public abstract class BaseWSVo {


}
