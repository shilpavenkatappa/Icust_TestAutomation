package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanAccountLoanDetailsHomeLoan extends IcustSpecificMethods{

	public IcustLoanAccountLoanDetailsHomeLoan selectCreateLoanAccount() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.Xpath")));
		wait(7000);
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan clickLoanDetails() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.Xpath")));
		wait(1000);
		return this;
	}
	
	
	public IcustLoanAccountLoanDetailsHomeLoan selectBussinessProductName() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.BusinessProductName.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.BusinessProductName.Dropdown.ClassicHomeLoan.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectApplicationDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ApplicationDate.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ApplicationDate.Date.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterAccountBranch() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.AccountBranch.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.AccountBranch.Dropdown.DSA.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterEstimatedCost() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.EstimatedCost.Xpath")), props.getProperty("EstimatedCost"));
		return this;
	}
	
	
	public IcustLoanAccountLoanDetailsHomeLoan enterCustomerContribution() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.CustomerContribution.Xpath")), props.getProperty("CustomerContribution"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterLoanAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanAmount.Xpath")), props.getProperty("LoanAmount"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectLoanTenureYear() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureYear.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureYear.Dropdown.2022.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectLoanTenureMonth() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureMonth.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureMonth.Dropdown.May.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectLoanTenureDay() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureDay.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.LoanTenureDay.Dropdown.Date.Xpath")));
		return this;
	}
	
	
	public IcustLoanAccountLoanDetailsHomeLoan enterPurposeOfLoan() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.PurposeOfLoan.Xpath")), props.getProperty("PurposeOfLoan"));
		return this;
	}
	
	
	public IcustLoanAccountLoanDetailsHomeLoan clickNextButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.Next.Xpath")));
		wait(5000);
        return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectDimension() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Dimension.Dropdwon.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Dimension.Dropdown.SqFT.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectHometype() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Hometype.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Hometype.Dropdown.Villa.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectAssetStatus() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.AssetStatus.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.AssetStatus.Dropdown.UnderConstruction.Xpath")));
		return this;
	}
	
	
	public IcustLoanAccountLoanDetailsHomeLoan enterMarketValue() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.MarketValue.Xpath")), props.getProperty("MarketValue"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterBuilding() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Building.Xpath")), props.getProperty("Building"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterStreet() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Street.Xpath")), props.getProperty("Street"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterLocality() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Locality.Xpath")), props.getProperty("Locality"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccount.LoanDetails.AddDetails.ClassicHomeLoan.AssetDetails.Zipcode.Xpath")), props.getProperty("Zipcode"));
		return this;
	}
	
	public IcustLoanAccountLoanDetailsHomeLoan clickNext1Button() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	