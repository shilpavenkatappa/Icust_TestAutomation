package pages;

import base.IcustSpecificMethods;

public class IcustTokenServicesCashDeposit extends IcustSpecificMethods{
	
	public IcustTokenServicesCashDeposit clickCashDeposit() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.clickCashDeposit.Xpath")));
		return this;
	}
	public IcustTokenServicesCashDeposit enterAccountNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CD.enterAccountNUmber.Xpath")), props.getProperty("AccountNumber"));
        return this;
	}
	
	public IcustTokenServicesCashDeposit clickFetchlink() {
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CD.clickFetch.Xpath")));
		wait(30000);
		return this;
	}
	
	public IcustTokenServicesCashDeposit enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CD.enterTrAmount.Xpath")), props.getProperty("TransactionAmount"));
		return this;
	}
	
	
	
	  public IcustTokenServicesCashDeposit selectAccountBranch() {
	  clickElement(locateElement("xpath",props.getProperty(
	  "IcustTellerDashboard.TokenServices.CD.clickAccountBranch.Xpath")));
	  clickElement(locateElement("xpath",props.getProperty(
	  "IcustTellerDashboard.TokenServices.CD.selectAccountBranch.Xpath"))); return
	  this; 
	  } 
	  public IcustTokenServicesCashDeposit selectTransactionBranch() {
	  clickElement(locateElement("xpath",props.getProperty(
	  "IcustTellerDashboard.TokenServices.CD.clickTransactionBranch.Xpath")));
	  clickElement(locateElement("xpath",props.getProperty(
	  "IcustTellerDashboard.TokenServices.CD.selectTransactionBranch.Xpath")));
	  return this; }
	 
	public IcustTokenServicesCashDeposit clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CD.clickSaveButton.Xpath")));
		wait(5000);
        return this;
	}

}
