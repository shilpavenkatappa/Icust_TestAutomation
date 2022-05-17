package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanRepaymentDetails extends IcustSpecificMethods{

	public IcustLoanRepaymentDetails selectRepaymentMode() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.RepaymentMode.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.RepaymentMode.Dropdown.Internal.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectRepaymentFrequency() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.RepaymentFrequency.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.RepaymentFrequency.Dropdown.Opinion.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectTypeOfRepayment() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.TypeOfRepayment.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.TypeOfRepayment.Dropdown.Emi.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectYear() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Year.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Year.Dropdown.2022.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectMonth() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Month.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Month.Dropdown.Nov.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectDay() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Day.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.LoanTenure.Day.Dropdown.30.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectFirstRepaymentDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.FirstRepaymentDate.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.FirstRepaymentDate.Xpath.Date.Xpath")));
		return this;
	}
	
	public IcustLoanRepaymentDetails selectMaturityDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.MaturityDate.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.MaturityDate.Xpath.Date.Xpath")));
		return this;
	}
	
	
	
	public IcustLoanRepaymentDetails enterMoratoriumPeriod() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.MoratoriumPeriod.Xpath")), props.getProperty("MoratoriumPeriod"));
		wait(1000);
		return this;
	}
	
	public IcustLoanRepaymentDetails enterCustomerAccountNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.CustomerAccountNumber.Xpath")), props.getProperty("CustomerAccountNumber"));
		wait(1000);
		return this;
	}
	
	
	public IcustLoanRepaymentDetails enterBranchCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.BranchCode.Xpath")), props.getProperty("BranchCode"));
		wait(1000);
		return this;
	}
	
	
	
	public IcustLoanRepaymentDetails enterBankName() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanRepaymentDetails.BankName.Xpath")), props.getProperty("BankName"));
		wait(1000);
		return this;
	}
	
	
	public IcustLoanRepaymentDetails clickNextButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustLoanAccount.LoanRepaymentDetails.Next.Xpath")));
		wait(5000);
        return this;
	}

}
