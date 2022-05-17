package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustLoanInterestDetails extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectAddDetails()
		.clickNextButton();
	}
}