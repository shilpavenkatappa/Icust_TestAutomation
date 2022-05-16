package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class LoanAccountServiceTestcases extends IcustSpecificMethods {
	@Test
	public void runLoanAccountServiceTestcases() {
	IcustLogin login= new IcustLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickStatementCycledd()
	.clickStatementCycle()
	.selectStartDate()
	.clickStatementTypedd()
	.clickStatementType();
	}

}
