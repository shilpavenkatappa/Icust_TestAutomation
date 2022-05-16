package pages;

import org.openqa.selenium.WebElement;
import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding3 extends IcustSpecificMethods {

	public IcustNewCustomerOnboarding3 selectEmploymentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Dopdown1.Xpath")));
		wait(1000);
		WebElement empType = locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.EmploymentType.Xpath"));
		clickElement(empType);
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Dopdown2.Xpath")));
		wait(1000);
		return this;
	}

	public IcustNewCustomerOnboarding3 selectEmployerName() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Dopdown2.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.EmployerName.Xpath")));
		wait(1000);
		return this;
	}

	public IcustNewCustomerOnboarding3 enterSalary() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Salary.Xpath")),
				props.getProperty("Salary"));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding4 clickNextButton() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustNewCustomerOnboarding4();
	}
}
