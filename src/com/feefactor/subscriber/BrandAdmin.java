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

import java.util.Calendar;

/**
 * @author netmobo
 */
public class BrandAdmin extends User{
    private static final long serialVersionUID = 1L;
    private long brandID;
    private long adminID;
    private boolean allowAllIps;
    private String applications;
    private boolean changePassword;
    private String lastAddress;
    private Calendar lastLogIn;
    private String oldPassword;
    private String password;
    private long profileID;
    private String secrets;
    private String username;
    private String preferences;
    private String settings;
    private Calendar expiration;
    private long roleID;
    private boolean isAgent;
    private String a1Password;
    
    public long getBrandID() {
        return brandID;
    }
    public void setBrandID(long brandID) {
        this.brandID = brandID;
    }
    public long getAdminID() {
        return adminID;
    }
    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }
    public boolean getAllowAllIps() {
        return allowAllIps;
    }
    public void setAllowAllIps(boolean allowAllIps) {
        this.allowAllIps = allowAllIps;
    }
    public String getApplications() {
        return applications;
    }
    public void setApplications(String applications) {
        this.applications = applications;
    }
    public boolean getChangePassword() {
        return changePassword;
    }
    public void setChangePassword(boolean changePassword) {
        this.changePassword = changePassword;
    }
    public String getLastAddress() {
        return lastAddress;
    }
    public void setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
    }
    public Calendar getLastLogIn() {
        return lastLogIn;
    }
    public void setLastLogIn(Calendar lastLogIn) {
        this.lastLogIn = lastLogIn;
    }
    public String getOldPassword() {
        return oldPassword;
    }
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getProfileID() {
        return profileID;
    }
    public void setProfileID(long profileID) {
        this.profileID = profileID;
    }
    public String getSecrets() {
        return secrets;
    }
    public void setSecrets(String secrets) {
        this.secrets = secrets;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPreferences() {
        return preferences;
    }
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    public String getSettings() {
        return settings;
    }
    public void setSettings(String settings) {
        this.settings = settings;
    }
    public Calendar getExpiration() {
        return expiration;
    }
    public void setExpiration(Calendar expiration) {
        this.expiration = expiration;
    }
    public long getRoleID() {
        return roleID;
    }
    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }
    public boolean getIsAgent() {
        return isAgent;
    }
    public void setIsAgent(boolean isAgent) {
        this.isAgent = isAgent;
    }
    public String getA1Password() {
        return a1Password;
    }
    public void setA1Password(String a1Password) {
        this.a1Password = a1Password;
    }
}
