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
package com.feefactor.paymentsystems;

import java.util.Calendar;

/**
 * @author netmobo
 */
public class CardTransactionHistory {

    protected long adminID;
    protected double amount;
    protected String application;
    protected String authoCode;
    protected long buyerAuthID;
    protected long cardHistoryID;
    protected String cardNumber;
    protected boolean credited;
    protected String currency;
    protected Calendar date;
    protected double fraudScore;
    protected String fraudScoreSource;
    protected long gatewayID;
    protected long invoiceNumber;
    protected String ipAddress;
    protected String merchantRefID;
    protected String payee;
    protected long payeeID;
    protected String payer;
    protected String rechargeCategory;
    protected String rechargeLevel;
    protected String remarks;
    protected String result;
    protected String sessionID;
    protected String transactionReferenceID;
    protected String transactionSerialNo;
    protected String transactionType;
    protected long userID;
    protected boolean voided;

    /**
     * Gets the value of the adminID property.
     * 
     */
    public long getAdminID() {
        return adminID;
    }

    /**
     * Sets the value of the adminID property.
     * 
     */
    public void setAdminID(long value) {
        this.adminID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the authoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoCode() {
        return authoCode;
    }

    /**
     * Sets the value of the authoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoCode(String value) {
        this.authoCode = value;
    }

    /**
     * Gets the value of the buyerAuthID property.
     * 
     */
    public long getBuyerAuthID() {
        return buyerAuthID;
    }

    /**
     * Sets the value of the buyerAuthID property.
     * 
     */
    public void setBuyerAuthID(long value) {
        this.buyerAuthID = value;
    }

    /**
     * Gets the value of the cardHistoryID property.
     * 
     */
    public long getCardHistoryID() {
        return cardHistoryID;
    }

    /**
     * Sets the value of the cardHistoryID property.
     * 
     */
    public void setCardHistoryID(long value) {
        this.cardHistoryID = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the credited property.
     * 
     */
    public boolean isCredited() {
        return credited;
    }

    /**
     * Sets the value of the credited property.
     * 
     */
    public void setCredited(boolean value) {
        this.credited = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the fraudScore property.
     * 
     */
    public double getFraudScore() {
        return fraudScore;
    }

    /**
     * Sets the value of the fraudScore property.
     * 
     */
    public void setFraudScore(double value) {
        this.fraudScore = value;
    }

    /**
     * Gets the value of the fraudScoreSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudScoreSource() {
        return fraudScoreSource;
    }

    /**
     * Sets the value of the fraudScoreSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudScoreSource(String value) {
        this.fraudScoreSource = value;
    }

    /**
     * Gets the value of the gatewayID property.
     * 
     */
    public long getGatewayID() {
        return gatewayID;
    }

    /**
     * Sets the value of the gatewayID property.
     * 
     */
    public void setGatewayID(long value) {
        this.gatewayID = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     */
    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     */
    public void setInvoiceNumber(long value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the merchantRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRefID() {
        return merchantRefID;
    }

    /**
     * Sets the value of the merchantRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRefID(String value) {
        this.merchantRefID = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayee(String value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payeeID property.
     * 
     */
    public long getPayeeID() {
        return payeeID;
    }

    /**
     * Sets the value of the payeeID property.
     * 
     */
    public void setPayeeID(long value) {
        this.payeeID = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the rechargeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeCategory() {
        return rechargeCategory;
    }

    /**
     * Sets the value of the rechargeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeCategory(String value) {
        this.rechargeCategory = value;
    }

    /**
     * Gets the value of the rechargeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeLevel() {
        return rechargeLevel;
    }

    /**
     * Sets the value of the rechargeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeLevel(String value) {
        this.rechargeLevel = value;
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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the transactionReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReferenceID() {
        return transactionReferenceID;
    }

    /**
     * Sets the value of the transactionReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReferenceID(String value) {
        this.transactionReferenceID = value;
    }

    /**
     * Gets the value of the transactionSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSerialNo() {
        return transactionSerialNo;
    }

    /**
     * Sets the value of the transactionSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSerialNo(String value) {
        this.transactionSerialNo = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
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

    /**
     * Gets the value of the voided property.
     * 
     */
    public boolean isVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     */
    public void setVoided(boolean value) {
        this.voided = value;
    }

}
