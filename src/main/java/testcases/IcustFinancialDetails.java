package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustFinancialDetails extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.enterApplicantName()
		.enterTotalIncome()
		.enterTotalExpenses()
		.selectLastUpdatedOn()
		.selectEmploymentType()
		.selectEmploymentCategory()
		.enterEmployeeNumber()
		.enterDesignation()
		.selectEmploymentStartDate()
		.selectEmploymentEndDate()
		.enterOfficeName()
		.enterBonus()
		.enterHousehold()
		.enterPropertyLoan()
		.enterSavingDeposits()
		.clickNextButton();
	}
}
