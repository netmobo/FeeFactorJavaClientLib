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
package com.feefactor;

/**
 * @author netmobo
 */
public class ClientConfig {
	private Server server;
    private AuthDetail auth;
    
    public ClientConfig(Server server, AuthDetail auth) {
        super();
        if(server==null){
            server = new Server();
        }
        if(auth==null){
            auth = new RtbeUserAuthDetail();
        }
        
        this.server = server;
        this.auth = auth;
    }

    public String getDigestPassword() {
        return auth.getDigestPassword();
    }

    public String getDigestUsername() {
        return auth.getDigestUsername();
    }

    public int getPort() {
        return server.getPort();
    }

    public String getPrefix() {
        return server.getPrefix();
    }

    public String getUrl() {
        return server.getHost();
    }

    public Server getServer() {
        return server;
    }

    public AuthDetail getAuth() {
        return auth;
    }
    
    public static final ClientConfig DEFAULT;
    static{
        Server server = Server.VOLTAIRE_FF;
        
        BrandAuthDetail ad = new BrandAuthDetail();
        ad.setBrandID(29070);
        ad.setDomain("7thSign");
        DEFAULT= new ClientConfig(server, ad);
    }
    public String getBaseURL() {
        return server.getBaseURL();
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void setAuthenticationDetail(AuthDetail auth) {
        if(auth==null){
            auth = new RtbeUserAuthDetail();
        }
        this.auth = auth;
    }
}
