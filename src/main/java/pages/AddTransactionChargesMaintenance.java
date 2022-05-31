package pages;

import base.IcustSpecificMethods;

public class AddTransactionChargesMaintenance extends IcustSpecificMethods{
	
	public AddTransactionChargesMaintenance enterChargeAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeAmount.Xpath")), props.getProperty("ChargeAmount"));
		return this;
	}
	
	public  AddTransactionChargesMaintenance clickChargeCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeCurrency.Xpath")));
		return this;
	}
	public  AddTransactionChargesMaintenance SelectChargeCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeCurrencySelectValue.Xpath")));
		return this;
	}
	public AddTransactionChargesMaintenance enterChargeDescription() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeDescription.Xpath")), props.getProperty("ChargeDescription"));
		return this;
	}
	
	public  AddTransactionChargesMaintenance clickTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionDate.Xpath")));
		return this;
	}
	public  AddTransactionChargesMaintenance SelectTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionDateSelectValue.Xpath")));
		return this;
	}
	public AddTransactionChargesMaintenance enterTransactionReference() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionReference.Xpath")), props.getProperty("TransactionReference"));
		return this;
	}
	public  AddTransactionChargesMaintenance ClickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.SaveButton.Xpath")));
		return this;
	}
	
}