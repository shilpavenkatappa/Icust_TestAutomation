package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustKYCVideoVerificationTab1 extends IcustSpecificMethods{

	public IcustKYCVideoVerificationTab1 enterCIFNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.CIFNumber.Xpath")), props.getProperty("CIFNumber"));
		wait(2000);
		return this;
	}
	
	public IcustKYCVideoVerificationTab1 clickFetchButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Fetch.Xpath")));
		wait(10000);
		return this;
	}
	
	public IcustKYCVideoVerificationTab2 clickNextButton() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustKYCVideoVerificationTab1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustKYCVideoVerificationTab2();
	}
}
