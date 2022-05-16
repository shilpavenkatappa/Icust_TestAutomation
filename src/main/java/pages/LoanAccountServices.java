package pages;

import java.awt.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class LoanAccountServices extends IcustSpecificMethods{
	public LoanAccountServices clickStatementCycledd() {
		clickElement(locateElement("xpath", props.getProperty("LoanAccountServices.StatementCycledd.Xpath")));
		return this;
		}
	public LoanAccountServices clickStatementCycle() {
		clickElement(locateElement("xpath", props.getProperty("LoanAccountServices.StatementCycle.Xpath")));
		return this;
		}
	public LoanAccountServices selectStartDate() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("LoanAccountServices.StartDate.Xpath"));
		wait(2000);
		jsExecutor(datepickIcon);
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		java.util.List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("12"))
			{
				ele.click();
				break;
			}			
		}
		wait(2000);
		return this;
	}
	public LoanAccountServices clickStatementTypedd() {
		clickElement(locateElement("xpath", props.getProperty("LoanAccountServices.StatementTypedd.Xpath")));
		return this;
		}
	public LoanAccountServices clickStatementType() {
		clickElement(locateElement("xpath", props.getProperty("LoanAccountServices.StatementType.Xpath")));
		return this;
		}

}
