package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanAccountFinancialDetails extends IcustSpecificMethods{

	
	public IcustLoanAccountFinancialDetails enterApplicantName() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.ApplicantName.Xpath")), props.getProperty("ApplicantName"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterTotalIncome() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.TotalIncome.Xpath")), props.getProperty("TotalIncome"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterTotalExpenses() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.TotalExpenses.Xpath")), props.getProperty("TotalExpenses"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails selectLastUpdatedOn() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.LastUpdatedOn.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.LastUpdatedOn.Date.Xpath")));
		return this;
	}
	
	public IcustLoanAccountFinancialDetails selectEmploymentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentType.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentType.Dropdown.Salaried.Xpath")));
		return this;
	}
	
	
	public IcustLoanAccountFinancialDetails selectEmploymentCategory() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentCategory.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentCategory.Dropdown.Private.Xpath")));
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterEmployeeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmployeeNumber.Xpath")), props.getProperty("EmployeeNumber"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterDesignation() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.Designation.Xpath")), props.getProperty("Designation"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails selectEmploymentStartDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentStartDate.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentStartDate.Date.Xpath")));
		return this;
	}
	
	public IcustLoanAccountFinancialDetails selectEmploymentEndDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentEndDate.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.EmploymentEndDate.Date.Xpath")));
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterOfficeName() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.OfficeName.Xpath")), props.getProperty("OfficeName"));
		wait(1000);
		return this;
	}
	
	
	
	public IcustLoanAccountFinancialDetails enterBonus() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.Bonus.Xpath")), props.getProperty("Bonus"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterHousehold() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.Household.Xpath")), props.getProperty("Household"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterPropertyLoan() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.PropertyLoan.Xpath")), props.getProperty("PropertyLoan"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails enterSavingDeposits() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.SavingDeposits.Xpath")), props.getProperty("SavingDeposits"));
		wait(1000);
		return this;
	}
	
	public IcustLoanAccountFinancialDetails clickNextButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustLoanAccount.LoanDetails.FinancialDetails.Next.Xpath")));
		wait(5000);
        return this;
	}

}
