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
package com.feefactor.charging;

import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;
import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public class Transactions extends ServiceBase{
    private final String basePath = "/Transactions";
    
    public Transactions(ClientConfig config) {
        super(config);
    }

    public String chargeAccount(
            long brandID,
            String accountID,
            String serviceName,
            String productCode,
            long quantity,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/single/account/";
        NameValuePair[] others = new NameValuePair[6];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", accountID);
        others[2] = new NameValuePair("serviceName", serviceName);
        others[3] = new NameValuePair("product", productCode);
        others[4] = new NameValuePair("quantity", String.valueOf(quantity));
        others[5] = new NameValuePair("reason", reason);
        
        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        return response;
	}
    
    public String startChargingAccount(
            long brandID,
            String accountID,
            String serviceName,
            String productCode,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/start/account/";
        NameValuePair[] others = new NameValuePair[5];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", accountID);
        others[2] = new NameValuePair("serviceName", serviceName);
        others[3] = new NameValuePair("productCode", productCode);
        others[4] = new NameValuePair("reason", reason);
        
        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        return response;
	}
    
    public String chargeUser(
            long brandID,
            String username,
            String password,
            String serviceName,
            String productCode,
            long quantity,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/single/user/";
        NameValuePair[] others = new NameValuePair[7];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", username);
        others[2] = new NameValuePair("password", password);
        others[3] = new NameValuePair("serviceName", serviceName);
        others[4] = new NameValuePair("productCode", productCode);
        others[5] = new NameValuePair("quantity", String.valueOf(quantity));
        others[6] = new NameValuePair("reason", reason);
        
        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        return response;
	}
    
    public String startChargingUser(
            long brandID,
            String username,
            String password,
            String serviceName,
            String productCode,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/start/user/";
        NameValuePair[] others = new NameValuePair[6];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", username);
        others[2] = new NameValuePair("password", password);
        others[3] = new NameValuePair("serviceName", serviceName);
        others[4] = new NameValuePair("productCode", productCode);
        others[5] = new NameValuePair("reason", reason);
        
        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        return response;
	}
    
    public String endCharging(
            String sessionID,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/end/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("sessionID", String.valueOf(sessionID));
        others[5] = new NameValuePair("reason", reason);

        String result = put(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        return result;
	}
    
    public boolean checkIfRunning(
            String sessionID
    )
    throws FeefactorCheckedException{
        String subPath = "/check/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("sessionID", String.valueOf(sessionID));
        String result = get(basePath+subPath, others);
        try {
            return Boolean.parseBoolean(result);
        } catch (Exception e){
            return false;
        }
	}
    
    public TransactionDetailRecord getTransactionDetailRecord(
            long transactionDetailRecordID)
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("transactionDetailRecordID", String.valueOf(transactionDetailRecordID));
        return get(basePath+subPath, TransactionDetailRecord.class, others);
	}
    
    public List<TransactionDetailRecord> getTransactionDetailRecords(
            long brandID,
            String accountID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getList(basePath+subPath, TransactionDetailRecord.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getTransactionDetailRecordsCount(
            long brandID,
            String accountID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public TransactionDetailRecord getSwitchLog(
            long transactionDetailRecordID)
    throws FeefactorCheckedException{
        String subPath = "/SwitchLogs";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("transactionDetailRecordID", String.valueOf(transactionDetailRecordID));
        return get(basePath+subPath, TransactionDetailRecord.class, others);
	}
    
    public List<TransactionDetailRecord> getSwitchLogs(
            long brandID,
            String accountID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/SwitchLogs/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getList(basePath+subPath, TransactionDetailRecord.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getSwitchLogsCount(
            long brandID,
            String accountID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/SwitchLogs/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public List<TransactionDetailRecord> getRawSwitchLogs(
            long brandID,
            String accountID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/Raw/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getList(basePath+subPath, TransactionDetailRecord.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getRawSwitchLogsCount(
            long brandID,
            String accountID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/Raw/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("accountID", String.valueOf(accountID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long reverseTransactionDetailRecord(
            long transactionDetailRecordID, 
            String reason
            ) throws FeefactorCheckedException{
        String subPath = "/reverse/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("transactionDetailRecordID", String.valueOf(transactionDetailRecordID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        try {
            return new Long(response);
        } catch (Exception e){
            return 0;
        }
	}
    
    public long adjustTransactionDetailRecord(
            long transactionDetailRecordID, 
            long newQuantity, 
            double newCharge, 
            String reason
            ) throws FeefactorCheckedException{
        String subPath = "/adjust/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("transactionDetailRecordID", String.valueOf(transactionDetailRecordID));
        others[1] = new NameValuePair("newQuantity", String.valueOf(newQuantity));
        others[2] = new NameValuePair("newCharge", String.valueOf(newCharge));
        others[3] = new NameValuePair("reason", String.valueOf(reason));

        String response = post(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        try {
            return new Long(response);
        } catch (Exception e){
            return 0;
        }
	}

    @Override
    public String getNamespace() {
        return "http://charging.feefactor.com";
    }
}
