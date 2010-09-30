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
package com.feefactor.services;

import java.io.Serializable;

/**
 * @author netmobo
 */
public class BrandProduct implements Serializable{

    private static final long serialVersionUID = 1L;
    protected long billingBlock;
    protected String description;
    protected long groupProductID;
    protected boolean isPlan;
    protected double minimumChargeable;
    protected String productCode;
    protected long productID;
    protected long serviceID;
    protected String settings;
    protected boolean useGroupPrice;

    /**
     * Gets the value of the billingBlock property.
     * 
     */
    public long getBillingBlock() {
        return billingBlock;
    }

    /**
     * Sets the value of the billingBlock property.
     * 
     */
    public void setBillingBlock(long value) {
        this.billingBlock = value;
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
     * Gets the value of the groupProductID property.
     * 
     */
    public long getGroupProductID() {
        return groupProductID;
    }

    /**
     * Sets the value of the groupProductID property.
     * 
     */
    public void setGroupProductID(long value) {
        this.groupProductID = value;
    }

    /**
     * Gets the value of the isPlan property.
     * 
     */
    public boolean isIsPlan() {
        return isPlan;
    }

    /**
     * Sets the value of the isPlan property.
     * 
     */
    public void setIsPlan(boolean value) {
        this.isPlan = value;
    }

    /**
     * Gets the value of the minimumChargeable property.
     * 
     */
    public double getMinimumChargeable() {
        return minimumChargeable;
    }

    /**
     * Sets the value of the minimumChargeable property.
     * 
     */
    public void setMinimumChargeable(double value) {
        this.minimumChargeable = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     */
    public long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     */
    public void setProductID(long value) {
        this.productID = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     */
    public long getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     */
    public void setServiceID(long value) {
        this.serviceID = value;
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
     * Gets the value of the useGroupServiceBaserate property.
     * 
     */
    public boolean isUseGroupPrice() {
        return useGroupPrice;
    }

    /**
     * Sets the value of the useGroupServiceBaserate property.
     * 
     */
    public void setUseGroupPrice(boolean value) {
        this.useGroupPrice = value;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("billingBlock=").append(getBillingBlock()).append(", ");
        sb.append("productID=").append(getProductID()).append(", ");
        sb.append("serviceID=").append(getServiceID()).append(", ");
        sb.append("minimumChargeable=").append(getMinimumChargeable()).append(", ");
        sb.append("description=").append(getDescription()).append(", ");
        sb.append("productCode=").append(getProductCode()).append(", ");
        sb.append("settings=").append(getSettings()).append(", ");

        return sb.toString();
    }
}
