package pages;

import base.IcustSpecificMethods;

public class EditVaultDenominationMaintenance extends IcustSpecificMethods {
	public EditVaultDenominationMaintenance editDenominationCode() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.DenominationCode.Xpath")),props.getProperty("DenomninationCode"));
		return this;
	}
	public EditVaultDenominationMaintenance editUnits() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.Units.Xpath")),props.getProperty("Units"));
		return this;
	}
	public EditVaultDenominationMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.Save.Xpath")));
		return this;
	}

}
