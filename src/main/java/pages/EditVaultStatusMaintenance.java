package pages;

import base.IcustSpecificMethods;

public class EditVaultStatusMaintenance extends IcustSpecificMethods {
	public EditVaultStatusMaintenance editUserid() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultStatusMaintenance.EditUserid.Xpath")),props.getProperty("Userid"));
		return this;
	}
	
	public EditVaultStatusMaintenance editTillvaultstatus() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultStatusMaintenance.editTillvaultstatus.Xpath")),props.getProperty("TillVaultStatus"));
		return this;
	}
	public EditVaultStatusMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Save.Xpath")));
		return this;
	}
	

}
