package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCorporateProofOfIdentity extends IcustSpecificMethods {

	public IcustCorporateProofOfIdentity enterIncorporationNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.IncorporationNumber.Xpath")), props.getProperty("IncorporationNumber"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateProofOfIdentity selectDateOfIssue() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfIssue.Xpath"));
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfIssue.Date.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateProofOfIdentity selectDateOfExpiry() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfExpiry.Xpath"));
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfExpiry.Date.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation clickNext4() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ClickNext.Xpath")));
		wait(2000);
		return new IcustCorporateOtherInformation();
	}
}
