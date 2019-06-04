
package com.majescomastek.stgicd.ws.meta.premiuminterfacend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.premiuminterfacend.InboundPremiumTransaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.premiuminterfacend.OutputTransaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestresponse.RequestResponse;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundCommissionSacrifice;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundEntity;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundSlidingScaleCommission;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.InboundTransactionReason;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.ReceivableDetails;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.Transaction;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.inboundentity.InboundEntityAddress;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.receivabledetails.InboundTransactionCommission;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transactionresponse.TransactionResponse;


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
    InboundTransactionCommission.class,
    InboundEntityAddress.class,
    InboundSlidingScaleCommission.class,
    InboundTransactionReason.class,
    InboundCommissionSacrifice.class,
    InboundEntity.class,
    Transaction.class,
    ReceivableDetails.class,
    RequestResponse.class,
    com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestresponse.Message.class,
    TransactionResponse.class,
    com.majescomastek.stgicd.ws.meta.premiuminterfacend.transactionresponse.Message.class,
    RequestHeader.class,
    OutputTransaction.class,
    InboundPremiumTransaction.class
})
public abstract class BaseWSVo {


}
