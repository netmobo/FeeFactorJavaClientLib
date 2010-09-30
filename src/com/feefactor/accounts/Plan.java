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

/**
 * @author netmobo
 */
public class Plan implements Serializable{
    private static final long serialVersionUID = 1L;
    protected long brandID;
    protected long currencyID;
    protected String description;
    protected double freeValue;
    protected double planCharge;
    protected long planID;
    protected long planType;
    protected long rollOverMode;
    protected double rollOverValue;
    protected String settings;
    
    protected String interval;
    protected String intervalType;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the freeValue property.
     * 
     */
    public double getFreeValue() {
        return freeValue;
    }

    /**
     * Sets the value of the freeValue property.
     * 
     */
    public void setFreeValue(double value) {
        this.freeValue = value;
    }

    /**
     * Gets the value of the planCharge property.
     * 
     */
    public double getPlanCharge() {
        return planCharge;
    }

    /**
     * Sets the value of the planCharge property.
     * 
     */
    public void setPlanCharge(double value) {
        this.planCharge = value;
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
     * Gets the value of the planType property.
     * 
     */
    public long getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     */
    public void setPlanType(long value) {
        this.planType = value;
    }

    /**
     * Gets the value of the rollOverMode property.
     * 
     */
    public long getRollOverMode() {
        return rollOverMode;
    }

    /**
     * Sets the value of the rollOverMode property.
     * 
     */
    public void setRollOverMode(long value) {
        this.rollOverMode = value;
    }

    /**
     * Gets the value of the rollOverValue property.
     * 
     */
    public double getRollOverValue() {
        return rollOverValue;
    }

    /**
     * Sets the value of the rollOverValue property.
     * 
     */
    public void setRollOverValue(double value) {
        this.rollOverValue = value;
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

    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("brandID=").append(getBrandID()).append(", ");
        sb.append("currencyID=").append(getCurrencyID()).append(", ");
        sb.append("description=").append(getDescription()).append(", ");
        sb.append("freeValue=").append(getFreeValue()).append(", ");
        sb.append("planCharge=").append(getPlanCharge()).append(", ");
        sb.append("planID=").append(getPlanID()).append(", ");
        sb.append("planType=").append(getPlanType()).append(", ");
        sb.append("rollOverMode=").append(getRollOverMode()).append(", ");
        sb.append("rollOverValue=").append(getRollOverValue()).append(", ");
        sb.append("settings=").append(getSettings()).append(", ");
        sb.append("intervalType=").append(getIntervalType()).append(", ");
        sb.append("interval=").append(getInterval());

        return sb.toString();
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }
}
