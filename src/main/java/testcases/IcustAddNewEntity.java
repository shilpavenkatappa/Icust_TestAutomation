package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustAddNewEntity extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectMaintenance()
		.enterEntityCode()
		.enterEntityName()
		.selectDenominationRequired()
		.enterVersion()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterPincode()
		.enterMobileNumber()
		.enterPhoneNumber()
		.clickSaveButton();
	}
}
