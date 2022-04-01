package testcases;

import org.testng.annotations.Test;

import base.IcustMobileSpecificMethods;
import pages.ICustMobileLogin;

public class ICustMobileChequeWithdrawal extends IcustMobileSpecificMethods{

	@Test
	public void runICustMobileChequeWithdrawal() {
		ICustMobileLogin mLogin =new ICustMobileLogin(); 
		mLogin.enterPhoneNumber()
		.clickContinue()
		.clickChequeWithdrawalLogin()
		.clickChequeWithdrawal()
		.enterTransactionAmount()
		.enterChequeNumber()
		.clickNext1()
		.clickCalendar()
		.selectDate()
		.clickDone1()
		.clickTime()
		.clickTimeSlot()
		.clickTimeSlotDone()
		//.clickTimeSlotClose()
		.clickNext2()
		.clickAddToWallet();
	}
}
