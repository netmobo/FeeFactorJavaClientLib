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

/**
 * @author netmobo
 */
public class Plans extends ServiceBase{
    private final String basePath = "/Plans";
    public Plans(ClientConfig config) {
        super(config);
    }

    public int deletePlan(
            long planID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("planID", String.valueOf(planID));
        others[1] = new NameValuePair("reason", reason);
        
        return delete(basePath+subPath, others);
	}
    
    public Plan getPlan(
            long planID)
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("planID", String.valueOf(planID));
        return get(basePath+subPath, Plan.class, others);
	}

    public List<Plan> getPlans(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search/";
        return getList(basePath+subPath, Plan.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getPlansCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertPlan(
            Plan plan,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        return insert(basePath+subPath, plan);
	}

    public int updatePlan(
            Plan plan,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        return update(basePath+subPath, plan);
	}
    
    public int deletePlanRC(
            long planRCID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("planRCID", String.valueOf(planRCID));
        others[1] = new NameValuePair("reason", reason);
        return delete(basePath+subPath, others);
	}

    public PlanRC getPlanRC(
            long planRcID)
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("planRcID", String.valueOf(planRcID));
        return get(basePath+subPath, PlanRC.class, others);
	}

    public List<PlanRC> getPlanRCs(
            long planID, 
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("planID",String.valueOf(planID));
        
        return getList(basePath+subPath, PlanRC.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getPlanRCsCount(
            long planID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("planID",String.valueOf(planID));
        
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertPlanRC(
            PlanRC planrc,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        
        return insert(basePath+subPath, planrc, others);
	}
    
    public int updatePlanRC(
            PlanRC planrc,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/recurringCharges/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", reason);
        
        return update(basePath+subPath, planrc, others);
	}

    @Override
    public String getNamespace() {
        return "http://accounts.feefactor.com";
    }
}
