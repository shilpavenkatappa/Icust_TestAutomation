package pages;

import base.IcustSpecificMethods;

public class VaultStatusMaintenance extends IcustSpecificMethods{
	public AddVaultStatusMaintenance clickAddnew() {
		clickElement(locateElement("xpath", props.getProperty("VaultStatusMaintenance.Addnew.Xpath")));
		return new AddVaultStatusMaintenance();	
	}
	public EditVaultStatusMaintenance clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultStatusMaintenance.Edit.Xpath")));
		return new EditVaultStatusMaintenance();
	}
	}


