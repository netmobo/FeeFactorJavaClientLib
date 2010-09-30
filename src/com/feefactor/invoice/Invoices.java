/*-
 * Copyright (c) 2010, NETMOBO LLC
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *     i.   Redistributions of source code must retain the above copyright 
 *          notice, this list of conditions and the following disclaimer.
 *     ii.  Redistributions in binary form must reproduce the above copyright 
 *          notice, this list of conditions and the following disclaimer in the 
 *          documentation and/or other materials provided with the 
 *          distribution.
 *     iii. Neither the name of NETMOBO LLC nor the names of its contributors 
 *          may be used to endorse or promote products derived from this 
 *          software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.feefactor.invoice;

import java.util.Calendar;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;
import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public class Invoices extends ServiceBase{
    private final String basePath = "/Invoices";
    public Invoices(ClientConfig config) {
        super(config);
    }

    public AccountInvoice getAccountInvoice(
            long invoiceNumber)
    throws FeefactorCheckedException{
        String subPath = "/Account/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("invoiceNumber", String.valueOf(invoiceNumber));
        
        return get(basePath+subPath, AccountInvoice.class, others);
	}
    
    public List<AccountInvoice> getAccountInvoices(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/search/";
        return getList(basePath+subPath, AccountInvoice.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getAccountInvoicesCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    /**
     * //param dateDue - when this invoice is meant to be paid. (Optional, Default is 3 days 
     *                  from now inclusive of milliseconds, i.e. exactly 72 hours from now)
     * //param brCondition - search condition for BR's to be included. (Optional)
     * //param serialNumber - account to create invoice.
     * //param invoiceCode - user defined description. (Optional)
     * //param allowBlank - when set to true, an invoice will be generated for Account 
     *                      included in the targetList even if the said account does not 
     *                      have any billing record. 
     * //throws SolegyContingencyException
     */
    public List<AccountInvoice> generateAccountInvoice(
            Calendar dateDue,
            String brCondition,
            long serialNumber,
            String invoiceCode,
            boolean allowBlankInvoice,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/";
        NameValuePair[] others = new NameValuePair[6];
        if(dateDue==null){
            others[0] = new NameValuePair("filler", "filler");
        } else {
            others[0] = new NameValuePair("dateDue", String.valueOf(dateDue));
        }
        others[1] = new NameValuePair("brCondition", String.valueOf(brCondition));
        others[2] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[3] = new NameValuePair("invoiceCode", String.valueOf(invoiceCode));
        others[4] = new NameValuePair("allowBlankInvoice", String.valueOf(allowBlankInvoice));
        others[5] = new NameValuePair("reason", String.valueOf(reason));
        
        String response = put(basePath+subPath, others);
        return XMLUtility.listFromXML(AccountInvoice.class, response);
	}
    
    public int deleteAccountBillingRecord(
            long brID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/billingRecord/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brID", String.valueOf(brID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return delete(basePath+subPath, others);
	}
    
    public BillingRecord getAccountBillingRecord(
            long brID)
    throws FeefactorCheckedException{
        String subPath = "/Account/billingRecord/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brID", String.valueOf(brID));
        
        return get(basePath+subPath, BillingRecord.class, others);
	}
    
    public List<BillingRecord> getAccountBillingRecords(
            long serialNumber,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/billingRecord/search";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        
        return getList(basePath+subPath, BillingRecord.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getAccountBillingRecordsCount(
            long serialNumber,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/billingRecord/count";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertAccountBillingRecord(
            BillingRecord billingRecord,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/Account/billingRecord/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, billingRecord, others);
	}

    public UserPayment getUserPayment(
            long paymentID)
    throws FeefactorCheckedException{
        String subPath = "/Users/payment/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("paymentID", String.valueOf(paymentID));
        
        return get(basePath+subPath, UserPayment.class, others);
	}
    
    public List<UserPayment> getUserPayments(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/Users/payment/search/";
        return getList(basePath+subPath, UserPayment.class, whereCondition, sortString, pageItems, pageNumber);
	}
    
    public long getUserPaymentsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/Users/payment/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertUserPayment(
            UserPayment payment,
            String reason)
    throws FeefactorCheckedException{
        String subPath = "/Users/payment/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, payment, others);
	}
    
    public List<AccountInvoicePayment> getAccountInvoicePayments(
            long invoiceNumber)
    throws FeefactorCheckedException{
        String subPath = "/Account/payment/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("invoiceNumber", String.valueOf(invoiceNumber));
        return getList(basePath+subPath, AccountInvoicePayment.class, "","",1,1, others);
	}
    
    public long getAccountInvoicePaymentsCount(
            long invoiceNumber)
    throws FeefactorCheckedException{
        String subPath = "/Account/payment/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("invoiceNumber", String.valueOf(invoiceNumber));
        return getCount(basePath+subPath, "", others);
	}

    @Override
    public String getNamespace() {
        return "http://invoice.feefactor.com";
    }
}
