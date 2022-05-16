package pages;

import base.IcustSpecificMethods;

public class EditVaultCurrencybalanceMaintenance extends IcustSpecificMethods{
	
	public EditVaultCurrencybalanceMaintenance editOpenbalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.EditOpenbalnceinLCY.Xpath")),props.getProperty("OpenbalnceinLCY"));
		return this;
	}
	
	public EditVaultCurrencybalanceMaintenance editBalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.EditBalnceinACY.Xpath")),props.getProperty("OpenbalnceinACY"));
		return this;
	}
	public EditVaultCurrencybalanceMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.Save.Xpath")));
		return this;
	}

}
