package com.ccard.factories;

import com.ccard.CreditCardCommonResources;
import com.ccard.account.Bronze;
import com.ccard.account.Gold;
import com.ccard.account.Silver;
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
		if (accountString.equals(CreditCardCommonResources.CREDITCARD_SILVER))
			return new Silver(1245, CreditCardCommonResources.CREDITCARD_SILVER);
		if (accountString.equals(CreditCardCommonResources.CREDITCARD_GOLD))
			return new Gold(1245, CreditCardCommonResources.CREDITCARD_GOLD);
		return null;
	}
}
