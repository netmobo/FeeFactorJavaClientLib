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

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.Image;
import com.feefactor.ServiceBase;
import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public class Users extends ServiceBase{
    private static Logger logger = Logger.getLogger(ServiceBase.class.toString());
    private final String basePath = "/Users";
    public Users(ClientConfig config) {
        super(config);
    }

	public int deleteUser(
	        long userID,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}

	public User getUser(
	        long userID) 
    throws FeefactorCheckedException{
	    String subPath = "/";
	    NameValuePair[] others = new NameValuePair[1];
	    others[0] = new NameValuePair("userID", String.valueOf(userID));
	    
	    return get(basePath+subPath, User.class, others);
	}
    
    public List<User> getUsers(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search";
        
        return getList(basePath+subPath, User.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getUsersCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count";
        
        return getCount(basePath+subPath, whereCondition);
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

	public int updateUser(
	        User user,
            String reason
            ) 
    throws FeefactorCheckedException{
	    String subPath = "/";
	    NameValuePair[] others = new NameValuePair[1];
	    others[0] = new NameValuePair("reason", String.valueOf(reason));
	    
	    return update(basePath+subPath, user, others);
	}
	
	public Profile getProfile(
	        long userID) 
    throws FeefactorCheckedException{
	    String subPath = "/profile/";
	    NameValuePair[] others = new NameValuePair[1];
	    others[0] = new NameValuePair("userID", String.valueOf(userID));
	    
	    return get(basePath+subPath, Profile.class, others);
	}
	
	public int updateProfile(
	        long userID, 
	        Profile profile,
            String reason
            ) 
    throws FeefactorCheckedException{
	    String subPath = "/profile/";
	    NameValuePair[] others = new NameValuePair[2];
	    others[0] = new NameValuePair("userID", String.valueOf(userID));
	    others[1] = new NameValuePair("reason", String.valueOf(reason));
	    
	    return update(basePath+subPath, Profile.class, others);
	}
    
    public int deleteUserQuestion(
            long userQuestionID,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/question/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("userQuestionID", String.valueOf(userQuestionID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return update(basePath+subPath, Profile.class, others);
	}

    public UserQuestion getUserQuestion(
            long userQuestionID) 
    throws FeefactorCheckedException{
        String subPath = "/question/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("userQuestionID", String.valueOf(userQuestionID));
        
        return get(basePath+subPath, UserQuestion.class, others);
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

    public long insertUserQuestion(
            UserQuestion userQuestion,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/question/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, userQuestion, others);
	}

    public int updateUserQuestion(
            UserQuestion userQuestion,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/question/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return update(basePath+subPath, userQuestion, others);
	}
    
    public Image getVerifiedId(
            long userID) 
    throws FeefactorCheckedException{
        String subPath = "/profile/verifiedId/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        
        return get(basePath+subPath, Image.class, others);
	}
    
    public int updateVerifiedId(
            long userID,
            Image image, 
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/verifiedId/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return updateImage(basePath+subPath, image, others);
	}
    
    public Image getAvatar(
            long userID) 
    throws FeefactorCheckedException{
        String subPath = "/profile/avatar/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        
        return get(basePath+subPath, Image.class, others);
	}
    
    public int updateAvatar(
            long userID,
            Image image, 
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/avatar/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("userID", String.valueOf(userID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return updateImage(basePath+subPath, image, others);
	}

    @Override
    public String getNamespace() {
        return "http://subscriber.feefactor.com";
    }

    //TODO: this should not be needed. rework design.
    protected int updateImage(String targetPath, Object o, NameValuePair[] others) throws FeefactorCheckedException{
        PostMethod method = new PostMethod();
        
        if(o!=null){
            try {
                String payload = XMLUtility.toXML(o, o.getClass().getSimpleName(), "http://feefactor.com");
                method.setRequestEntity(new StringRequestEntity(payload, "text/xml", "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.severe("Unable to convert object to payload. " + e.getMessage());
            }
        }
        
        if(others!=null) {
            method.setQueryString(others);
        }
        
        String response = executeMethod(targetPath, method);
        response = XMLUtility.basicFromXML(response); 
        if(isEmpty(response)){
            response = "0";
        }
      
        return new Integer(response);
    }
}
