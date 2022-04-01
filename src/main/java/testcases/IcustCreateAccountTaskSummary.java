package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCreateAccountTaskSummary extends IcustSpecificMethods{

	@Test
	public void runCreateAccountTaskSummary() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickCreateAccountTaskSummary()
		.enterSearchValue()
		.clickAccountID()
		.clickApproveButton();
	}
}
