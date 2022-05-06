package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustKycTaskSummary extends IcustSpecificMethods{

	@Test
	public void runKYCTaskSummary() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickKYCTaskSummary()
		.enterSearchValue()
		.clickKYC()
		.clickApproveButton();
	
	}
}
