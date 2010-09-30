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
public class Server implements Cloneable{
    private String host, prefix, baseURL;
    private int port
    ;
    
    public String getHost() {
        return host;
    }
    public void setHost(String url) {
        this.host = url;
        refreshBaseURL();
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
        refreshBaseURL();
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
        refreshBaseURL();
    }
    
    public static final Server VOLTAIRE_FF = new Server();
    public static final Server VOLTAIRE_TEST = new Server();
    public static final Server FEEFACTOR01_FF = new Server();
    
    static {
        VOLTAIRE_FF.setPort(8085);
        VOLTAIRE_FF.setPrefix("feefactor/rest/");
        VOLTAIRE_FF.setHost("70.42.72.151");
        
        VOLTAIRE_TEST.setPort(12345);
        VOLTAIRE_TEST.setPrefix("feefactor/rest/");
        VOLTAIRE_TEST.setHost("70.42.72.151");
        
        FEEFACTOR01_FF.setPort(5555);
        FEEFACTOR01_FF.setPrefix("feefactor/rest/");
        FEEFACTOR01_FF.setHost("70.42.72.187");
    }

    public String getBaseURL() {
        return baseURL;
    }
    
    private void refreshBaseURL(){
        //TODO: support for https.
        baseURL = "http://" + getHost();
        if(port>0){
            baseURL += ":" + port;
        }
        baseURL += "/" + prefix;
    }
    
    @Override
    public Server clone() throws CloneNotSupportedException {
        Server clone = new Server();
        clone.setHost(getHost());
        clone.setPort(getPort());
        clone.setPrefix(getPrefix());
        
        return clone;
    }
}
