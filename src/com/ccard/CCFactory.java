package com.ccard;

import com.financial.account.Account;
import com.financial.factories.FinancialFactory;
import com.financial.factories.SimpleAccountFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;
import com.financial.utilities.CommonResources.ACCOUNT;

public class CCFactory extends FinancialFactory {

	public IAccount createAccount(String accountString) {

		if (accountString.equals(CommonResources.ACCOUNT))
			return new Account(1245);
		if (accountString.equals(CreditCardCommonResources.CREDITCARD_BRONZE))
			return new Bronze(1245);
		if (accountString.equals(CreditCardCommonResources.CUSTORMER_SILVER))
			return new Silver(1245);
		if (accountString.equals(CreditCardCommonResources.CUSTORMER_GOLD))
			return new Gold(1245);
		return null;

	}
}
