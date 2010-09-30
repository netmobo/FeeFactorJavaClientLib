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

/**
 * @author netmobo
 */
public class AccountInvoice {

    protected String accountID;
    protected double amountDue;
    protected boolean archived;
    protected long brandID;
    protected double currentCharges;
    protected Calendar dateFrom;
    protected Calendar dateTo;
    protected Calendar dueDate;
    protected boolean fullyPaid;
    protected Calendar fullyPaidDate;
    protected int gmt;
    protected String invoiceCode;
    protected Calendar invoiceDate;
    protected long invoiceNumber;
    protected String preparedBy;
    protected String remarks;
    protected boolean sentToCustomer;
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
     * Gets the value of the amountDue property.
     * 
     */
    public double getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     */
    public void setAmountDue(double value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     */
    public boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     */
    public void setArchived(boolean value) {
        this.archived = value;
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
     * Gets the value of the currentCharges property.
     * 
     */
    public double getCurrentCharges() {
        return currentCharges;
    }

    /**
     * Sets the value of the currentCharges property.
     * 
     */
    public void setCurrentCharges(double value) {
        this.currentCharges = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(Calendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(Calendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Calendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the fullyPaid property.
     * 
     */
    public boolean isFullyPaid() {
        return fullyPaid;
    }

    /**
     * Sets the value of the fullyPaid property.
     * 
     */
    public void setFullyPaid(boolean value) {
        this.fullyPaid = value;
    }

    /**
     * Gets the value of the fullyPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFullyPaidDate() {
        return fullyPaidDate;
    }

    /**
     * Sets the value of the fullyPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyPaidDate(Calendar value) {
        this.fullyPaidDate = value;
    }

    /**
     * Gets the value of the gmt property.
     * 
     */
    public int getGmt() {
        return gmt;
    }

    /**
     * Sets the value of the gmt property.
     * 
     */
    public void setGmt(int value) {
        this.gmt = value;
    }

    /**
     * Gets the value of the invoiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCode() {
        return invoiceCode;
    }

    /**
     * Sets the value of the invoiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCode(String value) {
        this.invoiceCode = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(Calendar value) {
        this.invoiceDate = value;
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
     * Gets the value of the preparedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparedBy() {
        return preparedBy;
    }

    /**
     * Sets the value of the preparedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparedBy(String value) {
        this.preparedBy = value;
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
     * Gets the value of the sentToCustomer property.
     * 
     */
    public boolean isSentToCustomer() {
        return sentToCustomer;
    }

    /**
     * Sets the value of the sentToCustomer property.
     * 
     */
    public void setSentToCustomer(boolean value) {
        this.sentToCustomer = value;
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

}
