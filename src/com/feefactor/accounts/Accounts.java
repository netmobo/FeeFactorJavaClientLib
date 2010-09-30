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
package com.feefactor.accounts;

import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;
import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public class Accounts extends ServiceBase{
    public static final int MODE_SIMPLE = 1;
    public static final int MODE_PARTIAL = 2;
    public static final int MODE_FULL = 3;
    
    private final String basePath = "/Accounts";
    public Accounts(ClientConfig config) {
        super(config);
    }
    
    public int deleteAccount(
            long serialNumber,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", ""+serialNumber);
        others[1] = new NameValuePair("reason", reason);
        
        return delete(basePath+subPath, others);
	}

    public Account getAccount(
            long serialNumber)
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", ""+serialNumber);
        
        return get(basePath+subPath, Account.class, others);
	}

    public List<Account> getAccounts(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search/";
        return getList(basePath+subPath, Account.class, whereCondition, sortString, pageItems, pageNumber);
	}
    
    public long getAccountsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count/";
        return getCount(basePath+subPath, whereCondition);
	}
    

    public long insertAccount(
            Account account,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        return insert(basePath+subPath, account, others);
	}
    
    public long generateAccounts(
            Account account,
            long quantity,
            boolean allCaps,
            String accountIDPattern,
            boolean notifyAdmin,
            boolean notifyUser,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/generate/";
        NameValuePair[] others = new NameValuePair[6];
        others[0] = new NameValuePair("quantity", String.valueOf(quantity));
        others[1] = new NameValuePair("allCaps", String.valueOf(allCaps));
        others[2] = new NameValuePair("accountIDPattern", accountIDPattern);
        others[3] = new NameValuePair("notifyAdmin", String.valueOf(notifyAdmin));
        others[4] = new NameValuePair("notifyUser", String.valueOf(notifyUser));
        others[5] = new NameValuePair("reason", reason);
        return insert(basePath+subPath, account, others);
	}
    
    public int updateAccount(
            Account account,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        return update(basePath+subPath, account, others);
	}
    
    public List<AccountHistory> getAccountHistories(
            long serialNumber, 
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/history/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getList(basePath+subPath, AccountHistory.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountHistoriesCount(
            long serialNumber, 
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/history/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getCount(basePath+subPath, whereCondition, others);
	}
    
    public List<AccountPlanHistory> getAccountPlanHistories(
            long serialNumber,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/plan/history/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getList(basePath+subPath, AccountPlanHistory.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountPlanHistoriesCount(
            long serialNumber, 
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/plan/history/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getCount(basePath+subPath, whereCondition, others);
	}
    
    public List<AccountPlan> getAccountPlans(
            long serialNumber,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/plan/schedule/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getList(basePath+subPath, AccountPlan.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountPlansCount(
            long serialNumber,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/plan/schedule/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long scheduleSubscription(
            AccountPlan ap,
            int mode, 
            boolean retainEffectivityDate, 
            boolean retainEndDate, 
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/plan/schedule/";
        NameValuePair[] others = new NameValuePair[5];
        others[0] = new NameValuePair("reason", reason);
        others[1] = new NameValuePair("mode", reason);
        others[2] = new NameValuePair("retainEffectivityDate", reason);
        others[3] = new NameValuePair("retainEndDate", reason);
        others[4] = new NameValuePair("reason", reason);
        return insert(basePath+subPath, ap, others);
	}
    
    public long adjustPlanBalance(
            long serialNumber,
            double amount,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/plan/balance/adjust";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("reason", reason);
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("amount", String.valueOf(amount));
        return update(basePath+subPath, others);
	}
    
    public int refreshAccount(
            long serialNumber, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/refresh/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("reason", reason);
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        return update(basePath+subPath, others);
	}
    
    public int rechargeAccountViaTransient(
            long targetSerialNumber, 
            long sourceSerialNumber, 
            double amount, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recharge/transient/";
        NameValuePair[] others = new NameValuePair[4];
        others[0] = new NameValuePair("reason", reason);
        others[1] = new NameValuePair("targetSerialNumber", String.valueOf(targetSerialNumber));
        others[2] = new NameValuePair("sourceSerialNumber", String.valueOf(sourceSerialNumber));
        others[3] = new NameValuePair("amount", String.valueOf(amount));
        return new Long(insert(basePath+subPath, others)).intValue();
	}
    
    public int unregisterANI(
            AniAccount ani, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/ani/";
        NameValuePair[] others = new NameValuePair[4];
        others[0] = new NameValuePair("reason", reason);
        others[1] = new NameValuePair("serialNumber", String.valueOf(ani.getSerialNumber()));
        others[2] = new NameValuePair("ani", String.valueOf(ani.getAni()));
        others[3] = new NameValuePair("brandServiceID", String.valueOf(ani.getBrandServiceID()));
        return delete(basePath+subPath, others);
	}
    
    public long registerANI(
            AniAccount ani, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/ani/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        String result = put(basePath+subPath, ani, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    public List<AniAccount> getRegisteredANIs(
            long serialNumber, 
            long brandServiceID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/ani/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("brandServiceID", String.valueOf(brandServiceID));
        return getList(basePath+subPath, AniAccount.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getRegisteredANIsCount(
            long serialNumber, 
            long brandServiceID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/ani/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("brandServiceID", String.valueOf(brandServiceID));
        return getCount(basePath+subPath, whereCondition, others);
	}
    
    public int rechargeAccountManual(
            long serialNumber, 
            double amount, 
            String referenceID,
            String transactionType,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recharge/manual/";
        NameValuePair[] others = new NameValuePair[5];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("amount", String.valueOf(amount));
        others[2] = new NameValuePair("referenceID", String.valueOf(referenceID));
        others[3] = new NameValuePair("transactionType", String.valueOf(transactionType));
        others[4] = new NameValuePair("reason", String.valueOf(reason));
        
        return new Long(insert(basePath+subPath, others)).intValue();
	}
    
    public int deleteAccountRC(
            long accountRCID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public AccountRC getAccountRC(
            long accountRCID)
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        return get(basePath+subPath, AccountRC.class, others);
	}

    public List<AccountRC> getAccountRCs(
            long brandID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        return getList(basePath+subPath, AccountRC.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountRCsCount(
            long brandID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertAccountRC(
            AccountRC arc,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, arc, others);
	}

    public int updateAccountRC(
            AccountRC arc,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, arc, others);
	}
    
    public int deleteAccountRCSetting(
            long accountRCID,
            String key,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/setting/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        others[1] = new NameValuePair("key", String.valueOf(key));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}
    
    public List<AccountRCSetting> getAccountRCSettings(
            long accountRCID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/setting/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        return getList(basePath+subPath, AccountRCSetting.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountRCSettingsCount(
            long accountRCID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/setting/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertAccountRCSetting(
            AccountRCSetting arc,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/setting/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, arc, others);
	}
    
    public int updateAccountRCSetting(
            AccountRCSetting arc,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/setting/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, arc, others);
	}
    
    public AccountRCActivityLog getAccountRCActivityLog(
            long accountRCActivityLogID)
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/history/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCActivityLogID", String.valueOf(accountRCActivityLogID));
        return get(basePath+subPath, AccountRCActivityLog.class, others);
	}

    public List<AccountRCActivityLog> getAccountRCActivityLogs(
            long accountRCID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/history/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        return getList(basePath+subPath, AccountRCActivityLog.class, whereCondition, sortString, pageItems, pageNumber, others);
	}
    
    public long getAccountRCActivityLogsCount(
            long accountRCID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/history/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("accountRCID", String.valueOf(accountRCID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long forceApplyMissedAccountRCActivityLog(
            long accountRCActivityLogID, 
            String reason
            ) throws FeefactorCheckedException{
        String subPath = "/recurringCharges/history/recover/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("accountRCActivityLogID", String.valueOf(accountRCActivityLogID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, null, others);
	}

    @Override
    public String getNamespace() {
        return "http://accounts.feefactor.com";
    }

    public List<AccountDevice> getRegisteredDevices(
            long serialNumber, 
            long brandServiceID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/devices/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("brandServiceID", String.valueOf(brandServiceID));
        return getList(basePath+subPath, AccountDevice.class, whereCondition, sortString, pageItems, pageNumber, others);
    }

    public long getRegisteredDevicesCount(
            long serialNumber, 
            long brandServiceID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/devices/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("brandServiceID", String.valueOf(brandServiceID));
        return getCount(basePath+subPath, whereCondition, others);
    }

    public long registerDevice(
            AccountDevice device, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/devices/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        String result = put(basePath+subPath, device, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
    }

    public int unregisterDevice(
            AccountDevice device, 
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/devices/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        return update(basePath+subPath, device, others);
    }
}
