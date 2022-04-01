package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCorporateCustomerOnboarding extends IcustSpecificMethods{

	@Test
	public void runCorporateCustomerOnboarding() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickNewCustomerOnboardingLink()
		.clickCorporateCustomer()
		.clickCorporateProceed()
		//Corporate - Primary Information
		.enterCompanyName()
		.selectCategory()
		.selectCountry()
		.clickNext1()
		//Corporate - Director Details
		.selectPrefix()
		.enterFirstName()
		.enterLastName()
		.selectGender()
		.selectDateOfBirth()
		.selectPlaceOfBirth()
		.selectResidenceType()
		.selectCitizenshipBy()
		.selectCountryOfResidence()
		.selectIDType()
		.enterUniqueIdNumber()
		.selectValidTill()
		.enterDirectorAddress1()
		.enterDirectorAddress2()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterZipcode()
		.selectAddressType()
		.enterMobileNumber()
		.enterLandlineNumber()
		.enterEmail()
		.enterTaxid()
		.selectCountryOfIssue()
		.clickSaveDirector()
		.clickNext2()
		//Corporate - Contact Information
		.selectContactAddressType()
		.enterContactAddress1()
		.enterContactAddress2()
		.selectContactCountry()
		.selectContactState()
		.selectContactCity()
		.enterContactZipcode()
		.enterContactEmail()
		.enterContactMobileNumber()
		.clickNext3()
		//Corporate - Proof Of Identity
		.enterIncorporationNumber()
		.selectDateOfIssue()
		.selectDateOfExpiry()
		.clickNext4()
		//Corporate - Other Information
		.selectOrganisationType()
		.selectTypeOfOwnership()
		.selectOtherInformationAddressType()
		.enterOtherInformationAddress1()
		.enterOtherInformationAddress2()
		.selectOtherInformationCountry()
		.selectOtherInformationState()
		.selectOtherInformationCity()
		.enterOtherInformationZipcode()
		.selectDocumentType()
		.uploadDocument()
		.clickCorporateFinish();
	}
}
