package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustUnsecuredDetails extends IcustSpecificMethods{

	public IcustFinancialDetails clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustFinancialDetails();
	}
}
