package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustFinancialDetails extends IcustSpecificMethods{

	public IcustFinancialDetails clickAlertMsg() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustSecuredOverdraftDetails.Message.Xpath")));
		wait(2000);
		return this;
	}
	public IcustFinancialDetails clickFinancialAddDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustFinancialDetails.AddDetails.Xpath")));
		wait(2000);
		return this;
	}
		
	public IcustFinancialDetails selectEmploymentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustFinancialDetails.EmploymentTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustFinancialDetails.EmploymentType.Xpath")));
		return this;
	}
	
	public IcustFinancialDetails selectEmploymentCategory() {
		clickElement(locateElement("xpath", props.getProperty("IcustFinancialDetails.EmploymentCategoryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustFinancialDetails.EmploymentCategory.Xpath")));
		return this;
	}
	
	public IcustFinancialDetails enterEmployeeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.EmployeeNumber.Xpath")), props.getProperty("EmployeeNumber"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterOfficeName() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.OfficeName.Xpath")), props.getProperty("OfficeName"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterDesignation() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.Designation.Xpath")), props.getProperty("Designation"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterSalary() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.Salary.Xpath")), props.getProperty("Salary"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterMedical() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.Medical.Xpath")), props.getProperty("Medical"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterVehicleLoan() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.VehicleLoan.Xpath")), props.getProperty("VehicleLoan"));
		wait(1000);
		return this;
	}
	
	public IcustFinancialDetails enterProperties() {
		enterValue(locateElement("xpath", props.getProperty("IcustFinancialDetails.Properties.Xpath")), props.getProperty("Properties"));
		wait(1000);
		return this;
	}
	
	public IcustInterestDetails clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustInterestDetails();
	}
}
