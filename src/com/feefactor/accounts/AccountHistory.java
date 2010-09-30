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
package com.feefactor.accounts;

import java.io.Serializable;
import java.util.Calendar;

import com.feefactor.ServiceBase;

/**
 * @author netmobo
 */
public class AccountHistory implements Serializable{
    private static final long serialVersionUID = 1L;
    private long accountHistoryID;
    private long serialNumber;
    private Calendar transactionDate;
    private double previousBalance;
    private double amountChange;
    private String transactionType;
    private String referenceID;
    private String description;
    private long adminID;

    public long getAccountHistoryID() {
        return accountHistoryID;
    }

    public void setAccountHistoryID(long accountHistoryID) {
        this.accountHistoryID = accountHistoryID;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Calendar getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public double getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(double amountChange) {
        this.amountChange = amountChange;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("transactionDate=").append(ServiceBase.convertCalendarToMmddyyyy(getTransactionDate())).append(", ");
        sb.append("transactionType=").append(getTransactionType()).append(", ");
        sb.append("previousBalance=").append(getPreviousBalance()).append(", ");
        sb.append("adminID=").append(getAdminID()).append(", ");
        sb.append("accountHistoryID=").append(getAccountHistoryID()).append(", ");
        sb.append("amountChange=").append(getAmountChange()).append(", ");
        sb.append("description=").append(getDescription()).append(", ");
        sb.append("referenceID=").append(getReferenceID()).append(", ");
        sb.append("serialNumber=").append(getSerialNumber()).append(", ");

        return sb.toString();
    }
}