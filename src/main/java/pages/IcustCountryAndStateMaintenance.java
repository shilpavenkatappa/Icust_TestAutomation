package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCountryAndStateMaintenance extends IcustSpecificMethods{

	public IcustCountryAndStateMaintenance selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.Xpath")));
		return this;
	}
	
	public IcustCountryAndStateMaintenance enterCountryCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.CountryCode.Xpath")), props.getProperty("CountryCode"));
		return this;
	}
	
	public IcustCountryAndStateMaintenance enterCountryCode2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.CountryCode2.Xpath")), props.getProperty("CountryCode2"));
		return this;
	}
	public IcustCountryAndStateMaintenance enterCountryName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.CountryName.Xpath")), props.getProperty("CountryName"));
		return this;
	}
	
	public IcustCountryAndStateMaintenance enterISONumericCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.CountryISONumericCode.Xpath")), props.getProperty("ISONumericCode"));
		return this;
		
	}
	
	public IcustCountryAndStateMaintenance enterRegion() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.Region.Xpath")), props.getProperty("Region"));
		return this;
		
	}
	
	public IcustCountryAndStateMaintenance enterISDCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.ISDCode.Xpath")), props.getProperty("TelephoneISDCode"));
		return this;
		
	}
	
	public IcustCountryAndStateMaintenance selectIbanCheckRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.IbanCheckRequired.Toggle.Xpath")));
		return this;
		
	}
	
	public IcustCountryAndStateMaintenance selectBlackListed() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.BlackListed.Toggle.Xpath")));
		return this;
		
	}

	public IcustCountryAndStateMaintenance selectSave() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.Save.Xpath")));
		return this;
	}
}
