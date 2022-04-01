package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding2 extends IcustSpecificMethods{

	public IcustNewCustomerOnboarding2 selectDocumentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.Select.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.DocumentType.Xpath")));
		return this;
	}
	
	public IcustNewCustomerOnboarding2 uploadDocumentType() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("IcustNewCustomerOnboarding1.DocumentName.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("D:\\icust\\Pan_Back.jpg");
		wait(12000);
		return this;
	}
	
	public IcustNewCustomerOnboarding3 clickNextButton() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustNewCustomerOnboarding3();
	}
}
