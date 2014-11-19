package com.ccard;

import com.financial.account.Account;
import com.financial.factories.FinancialFactory;
import com.financial.factories.SimpleAccountFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;


public class CCFactory extends FinancialFactory {

	public IAccount createAccount(String accountString) {

		if (accountString.equals(CommonResources.ACCOUNT_TYPE_DEFAULT))
			return new Account(12, CommonResources.ACCOUNT_TYPE_DEFAULT);
		if (accountString.equals(CreditCardCommonResources.CREDITCARD_BRONZE))
			return new Bronze(1245, CreditCardCommonResources.CREDITCARD_BRONZE);
		if (accountString.equals(CreditCardCommonResources.CUSTORMER_SILVER))
			return new Silver(1245, CreditCardCommonResources.CUSTORMER_SILVER);
		if (accountString.equals(CreditCardCommonResources.CUSTORMER_GOLD))
			return new Gold(1245, CreditCardCommonResources.CUSTORMER_GOLD);
		return null;

	}
}
