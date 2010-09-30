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

import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;

/**
 * @author netmobo
 */
public class SelfSignUp extends ServiceBase{
    private final String basePath = "/signup/Users/";
    public SelfSignUp(ClientConfig config) {
        super(config);
    }

    public long insertUser(
            User user,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, user, others);
    }

    @Override
    public String getNamespace() {
        return "http://subscriber.feefactor.com";
    }

    public List<UserQuestion> getUserQuestions(
            long userID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/question/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        
        return getList(basePath+subPath, UserQuestion.class, whereCondition, sortString, pageItems, pageNumber, others);
    }

    public long getUserQuestionsCount(
            long userID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/question/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        
        return getCount(basePath+subPath, whereCondition, others);
    }

    public User validateUserQuestion(
            long questionID,
            String answer
            )
    throws FeefactorCheckedException{
        String subPath = "/question/validate/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("questionID", String.valueOf(questionID));
        others[1] = new NameValuePair("answer", answer);
        
        return get(basePath+subPath, User.class, others);
    }
}
