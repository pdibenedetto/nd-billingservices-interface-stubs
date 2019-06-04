
package com.majescomastek.stgicd.ws.meta.whatifinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.Transaction;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.inboundwhatiftransactiondetail.InboundTransactionDetail;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.TransactionResponse;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.InstallmentScheduleSummaryByDueDate;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.installmentschedulesummarybyduedate.InstallmentScheduleSummaryByTransactionReceivable;
import com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface.ResponseTransactionSchedule;
import com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface.WhatIfTransactionSchedule;


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
    com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.InboundWhatIfTransactionDetail.class,
    Transaction.class,
    RequestResponse.class,
    com.majescomastek.stgicd.ws.meta.whatifinterface.requestresponse.Message.class,
    RequestHeader.class,
    InstallmentScheduleSummaryByDueDate.class,
    ResponseTransactionSchedule.class,
    WhatIfTransactionSchedule.class,
    InboundTransactionDetail.class,
    InstallmentScheduleSummaryByTransactionReceivable.class,
    TransactionResponse.class,
    com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.Message.class,
    com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.InboundWhatIfTransactionDetail.class
})
public abstract class BaseWSVo {


}
