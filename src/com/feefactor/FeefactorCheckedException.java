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
public class FeefactorCheckedException extends Exception{
    public FeefactorCheckedException() {
    }
    private static final long serialVersionUID = 1L;
    private long errorcode;
    private String message;
    private String traceNumber;
    
    public long getErrorcode() {
        return errorcode;
    }
    public void setErrorcode(long errorcode) {
        this.errorcode = errorcode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getTraceNumber() {
        return traceNumber;
    }
    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }
    
    @Override
    public String getLocalizedMessage() {
        return "["+errorcode+"]"+message;
    }
}
