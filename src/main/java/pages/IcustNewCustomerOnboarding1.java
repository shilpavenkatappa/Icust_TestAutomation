package pages;
import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding1 extends IcustSpecificMethods {
	
	public IcustNewCustomerOnboarding1 enterKYCID() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.KYCID.Xpath")), props.getProperty("KYCID"));
		wait(10000);
		return this;
	}
	
	public IcustNewCustomerOnboarding1 clickFetchButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.Fetch.Xpath")));
		wait(15000);
		return this;
	}
	
	public IcustNewCustomerOnboarding2 clickNextButton() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(5000);
		return  new IcustNewCustomerOnboarding2();
	}
}
