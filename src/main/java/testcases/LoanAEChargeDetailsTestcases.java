package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;

import pages.IcustTellerLogin;

public class LoanAEChargeDetailsTestcases extends IcustSpecificMethods{
	@Test
	public void runLoanAEChargeDetailsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	
	.enterItchargeInterestRate()
	.enterHandlingchargeInterestRate();
	}
     

}
