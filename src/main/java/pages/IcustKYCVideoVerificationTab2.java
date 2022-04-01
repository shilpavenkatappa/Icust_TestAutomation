package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustKYCVideoVerificationTab2 extends IcustSpecificMethods{

	public IcustKYCVideoVerificationTab2 selectDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Date.Xpath")));
		wait(3000);
		return this;
	}
	
	public IcustKYCVideoVerificationTab2 selectTime() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Time.Xpath")));
		wait(5000);
		return this;
	}
	
	public IcustKYCVideoVerificationTab2 clickFinish() {
		WebElement finishButton =locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Finish.Xpath"));
		jsExecutor(finishButton);
		clickElement(finishButton);
		wait(3000);
		return this;
	}
	
	public IcustKYCVideoVerificationTab2 clickDone() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Done.Xpath")));
		wait(3000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return this;
	}
}
