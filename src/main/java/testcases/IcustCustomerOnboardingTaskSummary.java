package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCustomerOnboardingTaskSummary extends IcustSpecificMethods{

	@Test
	public void runKYCTaskSummary() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickCustomerOnboardingTaskSummary()
		.enterSearchValue()
		.clickCustomerID()
		.clickApproveButton();
	}
}
