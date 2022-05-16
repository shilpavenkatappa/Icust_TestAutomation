package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class LoanAEChargeDetailsTestcases extends IcustSpecificMethods{
	@Test
	public void runLoanAEChargeDetailsTestcases() {
	IcustLogin login= new IcustLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	
	.enterItchargeInterestRate()
	.enterHandlingchargeInterestRate();
	}
     

}
