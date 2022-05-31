package pages;

import base.IcustSpecificMethods;

public class AddTransactionCashMasterMaintenance extends IcustSpecificMethods{
	
	public  AddTransactionCashMasterMaintenance clickEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.EntityCode.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectEntityValue() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.EntityCodeSelectValue.Xpath")));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BankCode.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BankCodeSelectValue.Xpath")));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BranchCode.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BranchCodeSelectValue.Xpath")));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TillId.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TillIdSelectValue.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterTransactionProduct() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionProduct.Xpath")), props.getProperty("EnterTransactionProduct"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterTransactionReference() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionReference.Xpath")), props.getProperty("EnterTransactionReference"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Amount.Xpath")), props.getProperty("EnterAmount"));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickAccountCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountCurrency.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectAccountCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountCurrencySelectValue.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterAccountBalance() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountBalance.Xpath")), props.getProperty("AccountBalance"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterInstrument() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Instrument.Xpath")), props.getProperty("Instrument"));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickTransactionCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionCurrency.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectTransactionCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionCurrencySelectValue.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionAmount.Xpath")), props.getProperty("TransactionAmount"));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickOfsCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsCurrency.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectOfsCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsCurrencySelectValue.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterOfsAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsAmount.Xpath")), props.getProperty("OfsAmount"));
		return this;
	}
	public  AddTransactionCashMasterMaintenance clickTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionDate.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance selectTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionDateSelectValue.Xpath")));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterForexRate() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ForexRate.Xpath")), props.getProperty("ForexRate"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterForexNegotiationRate() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ForexNegotiationRate.Xpath")), props.getProperty("ForexNegotiationRate"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterChargeAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ChargeAmount.Xpath")), props.getProperty("ChargeAmount"));
		return this;
	}
	public AddTransactionCashMasterMaintenance enterRemark() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Remark.Xpath")), props.getProperty("Remark"));
		return this;
	}
	public AddTransactionCashMasterMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.clickSave.Xpath")));
		return this;
	}
	
}
