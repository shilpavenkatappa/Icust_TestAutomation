package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanDisburesmentDetails extends IcustSpecificMethods{

	public IcustLoanDisburesmentDetails selectDisburesmentMode() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.DisbursementMode.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.DisbursementMode.Dropdown.Autodisbursement.Xpath")));
		return this;
	}
	
	public IcustLoanDisburesmentDetails enterLoanAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.LoanAmount.Xpath")), props.getProperty("LoanAmount"));
		wait(1000);
		return this;
	}
	
	public IcustLoanDisburesmentDetails enterNumberOfDisbursement() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.NumberOfDisbursement.Xpath")), props.getProperty("NumberOfDisbursement"));
		wait(1000);
		return this;
	}
	
	
	public IcustLoanDisburesmentDetails selectFirstDisbursementDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.FirstDisbursementDate.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.FirstDisbursementDate.Xpath.Date.Xpath")));
		return this;
	}
	
	
	public IcustLoanDisburesmentDetails enterTotalDisbursement() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.TotalDisbursement.Xpath")), props.getProperty("TotalDisbursement"));
		wait(1000);
		return this;
	}
	
	public IcustLoanDisburesmentDetails enterCustomerAccount() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.CustomerAccount.Xpath")), props.getProperty("CustomerAccount"));
		wait(1000);
		return this;
	}
	
		
	public IcustLoanDisburesmentDetails enterBranchCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDisbursementDetails.BranchCode.Xpath")), props.getProperty("BranchCode"));
		wait(1000);
		return this;
	}
	
	
	public IcustLoanDisburesmentDetails clickNextButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustLoanAccount.LoanDisbursementDetails.Next.Xpath")));
		wait(5000);
        return this;
	}

}
