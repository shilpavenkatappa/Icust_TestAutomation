package testcases;

import org.testng.annotations.Test;
import base.ICUSTKIOSKMethods;
import pages.IcustKioskCashWithdrawal;

public class IcustCashWithdrawal_TC002 extends ICUSTKIOSKMethods{
	@Test
	public void runIcustKioskLogin() {
		IcustKioskCashWithdrawal withdraw =new IcustKioskCashWithdrawal();
		
		withdraw.enterPhoneNumber()
		.clickLoginContinue()
		.clickNext()
		.clickSkip()
		.selectWithdraw()
		.clickDashboardContinue()
		//.clickSavings()
		//.selectAccounNumber()
		//.selectTransactionBranch()
		.enterAmount()
		.selectDenomination()
		.completeTransaction();
	}

}
