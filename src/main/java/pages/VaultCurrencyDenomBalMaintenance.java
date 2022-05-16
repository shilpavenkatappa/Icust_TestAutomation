package pages;

import base.IcustSpecificMethods;

public class VaultCurrencyDenomBalMaintenance extends IcustSpecificMethods{
	
	public AddVaultCurrencyDenomination clickAddNew() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencyDenomBalMaintenance.Addnew.Xpath")));
		return new AddVaultCurrencyDenomination();
		
	}
	public EditVaultCurrencyDenomination clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencyDenomBalMaintenance.Edit.Xpath")));
		return new EditVaultCurrencyDenomination();
	}

}
