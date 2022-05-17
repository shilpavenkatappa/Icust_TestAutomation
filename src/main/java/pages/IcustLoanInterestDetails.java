package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanInterestDetails extends IcustSpecificMethods{

	
	
	public IcustLoanInterestDetails selectAddDetails() {
		clickElement(locateElement("xpath", props.getProperty("IcustCreateLoanAccount.ApplicationEnrichment.LoanInterestDetails.AddDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustLoanInterestDetails clickNextButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateLoanAccount.ApplicationEnrichment.LoanInterestDetails.AddDetails.Next.Xpath")));
		wait(5000);
        return this;
	}

}