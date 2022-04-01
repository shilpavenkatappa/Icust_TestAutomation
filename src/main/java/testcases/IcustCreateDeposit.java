package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCreateDeposit extends IcustSpecificMethods {

	@Test
	public void runCreateDeposit() throws AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername().enterPassword().clickSignInButton().clickCreateDeposit()
				//AccountDetails
				  .clickAccountDetails().enterCifNumber().selectAccountType().
				  enterBusinessProductName().enterProductDesc()
				  .selectAccountBranch().selectApplicationDate().clickCreateAccountNextButton()
				  //CustomerInformationDetails
				  .enterBirthPlace().selectResidentType().selectResident().selectCitizenship().
				  enterOccupationType().enterUniqueID().enterZipCode()
				  .enterLandlineNumber().clickSaveApplicant() 
				  //MandateDetails
				  .selectModeOfOperation().enterAmountFrom().enterAmountTo().
				  enterNoOfSignatures().clickNextButton() 
				  //AccountService
				  .selectAccountFrequency().selectAccountPreference().selectBankingPreference()
				  .selectChannelPreference().clickNext() 
				  //NomineeDetails
				  .selectPrefix().enterFirstName().enterLastName().selectRelationshipType().
				  selectDateOfBirth().clickAddressToggle().clickContactInfm()
				  .enterMobileNumber().enterEmail().clickNext() 
				  //FinancialDetails
				  .clickAlertMsg().clickFinancialAddDetails().selectEmploymentType().
				  selectEmploymentCategory().enterEmployeeNumber().enterOfficeName()
				  .enterDesignation().enterSalary().enterMedical().enterVehicleLoan().
				  enterProperties().clickNext() 
				  //InterestDetails
				  .clickInterestAddDetails().clickNext() 
				  //ChargeDetails
				  .enterAmount().clickNext()
				//QualitativeScoreboard
				.clickAssessmentAddDetails().selectMonthDropdown().selectPlanDropDown().enterName().clickNext()
				//ApprovalDetails
				.clickApprovalViewDetails().clickEdit().clickNext()
				//Digital Signing
				.clickDigitalSignAddDetails().clickSignNow().enterSignature().clickDone().ClickFinishButton();
	}
}
