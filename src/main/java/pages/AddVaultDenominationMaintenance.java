package pages;

import base.IcustSpecificMethods;

public class AddVaultDenominationMaintenance extends IcustSpecificMethods {
	public AddVaultDenominationMaintenance clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickVaultDenominationMaintenanceEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationEntitycodeValue.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickVaultDenominationMaintenanceBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationBankcodeDropdown.Xpath")));
		return this;
}
	public AddVaultDenominationMaintenance clickVaultDenominationMaintenanceBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationBankcodeValue.Xpath")));
		return this;
	}
	
	public AddVaultDenominationMaintenance clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Branchcode.Xpath")));
		return this;
}
	public AddVaultDenominationMaintenance clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.TillId.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Currency.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.CurrencyValue.Xpath")));
		return this;
	}
	public AddVaultDenominationMaintenance enterDenominationCode() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.DenominationCode.Xpath")),props.getProperty("DenomninationCode"));
		return this;
	}
	public AddVaultDenominationMaintenance enterUnits() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Units.Xpath")),props.getProperty("Units"));
		return this;
	}
	public AddVaultDenominationMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Save.Xpath")));
		return this;
	}
	
}
