package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustMandateDetails extends IcustSpecificMethods{

	public IcustMandateDetails selectModeOfOperation() {
		clickElement(locateElement("xpath", props.getProperty("IcustMandateDetails.ModeOfOperationDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMandateDetails.ModeOfOperation.Xpath")));
		return this;
	}
	
	public IcustMandateDetails enterAmountFrom() {
		enterValue(locateElement("xpath", props.getProperty("IcustMandateDetails.AmountFrom.Xpath")), props.getProperty("AmountFrom"));
		return this;
	}
	
	public IcustMandateDetails enterAmountTo() {
		enterValue(locateElement("xpath", props.getProperty("IcustMandateDetails.AmountTo.Xpath")), props.getProperty("AmountTo"));
		return this;
	}
	
	public IcustMandateDetails enterNoOfSignatures() {
		enterValue(locateElement("xpath", props.getProperty("IcustMandateDetails.NoOfSignatures.Xpath")), props.getProperty("NoOfSignatures"));
		return this;
	}
	
	public IcustAccountService clickNextButton() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return new IcustAccountService();
	}
}
