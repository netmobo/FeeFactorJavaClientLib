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
public class BrandService implements Serializable{
    private static final long serialVersionUID = 1L;
    protected long brandID;
    protected String configInfo;
    protected long currencyID;
    protected String description;
    protected String description2;
    protected long groupServiceID;
    protected double maxTransactionQuantity;
    protected String preference;
    protected long serviceID;
    protected String serviceName;

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
     * Gets the value of the configInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigInfo() {
        return configInfo;
    }

    /**
     * Sets the value of the configInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigInfo(String value) {
        this.configInfo = value;
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
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the groupServiceID property.
     * 
     */
    public long getGroupServiceID() {
        return groupServiceID;
    }

    /**
     * Sets the value of the groupServiceID property.
     * 
     */
    public void setGroupServiceID(long value) {
        this.groupServiceID = value;
    }

    /**
     * Gets the value of the maxTransactionQuantity property.
     * 
     */
    public double getMaxTransactionQuantity() {
        return maxTransactionQuantity;
    }

    /**
     * Sets the value of the maxTransactionQuantity property.
     * 
     */
    public void setMaxTransactionQuantity(double value) {
        this.maxTransactionQuantity = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreference(String value) {
        this.preference = value;
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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("brandID=").append(getBrandID()).append(", ");
        sb.append("serviceID=").append(getServiceID()).append(", ");
        sb.append("currencyID=").append(getCurrencyID()).append(", ");
        sb.append("maxTransactionQuantity=").append(getMaxTransactionQuantity()).append(", ");
        sb.append("serviceName=").append(getServiceName()).append(", ");
        sb.append("configInfo=").append(getConfigInfo()).append(", ");
        sb.append("description=").append(getDescription()).append(", ");

        return sb.toString();
    }
}
