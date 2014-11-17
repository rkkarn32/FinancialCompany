package com.financial.factories;

import com.financial.utilities.Utility;

public interface SimpleFinancialFactory {
	AbstractFinancialFactory createFinancilaFactory(Utility utility);
}
