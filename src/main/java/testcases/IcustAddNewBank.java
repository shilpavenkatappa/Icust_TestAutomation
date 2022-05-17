package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustAddNewBank extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectMaintenance()
		.enterBankName()
		.enterBankCode()
		.enterSwiftCode()
		.selectBankCurrency()
		.selectDefaultLanguage()
		.enterHeadOfficeBranch()
		.selectDenominationRequired()
		.selectEntityCode()
		.enterAddress1()
		.enterAddress2()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterPincode()
		.enterMobileNumber()
		.enterPhoneNumber()
		.clickSaveButton();
	}
}
