package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustBankMaintenanceAdd extends IcustSpecificMethods{

	public IcustBankMaintenanceAdd selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterBankName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankName.Xpath")), props.getProperty("BankName"));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterBankCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCode.Xpath")), props.getProperty("BankCode"));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterSwiftCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.SwiftCode.Xpath")), props.getProperty("SwiftCode"));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectBankCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCurrency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCurrency.Dropdown.INR.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectDefaultLanguage() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DefaultLanguage.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DefaultLanguage.Dropdown.English.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterHeadOfficeBranch() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.HeadOfficeBranch.Xpath")), props.getProperty("HeadOfficeBranch"));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.EntityCode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.EntityCode.Dropdown.2353.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Address1.Xpath")), props.getProperty("Address1"));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Address2.Xpath")), props.getProperty("Address2"));
		return this;
	}
	public IcustBankMaintenanceAdd selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Pincode.Xpath")), props.getProperty("Pincode"));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.MobileNumber.Xpath")), props.getProperty("MobileNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAdd enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.PhoneNumber.Xpath")), props.getProperty("PhoneNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAdd clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	