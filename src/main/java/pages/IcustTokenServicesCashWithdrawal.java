package pages;

import base.IcustSpecificMethods;

public class IcustTokenServicesCashWithdrawal extends IcustSpecificMethods{

	public IcustTokenServicesCashWithdrawal clickCashWithdrawal() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.clickCashWithdrawal.Xpath")));
		return this;
	}
	public IcustTokenServicesCashWithdrawal enterAccountNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterAccountNUmber.Xpath")), props.getProperty("AccountNumber"));
        return this;
	}
	
	public IcustTokenServicesCashWithdrawal clickFetchlink() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickFetch.Xpath")));
		wait(20000);
		return this;
	}
	
	public IcustTokenServicesCashWithdrawal enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterTrAmount.Xpath")), props.getProperty("TransactionAmount"));
		return this;
	}
	
	
	  public IcustTokenServicesCashWithdrawal selectAccountBranch() {
	  clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickAccountBranch.Xpath")));
	  clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.selectAccountBranch.Xpath"))); return
	  this; } 
	  public IcustTokenServicesCashWithdrawal selectTransactionBranch() {
	  clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickTransactionBranch.Xpath")));
	  clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.selectTransactionBranch.Xpath")));
	  return this; }
	 
	public IcustTokenServicesCashWithdrawal clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickSaveButton.Xpath")));
		wait(10000);
        return this;
	}

}
