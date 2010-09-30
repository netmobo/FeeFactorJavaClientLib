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
public class AccountPlanHistory implements Serializable{
    private static final long serialVersionUID = 1L;
    private long accountPlanHistoryID;
    private long serialNumber;
    private Calendar time;
    private long planID;
    private String description;
    private double amount;

    public long getAccountPlanHistoryID() {
        return accountPlanHistoryID;
    }

    public void setAccountPlanHistoryID(long accountPlanHistoryID) {
        this.accountPlanHistoryID = accountPlanHistoryID;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public long getPlanID() {
        return planID;
    }

    public void setPlanID(long planID) {
        this.planID = planID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("accountPlanHistoryID=").append(getAccountPlanHistoryID()).append(", ");
        sb.append("amount=").append(getAmount()).append(", ");
        sb.append("description=").append(getDescription()).append(", ");
        sb.append("planID=").append(getPlanID()).append(", ");
        sb.append("serialNumber=").append(getSerialNumber()).append(", ");
        sb.append("time=").append(ServiceBase.convertCalendarToMmddyyyy(getTime())).append(", ");

        return sb.toString();
    }

    
    public long getActivityRecordTargetID() {
        return getAccountPlanHistoryID();
    }

}