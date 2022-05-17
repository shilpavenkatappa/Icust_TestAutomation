package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustAddNewCountry extends IcustSpecificMethods{

	@Test
	public void runAddNewCountry()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectMaintenance()
		.enterCountryCode()
		.enterCountryCode2()
		.enterCountryName()
		.enterISONumericCode()
		.enterRegion()
		.enterISDCode()
		.selectIbanCheckRequired()
		.selectBlackListed()
		.selectSave();
	}
}
