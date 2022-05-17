
package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEditState extends IcustSpecificMethods{

	public IcustEditState selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.Xpath")));
		return this;
	}
	
	public IcustEditState enterStateCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateCode.Xpath")), props.getProperty("Edit_StateCode"));
		return this;
	}
	
	public IcustEditState enterStateCode2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateCode2.Xpath")), props.getProperty("Edit_StateCode2"));
		return this;
	}
	public IcustEditState enterStateName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateName.Xpath")), props.getProperty("Edit_StateName"));
		return this;
	}
	
	public IcustEditState enterStateNumericCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateNumericCode.Xpath")), props.getProperty("Edit_StateNumericCode"));
		return this;
		
	}
	
	public IcustEditState enterRecordStatus() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.RecordStatus.Xpath")), props.getProperty("Edit_RecordStatus"));
		return this;
		
	}
	
	
	public IcustMaintenanceEditCountryandState selectUpdate() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.Update.Xpath")));
		return new IcustMaintenanceEditCountryandState();
	}
}
