
package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustStateMaintenance extends IcustSpecificMethods{

	public IcustStateMaintenance selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.AddNew.Xpath")));
		return this;
	}
	
	public IcustStateMaintenance enterStateCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.StateCode.Xpath")), props.getProperty("StateCode"));
		return this;
	}
	
	public IcustStateMaintenance enterStateCode2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.StateCode2.Xpath")), props.getProperty("StateCode2"));
		return this;
	}
	public IcustStateMaintenance enterStateName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.StateName.Xpath")), props.getProperty("StateName"));
		return this;
	}
	
	public IcustStateMaintenance enterStateNumericCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.StateNumericCode.Xpath")), props.getProperty("StateNumericCode"));
		return this;
		
	}
	
	public IcustStateMaintenance enterRecordStatus() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.RecordStatus.Xpath")), props.getProperty("RecordStatus"));
		return this;
		
	}
	
	
	public IcustStateMaintenance selectSave() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.AddNew.Save.Xpath")));
		return this;
	}
}
