package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustLoanRepaymentDetailsTC extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectRepaymentMode()
		.selectRepaymentFrequency()
		.selectTypeOfRepayment()
		.selectYear()
		.selectMonth()
		.selectDay()
		.selectFirstRepaymentDate()
		.selectMaturityDate()
		.enterMoratoriumPeriod()
		.enterCustomerAccountNumber()
		.enterBranchCode()
		.enterBankName()
		.clickNextButton();
	}
}
