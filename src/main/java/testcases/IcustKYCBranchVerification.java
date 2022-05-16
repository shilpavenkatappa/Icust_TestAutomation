package testcases;

import java.awt.AWTException;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustKYCBranchVerification extends IcustSpecificMethods{
	@Test
	public void runKYCBranchVerification() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickKYCScreening()
		.clickKYCBranchVerification()
		.clickBranchProceedButton()
		.selectPrefix()
		.enterFirstName()
		.enterLastName()
		.enterDateOfBirth()
		.selectMaritalStatus()
		.selectGender()
		.selectNationality()
		.enterEmailAddress()
		.enterMobileNumber()
		.enterAddress1()
		.enterAddress2()
		.selectResidence()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterZipcode()
		.clickNext()
		.selectDocType()
		.uploadFrontSide()
		.clickAddNew()
		.uploadBackSide()
		.clickNext()
		.selectBioName()
		.clickBioScan()
		.clickFingerprintScan()
		.clickScanClose()
		.clickFinishButton()
		.clickKYCDone();
	}
}
