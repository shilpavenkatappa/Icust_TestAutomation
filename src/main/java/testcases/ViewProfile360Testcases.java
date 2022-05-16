package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class ViewProfile360Testcases extends IcustSpecificMethods {
	@Test
	public void runViewProfile360Testcases() {
	IcustLogin login= new IcustLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickSearch()
	.enterAccountId()
	.clickProfile()
	.clickViewProfile()
	.clickClose();

}
}
