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
package com.feefactor.charging;

import java.util.Calendar;

/**
 * @author netmobo
 */
public class TransactionDetailRecord {

    protected long accountBatchNumber;
    protected String accountID;
    protected String accountType;
    protected String product;
    protected long brandID;
    protected String brandName;
    protected long brandProductID;
    protected long brandServiceID;
    protected String brandServiceName;
    protected double charge;
    protected String currency;
    protected String description;
    protected String productDescription;
    protected String errorCode;
    protected double initialBrandPrice;
    protected double localCharge;
    protected double planCharge;
    protected double rateVsDollar;
    protected String planDescription;
    protected long planID;
    protected String productCode;
    protected double quantity;
    protected long serialNumber;
    protected String sessionID;
    protected long status;
    protected Calendar time;
    protected long transactionDetailRecordID;
    protected String chargeCalc;
    protected long userAntiTdr;
    protected long userBrID;
    protected long userID;
    protected String username;
    
    public long getAccountBatchNumber() {
        return accountBatchNumber;
    }
    public void setAccountBatchNumber(long accountBatchNumber) {
        this.accountBatchNumber = accountBatchNumber;
    }
    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public long getBrandID() {
        return brandID;
    }
    public void setBrandID(long brandID) {
        this.brandID = brandID;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public long getBrandProductID() {
        return brandProductID;
    }
    public void setBrandProductID(long brandProductID) {
        this.brandProductID = brandProductID;
    }
    public long getBrandServiceID() {
        return brandServiceID;
    }
    public void setBrandServiceID(long brandServiceID) {
        this.brandServiceID = brandServiceID;
    }
    public String getBrandServiceName() {
        return brandServiceName;
    }
    public void setBrandServiceName(String brandServiceName) {
        this.brandServiceName = brandServiceName;
    }
    public double getCharge() {
        return charge;
    }
    public void setCharge(double charge) {
        this.charge = charge;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public double getInitialBrandPrice() {
        return initialBrandPrice;
    }
    public void setInitialBrandPrice(double initialBrandPrice) {
        this.initialBrandPrice = initialBrandPrice;
    }
    public double getLocalCharge() {
        return localCharge;
    }
    public void setLocalCharge(double localCharge) {
        this.localCharge = localCharge;
    }
    public double getPlanCharge() {
        return planCharge;
    }
    public void setPlanCharge(double planCharge) {
        this.planCharge = planCharge;
    }
    public String getPlanDescription() {
        return planDescription;
    }
    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }
    public long getPlanID() {
        return planID;
    }
    public void setPlanID(long planID) {
        this.planID = planID;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getSessionID() {
        return sessionID;
    }
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    public long getStatus() {
        return status;
    }
    public void setStatus(long status) {
        this.status = status;
    }
    public Calendar getTime() {
        return time;
    }
    public void setTime(Calendar time) {
        this.time = time;
    }
    public long getTransactionDetailRecordID() {
        return transactionDetailRecordID;
    }
    public void setTransactionDetailRecordID(long transactionDetailRecordID) {
        this.transactionDetailRecordID = transactionDetailRecordID;
    }
    public String getChargeCalc() {
        return chargeCalc;
    }
    public void setChargeCalc(String chargeCalc) {
        this.chargeCalc = chargeCalc;
    }
    public long getUserAntiTdr() {
        return userAntiTdr;
    }
    public void setUserAntiTdr(long userAntiTdr) {
        this.userAntiTdr = userAntiTdr;
    }
    public long getUserBrID() {
        return userBrID;
    }
    public void setUserBrID(long userBrID) {
        this.userBrID = userBrID;
    }
    public long getUserID() {
        return userID;
    }
    public void setUserID(long userID) {
        this.userID = userID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public double getRateVsDollar() {
        return rateVsDollar;
    }
    public void setRateVsDollar(double rateVsDollar) {
        this.rateVsDollar = rateVsDollar;
    }
}
