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
public class Brands extends ServiceBase{
    private final String basePath = "/Brands";
    
    public Brands(ClientConfig config) {
        super(config);
    }

	public int deleteBrand(
	        long brandID,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}

	public Brand getBrand(
	        long brandID) 
    throws FeefactorCheckedException{
        String subPath = "/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));

        return get(basePath+subPath, Brand.class, others);
	}
    
    public List<Brand> getBrands(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/search/";
        return getList(basePath+subPath, Brand.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getBrandsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/count/";
        return getCount(basePath+subPath, whereCondition);
	}

	public long insertBrand(
	        Brand brand,
            String reason
            ) 
    throws FeefactorCheckedException{
	    String subPath = "/";
	    NameValuePair[] others = new NameValuePair[1];
	    others[0] = new NameValuePair("reason", String.valueOf(reason));
	    
	    return insert(basePath+subPath, brand, others);
	}

	public int updateBrand(
	        Brand brand,
            String reason
            ) 
    throws FeefactorCheckedException{
	    String subPath = "/";
	    NameValuePair[] others = new NameValuePair[1];
	    others[0] = new NameValuePair("reason", String.valueOf(reason));
	    
	    return update(basePath+subPath, brand, others);
	}
    
    public int deleteProfile(
            long brandID,
            long profileID,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("profileID", String.valueOf(profileID));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        
        return delete(basePath+subPath, others);
	}
    
    public Profile getProfile(
            long brandID,
            long profileID
            ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("profileID", String.valueOf(profileID));
        
        return get(basePath+subPath, Profile.class, others);
	}
    
    public List<Profile> getProfiles(
            long brandID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/profile/search/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        
        return getList(basePath+subPath, Profile.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getProfilesCount(
            long brandID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/profile/count/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertProfile(
            long brandID,
            Profile profile,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, profile, others);
	}
    
    public int updateProfile(
            long brandID,
            Profile profile,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/profile/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("brandID", String.valueOf(brandID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return update(basePath+subPath, profile, others);
	}
    
    public int deleteCurrency(
            long currencyID,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return delete(basePath+subPath, others);
	}

    public Currency getCurrency(
            long currencyID) 
    throws FeefactorCheckedException{
        String subPath = "/currency/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        
        return get(basePath+subPath, Currency.class, others);
	}
    
    public List<Currency> getCurrencies(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/currency/search/";
        return getList(basePath+subPath, Currency.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getCurrenciesCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/currency/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertCurrency(
            Currency currency,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, currency, others);
	}

    public int updateCurrency(
            Currency currency,
            String reason
            ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        
        return update(basePath+subPath, currency, others);
	}
    
    public int deleteExchangeRate(
            long currencyID,
            long exchangeRateID,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        others[1] = new NameValuePair("exchangeRateID", String.valueOf(exchangeRateID));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        
        return delete(basePath+subPath, others);
	}
    
    public ExchangeRate getExchangeRate(
            long currencyID,
            long exchangeRateID) 
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        others[1] = new NameValuePair("exchangeRateID", String.valueOf(exchangeRateID));
        
        return get(basePath+subPath, ExchangeRate.class, others);
	}
    
    public List<ExchangeRate> getExchangeRates(
            long currencyID,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/search";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        
        return getList(basePath+subPath, ExchangeRate.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getExchangeRatesCount(
            long currencyID,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/count";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        
        return getCount(basePath+subPath, whereCondition, others);
	}

    public long insertExchangeRate(
            long currencyID,
            ExchangeRate exchangeRate,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return insert(basePath+subPath, exchangeRate, others);
	}
    
    public int updateExchangeRate(
            long currencyID,
            ExchangeRate exchangeRate,
            String reason
    ) 
    throws FeefactorCheckedException{
        String subPath = "/currency/rate/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("currencyID", String.valueOf(currencyID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));
        
        return update(basePath+subPath, exchangeRate, others);
	}

    @Override
    public String getNamespace() {
        return "http://subscriber.feefactor.com";
    }
}
