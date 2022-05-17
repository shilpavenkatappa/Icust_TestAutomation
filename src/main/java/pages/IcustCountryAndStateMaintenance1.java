package pages;

import base.IcustSpecificMethods;

public class IcustCountryAndStateMaintenance1 extends IcustSpecificMethods{

	public IcustCountryAndStateMaintenance1 clickMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(15000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Xpath")));
		wait(5000);
		return this;
	}
	
		
	
	public IcustMaintenanceEditCountryandState clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Xpath")));
		wait(4000);
		return new IcustMaintenanceEditCountryandState();
	}
}

