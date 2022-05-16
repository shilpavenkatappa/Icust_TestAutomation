package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class LoanCreditRatingsTestcases extends IcustSpecificMethods {
	@Test
	public void runLoanCreditRatingsTestcases() {
	IcustLogin login= new IcustLogin();
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
