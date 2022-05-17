package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustMaintenanceEditCountryandState extends IcustSpecificMethods{

	
	public IcustMaintenanceEditCountryandState enterCountryCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.CountryCode.Xpath")), props.getProperty("Edit_CountryCode"));
		return this;
	}
	
	public IcustMaintenanceEditCountryandState enterCountryCode2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.CountryCode2.Xpath")), props.getProperty("Edit_CountryCode2"));
		return this;
	}
	public IcustMaintenanceEditCountryandState enterCountryName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.CountryName.Xpath")), props.getProperty("Edit_CountryName"));
		return this;
	}
	
	public IcustMaintenanceEditCountryandState enterISONumericCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.CountryISONumericCode.Xpath")), props.getProperty("Edit_ISONumericCode"));
		return this;
		
	}
	
	public IcustMaintenanceEditCountryandState enterRegion() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Region.Xpath")), props.getProperty("Edit_Region"));
		return this;
		
	}
	
	public IcustMaintenanceEditCountryandState enterISDCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.ISDCode.Xpath")), props.getProperty("Edit_TelephoneISDCode"));
		return this;
		
	}
	
	public IcustMaintenanceEditCountryandState selectIbanCheckRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.IbanCheckRequired.Toggle.Xpath")));
		return this;
		
	}
	
	public IcustMaintenanceEditCountryandState selectBlackListed() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.BlackListed.Toggle.Xpath")));
		return this;
		
	}
	
	public IcustMaintenanceEditCountryandState selectUpdate() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Update.Xpath")));
		return this;
	}

}
