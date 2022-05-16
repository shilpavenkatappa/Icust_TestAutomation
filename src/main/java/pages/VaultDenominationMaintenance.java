package pages;

import base.IcustSpecificMethods;

public class VaultDenominationMaintenance extends IcustSpecificMethods {
	public AddVaultDenominationMaintenance clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("VaultDenominationMaintenance.Addnew.Xpath")));
		return new AddVaultDenominationMaintenance();	
	}
	public EditVaultDenominationMaintenance clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultDenominationMaintenance.Edit.Xpath")));
		return new EditVaultDenominationMaintenance();
	}
	

}
