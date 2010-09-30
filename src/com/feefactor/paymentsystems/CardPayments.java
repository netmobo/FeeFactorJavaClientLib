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
package com.feefactor.paymentsystems;

import java.util.List;

import org.apache.commons.httpclient.NameValuePair;

import com.feefactor.ClientConfig;
import com.feefactor.FeefactorCheckedException;
import com.feefactor.ServiceBase;
import com.utility.XMLUtility;

/**
 * @author netmobo
 */
public class CardPayments extends ServiceBase{
    private final String basePath = "/CardPayments";
    
    public CardPayments(ClientConfig config) {
        super(config);
    }

    /**
     * @param paymentGatewayID
     * @param serialNumber
     * @param load
     * @param cardID
     * @param cvv
     * @param description
     * @param merchantDescriptor - required for VISA paypal transactions
     * @param merchantPhone - required for VISA paypal transactions
     * @param comment
     * @return
     */
    public long rechargeAccountViaUserCard(
            long paymentGatewayID,
            long serialNumber,
            double load, 
            long cardID,
            String cvv,
            String description,
            String merchantDescriptor,
            String merchantPhone,
            String comment
            ) throws FeefactorCheckedException{
        String subPath = "/card/account/recharge/registered";
        NameValuePair[] others = new NameValuePair[9];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("load", String.valueOf(load));
        others[3] = new NameValuePair("cardID", String.valueOf(cardID));
        others[4] = new NameValuePair("cvv", String.valueOf(cvv));
        others[5] = new NameValuePair("description", String.valueOf(description));
        others[6] = new NameValuePair("merchantDescriptor", String.valueOf(merchantDescriptor));
        others[7] = new NameValuePair("merchantPhone", String.valueOf(merchantPhone));
        others[8] = new NameValuePair("comment", String.valueOf(comment));

        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    /**
     * @param paymentGatewayID
     * @param serialNumber
     * @param load
     * @param paymentAuthorizationID
     * @param cvv
     * @param description
     * @param merchantDescriptor - required for VISA paypal transactions
     * @param merchantPhone - required for VISA paypal transactions
     * @param comment
     * @return
     */
    public long rechargeAccountViaUserPaymentAuthorization(
            long paymentGatewayID,
            long serialNumber,
            double load, 
            long paymentAuthorizationID,
            String cvv,
            String description,
            String merchantDescriptor,
            String merchantPhone,
            String comment
    ) throws FeefactorCheckedException{
        String subPath = "/card/account/recharge/paymentAuthorization";
        NameValuePair[] others = new NameValuePair[9];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("load", String.valueOf(load));
        others[3] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[4] = new NameValuePair("cvv", String.valueOf(cvv));
        others[5] = new NameValuePair("description", String.valueOf(description));
        others[6] = new NameValuePair("merchantDescriptor", String.valueOf(merchantDescriptor));
        others[7] = new NameValuePair("merchantPhone", String.valueOf(merchantPhone));
        others[8] = new NameValuePair("comment", String.valueOf(comment));
        
        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
    }
    
    public long rechargeAccountViaCC(
            long paymentGatewayID,
            long serialNumber,
            double load, 
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String address1,
            String address2,
            String city,
            String state,
            String zip,
            String country,
            String cardNumber,
            String expirationMonth,
            String expirationYear,
            String cardType,
            String cvv,
            String description,
            String merchantDescriptor,
            String merchantPhone,
            String comment,
            boolean storeAsUserCard
    ) throws FeefactorCheckedException{
        String subPath = "/card/account/recharge/";
        NameValuePair[] others = new NameValuePair[24];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("load", String.valueOf(load));
        others[3] = new NameValuePair("firstName", String.valueOf(firstName));
        others[4] = new NameValuePair("lastName", String.valueOf(lastName));
        others[5] = new NameValuePair("email", String.valueOf(email));
        others[6] = new NameValuePair("phoneNumber", String.valueOf(phoneNumber));
        others[7] = new NameValuePair("address1", String.valueOf(address1));
        others[8] = new NameValuePair("address2", String.valueOf(address2));
        others[9] = new NameValuePair("city", String.valueOf(city));
        others[10] = new NameValuePair("state", String.valueOf(state));
        others[11] = new NameValuePair("zip", String.valueOf(zip));
        others[12] = new NameValuePair("country", String.valueOf(country));
        others[13] = new NameValuePair("cardNumber", String.valueOf(cardNumber));
        others[14] = new NameValuePair("expirationMonth", String.valueOf(expirationMonth));
        others[15] = new NameValuePair("expirationYear", String.valueOf(expirationYear));
        others[16] = new NameValuePair("cardType", String.valueOf(cardType));
        others[17] = new NameValuePair("expirationMonth", String.valueOf(expirationMonth));
        others[18] = new NameValuePair("cvv", String.valueOf(cvv));
        others[19] = new NameValuePair("description", String.valueOf(description));
        others[20] = new NameValuePair("merchantDescriptor", String.valueOf(merchantDescriptor));
        others[21] = new NameValuePair("merchantPhone", String.valueOf(merchantPhone));
        others[22] = new NameValuePair("comment", String.valueOf(comment));
        others[23] = new NameValuePair("storeAsUserCard", String.valueOf(storeAsUserCard));

        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    public long rechargeAccountViaVoucher(
            long paymentGatewayID,
            long serialNumber,
            double load, 
            String voucherNumber,
            String voucherValue,
            String voucherCurrencyCode,
            String voucherKey,
            String description,
            String comment
    ) throws FeefactorCheckedException{
        String subPath = "/voucher/account/recharge/";
        NameValuePair[] others = new NameValuePair[9];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("load", String.valueOf(load));
        others[3] = new NameValuePair("voucherNumber", String.valueOf(voucherNumber));
        others[4] = new NameValuePair("voucherValue", String.valueOf(voucherValue));
        others[5] = new NameValuePair("voucherCurrencyCode", String.valueOf(voucherCurrencyCode));
        others[6] = new NameValuePair("voucherKey", String.valueOf(voucherKey));
        others[7] = new NameValuePair("description", String.valueOf(description));
        others[8] = new NameValuePair("comment", String.valueOf(comment));

        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    public long processAccountCheckout(
            long paymentGatewayID,
            long serialNumber,
            String checkoutData
    ) throws FeefactorCheckedException{
        String subPath = "/checkout/account/process/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("checkoutData", String.valueOf(checkoutData));

        return insert(basePath+subPath, others);
	}
    
    public CardTransactionHistory getCardTransactionHistory(
            long serialNumber,
            long cardHistoryID)
    throws FeefactorCheckedException{
        String subPath = "/History/Account/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("cardHistoryID", String.valueOf(cardHistoryID));

        return get(basePath+subPath, CardTransactionHistory.class, others);
	}
    
    public List<CardTransactionHistory> getCardTransactionHistories(
            long serialNumber,
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/History/Account/search";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));

        return getList(basePath+subPath, CardTransactionHistory.class, whereCondition, sortString, pageItems, pageNumber, others);
	}

    public long getCardTransactionHistoriesCount(
            long serialNumber,
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/History/Account/search";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));

        return getCount(basePath+subPath, whereCondition, others);
	}

    public int deleteBrandPaymentGateway(
            long paymentGatewayID,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}

    public PaymentGateway getBrandPaymentGateway(
            long paymentGatewayID)
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));

        return get(basePath+subPath, PaymentGateway.class, others);
	}

    public List<PaymentGateway> getBrandPaymentGateways(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/search/";
        return getList(basePath+subPath, PaymentGateway.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getBrandPaymentGatewaysCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertBrandPaymentGateway(
            PaymentGateway paymentGateway,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return insert(basePath+subPath, paymentGateway, others);
	}
    
    public int updateBrandPaymentGateway(
            PaymentGateway paymentGateway,
            String reason
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentgateway/brand/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return update(basePath+subPath, paymentGateway, others);
	}
    
    public int deleteUserCard(
            long cardID,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/card/user/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("cardID", String.valueOf(cardID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}
    
    public UserCard getUserCard(
            long cardID)
    throws FeefactorCheckedException{
        String subPath = "/card/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("cardID", String.valueOf(cardID));
        
        return get(basePath+subPath, UserCard.class, others);
	}
    
    public List<UserCard> getUserCards(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/card/user/search/";
        
        return getList(basePath+subPath, UserCard.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getUserCardsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/card/user/count/";
        
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertUserCard(
            UserCard card,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/card/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return insert(basePath+subPath, card, others);
	}
    
    public int updateUserCard(
            UserCard card,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/card/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return update(basePath+subPath, card, others);
	}
    
    public int deleteUserBankAccount(
            long bankAccountID,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("bankAccountID", String.valueOf(bankAccountID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}
    
    public UserBankAccount getUserBankAccount(
            long bankAccountID)
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("bankAccountID", String.valueOf(bankAccountID));

        return get(basePath+subPath, UserBankAccount.class, others);
	}
    
    public List<UserBankAccount> getUserBankAccounts(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/search/";
        
        return getList(basePath+subPath, UserBankAccount.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getUserBankAccountsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/count/";
        
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertUserBankAccount(
            UserBankAccount bankAccount,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return insert(basePath+subPath, bankAccount, others);
	}
    
    public int updateUserBankAccount(
            UserBankAccount bankAccount,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/bankAccount/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));

        return update(basePath+subPath, bankAccount, others);
	}
    
    public CardTransactionHistory reverseCardTransaction(
            long serialNumber,
            long cardHistoryID,
            long paymentGatewayID,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/card/account/recharge/reverse/";
        NameValuePair[] others = new NameValuePair[4];
        others[0] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[1] = new NameValuePair("cardHistoryID", String.valueOf(cardHistoryID));
        others[2] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[3] = new NameValuePair("reason", String.valueOf(reason));

        String result = post(basePath+subPath, others);
        return XMLUtility.fromXML(CardTransactionHistory.class, result);
	}
    
    public int deleteUserPaymentAuthorization(
            long paymentAuthorizationID,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/";
        NameValuePair[] others = new NameValuePair[2];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[1] = new NameValuePair("reason", String.valueOf(reason));

        return delete(basePath+subPath, others);
	}
    
    public UserPaymentAuthorization getUserPaymentAuthorization(
            long paymentAuthorizationID)
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));

        return get(basePath+subPath, UserPaymentAuthorization.class, others);
	}
    
    public List<UserPaymentAuthorization> getUserPaymentAuthorizations(
            String whereCondition, 
            String sortString, 
            long pageItems, 
            long pageNumber
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/search/";
        return getList(basePath+subPath, UserPaymentAuthorization.class, whereCondition, sortString, pageItems, pageNumber);
	}

    public long getUserPaymentAuthorizationsCount(
            String whereCondition 
            )
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/count/";
        return getCount(basePath+subPath, whereCondition);
	}

    public long insertUserPaymentAuthorization(
            UserPaymentAuthorization paymentAuthorization,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return insert(basePath+subPath, paymentAuthorization, others);
	}
    
    public int updateUserPaymentAuthorization(
            UserPaymentAuthorization paymentAuthorization,
            String reason
    )
    throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/";
        NameValuePair[] others = new NameValuePair[1];
        others[0] = new NameValuePair("reason", String.valueOf(reason));
        return update(basePath+subPath, paymentAuthorization, others);
	}
    
    public long addUserCardToPaymentAuthorization(
            long paymentAuthorizationID,
            long cardID,
            long priority,
            String reason
            )throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/card/";
        NameValuePair[] others = new NameValuePair[4];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[1] = new NameValuePair("cardID", String.valueOf(cardID));
        others[2] = new NameValuePair("priority", String.valueOf(priority));
        others[3] = new NameValuePair("reason", String.valueOf(reason));
        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    public int removeUserCardFromPaymentAuthorization(
            long paymentAuthorizationID,
            long cardID,
            String reason
    )throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/card/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[1] = new NameValuePair("cardID", String.valueOf(cardID));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}
    
    public long addAccountToPaymentAuthorization(
            long paymentAuthorizationID,
            long serialNumber,
            String reason
    )throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/account/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        String result = post(basePath+subPath, others);
        result = XMLUtility.basicFromXML(result);
        try {
            return new Long(result);
        } catch (Exception e){
            return 0;
        }
	}
    
    public int removeAccountFromPaymentAuthorization(
            long paymentAuthorizationID,
            long serialNumber,
            String reason
    )throws FeefactorCheckedException{
        String subPath = "/paymentAuthorization/user/account/";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("paymentAuthorizationID", String.valueOf(paymentAuthorizationID));
        others[1] = new NameValuePair("serialNumber", String.valueOf(serialNumber));
        others[2] = new NameValuePair("reason", String.valueOf(reason));
        return delete(basePath+subPath, others);
	}
    
    public String getVoucherCurrency(
            String paymentGatewayID,
            String voucherNumber,
            String voucherKey
    )throws FeefactorCheckedException{
        String subPath = "/voucher/currency";
        NameValuePair[] others = new NameValuePair[3];
        others[0] = new NameValuePair("paymentGatewayID", String.valueOf(paymentGatewayID));
        others[1] = new NameValuePair("voucherNumber", String.valueOf(voucherNumber));
        others[2] = new NameValuePair("voucherKey", String.valueOf(voucherKey));
        
        String response = get(basePath+subPath, others);
        response = XMLUtility.basicFromXML(response);
        return response;
    }

    @Override
    public String getNamespace() {
        return "http://paymentsystem.feefactor.com";
    }
}
