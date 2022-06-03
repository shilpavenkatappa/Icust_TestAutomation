package pages;

import base.IcustSpecificMethods;

public class IcustAddBaseDenominationmaintenance extends IcustSpecificMethods {

	public IcustAddBaseDenominationmaintenance selectBaseDenominationMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintainence.BaseDenominationMaintenance.Xpath")));
		wait(5000);
		clickElement(
				locateElement("xpath", props.getProperty("IcustMaintenance.BaseDenominationMaintenance.AddNew.Xpath")));
		return this;
	}

	public IcustAddBaseDenominationmaintenance enterDenomination() {
		enterValue(
				locateElement("xpath",
						props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Denomination.Xpath")),
				props.getProperty("BankName"));
		return this;
	}

	public IcustAddBaseDenominationmaintenance selectCurrency() {
		clickElement(locateElement("xpath", props.getProperty(
				"IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Currency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty(
				"IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Currency.Dropdown.CNY.Xpath")));
		return this;
	}

	public IcustAddBaseDenominationmaintenance clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Save.Xpath")));
		wait(5000);
		return this;
	}

}
