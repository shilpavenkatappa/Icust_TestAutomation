package pages;

import base.IcustSpecificMethods;

public class VaultCurrencybalanceMaintenance extends IcustSpecificMethods {
	public AddVaultCurrencybalanceMaintenance clickAddnew() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencybalanceMaintenance.Addnew.Xpath")));
		return new AddVaultCurrencybalanceMaintenance();	
	}
	public EditVaultCurrencybalanceMaintenance clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencybalanceMaintenance.Edit.Xpath")));
		return new EditVaultCurrencybalanceMaintenance();
	}
	

}
