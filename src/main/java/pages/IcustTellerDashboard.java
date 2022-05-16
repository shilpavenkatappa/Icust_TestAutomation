package pages;

import base.IcustSpecificMethods;

public class IcustTellerDashboard extends IcustSpecificMethods{

	public IcustTellerDashboard clickNewCustomerOnboardingLink() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.NewCustomer.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(1000);
		return this;
	}
	
	public IcustTellerDashboard clickIndividualCustomer() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.IndividualCustomer.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustTellerDashboard clickCorporateCustomer() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CorporateCustomer.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding1 clickCustomerProceed() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		return new IcustNewCustomerOnboarding1();
	}
	
	public ICustCorporateBasicInformation clickCorporateProceed() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		wait(2000);
		return new ICustCorporateBasicInformation();
	}
	
	public IcustCustomerOnboardingTaskSummary clickCustomerOnboardingTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.OnboardingTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(10000);
		return new IcustCustomerOnboardingTaskSummary();
	}
	
	public IcustKYCVerification clickKYCScreening() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.KYCScreening.Xpath")));
		wait(3000);
		windowsHandling();
		/* webDriverWait("Rumango"); */
		//wait(2000);
		//driver.findElementByXPath("//mat-hint[text()='Customer Onboarding']").click();
		//clickElement(locateElement("xpath", props.getProperty("//mat-hint[text()='Customer Onboarding']")));
		//wait(2000);
		//driver.findElementByXPath("//span[text()=' CONTINUE ']").click();
		//clickElement(locateElement("xpath", props.getProperty("//span[text()=' CONTINUE ']")));
		wait(5000);
		return new IcustKYCVerification();
	}
	
	public IcustKYCTaskSummary clickKYCTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.KYCTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(10000);
		return new IcustKYCTaskSummary();
	}
	
	public ICustCreateAccountTaskSummary clickCreateAccountTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CreateAccountTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(10000);
		return new ICustCreateAccountTaskSummary();
	}
	
	public IcustCreateAccountDetails clickCreateDeposit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CreateDeposit.Xpath")));
		windowsHandling();
		webDriverWait("Home > Home | Rumango");
		return new IcustCreateAccountDetails();
	}
	
	public IcustPickAToken clickToken() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.Xpath")));
		wait(20000);
		return new IcustPickAToken();

	}
	
	public IcustTokenServicesCashDeposit clickServicesToggleButtonforCashDeposit() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));	
		wait(1000);
		return new IcustTokenServicesCashDeposit();
	}
	public IcustTokenServicesCashWithdrawal clickServicesToggleButtonforCashWithdrawal() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));	
		wait(1000);
		return new IcustTokenServicesCashWithdrawal();
	}
	public IcustTellerDashboardSearchAndViewProfile clickSearch() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickSearch.Xpath")));
		wait(3000);
		return new IcustTellerDashboardSearchAndViewProfile();
	}
	
	public IcustTokenServices clickServicesToggleButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));		
		return new IcustTokenServices();
	}
	
	public IcustCorporateOnboardingTaskSummary corporateOnboardingButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingtTaskSummary.TellerButton.Xpath")));
		wait(30000);
		return new IcustCorporateOnboardingTaskSummary();
	}
	public pages.IcustLoanAccountAdmissionDetails IcustLoanAccountAdmissionDetailsNextButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.nextButton.Xpath")));
		wait(30000);
		return new IcustLoanAccountAdmissionDetails();
	}
	public IcustMaintenance clickProfileIcon() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.profile.Xpath")));
		return new IcustMaintenance();
	}
	public LoanCollateralDetails clickCreateLoanAccount() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Createloanaccount.Xpath")));
		return new LoanCollateralDetails();
	}
	
//	public IcustTellerDashboard clickSearch() {
//		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Search.Xpath")));
//		return this;
//	}
	public IcustTellerDashboard enterAccountId() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.AccountId.Xpath")),props.getProperty("AccountId"));
		return this;
	}
	public Dashboard360 clickProfile() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Profile.Xpath")));
		return new Dashboard360();
	}
}
