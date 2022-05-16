package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustNewCustomerOnboardingTestCase extends IcustSpecificMethods {

	@Test
	public void runNewCustomer() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername().
		enterPassword()
		.clickSignInButton()
		.clickNewCustomerOnboardingLink()
		.clickIndividualCustomer()
		.clickCustomerProceed()
		.enterKYCID()
		.clickFetchButton()
		.clickNextButton()
				/*
				 * .selectDocumentType() .uploadDocumentType()
				 */
		.clickNextButton()
		.selectEmploymentType()
		.selectEmployerName()
		.enterSalary()
		.clickNextButton()
		.selectNoOfSignatures()
		.clickSignUpload()
		.clickFinishButton()
		.clickContinue();
	}

}
