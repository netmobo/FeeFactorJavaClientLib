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
package com.feefactor.services;

import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;

/**
 * @author netmobo
 */
public class BrandServices extends ServiceBase{
    private final String basePath = "/Services/Brand";
    public BrandServices(ClientConfig config) {
        super(config);
    }

    public int deleteBrandService(
            long serviceID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serviceID", String.valueOf(serviceID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}

    public BrandService getBrandService(
            long serviceID)
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serviceID", String.valueOf(serviceID));

        return get(basePath+subPath, BrandService.class, others);
	}

    public List<BrandService> getBrandServices(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search/";

        return getList(basePath+subPath, BrandService.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getBrandServicesCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count/";
        
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertBrandService(
            BrandService brandService,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, brandService, others);
	}

    public int updateBrandService(
            BrandService brandService,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, brandService, others);
	}

    public int deleteBrandProduct(
            long productID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public BrandProduct getBrandProduct(
            long productID)
    throws FeefactorCheckedException{
        String subPath = "/product/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        return get(basePath+subPath, BrandProduct.class, others);
	}

    public List<BrandProduct> getBrandProducts(
            long serviceID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/product/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serviceID", String.valueOf(serviceID));
        return getList(basePath+subPath, BrandProduct.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getBrandProductsCount(
            long serviceID, 
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/product/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serviceID", String.valueOf(serviceID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertBrandProduct(
            BrandProduct brandProduct,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, brandProduct, others);
	}

    public int updateBrandProduct(
            BrandProduct brandProduct,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, brandProduct, others);
	}

    public int deleteBrandProductSchedule(
            long scheduleID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("scheduleID", String.valueOf(scheduleID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public BrandProductSchedule getBrandProductSchedule(
            long scheduleID)
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("scheduleID", String.valueOf(scheduleID));
        return get(basePath+subPath, BrandProductSchedule.class, others);
	}

    public List<BrandProductSchedule> getBrandProductSchedules(
            long productID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        return getList(basePath+subPath, BrandProductSchedule.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getBrandProductSchedulesCount(
            long productID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertBrandProductSchedule(
            BrandProductSchedule brandProductSchedule,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, brandProductSchedule, others);
	}
    
    public int updateBrandProductSchedule(
            BrandProductSchedule brandProductSchedule,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/schedule/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, brandProductSchedule, others);
	}

    public int deleteBrandProductPrice(
            long priceID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("priceID", String.valueOf(priceID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public BrandProductPrice getBrandProductPrice(
            long priceID)
    throws FeefactorCheckedException{
        String subPath = "/product/prices/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("priceID", String.valueOf(priceID));
        return get(basePath+subPath, BrandProductPrice.class, others);
	}

    public List<BrandProductPrice> getBrandProductPrices(
            long productID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        return getList(basePath+subPath, BrandProductPrice.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getBrandProductPricesCount(
            long productID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertBrandProductPrice(
            BrandProductPrice brandProductPrice,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, brandProductPrice, others);
	}

    public int updateBrandProductPrice(
            BrandProductPrice brandProductPrice,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, brandProductPrice, others);
	}

    public int deleteChargeTypeOperation(
            long chargeTypeOperationID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("chargeTypeOperationID", String.valueOf(chargeTypeOperationID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public ChargeTypeOperation getChargeTypeOperation(
            long chargeTypeOperationID)
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("chargeTypeOperationID", String.valueOf(chargeTypeOperationID));
        return get(basePath+subPath, ChargeTypeOperation.class, others);
	}

    public List<ChargeTypeOperation> getChargeTypeOperations(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/search/";
        return getList(basePath+subPath, ChargeTypeOperation.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getChargeTypeOperationsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertChargeTypeOperation(
            ChargeTypeOperation chargeTypeOperation,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, chargeTypeOperation, others);
	}

    public int updateChargeTypeOperation(
            ChargeTypeOperation chargeTypeOperation,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/chargeTypeOperation/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, chargeTypeOperation, others);
	}

    public int deleteBrandProductPlanPrice(
            long priceID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("priceID", String.valueOf(priceID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}

    public BrandProductPlanPrice getBrandProductPlanPrice(
            long priceID)
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("priceID", String.valueOf(priceID));
        return get(basePath+subPath, BrandProductPlanPrice.class, others);
	}

    public List<BrandProductPlanPrice> getBrandProductPlanPrices(
            long productID,
            long planID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/search/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        others[1] = new NameValuePair("planID", String.valueOf(planID));
        return getList(basePath+subPath, BrandProductPlanPrice.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getBrandProductPlanPricesCount(
            long productID,
            long planID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/count/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("productID", String.valueOf(productID));
        others[1] = new NameValuePair("planID", String.valueOf(planID));
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertBrandProductPlanPrice(
            BrandProductPlanPrice brandProductPlanPrice,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, brandProductPlanPrice, others);
	}

    public int updateBrandProductPlanPrice(
            BrandProductPlanPrice brandProductPlanPrice,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/product/prices/plan/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, brandProductPlanPrice, others);
	}

    @Override
    public String getNamespace() {
        return "http://services.feefactor.com";
    }

}
