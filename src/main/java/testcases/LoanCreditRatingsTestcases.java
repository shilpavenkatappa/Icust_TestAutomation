package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;

import pages.IcustTellerLogin;

public class LoanCreditRatingsTestcases extends IcustSpecificMethods {
	@Test
	public void runLoanCreditRatingsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickScore()
	.clickSelectAgencydd()
	.clickSelectAgency()
	.enterRatings()
	.enterRemarks();
	}

}
