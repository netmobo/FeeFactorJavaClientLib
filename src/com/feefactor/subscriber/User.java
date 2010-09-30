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
package com.feefactor.subscriber;

import java.io.Serializable;
import java.util.Calendar;

import com.feefactor.ServiceBase;

/**
 * @author netmobo
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String billingEmailAddress;
    protected String billingSchedule;
    protected long brandID;
    protected boolean changePassword;
    protected Calendar expiration;
    protected String lastAddress;
    protected Calendar lastLogIn;
    protected String password;
    protected String preferences;
    protected long profileID;
    protected String settings;
    protected long userID;
    protected String username;

    /**
     * Gets the value of the billingEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmailAddress() {
        return billingEmailAddress;
    }

    /**
     * Sets the value of the billingEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmailAddress(String value) {
        this.billingEmailAddress = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSchedule(String value) {
        this.billingSchedule = value;
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
     * Gets the value of the changePassword property.
     * 
     */
    public boolean isChangePassword() {
        return changePassword;
    }

    /**
     * Sets the value of the changePassword property.
     * 
     */
    public void setChangePassword(boolean value) {
        this.changePassword = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(Calendar value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the lastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAddress() {
        return lastAddress;
    }

    /**
     * Sets the value of the lastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAddress(String value) {
        this.lastAddress = value;
    }

    /**
     * Gets the value of the lastLogIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastLogIn() {
        return lastLogIn;
    }

    /**
     * Sets the value of the lastLogIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLogIn(Calendar value) {
        this.lastLogIn = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferences(String value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     */
    public long getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     */
    public void setProfileID(long value) {
        this.profileID = value;
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer("::");
        sb.append("userID=").append(getUserID()).append(", ");
        sb.append("profileID=").append(getProfileID()).append(", ");
        sb.append("expiration=").append(ServiceBase.convertCalendarToMmddyyyy(getExpiration())).append(", ");
        sb.append("lastAddress=").append(getLastAddress()).append(", ");
        sb.append("lastLogIn=").append(getLastLogIn()).append(", ");
        sb.append("password=").append(getPassword()).append(", ");
        sb.append("preferences=").append(getPreferences()).append(", ");
        sb.append("settings=").append(getSettings()).append(", ");
        sb.append("username=").append(getUsername()).append(", ");
        sb.append("brandID=").append(getBrandID()).append(", ");
        sb.append("billingEmailAddress=").append(getBillingEmailAddress()).append(", ");
        sb.append("billingSchedule=").append(getBillingSchedule()).append(", ");

        return sb.toString();
    }
}
