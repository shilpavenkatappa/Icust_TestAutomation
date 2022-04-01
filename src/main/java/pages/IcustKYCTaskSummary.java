package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustKYCTaskSummary extends IcustSpecificMethods{

	public IcustKYCTaskSummary enterSearchValue() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCTaskSummary.Search.Xpath")),
				props.getProperty("SearchKYC"));
		wait(3000);
		return this;
	}
	
	public IcustKYCTaskSummary clickKYC() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCTaskSummary.SearchText.Xpath")));
		wait(3000);
		return this;
	}
	
	public IcustKYCTaskSummary clickApproveButton() {
		WebElement approveButton =locateElement("xpath", props.getProperty("IcustKYCTaskSummary.Approve.Xpath"));
		jsExecutor(approveButton);
		clickElement(approveButton);
		wait(6000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return this;
	}
}
