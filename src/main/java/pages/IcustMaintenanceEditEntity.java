package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustMaintenanceEditEntity extends IcustSpecificMethods{

	public IcustMaintenanceEditEntity selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Xpath")));
		return this;
	}
	
	public IcustMaintenanceEditEntity enterEntityCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.EntityCode.Xpath")), props.getProperty("Edit_EntityCode"));
		return this;
	}
	
	public IcustMaintenanceEditEntity enterEntityName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.EntityName.Xpath")), props.getProperty("Edit_EntityName"));
		return this;
	}
	
	public IcustMaintenanceEditEntity selectDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.DenominationRequired.Dropdown.No.Xpath")));
		return this;
	}
	
	

	public IcustMaintenanceEditEntity enterVersion() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Version.Xpath")), props.getProperty("Edit_Version"));
		return this;
	}
	
	public IcustMaintenanceEditEntity selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustMaintenanceEditEntity selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustMaintenanceEditEntity selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustMaintenanceEditEntity enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Pincode.Xpath")), props.getProperty("Edit_Pincode"));
		return this;
	}
	
	public IcustMaintenanceEditEntity enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.MobileNumber.Xpath")), props.getProperty("Edit_MobileNumber"));
		return this;
	}
	
	public IcustMaintenanceEditEntity enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.PhoneNumber.Dropdown.Xpath")), props.getProperty("Edit_PhoneNumber"));
		return this;
	}
	
	public IcustMaintenanceEditEntity clickUpdateButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Update.Xpathh")));
		wait(5000);
        return this;
	}

}
	