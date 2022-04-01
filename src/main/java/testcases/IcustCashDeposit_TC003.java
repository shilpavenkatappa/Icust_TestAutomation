package testcases;

import org.testng.annotations.Test;

import base.ICUSTKIOSKMethods;
import pages.IcustKioskCashDeposit;

public class IcustCashDeposit_TC003 extends ICUSTKIOSKMethods{
	@Test
	public void runIcustKioskLogin() {
		IcustKioskCashDeposit deposit =new IcustKioskCashDeposit();
		
		deposit.enterPhoneNumber()
		.clickLoginContinue()
		.clickNext()
		.clickSkip()
		.selectDeposit()
		.clickDashboardContinue()
		//.clickSavings()
		//.selectAccounNumber()
		//.selectTransactionBranch()
		.enterAmount()
		.selectDenomination()
		.completeTransaction();
	}

}
