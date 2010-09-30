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

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthPolicy;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public abstract class ServiceBase {
    private static Logger logger = Logger.getLogger(ServiceBase.class.toString());
    private final ClientConfig config;
    public ServiceBase(ClientConfig config){
        this.config = config;
    }
    
    public ClientConfig getConfig() {
        return config;
    }
    
    public abstract String getNamespace();
    
    /**
     * Retrieve a list of the specified object.<br>
     * a.k.a. GetMethod<br>
     * Convenience method for top-level objects, e.g. BrandService, Brand, etc.<br> 
     * @see getList(AuthDetail String targetPath, Class c, String whereCondition, String sortString, long pageNumber, long pageItems, NameValuePair[] others)
     */
    protected <U, T extends List<U>> T getList(String targetPath, Class<U> c, String whereCondition
            , String sortString, long pageItems, long pageNumber) throws FeefactorCheckedException{
        return getList(targetPath, c, whereCondition, sortString, pageItems, pageNumber, null);
    }
    
    /**
     * Retrieve a list of the specified object.<br>
     * a.k.a. GetMethod<br>
     * 
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param c - The expected object type contained in the list. Used for unmarshalling the response.
     * @param whereCondition - The search condition to be used.
     * @param sortString - The sort order to be used.
     * @param pageNumber - The n'th page of retrieval, default of 1.
     * @param pageItems - The number of items per page, min of 1, max of 50, defaults to 10 if invalid.
     * @param others - NameValuePair of Jakarta Commons' HttpClient3.1, may contain the parent record's primary key
     * @return
     */
    protected <U, T extends List<U>> T getList(String targetPath, Class<U> c, String whereCondition
            , String sortString, long pageItems, long pageNumber, NameValuePair[] others) throws FeefactorCheckedException{
        int size = 0;
        if(others!=null){
            size = others.length;
        } else {
            others = new NameValuePair[0];
        }
        
        NameValuePair[] resized = new NameValuePair[size+4];
        for(int i=0; i<size; ++i){
            resized[i] = others[i];
        }
        others = resized;
        others[size+0] = new NameValuePair("whereCondition", whereCondition);
        others[size+1] = new NameValuePair("sortString", sortString);
        others[size+2] = new NameValuePair("pageNumber", String.valueOf(pageNumber));
        others[size+3] = new NameValuePair("pageItems", String.valueOf(pageItems));
        
        String response = get(targetPath, others);
        return XMLUtility.listFromXML(c, response);
    }
    
    /**
     * Retrieve the number of records that would satisfy the given search condition.<br>
     * Convenience method for top-level objects, e.g. BrandService, Brand, etc.<br>
     * @see getCount(String targetPath, String whereCondition, NameValuePair[] others)
     */
    protected long getCount(String targetPath, String whereCondition) throws FeefactorCheckedException{
        return getCount(targetPath, whereCondition, null);
    }
    
    /**
     * Retrieve the number of records that would satisfy the given search condition.<br>
     *  
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param whereCondition - The search condition to be used.
     */
    protected long getCount(String targetPath, String whereCondition, NameValuePair[] others) throws FeefactorCheckedException{
        int size = 0;
        if(others!=null){
            size = others.length;
        } else {
            others = new NameValuePair[0];
        }
        
        NameValuePair[] resized = new NameValuePair[size+1];
        for(int i=0; i<size; ++i){
            resized[i] = others[i];
        }
        others = resized;
        others[size+0] = new NameValuePair("whereCondition", whereCondition);
        
        String response = get(targetPath, others);
        if(isEmpty(response)){
            response = "0";
        }
        response = XMLUtility.basicFromXML(response);
        return new Long(response);
    }
    
    /**
     * The name of the uniqueID is unavailable to this parent class, hence would only support NVP<br>
     * a.k.a. GetMethod<br>
     * 
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param c The expected object type
     * @param others - NameValuePair of Jakarta Commons' HttpClient3.1, may contain the parent record's primary key
     */
    protected <T> T get(String targetPath, Class<T> c, NameValuePair[] others) throws FeefactorCheckedException{
        return XMLUtility.fromXML(c, get(targetPath, others));
    }
    
    protected String get(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        GetMethod method = new GetMethod();
        
        //It would be better to change the signature to List, but it would
        //have greater impact on the rest of the client code.
        List<NameValuePair> tmp = new ArrayList<NameValuePair>();
        if(others!=null) {
            for(NameValuePair nvp : others){
                if(nvp == null || isEmpty(nvp.getName()) || isEmpty(nvp.getValue())){
                    continue;
                }
                tmp.add(nvp);
            }
        }
        
        if(!tmp.isEmpty()){
            method.setQueryString(tmp.toArray(new NameValuePair[tmp.size()]));
        }
        
        return executeMethod(targetPath, method);
    }
    
    /**
     * Create the specified record.<br>
     * a.k.a. PutMethod<br>
     * Convenience method for top-level objects, e.g. BrandService, Brand, etc.<br>
     * @see insert(String targetPath, String namespace, Object o, NameValuePair[] others)
     */ 
    protected long insert(String targetPath, Object o) throws FeefactorCheckedException{
        return insert(targetPath, o, null);
    }
    
    /**
     * Create the specified record.<br>
     * a.k.a. PutMethod<br>
     * Convenience method for mapping records, e.g. UserCardRegistry, CardAccountRegistry, etc.<br>
     * @see insert(String targetPath, Object o, NameValuePair[] others)
     */ 
    protected long insert(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        return insert(targetPath, null, others);
    }
    
    /**
     * Create the specified record.<br>
     * a.k.a. PutMethod<br>
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param namespace - namespace to be used in the xml-representation of the object.
     * @param o - object to be created.
     * @param others - NameValuePair of Jakarta Commons' HttpClient3.1, may contain the parent record's primary key
     * @return
     */
    protected long insert(String targetPath, Object o, NameValuePair[] others) throws FeefactorCheckedException{
        String response = put(targetPath, o, others);
        response = XMLUtility.basicFromXML(response);
        if(isEmpty(response)){
            response = "0";
        }
        return new Long(response);
    }
    
    protected String put(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        return put(targetPath, null, others);
    }
    
    protected String put(String targetPath, Object o) throws FeefactorCheckedException{
        return put(targetPath, o, null);
    }
    
    protected String put(String targetPath, Object o, NameValuePair[] others) throws FeefactorCheckedException{
        PutMethod method = new PutMethod();
        
        if(o!=null){
            try {
                String payload = XMLUtility.toXML(o, o.getClass().getSimpleName(), getNamespace());
                method.setRequestEntity(new StringRequestEntity(payload, "text/xml", "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.severe("Unable to convert object to payload. " + e.getMessage());
            }
        }
        
        //It would be better to change the signature to List, but it would
        //have greater impact on the rest of the client code.
        List<NameValuePair> tmp = new ArrayList<NameValuePair>();
        if(others!=null) {
            for(NameValuePair nvp : others){
                if(nvp == null || isEmpty(nvp.getName()) || isEmpty(nvp.getValue())){
                    continue;
                }
                tmp.add(nvp);
            }
        }
        
        if(!tmp.isEmpty()){
            method.setQueryString(tmp.toArray(new NameValuePair[tmp.size()]));
        }

        return executeMethod(targetPath, method);
    }
    
    /**
     * Record to be updated<br>
     * a.k.a. PostMethod<br>
     * Convenience method for top-level objects, e.g. BrandService, Brand, etc.<br>
     * @see update(String targetPath, Object o, NameValuePair[] others)
     */ 
    protected int update(String targetPath, Object o) throws FeefactorCheckedException{
        return update(targetPath, o, null);
    }
    
    /**
     * Record to be updated<br>
     * a.k.a. PostMethod<br>
     * Convenience method for mapping records, e.g. UserCardRegistry, CardAccountRegistry, etc.<br>
     * @throws FeefactorCheckedException 
     * @see update(String targetPath, Object o, NameValuePair[] others)
     */ 
    protected int update(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        return update(targetPath, null, others);
    }
    
    /**
     * Record to be updated<br>
     * a.k.a. PostMethod<br>
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param namespace - namespace to be used in the xml-representation of the object.
     * @param o - object to be created.
     * @param others - NameValuePair of Jakarta Commons' HttpClient3.1, may contain the parent record's primary key
     * @return
     * @throws FeefactorCheckedException 
     */
    protected int update(String targetPath, Object o, NameValuePair[] others) throws FeefactorCheckedException{
        String response = post(targetPath, o, others);
        response = XMLUtility.basicFromXML(response); 
        if(isEmpty(response)){
            response = "0";
        }
        
        return new Integer(response);
    }
    
    protected String post(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        return post(targetPath, null, others);
    }
    
    protected String post(String targetPath, Object o) throws FeefactorCheckedException{
        return post(targetPath, o, null);
    }
    
    protected String post(String targetPath, Object o, NameValuePair[] others) throws FeefactorCheckedException{
        PostMethod method = new PostMethod();
        
        if(o!=null){
            try {
                String payload = XMLUtility.toXML(o, o.getClass().getSimpleName(), getNamespace());
                method.setRequestEntity(new StringRequestEntity(payload, "text/xml", "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.severe("Unable to convert object to payload. " + e.getMessage());
            }
        }
        
        //It would be better to change the signature to List, but it would
        //have greater impact on the rest of the client code.
        List<NameValuePair> tmp = new ArrayList<NameValuePair>();
        if(others!=null) {
            for(NameValuePair nvp : others){
                if(nvp==null || isEmpty(nvp.getName()) || isEmpty(nvp.getValue())){
                    continue;
                }
                tmp.add(nvp);
            }
        }
        
        if(!tmp.isEmpty()){
            method.setQueryString(tmp.toArray(new NameValuePair[tmp.size()]));
        }
        
        return executeMethod(targetPath, method);
    }
    
    /**
     * The name of the uniqueID is unavailable to this parent class, hence would only support NVP<br>
     * Record to be deleted<br>
     * a.k.a. DeleteMethod<br>
     * @param auth - Authentication details to be used for this transaction.
     * @param targetPath - The target URL to send the request to.
     * @param others - NameValuePair of Jakarta Commons' HttpClient3.1, may contain the record's primary key
     * @return
     * @throws FeefactorCheckedException 
     */
    protected int delete(String targetPath, NameValuePair[] others) throws FeefactorCheckedException{
        DeleteMethod method = new DeleteMethod();

        //It would be better to change the signature to List, but it would
        //have greater impact on the rest of the client code.
        List<NameValuePair> tmp = new ArrayList<NameValuePair>();
        if(others!=null) {
            for(NameValuePair nvp : others){
                if(nvp == null || isEmpty(nvp.getName()) || isEmpty(nvp.getValue())){
                    continue;
                }
                tmp.add(nvp);
            }
        }
        
        if(!tmp.isEmpty()){
            method.setQueryString(tmp.toArray(new NameValuePair[tmp.size()]));
        }
        
        String response = executeMethod(targetPath, method);
        response = XMLUtility.basicFromXML(response);
        if(isEmpty(response)) {
            response = "0";
        }
        return new Integer(response);
    }
    
    protected String executeMethod(String targetPath, HttpMethod method) throws FeefactorCheckedException {
        HttpClient client = new HttpClient();
        client.getState().setCredentials(
                new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
                new UsernamePasswordCredentials(getConfig().getDigestUsername(), getConfig().getDigestPassword()));
        
        List<String> authPrefs = new ArrayList<String>();
        authPrefs.add(AuthPolicy.DIGEST);
        client.getParams().setParameter(AuthPolicy.AUTH_SCHEME_PRIORITY,authPrefs);
        
        method.setDoAuthentication(true);
        String finalPath = getConfig().getBaseURL()+targetPath;
        finalPath = finalPath.replaceAll("//", "/");
        finalPath = finalPath.replaceAll(":/", "://");
        method.setPath(finalPath);
        String response = "";
        try {
            //TODO: handle result 302
            int result = client.executeMethod(method);
            response = readResponse(method);
            processResult(result, response);
        } catch (FeefactorCheckedException fce) {
            throw fce;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(),e);
        }
        return response;
    }
    
    private void processResult(int result, String response) throws FeefactorCheckedException{
        switch (result) {
            case 200:
                return;
            case 401:
                FeefactorCheckedException ffc = new FeefactorCheckedException();
                ffc.setErrorcode(401);
                ffc.setMessage("Failed to authenticate.");
                throw ffc;
            case 500:
                throw XMLUtility.fromXML(FeefactorFault.class, response);
            case 400:
                throw XMLUtility.fromXML(FeefactorCheckedException.class, response);
            default:
                FeefactorFault fault = new FeefactorFault();
                fault.setErrorcode(result);
                fault.setMessage("Unknown error encountered.");
                throw fault;
        }
    }
    
    protected boolean isEmpty(String input) {
        return input==null || input.length()<1;
    }
    
    private static int length = 2048;//2KBit
    private static byte[] buffer = new byte[length];
    
    private String readResponse(HttpMethod method) throws IOException {
        InputStream is = method.getResponseBodyAsStream();
        StringBuffer sb = new StringBuffer();
        int readResult = 0;
        int offset = 0;
        do {
            try {
                readResult = is.read(buffer, 0, length);
                String temp = new String(buffer);
                sb.append(temp.substring(0, readResult));
                offset += readResult;
            } catch (Exception e) {
                readResult = -1;
            }
        } while (readResult > 0);
        return sb.toString();
    }
    
    public static Calendar convertMmddyyyyToCalendar(String data){
        //MM/dd/yyyy
        String[] parts = data.split("[/-]");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, new Integer(parts[0])-1);
        cal.set(Calendar.DAY_OF_MONTH, new Integer(parts[1]));
        cal.set(Calendar.YEAR, new Integer(parts[2]));
        return cal;
    }
    
    public static String convertCalendarToMmddyyyy(Calendar cal){
        //MM/dd/yyyy
        StringBuffer sb = new StringBuffer();
        sb.append(cal.get(Calendar.MONTH)+1).append("/");
        sb.append(cal.get(Calendar.DAY_OF_MONTH)).append("/");
        sb.append(cal.get(Calendar.YEAR));
        return sb.toString();
    }

}
