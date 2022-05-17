package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustHomeloan extends IcustSpecificMethods{

	@Test
	public void runLoanAccountLoanDetails()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectCreateLoanAccount()
		.clickLoanDetails()
		.selectBussinessProductName()
		.selectApplicationDate()
		.enterAccountBranch()
		.enterEstimatedCost()
		.enterCustomerContribution()
		.enterLoanAmount()
		.selectLoanTenureYear()
		.selectLoanTenureMonth()
		.selectLoanTenureDay()
		.enterPurposeOfLoan()
		.clickNextButton()
		.selectDimension()
		.selectHometype()
		.selectAssetStatus()
		.enterMarketValue()
		.enterBuilding()
		.enterStreet()
		.enterLocality()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterZipcode()
		.clickNext1Button();
	}
}
