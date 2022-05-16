package pages;

import base.IcustSpecificMethods;

public class AddVaultStatusMaintenance extends IcustSpecificMethods{
	public AddVaultStatusMaintenance clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public AddVaultStatusMaintenance clickVaultstatusEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultStatusEntitycode.Xpath")));
		return this;
	}
	public AddVaultStatusMaintenance clickVaultstatusBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.BankcodeDropdown.Xpath")));
		return this;
}
	public AddVaultStatusMaintenance clickVaultstatusBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultStatusBankcode.Xpath")));
		return this;
	}
	
	public AddVaultStatusMaintenance clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.Branchcode.Xpath")));
		return this;
}
	public AddVaultStatusMaintenance clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public AddVaultStatusMaintenance clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillId.Xpath")));
		return this;
	}
	public AddVaultStatusMaintenance clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public AddVaultStatusMaintenance enterVaultStatusUserid() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultstatusUserid.Xpath")),props.getProperty("Userid"));
		return this;
	}
	public AddVaultStatusMaintenance enterTillVaultStatus() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillVaultstatus.Xpath")),props.getProperty("TillVaultStatus"));
		return this;
	}
	public AddVaultStatusMaintenance clickTvOpentime() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.Tvopentime.Xpath")));
		return this;
	}
	
}
