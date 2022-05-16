package pages;

import base.IcustSpecificMethods;

public class MaintenanceMenus extends IcustSpecificMethods{
	public DenominationMaintenance clickDenominationMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.Denomination.Xpath")));
		return new DenominationMaintenance();
		
	}
	public VaultCurrencyDenomBalMaintenance clickVaultCurrencyMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultCurrencyDenom.Xpath")));
		return new VaultCurrencyDenomBalMaintenance();

}
	public VaultStatusMaintenance clickVaultStatusMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultStatus.Xpath")));
		return new VaultStatusMaintenance();
	}
	public VaultCurrencybalanceMaintenance clickVaultCurrencybalanceMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultCurrency.Xpath")));
		return new VaultCurrencybalanceMaintenance();
}
	public VaultDenominationMaintenance clickVaultDenominationMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultDenomination.Xpath")));
		return new VaultDenominationMaintenance();
}
}
