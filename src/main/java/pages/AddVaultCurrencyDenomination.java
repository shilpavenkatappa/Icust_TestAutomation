package pages;

import base.IcustSpecificMethods;

public class AddVaultCurrencyDenomination extends IcustSpecificMethods {
	public AddVaultCurrencyDenomination enterDenominationcode() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Denominationcode.Xpath")), props.getProperty("Denominationcode"));
		return  this;
	}
	
	public AddVaultCurrencyDenomination enterOpenunitsbalance() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Openunitsbalance.Xpath")), props.getProperty("OpenUnitsBlance"));
		return  this;

}
	
	public AddVaultCurrencyDenomination enterUnitsbalance() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Unitsbalance.Xpath")), props.getProperty("UnitsBlance"));
		return  this;
}
	public AddVaultCurrencyDenomination clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.save.Xpath")));
		return this;
	}
	
}