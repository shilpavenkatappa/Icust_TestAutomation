package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustAccountService extends IcustSpecificMethods{

	public IcustAccountService selectAccountFrequency() {
		clickElement(locateElement("xpath", props.getProperty("IcustAccountService.AccountFrequency.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustAccountService selectAccountPreference() {
		clickElement(locateElement("xpath", props.getProperty("IcustAccountService.AccountPreference.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustAccountService selectBankingPreference() {
		clickElement(locateElement("xpath", props.getProperty("IcustAccountService.BankingPreference.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustAccountService selectChannelPreference() {
		clickElement(locateElement("xpath", props.getProperty("IcustAccountService.CommunicationPreference.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustNomineeDetails();
	}
}
