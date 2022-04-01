package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class ICustCreateAccountTaskSummary extends IcustSpecificMethods{

	public ICustCreateAccountTaskSummary enterSearchValue() {
		enterValue(locateElement("xpath", props.getProperty("ICustCreateAccountTaskSummary.Search.Xpath")),
				props.getProperty("SearchAccount"));
		wait(30000);
		return this;
	}
	
	public ICustCreateAccountTaskSummary clickAccountID() {
		clickElement(locateElement("xpath", props.getProperty("ICustCreateAccountTaskSummary.SearchText.Xpath")));
		wait(10000);
		return this;
	}
	
	public ICustCreateAccountTaskSummary clickApproveButton() {
		WebElement approveButton =locateElement("xpath", props.getProperty("ICustCreateAccountTaskSummary.Approve.Xpath"));
		jsExecutor(approveButton);
		clickElement(approveButton);
		wait(6000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return this;
	}
}
