package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCreateAccountDetails extends IcustSpecificMethods{

	public IcustCreateAccountDetails clickAccountDetails() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.AccountDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCreateAccountDetails enterCifNumber() {
		wait(3000);
		WebElement cifNumber =locateElement("xpath", props.getProperty("IcustCreateDeposit.CifNumber.Xpath"));
		enterValue(cifNumber, props.getProperty("CIFNumberValue"));
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.CustomerName.Xpath")));
		//cifNumber.sendKeys(Keys.TAB);
		wait(15000);
		
		  driver.navigate().refresh(); wait(5000); 
		  WebElement cif=locateElement("xpath", props.getProperty("IcustCreateDeposit.RefreshCifNumber.Xpath"));
		 clickElement(cif);
		 wait(2000);
		  enterValue(cif, props.getProperty("CIFNumberValue"));
		  wait(2000);
		  clickElement(locateElement("xpath",
		  props.getProperty("IcustCreateDeposit.CustomerName.Xpath"))); 
		  wait(7000);
		 
		return this;
	}
	
	public IcustCreateAccountDetails selectAccountType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.AccountTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.SelectAccountType.Xpath")));
		return this;
	}
	
	public IcustCreateAccountDetails enterBusinessProductName() {
		enterValue(locateElement("xpath", props.getProperty("IcustCreateDeposit.BusinessProductName.Xpath")), props.getProperty("BusinessProductName"));
		return this;
	}
	
	public IcustCreateAccountDetails enterProductDesc() {
		enterValue(locateElement("xpath", props.getProperty("IcustCreateDeposit.ProductDescription.Xpath")), props.getProperty("ProductDescription"));
		return this;
	}
	
	public IcustCreateAccountDetails selectAccountBranch() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.AccountBranch.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.AccountBranch.Select.Xpath")));
		return this;
	}
	
	public IcustCreateAccountDetails selectApplicationDate() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustCreateDeposit.ApplicationDate.Xpath"));
		wait(2000);
		jsExecutor(datepickIcon);
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("31"))
			{
				ele.click();
				break;
			}			
		}
		wait(2000);
		return this;
	}
	
	public IcustCreateAccountDetails clickInitialFundingToggle() {
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.InitialFunding.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCreateAccountDetails clickOverdraftToggle() {
		clickElement(locateElement("xpath", props.getProperty("IcustCreateDeposit.Overdraft.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCustomerInformationDetails clickCreateAccountNextButton() {
		clickElement(locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath")));
		wait(2000);
		return new IcustCustomerInformationDetails();
	}
}
