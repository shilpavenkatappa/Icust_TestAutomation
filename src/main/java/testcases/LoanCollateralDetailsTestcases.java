package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustLogin;

public class LoanCollateralDetailsTestcases extends IcustSpecificMethods{
	@Test
	public void runLoanCollateralDetailsTestcases() {
	IcustLogin login= new IcustLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickCollateralTypeDropdown()
	.clickCollateralTypeValue()
	.clickCurrencyDropdown()
	.clickCurrencyValue()
	.enterCollateralValue()
	.clickAttributesDropdown()
	.clickAttributeValue()
	.enterBuilding()
	.enterStreet()
	.enterLocality()
	.clickCountryDropdown()
	.clickCountry()
	.clickStateDropdown()
	.clickState()
	.clickCityDropdown()
	.clickCity()
	.enterZipcode()
	.clickCollateral1()
	.enterNumbofCollateral()
	.enterTotalCollateralValue()
	.enterUtilizedPreviously()
	.enterCoveravailable();
	}

}
