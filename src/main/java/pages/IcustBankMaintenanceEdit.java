package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustBankMaintenanceEdit extends IcustSpecificMethods{

	public IcustBankMaintenanceEdit selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterBankName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankName.Xpath")), props.getProperty("Edit_BankName"));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterBankCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCode.Xpath")), props.getProperty("Edit_BankCode"));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterSwiftCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.SwiftCode.Xpath")), props.getProperty("Edit_SwiftCode"));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectBankCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCurrency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCurrency.Dropdown.INR.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectDefaultLanguage() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DefaultLanguage.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DefaultLanguage.Dropdown.English.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterHeadOfficeBranch() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.HeadOfficeBranch.Xpath")), props.getProperty("Edit_HeadOfficeBranch"));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.EntityCode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.EntityCode.Dropdown.2353.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Address1.Xpath")), props.getProperty("Edit_Address1"));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Address2.Xpath")), props.getProperty("Edit_Address2"));
		return this;
	}
	public IcustBankMaintenanceEdit selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Pincode.Xpath")), props.getProperty("Edit_Pincode"));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.MobileNumber.Xpath")), props.getProperty("Edit_MobileNumber"));
		return this;
	}
	
	public IcustBankMaintenanceEdit enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.PhoneNumber.Xpath")), props.getProperty("Edit_PhoneNumber"));
		return this;
	}
	
	public IcustBankMaintenanceEdit clickUpdateButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	