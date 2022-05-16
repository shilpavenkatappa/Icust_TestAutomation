package pages;

import base.IcustSpecificMethods;

public class AddDenomination extends IcustSpecificMethods{
	
	public  AddDenomination clickEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Entitycode.Xpath")));
		return this;
	}
	public AddDenomination clickEntityValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.EntityDropdown.Xpath")));
		return this;
	}
	public AddDenomination clickBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Bankcode.Xpath")));
		return this;
	}
	public AddDenomination clickBankCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.BankcodeDropdown.Xpath")));
		return this;
	}
	public AddDenomination clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Currency.Xpath")));
		return this;
		}
	public AddDenomination clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.CurrencyDropdown.Xpath")));
		return this;
	}
	public AddDenomination enterDenomCode() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomcode.Xpath")), props.getProperty("Denomcode"));
		return this;
	}
	public AddDenomination enterDenomDesc() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomdesc.Xpath")), props.getProperty("Denomdesc"));
		return this;
	}
	public AddDenomination enterDenomValue() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomvalue.Xpath")), props.getProperty("Denomvalue"));
		return this;
		}
	public AddDenomination clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.save.Xpath")));
		return this;
	}
	
}
