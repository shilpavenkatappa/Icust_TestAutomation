package testcases;

import org.testng.annotations.Test;

import base.IcustMobileSpecificMethods;
import pages.ICustMobileLogin;
import pages.IcustKioskLogin;

public class ICustMobileCashDeposit extends IcustMobileSpecificMethods{

	@Test
	public void runICustMobileCashDeposit() {
		ICustMobileLogin mLogin =new ICustMobileLogin(); 
		mLogin.enterPhoneNumber()
		.clickContinue()
		.clickCashDepositLogin()
		.clickCashDeposit()
		.enterTransactionAmount()
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
