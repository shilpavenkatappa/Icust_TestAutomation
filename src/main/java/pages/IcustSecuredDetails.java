package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustSecuredDetails extends IcustSpecificMethods{

	public IcustSecuredDetails clickAlertMsg() {
		clickElement(locateElement("xpath", props.getProperty("IcustSecuredOverdraftDetails.Message.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustSecuredDetails clickAddDetails() {
		clickElement(locateElement("xpath", props.getProperty("IcustSecuredOverdraftDetails.AddDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustSecuredDetails enterCollateralValue() {
		enterValue(locateElement("Id", props.getProperty("IcustSecuredOverdraftDetails.CollateralValue.Id")), props.getProperty("CollateralValue"));
		return this;
	}
	
	public IcustSecuredDetails enterLinkagePercentage() {
		enterValue(locateElement("Id", props.getProperty("IcustSecuredOverdraftDetails.LinkagePercentage.Xpath")), props.getProperty("LinkagePercentage"));
		return this;
	}
	
	public IcustSecuredDetails enterSecurityRefNum() {
		WebElement refNum =locateElement("xpath", props.getProperty("IcustSecuredOverdraftDetails.SecurityRefNum.Xpath"));
		enterValue(refNum, props.getProperty("SecurityRefNum"));
		refNum.sendKeys(Keys.TAB);
		//enterValue(locateElement("Id", props.getProperty("IcustSecuredOverdraftDetails.SecurityRefNum.Xpath")), props.getProperty("SecurityRefNum"));
		wait(2000);
		return this;
	}
	
	public IcustUnsecuredDetails clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustUnsecuredDetails();
	}
}
