package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;

import pages.IcustTellerLogin;

public class LoanAccountServiceTestcases extends IcustSpecificMethods {
	@Test
	public void runLoanAccountServiceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
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
