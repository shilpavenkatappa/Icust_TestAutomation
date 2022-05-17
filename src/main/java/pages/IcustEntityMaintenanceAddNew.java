package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEntityMaintenanceAddNew extends IcustSpecificMethods{

	public IcustEntityMaintenanceAddNew selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew enterEntityCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.EntityCode.Xpath")), props.getProperty("EntityCode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew enterEntityName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.EntityName.Xpath")), props.getProperty("EntityName"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew selectDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	

	public IcustEntityMaintenanceAddNew enterVersion() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Version.Xpath")), props.getProperty("Version"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew selectCountry() {
		wait(20000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Country.Dropdown.Xpath")));
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew selectState() {
		wait(20000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.State.Dropdown.Xpath")));
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew selectCity() {
		wait(20000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.City.Dropdown.Xpath")));
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Pincode.Xpath")), props.getProperty("Pincode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.MobileNumber.Xpath")), props.getProperty("MobileNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.PhoneNumber.Xpath")), props.getProperty("PhoneNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddNew clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	