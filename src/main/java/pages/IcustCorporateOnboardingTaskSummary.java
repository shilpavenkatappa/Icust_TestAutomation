package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCorporateOnboardingTaskSummary extends IcustSpecificMethods{

	public IcustCorporateOnboardingTaskSummary corporateEnterSearchValue() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingtTaskSummary.Search.Xpath")),
				props.getProperty("SearchCustomer"));
		wait(30000);
		return this;
	}
	
	public IcustCorporateOnboardingTaskSummary CorporateClickAccountID() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingTaskSummary.SearchText.Xpath")));
		wait(10000);
		return this;
	}
	
	public IcustCorporateOnboardingTaskSummary corporateClickApproveButton() {
		WebElement approveButton =locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingTaskSummary.Approve.Xpath"));
		jsExecutor(approveButton);
		clickElement(approveButton);
		wait(6000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return this;
	}
}