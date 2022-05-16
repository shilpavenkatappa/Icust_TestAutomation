package pages;

import base.IcustSpecificMethods;

public class AddVaultCurrencybalanceMaintenance extends IcustSpecificMethods {
	public AddVaultCurrencybalanceMaintenance clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickVaultCurrencyblanceEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultCurrencyblanceEntitycodeValue.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickVaultcurrencyBalanceBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultcurrencyBalanceBankcodeDropdown.Xpath")));
		return this;
}
	public AddVaultCurrencybalanceMaintenance clickVaultcurrencyBalanceBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultcurrencyBalanceBankcodeValue.Xpath")));
		return this;
	}
	
	public AddVaultCurrencybalanceMaintenance clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Branchcode.Xpath")));
		return this;
}
	public AddVaultCurrencybalanceMaintenance clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.TillId.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Currency.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.CurrencyValue.Xpath")));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance enterGLAccount() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Glaccount.Xpath")),props.getProperty("GLAccount"));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance enterOpenbalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.OpenbalnceinACY.Xpath")),props.getProperty("OpenbalnceinACY"));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance enterOpenbalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.OpenbalnceinLCY.Xpath")),props.getProperty("OpenbalnceinLCY"));
		return this;
	}
	
	public AddVaultCurrencybalanceMaintenance enterBalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BalnceinACY.Xpath")),props.getProperty("balnceinACY"));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance enterBalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BalnceinLCY.Xpath")),props.getProperty("balnceinLCY"));
		return this;
	}
	public AddVaultCurrencybalanceMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Save.Xpath")));
		return this;
	}
	
}
