package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class RecentTransactionTestcases extends IcustSpecificMethods{
	@Test
	public void runRecentTransactionTestcases() {
	IcustLogin login= new IcustLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickSearch()
	.enterAccountId()
	.clickProfile()
	.clickViewReport()
	.clickClose();

}
}
