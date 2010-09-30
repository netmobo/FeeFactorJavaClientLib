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
public class Account implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String accountID;
    protected long accountPlanID;
    protected Calendar activationDate;
    protected boolean autoActivate;
    protected double balance;
    protected long batchNumber;
    protected long brandID;
    protected long brandServiceID;
    protected Calendar creationDate;
    protected String creator;
    protected double creditLimit;
    protected long currencyID;
    protected double denomination;
    protected Calendar endRoamDate;
    protected Calendar expirationDate;
    protected Calendar firstUseDate;
    protected double freeRollOverBal;
    protected double freeValueBal;
    protected long inactiveAgeLimit;
    protected Calendar inactiveExpirationDate;
    protected double initialBalance;
    protected Calendar lastPlanRefreshDate;
    protected Calendar lastUseDate;
    protected long planID;
    protected String remarks;
    protected boolean roaming;
    protected long serialNumber;
    protected String settings;
    protected long simultaneousAccess;
    protected String status;
    protected String type;
    protected long usageAge;
    protected Calendar usageDate;
    protected Calendar usageExpirationDate;
    protected long userID;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the accountPlanID property.
     * 
     */
    public long getAccountPlanID() {
        return accountPlanID;
    }

    /**
     * Sets the value of the accountPlanID property.
     * 
     */
    public void setAccountPlanID(long value) {
        this.accountPlanID = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(Calendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the autoActivate property.
     * 
     */
    public boolean isAutoActivate() {
        return autoActivate;
    }

    /**
     * Sets the value of the autoActivate property.
     * 
     */
    public void setAutoActivate(boolean value) {
        this.autoActivate = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     */
    public long getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     */
    public void setBatchNumber(long value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     */
    public long getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     */
    public void setBrandID(long value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the brandServiceID property.
     * 
     */
    public long getBrandServiceID() {
        return brandServiceID;
    }

    /**
     * Sets the value of the brandServiceID property.
     * 
     */
    public void setBrandServiceID(long value) {
        this.brandServiceID = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(Calendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     */
    public void setCreditLimit(double value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     */
    public long getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     */
    public void setCurrencyID(long value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the denomination property.
     * 
     */
    public double getDenomination() {
        return denomination;
    }

    /**
     * Sets the value of the denomination property.
     * 
     */
    public void setDenomination(double value) {
        this.denomination = value;
    }

    /**
     * Gets the value of the endRoamDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndRoamDate() {
        return endRoamDate;
    }

    /**
     * Sets the value of the endRoamDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRoamDate(Calendar value) {
        this.endRoamDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the firstUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFirstUseDate() {
        return firstUseDate;
    }

    /**
     * Sets the value of the firstUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUseDate(Calendar value) {
        this.firstUseDate = value;
    }

    /**
     * Gets the value of the freeRollOverBal property.
     * 
     */
    public double getFreeRollOverBal() {
        return freeRollOverBal;
    }

    /**
     * Sets the value of the freeRollOverBal property.
     * 
     */
    public void setFreeRollOverBal(double value) {
        this.freeRollOverBal = value;
    }

    /**
     * Gets the value of the freeValueBal property.
     * 
     */
    public double getFreeValueBal() {
        return freeValueBal;
    }

    /**
     * Sets the value of the freeValueBal property.
     * 
     */
    public void setFreeValueBal(double value) {
        this.freeValueBal = value;
    }

    /**
     * Gets the value of the inactiveAgeLimit property.
     * 
     */
    public long getInactiveAgeLimit() {
        return inactiveAgeLimit;
    }

    /**
     * Sets the value of the inactiveAgeLimit property.
     * 
     */
    public void setInactiveAgeLimit(long value) {
        this.inactiveAgeLimit = value;
    }

    /**
     * Gets the value of the inactiveExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInactiveExpirationDate() {
        return inactiveExpirationDate;
    }

    /**
     * Sets the value of the inactiveExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveExpirationDate(Calendar value) {
        this.inactiveExpirationDate = value;
    }

    /**
     * Gets the value of the initialBalance property.
     * 
     */
    public double getInitialBalance() {
        return initialBalance;
    }

    /**
     * Sets the value of the initialBalance property.
     * 
     */
    public void setInitialBalance(double value) {
        this.initialBalance = value;
    }

    /**
     * Gets the value of the lastPlanRefreshDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastPlanRefreshDate() {
        return lastPlanRefreshDate;
    }

    /**
     * Sets the value of the lastPlanRefreshDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPlanRefreshDate(Calendar value) {
        this.lastPlanRefreshDate = value;
    }

    /**
     * Gets the value of the lastUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUseDate() {
        return lastUseDate;
    }

    /**
     * Sets the value of the lastUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUseDate(Calendar value) {
        this.lastUseDate = value;
    }

    /**
     * Gets the value of the planID property.
     * 
     */
    public long getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     */
    public void setPlanID(long value) {
        this.planID = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the roaming property.
     * 
     */
    public boolean isRoaming() {
        return roaming;
    }

    /**
     * Sets the value of the roaming property.
     * 
     */
    public void setRoaming(boolean value) {
        this.roaming = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     */
    public long getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     */
    public void setSerialNumber(long value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettings(String value) {
        this.settings = value;
    }

    /**
     * Gets the value of the simultaneousAccess property.
     * 
     */
    public long getSimultaneousAccess() {
        return simultaneousAccess;
    }

    /**
     * Sets the value of the simultaneousAccess property.
     * 
     */
    public void setSimultaneousAccess(long value) {
        this.simultaneousAccess = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the usageAge property.
     * 
     */
    public long getUsageAge() {
        return usageAge;
    }

    /**
     * Sets the value of the usageAge property.
     * 
     */
    public void setUsageAge(long value) {
        this.usageAge = value;
    }

    /**
     * Gets the value of the usageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUsageDate() {
        return usageDate;
    }

    /**
     * Sets the value of the usageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageDate(Calendar value) {
        this.usageDate = value;
    }

    /**
     * Gets the value of the usageExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUsageExpirationDate() {
        return usageExpirationDate;
    }

    /**
     * Sets the value of the usageExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageExpirationDate(Calendar value) {
        this.usageExpirationDate = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("accountID=").append(getAccountID()).append(", ");
        sb.append("balance=").append(getBalance()).append(", ");
        sb.append("batchNumber=").append(getBatchNumber()).append(", ");
        sb.append("brandID=").append(getBrandID()).append(", ");
        sb.append("brandServiceID=").append(getBrandServiceID()).append(", ");
        sb.append("creationDate=").append(ServiceBase.convertCalendarToMmddyyyy(getCreationDate())).append(", ");
        sb.append("creator=").append(getCreator()).append(", ");
        sb.append("creditLimit=").append(getCreditLimit()).append(", ");
        sb.append("currencyID=").append(getCurrencyID()).append(", ");
        sb.append("denomination=").append(getDenomination()).append(", ");
        sb.append("expirationDate=").append(ServiceBase.convertCalendarToMmddyyyy(getExpirationDate())).append(", ");
        sb.append("firstUseDate=").append(getFirstUseDate()).append(", ");
        sb.append("freeValueBal=").append(getFreeValueBal()).append(", ");
        sb.append("inactiveExpirationDate=").append(ServiceBase.convertCalendarToMmddyyyy(getInactiveExpirationDate())).append(", ");
        sb.append("lastPlanRefreshDate=").append(ServiceBase.convertCalendarToMmddyyyy(getLastPlanRefreshDate())).append(", ");
        sb.append("lastUseDate=").append(ServiceBase.convertCalendarToMmddyyyy(getLastUseDate())).append(", ");
        sb.append("planID=").append(getPlanID()).append(", ");
        sb.append("remarks=").append(getRemarks()).append(", ");
        sb.append("serialNumber=").append(getSerialNumber()).append(", ");
        sb.append("simultaneousAccess=").append(getSimultaneousAccess()).append(", ");
        sb.append("status=").append(getStatus()).append(", ");
        sb.append("type=").append(getType()).append(", ");
        sb.append("usageExpirationDate=").append(ServiceBase.convertCalendarToMmddyyyy(getUsageExpirationDate())).append(", ");
        sb.append("userID=").append(getUserID()).append(", ");

        return sb.toString();
    }

}
