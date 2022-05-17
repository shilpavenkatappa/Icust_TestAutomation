package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustEditCountry extends IcustSpecificMethods{

	@Test
	public void runEditCountry()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickMaintenance()
		.clickEdit()
		.enterCountryCode()
		.enterCountryCode2()
		.enterCountryName()
		.enterISONumericCode()
		.enterRegion()
		.enterISDCode()
		.selectUpdate();
	}
}
