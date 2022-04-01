package pages;

import base.IcustSpecificMethods;

public class IcustTokenServices extends IcustSpecificMethods{
	
	public IcustTokenServices clickCashWithdrawal() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.clickCashDeposit.Xpath")));
		return this;
	}
	public IcustTokenServices enterAccountNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CD.enterAccountNUmber.Xpath")), props.getProperty("AccountNumber"));
        return this;
	}
	
	public IcustTokenServices clickFetchlink() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CD.clickFetch.Xpath")));
		wait(10000);
		return this;
	}
	
	public IcustTokenServices enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CD.enterTrAmount.Xpath")), props.getProperty("TransactionAmount"));
		return this;
	}
	
	/*
	 * public IcustTokenServices selectAccountBranch() {
	 * clickElement(locateElement("xpath",props.getProperty(
	 * "IcustTellerDashboard.TokenServices.CD.clickAccountBranch.Xpath")));
	 * clickElement(locateElement("xpath",props.getProperty(
	 * "IcustTellerDashboard.TokenServices.CD.selectAccountBranch.Xpath"))); return
	 * this; } public IcustTokenServices selectTransactionBranch() {
	 * clickElement(locateElement("xpath",props.getProperty(
	 * "IcustTellerDashboard.TokenServices.CD.clickTransactionBranch.Xpath")));
	 * clickElement(locateElement("xpath",props.getProperty(
	 * "IcustTellerDashboard.TokenServices.CD.selectTransactionBranch.Xpath")));
	 * return this; }
	 */
	public IcustTokenServices clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CD.clickSaveButton.Xpath")));
		wait(5000);
        return this;
	}

}
